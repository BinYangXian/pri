package day8.extendsAndOveride;

public class Test3 {
	public static void main(String[] args) {
		/**
		 * 方法的重写的语法
		 * 1）有超类型和子类型
		 * 2）重写是针对成员方法
		 * 3）方法签名（方法名+参数列表）
		 *     子类型==超类型
		 * 4）访问修饰符  -》子类型要比超类更开放
		 * 	       子类型>=超类型
		 * 
		 * 注意点：超类型private方法不能重写
		 * 
		 * 5）返回值类型  ->与访问修饰符关系相反
		 * 	   a）void+基本类型
		 * 			子类型==超类型
		 * 	   b）引用类型
		 * 			子类型<=超类型
		 * 
		 * 检查方法是否被重写！
		 * 在子类型重写的方法上加@Override
		 * a)完成重写-》不会编译错误
		 * b）没有重写-》编译错误
		 */
	}
}
class Parent{
	void test1(){}
	private void test2(){}
	public long test3(){return 0;}
	public long test4(){return 0;}
	public long test5(){return 0;}
	
}
class Child extends Parent{
	
	@Override
	void test1(){}
	
//	@Override
//	void test2(){}
	
	@Override
	public long test3(){return 0;}

	
}


