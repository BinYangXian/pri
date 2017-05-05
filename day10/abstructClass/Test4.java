package day10.abstructClass;

public class Test4 {
	public static void main(String[] args) {
		/**
		 * 抽象类注意点:
    1)、抽象类不能实例化（及时没有抽象方法）,需要子类实例化
    2)、一定存在子类，不然抽象类无意义
    3)、抽象类不一定有抽象方法，但是有抽象方法一定是抽象类，没有抽象方法的抽象类，也不能实例化。
    4)、abstract不能和final一起使用，矛盾了
    5)、abstract不能和static一起使用，抽象功能针对成员方法（面向对象）
		 */
	}
}
// 3
abstract class A{}
//class B{ 
//	abstract void test1();
//}

//4

abstract class C{
	abstract void test2();
}