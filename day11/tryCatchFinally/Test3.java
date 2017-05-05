package day11.tryCatchFinally;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test3 {
	public static void main(String[] args) {
		/**
		 * 异常相关的关键字
		 * 
		 * throw：动词，丢出，扔出异常
		 * 
		 * throws：名称，声明可能出现的异常类的列表
		 * -------------------------
		 * 
		 * try：（正常业务执行）监听程序正常业务代码里可能出现的问题，把对应的问题报告给对应的catch。
		 * catch（遇到异常执行）:负责处理程序里某一种问题（异常-》绑定异常类）
		 * finally:处理一定执行的代码（异常或正常业务都要执行）
		 * 
		 */
		app();
	}
	/**
	 * 把personinfo.txt文件的数据打印到控制台
	 */
	private static void app() {
		//提高作用域，finally需要访问
		FileReader fr=null;
		try {
			//a）文件的路径
			//String filePath="D:\\software\\eclipse_javaEE\\workspace4.4\\javaSe_1611_3\\src\\day11\\tryCatchFinally\\personInfo.txt";
			//b）连接到文件和程序的管道
			fr=new FileReader("ddd");
			//c）通过管道读取数据
			for (int i = 0; i < 14; i++) {
				//整数
				int ch= fr.read();
				//打印字符
				System.out.print((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("文件路径错误");
			
		} catch (IOException e) {
			System.out.println("管道断开了不能读取数据");
		}finally{
			//关闭管道-无论是否有异常都需要关闭-放入finally
			//d)关闭管道
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("----关闭-----");
		}
		
		
	}
	
}
