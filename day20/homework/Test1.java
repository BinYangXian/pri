package day20.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import util.IoCloseUtil;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 思路分析：
		 * 1）读取url.txt里所有的url到程序中-装入list容器
		 * 2）遍历容器里所有的url分别进行下载
		 *   a)得到用户输入的存在的文件夹的路径
		 */
		app();
	}
	private static void app() {
		//1
		List<String> listUrl=readFileUrl();
		System.out.println("读取url："+listUrl);
		//2
		downListUrlFile(listUrl);
	}
	
	/**
	 * 得到用户输入的存在的文件夹的路径
	 */
	public static String inputDirPath(){
		//管理者
		Scanner sc=new Scanner(System.in);
		while(true){
			//提示
			System.out.println("请输入一个存在的文件夹路径！");
			//输入
			String path= sc.next();
			//
			File file=new File(path);
			//判断输入-正确-退出循环-退出方法
			if(file.isDirectory()){
				return path;
			}
		}
	}
	
	/**
	 * 2）遍历容器里所有的url分别进行下载
	 * @param listUrl
	 */
	private static void downListUrlFile(List<String> listUrl) {
		//文件-所在文件夹的路径
		String path=inputDirPath();
		
		//遍历找到list所有的url
		for (String url : listUrl) {
			//文件的名字
			String []urlInfoArr= url.split("/");
			String name= urlInfoArr[urlInfoArr.length-1];
			//文件自己的路径
			String filePath=path+File.separator+name;
			/**
			 * 下载
			 */
			new Thread(()->{
				downUrlFile(url, filePath);
			}).start();
		}
	}
	/**
	 * 下载url对应的资源到文件中
	 * 参数：
	 * 下载的url路径
	 * 保存资源的文件的路径
	 */
	public static void downUrlFile(String url,String filePath){
		InputStream is=null;
		OutputStream os=null;
		try {
//		    a）创建输入输出数据源
			URL inUrl=new URL(url);
			File outFile=new File(filePath);
//		    b）通过数据源创建输入输出流
			is=new BufferedInputStream(inUrl.openStream());
			os=new BufferedOutputStream(new FileOutputStream(outFile));
//		    c）通过输入流循环的读取数据
			System.out.println("开始下载"+filePath+"开始！");
			byte[] buff=new byte[512];
			int len;
			while ((len=is.read(buff))!=-1) {
//			    d）通过输出流循环的写出数据
				os.write(buff, 0, len);
			}
//		    e）刷新流flush（如果需要数据-立即传入到数据源时，则需要调用）
			os.flush();
			System.out.println("完成下载"+filePath+"完成！");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
//		    f）关闭流close
			IoCloseUtil.close(os,is);
		}
		
	}
	/**
	 * 1）读取url.txt里所有的url到程序中-装入list容器
	 */
	private static List<String> readFileUrl() {
//			 a）创建数据源
		File file=new File("src/day20/homework/urls2.txt");
//		     b）通过数据源创建需要的输入流
		BufferedReader br=null;
		try {
			br=new BufferedReader(new FileReader(file));
//		     c）通过流从对应的数据源循环读取数据
			//装url的list
			List<String> list=new ArrayList<String>();
			String buff;
			while ((buff=br.readLine())!=null) {
//			     d）处理读取的数据
				list.add(buff);
			}
			//返回list
			return list;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
//		     e）关闭流close
			IoCloseUtil.close(br);
		}
		return null;
	}
}
