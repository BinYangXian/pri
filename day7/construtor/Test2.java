package day7.construtor;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 构造器(函数，方法)有什么用呢？
			-》方便我们在创建对象的时候，快速为对象的数据(成员变量)进行初始化！
        	
        	构造器（方法，函数）的使用步骤
		 * 
		 * a）定义构造器（方法）
		 * 位置：类中
		 * 语法：
		 * public 方法名(形式参数列表){
		 * 	  //构造器初始化数据的代码
		 * 	  //把当前对象（刚创建对象）的成员变量初始化
		 * }
		 *  注意点
		 *  1）没有返回值类型的位置-》相当于void-可以使用return;语句
		 *  2)方法名与类名相同
		 *  3)形式参数列表->写需要初始化的成员变量的对应的参数
		 *  4)如果没有手动定义构造器-那么类中会自动加入空构造器，手动加入构造器-不会加入空构造器
		 *  -空构造器（需要在：反射，继承使用）-一般需要手动加入
		 * 
		 * 
		 * b）使用（执行）构造器（不能直接对象调用）
		 * 
		 * 在new对象的时候自动调用
		 * new对象的过程-》new 类名([构造器参数]);
		 * 1）在堆内存创建出一个对象
		 * 2）用刚创建的对象调用匹配参数的构造器-做数据初始化
		 * 3)返回对象的地址
		 * 
		 * 
		 * 构造器的重载
		 * 作用：为创建对象提供不同的初始化方式
		 * 
		 * 
		 */
		dome1();
	}
	private static void dome1() {
		/**
		 * 学生数据
 
名字               年龄            性别
a）有名字年龄和性别
柳岩                	20          	 女
angelababy   25           女
刘德华            	18       	   男
		 */
		//柳岩                	20          	 女
		/**
		 * new Student2("柳岩",20,'女')
		 * a) new Student2  ->创建一个stuent2对象
		 * b）用刚创建对象 调用 Student2(String name2,int age2,char sex2)进行数据初始化
		 */
		Student2 s1=new Student2("柳岩",20,'女');
		//s1.Student2("柳岩",20,'女');//构造器不能直接调用
		//
		//angelababy   25           女
		Student2 s2=new Student2("angelababy",25,'女');
		
		//      刘德华      	18       	   男
		Student2 s3=new Student2("刘德华",18,'男');
		//打印 
		printStudentInfo(s1);
		printStudentInfo(s2);
		printStudentInfo(s3);
		
		/**
		 * b）有名字和性别
赵子龙        0           男
诸葛亮        0           男
		 */
//		赵子龙        0           男
		Student2 s4=new Student2("赵子龙",'男');
//		诸葛亮        0           男
		Student2 s5=new Student2("诸葛亮",'男');
		//打印 
		printStudentInfo(s4);
		printStudentInfo(s5);
		
	}
	//打印学生信息的功能
	public static void printStudentInfo(Student2 stu){
		System.out.println("------------");
		System.out.println("名字："+stu.name);
		System.out.println("年龄："+stu.age);
		System.out.println("性别："+stu.sex);
	}
	
	
}
class Student2{
	String name;
	int age;
	char sex;
	//构造器（空构造）-不初始化信息
	public Student2() {
	}
	//构造器-初始化 名字，性别
	public Student2(String name2,char sex2){
		name=name2;
		sex=sex2;
	}
	//构造器-初始化 名字，年龄，性别
	/**
	 * 把调用Student2(String name2,int age2,char sex2)构造器
	 * 的对象的成员变量-初始化
	 * */
	public Student2(String name2,int age2,char sex2){
		/**
		 * 调用对象.name=name2;
		调用对象.age=age2;
		调用对象.sex=sex2;
		 * */
		//怎么访问调用当前构造方法的调用对象的成员变量-》直接通过成员变量访问
		name=name2;
		age=age2;
		sex=sex2;
	}
}
