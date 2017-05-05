package day9.finalTest;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 2）final 修饰方法
		 * -》方法就不能重写
		 * ——》父类中有功能（方法）以及完善，可以定义为final-防止子类重写。
		 * 语法：
		 * ... final  返回值类型 方法名 ...
		 * 
		 * 3）final 修饰类
		 * -》类就不能继承
		 * 
		 * ——》父类中所有的数据功能完善，可以定义为final-防止子类继承。
		 * 
		 * 
		 */
		dome1();
	}
	private static void dome1() {
		// TODO Auto-generated method stub
		
	}
}
// final的类 不能继承
//class zifuchuan extends String {
//	
//}


class Animal{
	//呼吸=呼出二氧化碳，吸入氧气-已经完善
	public final void breath(){
		System.out.println("呼出二氧化碳，吸入氧气1");
		System.out.println("呼出二氧化碳，吸入氧气2");
	}
}
class Person extends Animal{
	
}
class Cat extends Animal{

	//final方法不能重写
//	@Override
//	public void breath() {
//	}
	
}
