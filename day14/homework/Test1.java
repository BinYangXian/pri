package day14.homework;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 1、字符串基本Api
a)创建一个String对象（"刘德华_java程序员_布鲁明顿"），把它转换为一个char数组，char数组存储String的每一个字符。
b)创建一个StringBuilder对象，把char数组内容添加到StringBuilder对象中
c)删除（第9-11个字符），然后插入字符串"高级攻城狮"到第9个位置
d)再把"java"字符串替换为（"ios"），再倒序存储字符串
e)再把字符串都转换为大写，然后输出结果字符串
		 */
		//a
		String personInfo="刘德华_java程序员_布鲁明顿";
	 	char[] personInfoArr= personInfo.toCharArray();
	 	System.out.println("字符数组："+Arrays.toString(personInfoArr));
	 	//b
	 	StringBuilder sb=new StringBuilder();
	 	sb.append(personInfoArr);
	 	System.out.println("sb1："+sb);
		//c
	 	sb.delete(8, 11);
	 	System.out.println("sb2："+sb);
	 	sb.insert(8, "高级攻城狮");
	 	System.out.println("sb3："+sb);
	 	/**
	 	 * 转换为String使用String的功能完成d ，e
	 	 */
	 	String sb2=sb.toString();
	 	//d
	 	sb2=sb2.replaceAll("java", "ios");
		System.out.println("sb4："+sb2);
		sb2= new StringBuilder(sb2).reverse().toString();
		System.out.println("sb5："+sb2);
	 	//e
		sb2= sb2.toUpperCase();
		System.out.println("sb6："+sb2);
	}
}
