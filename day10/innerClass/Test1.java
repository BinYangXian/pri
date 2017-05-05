package day10.innerClass;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 1、内部类的概念
一般情况，我们把类定义成独立的单元。
有些情况下，我们把一个类放在另一个类的内部（类中，方法中）定义，称为内部类。
例子：
1）
动物
人
猫
狗
手机（只有人会用）

2）
回调函数：利用内部类，接口，多态，实现回调函数。

2、内部类的作用：内部类提供了更好的封装！！通过访问修饰符可以让内部类只让外部类访问


			内部类-的分类
			a）局部内部类  -》对应局部变量
			 -》定义在方法中类
			b）成员内部类 -》对应成员变量
			-》定义在类中类，不能加static
			c）静态内部类 -》对应静态变量
			-》定义在类中类，加static

		 */
	}
}
class Person{
	public static void main(String[] args) {
		//人使用外部类手机-可以用
		new Phone1();
		//人使用内部类手机(默认修饰符)-可以用
		new Person.Phone2();
		//人使用内部类手机(私有修饰符)-可以用
		new Person.Phone3();
	}
	//手机-内部类(默认修饰符)-放入人类中-只给人用
	static class Phone2{
		
	}
	//手机-内部类(私有修饰符)-放入人类中-只给人用
	private static class Phone3{
		
	}
}
class Cat{
	public static void main(String[] args) {
		//猫使用外部类手机-可以用
		new Phone1();
		//猫使用内部类手机(默认修饰符)-可以用
		new Person.Phone2();
		//猫使用内部类手机(私有修饰符)-不可以用
		//new Person.Phone3();
	}
}
class Dog{
}
//手机-外部类
class Phone1{
	
}