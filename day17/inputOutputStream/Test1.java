package day17.inputOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 
		 * 使用输入流的步骤
		 * a）创建输入的数据源（文件，字节数组...）
		 * b）根据数据源创建输入流（管道）
		 * c）通过管道读取数据
		 * d）根据业务处理数据
		 * e）关闭流（管道）
		 * 
		 * 
		 * 1)InputStream 常用api
 
 void close()  
 
          关闭此输入流并释放与该流关联的所有系统资源。 
abstract  int read()
          从输入流中读取数据的下一个字节。
 int read(byte[] b)
          从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
		 * 
		 * 
		 * 注意点：所有流的子类型的构造器
		 * a）节点流：创建对象包装一个【数据源】
		 * b）处理流：创建对象包装一个【其他流】
		 * 
		 */
		dome2();
	}
	/**
	 * 把"personInfo.ttt"的[人的信息]读取到程序中
	 * 打印到控制台
	 * 
	 * int read(byte[] b)->读取很多字节（字节数组）
	 */

	private static void dome2() {
//		 a）创建输入的数据源（文件，字节数组...）
		File file=new File("my17day/day17/inputOutputStream/personInfo1.ttt");
		//提高作用域
		InputStream fis=null;
		try {
//			 b）根据数据源创建输入流（管道）
			fis=new FileInputStream(file);
//			 c）通过管道读取数据
			//缓冲数据的字节数组-实际开发512或1024
			byte[] buff=new byte[7];
			//读取的数量的长度
			int buffLen;
			while((buffLen=fis.read(buff))!=-1){//a)读取数据 b）存储数据 c）判断有数据
				//d）处理数据
//				 d）根据业务处理数据
				System.out.println("读取的字节数组(整数)："+Arrays.toString(buff));
				System.out.println("读取的字节数组的长度："+buffLen);
				
				//解码为字符串
				String data=new String(buff, 0, buffLen, "utf-8");
				System.out.println("读取的字符数据："+data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("文件路径错误！");
		} catch (IOException e) {
			System.out.println("流断开了，不能继续操作!");
		}finally{
//			 e）关闭流（管道）
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	/**
	 * 把"personInfo.ttt"的[人的信息]读取到程序中
	 * 打印到控制台
	 * 
	 * read()->读取一个字节
	 */

	private static void dome1() {
//		 a）创建输入的数据源（文件，字节数组...）
		File file=new File("src/day17/inputOutputStream/personInfo1.ttt");
		//提高作用域
		InputStream fis=null;
		try {
//			 b）根据数据源创建输入流（管道）
			fis=new FileInputStream(file);
//			 c）通过管道读取数据
			/**
			 * 方式1：
			 * while(true){
				//读取数据
				int bt= fis.read();
				//有数据-处理数据-继续读取
				if(bt!=-1){
					System.out.println("读取的字节(整数)："+bt);
				}else{
					//没有数据-结束循环
					break;
				}
			}
			 */
			/**
			 * 方式2：
			 */
			//缓冲数据的变量
			int buff;
			while((buff=fis.read())!=-1){//a)读取数据 b）存储数据 c）判断有数据
				//d）处理数据
//				 d）根据业务处理数据
				System.out.println("读取的字节(整数)："+buff);
			}
		} catch (FileNotFoundException e) {
			System.out.println("文件路径错误！");
		} catch (IOException e) {
			System.out.println("流断开了，不能继续操作!");
		}finally{
//			 e）关闭流（管道）
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
