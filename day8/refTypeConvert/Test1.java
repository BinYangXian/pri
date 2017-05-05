package day8.refTypeConvert;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 类型转换
		 * 
		 * 1）基本类型的转换
		 * 
		 * 转换的原因：
		 * 因为有些类型（基本类型）之间有些内容是通用的！
			例如：
			1)数字125，byte short char int long 都可以存储。
		 * 	
		 * 2）引用类型的转换
		 * 
		 * 转换的原因：
		 * 引用类型之间有些数据（对象）是通用
		 * 例如：柳岩  -》中国人，人，动物，明星 ...
		 * 
		 * 语法：
		 * 类型A  变量=类型B的值(对象);
		 * 
		 * a）自动类型转换->编译器自动进行
		 * 	 超类型A  变量=子类型B的值;
		 * 
		 * b）手动（强制）类型转换--》需要手动语法指定
		 *   子类型A  变量=超类型B的值;-》编译错误
		 *   子类型A  变量=(子类型A)超类型B的值;//强制转换
		 * 
		 * 对于类型而言编译器和运行的jvm做的事情
		 * 1）编译看引用类型：只知道    引用类型  不知道   引用指向的对象类型
		 * 2）jvm运行看对象类型：引用所执行的代码，在jvm运行的时候根据对象的类型来执行
		 * 
		 * 
		 * 注意点
		 * 1）强制转换有可能出现ClassCastException
		 * 
		 * -》通过instanceof 判断我们的类型是否可以转换
		 * 
		 * 语法：
		 *   引用变量   instanceof  目标类型
		 * 结果值：布尔值
		 *  a）true：引用变量指向的【对象的类型】可以转换为【目标类型】
		 *  b）false：引用变量指向的【对象的类型】不可以转换为【目标类型】
		 * 
		 */
		dome2();
	}
	/**
	 *  b）手动（强制）类型转换--》需要手动语法指定
		 *   子类型A  变量=超类型B的值;-》编译错误
		 *   子类型A  变量=(子类型A)超类型B的值;//强制转换
	 */
	private static void dome2() {
		//来一个-范冰冰
		Animal a3= new Chinse("范冰冰");
		//来一个-假老练
		Animal a4= new Cat("假老练");
		
		//把a3转换为中国人-不行
		//Chinse c1=a3;
		/**
		 * 编译器 认为a3是animal类型
		 * animal类型存储值，可能不是中国人，不能直接帮我们转换为中国人-》编译错误
		 * 我们知道a3对象是中国人（范冰冰），可以转换为中国人--》需要强转转换-》强转可以完成
		 */
		//如果a3可以转换为chinse再进行转换
		if(a3 instanceof Chinse){
			Chinse c1=(Chinse)a3;
			System.out.println("a3可以转换为chinse");
		}
		
		//把a4转换为中国人-不行
		//Chinse c2=a4;
		/**
		 * 编译器 认为a4是animal类型
		 * animal类型存储值，可能不是中国人，不能直接帮我们转换为中国人-》编译错误
		 * 我们知道a4对象是猫（假老练），不可以转换为中国人--》不能强转转换-》强转也会出现错误（运行错误）
		 * ClassCastException(类型不能转换的错误)
		 */
		//如果a4可以转换为chinse再进行转换
		if(a4 instanceof Chinse){
			Chinse c2=(Chinse)a4;
			System.out.println("a4可以转换为chinse");
		}
		
		
	}
	/**
	 * a）自动类型转换->编译器自动进行
		  超类型A  变量=子类型B的值;
	 */
	private static void dome1() {
		
		//来一个-李冰冰
		Chinse ch1=new Chinse("李冰冰");
		//来一个-汤姆猫
		Cat ca1=new Cat("汤姆猫");
				
		//李冰冰是动物-转换为动物
		Animal a1=ch1;
		//汤姆猫是动物-转换为动物
		Animal a2=ca1;
		
		//来一个-范冰冰
		Animal a3= new Chinse("范冰冰");
		//来一个-假老练
		Animal a4= new Cat("假老练");
		
		//李冰冰不是猫-不能转换为猫
		//Cat ca2=ch1;
		//范冰冰是中国人-应该可以转换为中国人
		//Chinse ch2=a3;//编译器-转换失败
		/**
		 * 编译器 认为a3是animal类型
		 * animal类型存储值，可能不是中国人，不能直接帮我们转换为中国人-》编译错误
		 * 我们知道a3对象是中国人（范冰冰），可以转换为中国人--》需要强转转换
		 */
		
		
	}
}
class Animal{
	String name;
	public Animal() {
	}
	public Animal(String name) {
		this.name = name;
	}
}
class Person extends Animal{
	public Person() {
	}
	public Person(String name) {
		this.name = name;
	}
}
class Chinse extends Person{
	public Chinse(String name) {
		this.name = name;
	}
}
class Cat extends Animal{
	public Cat(String name) {
		this.name = name;
	}
}

