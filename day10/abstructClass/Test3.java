package day10.abstructClass;

public class Test3 {
	public static void main(String[] args) {
		
		/**
		 * 1、抽象类:也是类，相比普通类而言，多了可以定义抽象方法

2、抽象方法 ？
    就是有功能名字，没有功能实现。
3、抽象方法有什么用？
    有时候，类中有一些功能不能确定具体怎么完成，就可以定义为抽象的方法
抽象和具体不是一定的：由需求，由客户决定
		 * 
		 * 
		 * 抽象类的语法：
		 * abstract class 抽象类名{
		 *     //成员变量，静态变量，成员方法，静态方法，构造器...
		 *     //0到多个抽象的方法
		 * }
		 * 
		 * 抽象的方法的语法：
		 * 访问修饰符  abstract 返回值类型    方法名(参数列表);
		 * 
		 * 
		 * 抽象类的注意点
		 * 1）抽象类的子类型
		 *     a）普通类：必须重写所有的抽象的功能
		 *     b）抽象类：可选重写所有的抽象的功能
		 * 
		 */
		
		
		
//		//市场部员工-柳岩上班
		new MarketStaff3("柳岩").goWork();
		
//		//开发部员工-刘德华上班
		//来一个开发部员工-刘德华
		Staff3 s2=  new  CoderStaff3("刘德华");
		//刘德华上班
		s2.goWork();
//		//开发部员工-周杰伦上班
		//来一个开发部员工-周杰伦
		Staff3 s3=  new  CoderStaff3("周杰伦");
		//周杰伦上班
		s3.goWork();
		
		
		/**
		 * Staff3类是用来规范具体员工的-不应该创建对象-》抽象类可以实现
		 */
//		Staff3 s4=new Staff3("王宝强");
//		s4.goWork();
		
		/**
		 * Boss2类没有实现 工作功能，编译器没有检查
		 */
		Boss2 s5=new Boss2("周星驰");
		s5.goWork();
	}
	
}
/**
超类型：员工-规范所有的员工
统一api：工作 working

超类型是抽象类定义的

a）超类型的对象不可以创建-》编译器会检查
b）超类型里的不知道怎么实现的功能-》，父类不应该有实现的代码，
，子类必须重写该方法，抽象的方法可以实现
*/
abstract class Staff3{
	String name;
	
	public Staff3(String name) {
		this.name = name;
	}

	/**
	 * 工作
	 * -》工作的功能员工不知道怎么实现-》只知道员工有该功能，父类不应该有实现的代码，
	 * 子类必须重写该方法
	 */
	public abstract void working();
	/**
	 * 上班的功能-》上班的功能员工知道怎么实现-》有实现步骤
	 * 
	 * this(当前对象)： 上班的员工
	 */
	public  void goWork(){
		System.out.println();
		//赶车上班
		System.out.println(this.name+"赶车去公司");
		//工作-利用多态-调用具体员工的工作
		this.working();
		//赶车回家
		System.out.println(this.name+"赶车回家");
	}
}
/**
市场部员工
*/
class MarketStaff3 extends Staff3{

	
	public MarketStaff3(String name) {
		super(name);
	}

	@Override
	public void working() {
		System.out.println("陪客户玩，陪喝酒，聊天，跑业务1");
		System.out.println("陪客户玩，陪喝酒，聊天，跑业务2");
	}
}
/**
开发部员工
*/
class CoderStaff3 extends Staff3{

	
	public CoderStaff3(String name) {
		super(name);
	}
	@Override
	public void working() {
		System.out.println("写代码，调试bug1");
		System.out.println("写代码，调试bug2");
	}
}

/**
老板
*/
class Boss2 extends Staff3{
	public Boss2(String name) {
		super(name);
	}
	/**
	 * 没有提供工作功能，编译器强制重写
	 */
	@Override
	public void working() {
		System.out.println("视察工作，查看报表，看赚了多少钱1");
		System.out.println("视察工作，查看报表，看赚了多少钱2");
	}
}

/**
 * 	经理 ->不知道怎么工作
 *  a）开发部经理  -》    安排写代码....
 *  b）市场部经理  ->  安排约谈业务 ...
 * */
abstract class Manage extends Staff3{
	
	public Manage(String name) {
		super(name);
	}
	
}