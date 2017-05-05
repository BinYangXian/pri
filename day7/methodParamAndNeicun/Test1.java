package day7.methodParamAndNeicun;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * java内存区域
		 * a）栈内存：局部变量 
		 * b）堆内存：new的对象（成员变量）
		 * 
		 * 方法调用的时候参数传递
		 * -》实际参数    给	形式参数    赋值（copy一份值）
		 * a）基本类型：copy的值-》就是业务数据
		 * b）引用类型：copy的值-》就是对象的地址
		 * 
		 * 引用和对象注意点
		 * 1）同一个对象可以被多个引用指向-》同一个电视机可以陪多个遥控器
		 * 其中一个引用改变了对象内容，其他引用也可见。
		 * 
		 * 2)同一个对象引用也可以指向多个对象，同一时刻只能指向一个对象。
		 * 
		 */
		dome3_1();
	}
	
	/**
	 * b）引用类型：copy的值-》就是对象的地址
	 * 
	 * 1）同一个对象可以被多个引用指向-》同一个电视机可以陪多个遥控器
		 * 其中一个引用改变了对象内容，其他引用也可见。
	 */
	public static void dome2_1(){
		Student s1=new Student();
		System.out.println("1age:"+s1.age);
		s1.age=18;
		System.out.println("5age:"+s1.age);
		dome2_2(s1);
		System.out.println("4age:"+s1.age);
	}
	public static void dome2_2(Student s1){
		System.out.println("2age:"+s1.age);
		s1.age=25;
		System.out.println("3age:"+s1.age);
	}
	/**
	 * a）基本类型：copy的值-》就是业务数据
	 */
	public static void dome1_1(){
		int age=18;
		System.out.println("1age:"+age);
		dome1_2(age);
		System.out.println("4age:"+age);
	}
	public static void dome1_2(int age){
		System.out.println("2age:"+age);
		age=25;
		System.out.println("3age:"+age);
	}

	/**
	 * b）引用类型：copy的值-》就是对象的地址
	 * 
	 * 2)同一个对象引用也可以指向多个对象，同一时刻只能指向一个对象。
	 * 
	 */
	public static void dome3_1(){
		Student s1=new Student();
		System.out.println("1age:"+s1.age);
		s1.age=18;
		System.out.println("5age:"+s1.age);
		dome3_2(s1);
		System.out.println("4age:"+s1.age);
	}
	public static void dome3_2(Student s1){
		System.out.println("2age:"+s1.age);
		s1.age=25;
		System.out.println("3age:"+s1.age);
		s1=new Student();
		System.out.println("6age:"+s1.age);
	}
}
//
class Student{
	int age=5;
}

