package day8.fangwen.test;

public class CurPackageOtherCls {
	public static void main(String[] args) {
		//公共的的资源-同包其他类可以访问
		System.out.println(TestFangwen.publicStaticField);
		//默认修饰符的资源-同包其他类可以访问
		TestFangwen.defaultStaticMethod();
		//私有的  修饰符的资源-当前类可以访问
		//new TestFangwen().privateMethod();
	}
}
