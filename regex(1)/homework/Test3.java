package regex.homework;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import util.IoCloseUtil;
import util.UrlUtil;

public class Test3 {
	public static void main(String[] args) {
		/**
		 * 思路分析：
		 * 1）下载http://desk.zol.com.cn/meinv/1920x1080/
		 * 对应的html内容到程序中-拼接字符串
		 * 2）编写查找图片的名字和url的正则表达式
		 * -》正则工具-<img[\s\S]{5,50}alt="([^"]{1,50})"\s{1,10}src="([^"]{1,200})
		 * 3)使用正则api（pattern，matcher）查找出对应的图片名字和url-放入map容器
		 * 4）取出map容器里所有的图片名字和url分别进行下载
		 */
		app();
	}
	private static void app() {
		//1
		StringBuilder htmlStr= downUrlHtml();
		//System.out.println("读取的html："+htmlStr);
		//2
		//<img[\s\S]{5,50}alt="([^"]{1,50})"\s{1,10}src="([^"]{1,200})
		String reg="<img[\\s\\S]{5,50}alt=\"([^\"]{1,50})\"\\s{1,10}src=\"([^\"]{1,200})";
		
		//3
		Map<String, String> imgInfo=findImgInfoToMap(htmlStr,reg);
		System.out.println("找到的图片信息："+imgInfo);
		
		//4
		downImgInfo(imgInfo);
		
		
	}
	
	private static void downImgInfo(Map<String, String> imgInfo) {
		//取出map里所有的图片名字和url进行下载
		for (String keyImgName : imgInfo.keySet()) {
			String valImgUrl=imgInfo.get(keyImgName);
			//文件的路径
			String filePath="src/regex/homework/imgs/"+keyImgName+".jpg";
			//开线程-下载
			new Thread(
			()->{
				UrlUtil.downUrlFile(valImgUrl, filePath);
				System.out.println("下载"+filePath+"完成！");
			}		
			).start();
			
			
		}	
	}
	private static Map<String, String> findImgInfoToMap(StringBuilder htmlStr,
			String reg) {
		//a）正则对象
	 	Pattern pt=Pattern.compile(reg);
	 	//b)正则对象绑定数据-得到匹配器
	    Matcher mt=pt.matcher(htmlStr);
		/**
		 * c）通过匹配器找数据
		 */
	    Map<String, String> map=new HashMap<String, String>();
	    while(mt.find()){
	    	//拿到图片名字
	    	String imgName=mt.group(1); 
	    	//拿到图片地址
	    	String imgUrl=mt.group(2);
	    	//放入map
	    	map.put(imgName, imgUrl);
	    }
		return map;
	}
	/**
	 * 1）下载http://desk.zol.com.cn/meinv/1920x1080/
		 * 对应的html内容到程序中-拼接字符串
	 */
	private static StringBuilder downUrlHtml() {
		Reader isr=null;
		try {
//			 a）创建数据源
			URL inUrl=new URL("http://desk.zol.com.cn/meinv/1920x1080/");
//		     b）通过数据源创建需要的输入流
			isr=new InputStreamReader(inUrl.openStream(), "gbk");
//		     c）通过流从对应的数据源循环读取数据
			StringBuilder sb=new StringBuilder();
			
			char [] buff=new char[512];
			int len;
			while ((len=isr.read(buff))!=-1) {
//			     d）处理读取的数据
				sb.append(buff, 0, len);
			}
			//返回
			return sb;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
//		     e）关闭流close
			IoCloseUtil.close(isr);
		}
		return null;
	}
}
