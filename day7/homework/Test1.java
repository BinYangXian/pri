package day7.homework;

public class Test1 {
	public static void main(String[] args) {
		dome1();
	}

	private static void dome1() {
		/**
		 * 需求创建6个对象
                名字    年龄    学号    性别
对象1：    李四     22    s001         男
对象2：    张三     11    s003        不知道性别
对象3：    张三2     15    s005    不知道性别
对象4：    张三3    0    null      不知道性别
对象5：    张三4    0    null      不知道性别
对象6：    没有名字  0    null       不知道性别
		 */
		Student s1=new Student("李四", 22, "s001", "男");
		Student s2=new Student("张三", 11, "s003");
		Student s3=new Student("张三2", 15, "s005");
		Student s4=new Student("张三3");
		Student s5=new Student("张三4");
		Student s6=new Student();
		//打印
		printStuInfo(s1);
		printStuInfo(s2);
		printStuInfo(s3);
		printStuInfo(s4);
		printStuInfo(s5);
		printStuInfo(s6);
	}
	public static void printStuInfo(Student stu){
		System.out.println();
		System.out.println("名字："+stu.name);
		System.out.println("年龄："+stu.age);
		System.out.println("学号："+stu.snum);
		System.out.println("性别："+stu.sex);
		
	}
}


/**
 * 编写一个学生类
   成员变量：名字，年龄，学号，性别，
 * */
class Student{
	String name="没有名字";
	int age;
	String snum;
	String sex="不知道性别";
	//初始化-名字，年龄，学号，性别的构造器
    //shirft alt s
	public Student(String name2, int age2, String snum2, String sex2) {
		//super();
		name = name2;
		age = age2;
		snum = snum2;
		sex = sex2;
	}
	//初始化-名字，年龄，学号的构造器
	public Student(String name2, int age2, String snum2) {
		//super();
		name = name2;
		age = age2;
		snum = snum2;
	}
	//初始化-名字的构造器
	public Student(String name2) {
		//super();
		name = name2;
	}
	//空构造器
	public Student() {
	}
}