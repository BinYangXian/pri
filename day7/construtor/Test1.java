package day7.construtor;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 构造器(函数，方法)有什么用呢？
			-》方便我们在创建对象的时候，快速为对象的数据进行初始化！
        	
		 * 
		 */
		dome1();
	}
	/**
	 * 没有构造器-初始化数据-代码复杂
	 */
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
		//创建对象
		Student s1=new Student();
		//设置数据
		s1.name="柳岩";
		s1.age=20;
		s1.sex='女';
		//angelababy   25           女
		//创建对象
		Student s2=new Student();
		//设置数据
		s2.name="angelababy";
		s2.age=25;
		s2.sex='女';
		//刘德华            	18       	   男
		//创建对象
		Student s3=new Student();
		//设置数据
		s3.name="刘德华";
		s3.age=18;
		s3.sex='男';
	}
}
class Student{
	String name;
	int age;
	char sex;
	
}
