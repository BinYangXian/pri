package day8.fangwen.test;

public class TestFangwen {
	/**
	 * 访问修饰符作用？

  控制资源（类，属性（成员变量，静态变量），方法）被访问的位置！
	 * 
	 * 4种访问修饰符							访问位置
	 * 					
	 * a）public  公共的			a）当前类使用 b)同包的其他类  c）其他包的子类  d）其他包的普通类
	 * 
	 * b）protected   受保护的		a）当前类使用 b)同包的其他类  c）其他包的子类
	 * 
	 * c）default（没有该关键字-默认加入） 默认的    a）当前类使用 b)同包的其他类
	 * 
	 * d）private  私有的       a）当前类使用
	 * 
	 * 
	 * 使用的位置
	 * a）类： 【普通外部类】只能使用 public 或default
	 * b）属性和方法：可以使用  4种访问修饰符
	 * 
	 * 注意点
	 * 1）一旦我们的资源（类，方法，属性）不能访问-》编译错误 xxx is not visible（不可访问）
	 * 
	 * 
	 */
	public static void main(String[] args) {
		//公共的的资源-当前类可以访问
		System.out.println(publicStaticField);
		System.out.println(TestFangwen.publicStaticField);
		
		//默认修饰符的资源-当前类可以访问
		TestFangwen.defaultStaticMethod();
		
		//私有的  修饰符的资源-当前类可以访问
		//TestFangwen tf =new TestFangwen();
		//tf.privateMethod();
		new TestFangwen().privateMethod();
		
	}
	//公共的静态的属性
	public static String publicStaticField="公共的静态的属性";
	
	//默认修饰符 静态的方法
	static void defaultStaticMethod(){
		System.out.println("默认修饰符 静态的方法");
	}
	//私有修饰符成员的方法
	private void privateMethod(){
		System.out.println("私有修饰符成员的方法");
	}
}


