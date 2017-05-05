package day8.fangwen;

import day8.fangwen.test.TestFangwen;

public class OtherPackageCls {
	public static void main(String[] args) {
		//公共的的资源-其他包普通类可以访问
		System.out.println(TestFangwen.publicStaticField);
		
		//默认修饰符的资源-同包其他类可以访问
		//TestFangwen.defaultStaticMethod();
	}
}
