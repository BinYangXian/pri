package day15.homework;

public class Test3 {
	public static void main(String[] args) {
		/**
		 * 1、类型转换
a)创建一个String内容为"张无忌_98_男"，
b）把字符串内容中的【年龄】转化为Integer整数
c） 再转换为int整数值
d）再转换为对应整数的char字符
e）再转换为Character字符
f） 再转换为String字符串
		 */
		//a
		String str="张无忌_98_男";
		//b
		String age= str.split("_")[1];
		Integer age2= Integer.valueOf(age);
		//c
		int age3=age2.intValue();
		//d
		char ch=(char) age3;
		//e
		Character ch2= Character.valueOf(ch);
		//f
		String str2= ch2.toString();
	}
}
