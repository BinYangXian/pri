package com.bjsxt.listSetMapTest;

import java.lang.reflect.Array;

public class Test3 {
	public static void main(String[] args) {
		//传入String类型
		test1("111");
		//传入Integer类型
		test1(111);
	}
	public static <Type> void test1(Type t){
		//Type[] arr= new Type[];//泛型参数 只是编译期有效
		//获取t运行时的类型
		Class runT= t.getClass();
		//创建t运行时类型的数组
		Type[] arr=(Type[]) Array.newInstance(runT, 10);
		System.out.println("数组类型："+arr);
		System.out.println("数组长度："+arr.length);
	}
}
