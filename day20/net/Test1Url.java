package day20.net;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

import day18.homework.IoCloseUtil;

public class Test1Url {
	public static void main(String[] args)throws Exception {
		/**
		 * 资源定位（定位网络计算机的程序的资源）应用层技术：
		 *     
url结构：协议+服务域名（对应ip）+端口+资源文件位置（路径+参数）
语法：协议://服务域名（或ip）[:端口]资源文件位置（路径+参数）
http://desk.fd.zol-img.com.cn/t_s960x600c5/g5/M00/0B/05/ChMkJlcgdH2IVmv2AAYP2zcB7GQAAQr3gJjQtUABg_z016.jpg
		 */
		dome2();
	}
	/**
	 * 拿到url对应的资源
	 * 
	 * 
	 * 
	 * 连接到某个url的流（数据源为网络上一个资源,该资源对应的流）
      InputStream openStream()  
          打开到此 URL 的连接    并返回一个用于从该连接读入的 InputStream。 
	 * 
	 */
	private static void dome2() {

		InputStream is=null;
		OutputStream os=null;
		try {
//		    a）创建输入输出数据源
			URL urlIn=new URL("http://desk.fd.zol-img.com.cn/t_s960x600c5/g5/M00/0B/05/ChMkJlcgdH2IVmv2AAYP2zcB7GQAAQr3gJjQtUABg_z016.jpg");
			File fileOut=new File("src/day20/net/中关村美女图片.jpg");
//		    b）通过数据源创建输入输出流
			is=urlIn.openStream();
			os= new FileOutputStream(fileOut);
//		    c）通过输入流循环的读取数据
			byte[] buff=new byte[512];
			int readLen;
			while((readLen=is.read(buff))!=-1){
//			    d）通过输出流循环的写出数据
				os.write(buff, 0, readLen);
			}
//		    e）刷新流flush（如果需要数据-立即传入到数据源时，则需要调用）
			os.flush();
			System.out.println("下载完成！");
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
	 * 创建url
	 * 
	 * URL(String spec)
          根据 String 表示形式创建 URL 对象。
    URL(String protocol, String host, int port, String file)
          根据指定 protocol、host、port 号和 file 创建 URL 对象。
          
url的4个部分

     String getProtocol()
          获取此 URL 的协议名称。
     String getHost()
          获取此 URL 的主机名（如果适用）。
     int getPort()
          获取此 URL 的端口号。
    String getFile()
          获取此 URL 的资源文件部分。
	 */
	private static void dome1()throws Exception {
		//创建url-表示中关村图片的url
		//完成url字符串创建
		URL u1=new URL("http://desk.fd.zol-img.com.cn/t_s960x600c5/g5/M00/0B/05/ChMkJlcgdH2IVmv2AAYP2zcB7GQAAQr3gJjQtUABg_z016.jpg");
		//url四个部分创建
		URL u2=new URL("http","desk.fd.zol-img.com.cn",80,"/t_s960x600c5/g5/M00/0B/05/ChMkJlcgdH2IVmv2AAYP2zcB7GQAAQr3gJjQtUABg_z016.jpg");
	
		//查看url信息
		System.out.println("u1："+u1);
		System.out.println("u2："+u2);
		//查看各部分的信息
		System.out.println("u2的协议："+u2.getProtocol());
		System.out.println("u2的域名："+u2.getHost());
		System.out.println("u2的端口："+u2.getPort());
		System.out.println("u2的资源文件位置："+u2.getFile());
	}
}
