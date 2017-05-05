package day11.tryCatchFinally;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Test2 {
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
		 * 
		 * java处理异常两种方式
		 * 1）throws：方法自己遇到问题（异常），自己不处理，抛出给上级处理
		 * 2）try catch finally：方法自己遇到问题（异常），自己处理，不抛出给上级，处理之后异常后的代码可以执行。
		 * 
		 * 语法结构：
		 * 
 try{
             ／／可能出现异常的代码
 }[
 	catch(对应的异常类 e){//对应的异常
        　／／出现对应异常的处理代码
  }
  ...
 ]
  ||
[
 finally{
／／一定执行的代码（无论是否异常）
 } 
]
		 * 
		 * 常见形式
		 * 1）try catch：处理有异常的结构 
		 * 
		 * 2）try catch finally：处理有异常的结构 ，有一定要执行的代码
		 * 
		 * 3）try finally：遇到异常，无需处理，一定要执行的代码
		 * 
		 * 
		 * try catch 注意点
		 * 1）catch可以多个，每一个catch处理一种对应的异常-》catch只会执行一个
		 * 2）catch处理异常的时候，可以直接通过父类型处理子类型异常
		 * 3）catch处理异常的时候，多个异常有大小关系，先小异常，后大异常
		 */
		app2();
	}
	
	/**
	 * 
	 * 
	 * catch通过父类型异常处理子类型
	 * 
	 */

	private static void app2() {
		
		while(true){
			try{
				//管理者
				Scanner sc=new Scanner(System.in);
				//被除数
				System.out.println("请输入被除数！");
				int a=sc.nextInt();
				//除数
				System.out.println("请输入除数！");
				int b=sc.nextInt();
				//商
				int c= a/b;
				//余数
				int d= a%b;
				System.out.println("商："+c);
				System.out.println("余数："+d);
				//计算出结果-直接停止循环
				/**
				 * 随机产生一个Sql异常
				 */
				if(Math.random()>0.5){
					throw new SQLException("手动产生的其他异常");
				}
				break;
			}
			catch(RuntimeException ie ){
				/**
				 * 出现了
				 * InputMismatchException
				 * 或
				 * ArithmeticException
				 * 或
				 * 其他RuntimeException异常类
				 */
				//
				//a）提示错误
				System.out.println("输入的不是一个整数或除数不能为0或其他运行错误！");
				//b)重写输入-》下一次循环即可
			}catch(Exception e){
				System.out.println("其他没有处理的异常！！");
			}
			
			
		}
		
	}
	/**
	 * 
	 * 
	 * catch处理多个子类型异常
	 * 
	 */

	private static void app() {
		
		while(true){
			try{
				//管理者
				Scanner sc=new Scanner(System.in);
				//被除数
				System.out.println("请输入被除数！");
				int a=sc.nextInt();
				//除数
				System.out.println("请输入除数！");
				int b=sc.nextInt();
				//商
				int c= a/b;
				//余数
				int d= a%b;
				System.out.println("商："+c);
				System.out.println("余数："+d);
				//计算出结果-直接停止循环
				break;
			}catch(InputMismatchException ie ){
				//出现了InputMismatchException
				//a）提示错误
				System.out.println("输入的不是一个整数！");
				//b)重写输入-》下一次循环即可
			}catch(ArithmeticException ae){
				//出现了ArithmeticException
				//a）提示错误
				System.out.println("除数不能为0！");
				//b)重写输入-》下一次循环即可
			}
		}
		
	}
}
