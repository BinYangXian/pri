package day13.stringBuilderAndbuffer;

public class Test1 {
	public static void main(String[] args) {
		/**
b）String类
其对象表示的字符串不能改变，内部存储数据的char数组是final的！！

c）StringBuilder类
  其对象表示的字符串可以改变,内部存储数据的char数组不是final的！！ 
线程不安全	效率高。

d）StringBuffer类
其对象表示的字符串可以改变,内部存储数据的char数组不是final的！！ 
线程安全	效率相对StringBuilder略低。
		 */
		dome1();
	}
	private static void dome1() {
		/**
		 * String 是不可变字符串-其对象表示的字符串不能改变，自身改变的操作，都会产生新的字符串对象
		 */
		String personInfo="古力娜扎_";
		//连接-年龄
		personInfo=personInfo.concat("17岁_");
		//连接-工作
		personInfo=personInfo.concat("java攻城狮_");
		//查看数据
		System.out.println("人的信息1："+personInfo);
		/**
		 * StringBuilder 不可变字符串-其对象表示的字符串可以改变，自身改变的操作，不会产生新的字符串对象
		 * 直接改自己内容。
		 */
		StringBuilder personInfo2=new StringBuilder("古力娜扎_");
		System.out.println("人的信息2："+personInfo2);
		//连接-年龄
		personInfo2.append("17岁_");
		//连接-工作
		personInfo2.append("java攻城狮_");
		//查看数据
		System.out.println("人的信息3："+personInfo2);
		
	}
}
