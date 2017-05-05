package day11.throwsAndOverride;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.InputMismatchException;

public class Test1 {
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
		 * 6)抛出的异常类列表  -》子类型不能比父类型惹更多的麻烦（异常）
		 * 		子类型<=超类型
		 * 
		 * <=：跟个数无关，指的时候最大的异常类列表的关系。
		 * 
		 */
	}
}
class Parent{
	
	public void test1()throws IOException{}
	public void test2()throws IOException{}
	public void test3()throws IOException{}
	public void test4()throws Exception{}
	
	public void test5(){}//默认throws runtimeexception
	
}
class Chirld  extends Parent{

	//子类抛出相同的异常可以重写
	@Override
	public void test1()throws IOException{}
	//子类抛出比父类大的异常不以重写
//	@Override
//	public void test2()throws Exception{}

	//子类抛出比父类小的异常可以重写
	@Override
	public void test3()throws FileNotFoundException{}
	
	//大小大小跟个数无关！
	public void test4()throws IOException,SQLException{}
	
	
	public void test5()throws NullPointerException,ClassCastException,InputMismatchException{}
}


