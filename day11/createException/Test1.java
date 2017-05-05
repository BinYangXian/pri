package day11.createException;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 异常的概念

Throwable（异常）的概念：程序非正常执行(运行时)的情况，程序【运行】遇到了问题！！
a） Exception(例外)：业务处理代码层面的时候发生的问题，这种问题可以解决，可以通过异常机制进行处理
b） Error（错误）：业务处理jvm层面（运行环境）发生的问题，这种问题不能或不应该通过异常机制进行处理

		程序在什么时候会产生异常（问题）
		-》程序代码在执行的过程中，不能完成业务要求，那么通常就可以产生异常（问题）。
        	例如：string的charAt取出字符数据需要传入下标，下标不是（0到len-1）那么就找不到
        	对应的数据，那么就产生了异常！！！
        	
        	
        	产生异常（问题）的代码方式
        	a）运算的代码产生
        	  例如： a/b  -》b 为o产生 除数为0的异常
        	b）方法调用产生
        	例如： "hi".charAt(idx)  -》idx 不在（0到len-1）产生 字符串下标越界的异常
        	c）手动throw产生
        	 语法：
        	 throw 异常对象;
        	
        	程序发生了异常-应该catch处理
        	-》如果不处理-》异常会交给jvm处理-
        	-》jvm处理
        	a） 把错误的信息打印到控制台
        	b）把程序（错误的线程）停止了-后面代码不执行
        	
		 */
		dome1();
	}
	private static void dome1() {
		//管理者
		Scanner sc=new Scanner(System.in);
		
		//输入被除数
		System.out.println("请输入被除数");
		int b=sc.nextInt();
		//输入字符串下标
		System.out.println("请输入字符串下标");
		int idx=sc.nextInt();
		
		
		System.out.println("----------1----------");
		/**
		 * a）运算的代码产生
		 */
		int a=5;
		int c=a/b;//可能出现  除数为0的异常
		System.out.println("----------2----------");
		/**
		 * 	b）方法调用产生
		 */
		String msg="hi美女";
		//取出指定下标的字符
		char ch=msg.charAt(idx);//可能出现   下标越界的问题
		System.out.println("----------3----------");
		
	}
}
