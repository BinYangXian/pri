package day7.staticField;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * static关键字的作用？
       有些时候，对象有一些通用的属性和方法（与对象无关）时，
我们可以定义为static，表示该属性或方法（属于类）而不是对象。
static的资源-只存储一份。

		1）static 修饰属性-->静态属性，静态变量
		在类中-其每一个对象都需要存储一份的数据-》成员变量
		-》名字，分数 ...
		位置：在类中，与其他方法同级别
		语法：
		[修饰符] 数据类型   变量名1=[值1],...;
		
		访问成员变量（属于对象）语法：
			对象引用.成员变量
		
		
		在类中-所有的对象共享一份的数据-》静态变量
		-》腿的数量，总分 ...
		
		位置：在类中，与其他方法同级别
		语法：
		[修饰符] static 数据类型   变量名1=[值1],...;
		
		访问静态变量(属于类)语法：
		  a）类名.静态变量（推荐）-》如果是当前类的静态变量访问可以省略类名.
		  b）对象引用.静态变量
	
		
		
		注意点
		1）如果静态变量没有初始化值，那么默认自动初始化-》规则和成员变量一致
		
		2）static 修饰方法-->静态方法
		...
		 * java内存的区域
		 * 1）栈：局部变量
		 * 2）堆：new的对象（成员变量）
		 * 3）方法区：静态的变量，执行用的类的信息（class字节码）
		 * 
		 * 
		 */
		dome1();
	}
	private static void dome1() {
		//来一个学生
		Student s1=new Student();
		//来一个学生
		Student s2=new Student();
		//来一个学生
		Student s3=null;
		
		/**
		 * 使用成员变量
		 */
		//存储1的数据
		s1.name="周杰伦";
		s1.score=80;
		
		//存储2的数据
		s2.name="胡一菲";
		s2.score=70;
		
		
		//存储3的数据
//		s3.name="关谷";//为null不能使用成员变量
//		s3.score=85;//为null不能使用成员变量

		/**
		 * 使用静态变量
		 */
		/**
		 *  a）类名.静态变量（推荐）
		 */
		System.out.println("1footCount:"+Student.footCount);
		Student.footCount=2;
		System.out.println("2footCount:"+Student.footCount);
		
		/**
		 *  b）对象引用.静态变量
		 */
		s3=null;
		s1.footCount=3;
		System.out.println("2footCount:"+s1.footCount);
		s3.footCount=4;
		System.out.println("3footCount:"+s3.footCount);
		System.out.println("4footCount:"+Student.footCount);
		
	}
}
class Student{
	/**
	 * 静态变量
	 */
	static int footCount;
	static int sumScore;
	/**
	 * 成员变量
	 */
	String name;
	int score;
	
}
