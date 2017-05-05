package day18.printStream;

import java.io.File;
import java.io.PrintStream;

public class Test2 {
	public static void main(String[] args)throws Exception {
		/**
		 * 系统System的属性
		 * 
		 * System.in:连接控制台的输入流inputstream
		 * System.out：连接控制台的输入出流printStream-》打印【提示信息-黑色】
		 * System.err：连接控制台的输入出流printStream-》打印【错误信息-红色】
		 * 
		 * --》可以通过
		 * System.setOut
		 * System.setIn
		 * System.setErr
		 * ->改变连接的流
		 * 
		 */
		dome1();
	}

	private static void dome1() throws Exception{
		System.out.println("打印黑色信息到控制台111");
		System.out.println("打印黑色信息到控制台222");
		/**
		 * 把System.out连接的流改为连接到文件test2.txt的printStream
		 */
		//保存连接到控制台的printStream
		PrintStream consolePs=System.out;
		
		//连接到test2的printStream
		PrintStream ps1=new PrintStream(new File("src/day18/printStream/test2.txt"));
		//设置
		System.setOut(ps1);
		
		
		System.out.println("打印黑色信息到test2文件111");
		System.out.println("打印黑色信息到test2文件222");
		//还原到控制台
		System.setOut(consolePs);
		System.out.println("打印黑色信息到控制台333");
		System.out.println("打印黑色信息到控制台444");
		
		
	}
}
