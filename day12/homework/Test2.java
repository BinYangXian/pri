package day12.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 2）定义方法public static int inputInt();
返回值：用户输入的整数
方法内部使用Scanner 读取用户控制台输入整数信息 ！功能描述：用户键盘输入一个整数，
如果输入不能转换为整数的字符串，处理异常（try catch）继续让用户输入（循环），
直到输入正常整数才返回整数。
注意：如果使用同一个Scanner 对象进行输入，遇到输入不匹配异常，不会清除对象里读取的缓存，
需要使用对象的next来清除缓存，或者循环里
用不同的Scanner 对象进行输入。
		 */
		//System.out.println("a输入的整数："+inputInt1());
		System.out.println("b输入的整数："+inputInt2());
	}
	/**
	 * 循环创建了多个Scanner对象-性能差
	 */
	public static int inputInt1(){
		
		while(true){
			try {
				//输入数据
				Scanner sc=new Scanner(System.in);
				System.out.println("请输入一个整数！");
				int inNum= sc.nextInt();
				//数据是整数-结束循环-结束方法-返回整数
				return inNum;
			} catch (InputMismatchException ie) {
				//数据不是整数-继续输入
				System.out.println("数据输入不是很整数！！！");
			}
		}
	}
	/**
	 * 只用一个Scanner 对象
	 */
	public static int inputInt2(){
		//一个Scanner 对象可以多次输入，放入循环外
		Scanner sc=new Scanner(System.in);
		while(true){
			try {
				//输入数据
				System.out.println("请输入一个整数！");
				int inNum= sc.nextInt();
				//数据是整数-结束循环-结束方法-返回整数
				return inNum;
			} catch (InputMismatchException ie) {
				//数据不是整数-继续输入
				System.out.println("数据输入不是很整数！！！");
				//把错误缓存的字符串数据-拿出来
				 sc.next();
			}
		}
	}
	
}
