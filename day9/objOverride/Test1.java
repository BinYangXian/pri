package day9.objOverride;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * object类：所有引用类型的超类型
		 * -》定义了通用的api
		 * 
		 * 1)toString ：把当前对象this-转字符串，字符串描述对象的信息（成员变量..）
		 * obj实现：包名.类名+ @  +hashcodde 16进制整数
		 * 不满足要求
		 * -》需要重写
		 * 拼接的成员变量-》由需求决定
		 */
		dome4();
	}
	/**
	 * toString的优化
	 * 
	 * 1）字符串+的运算符
	 * a）字符串+基本类型  -》自动把基本类型转换为对应值的字符串拼接
	 * b）字符串+引用类型 -》自动把引用类型转换为toString的字符串拼接
	 * 等价于-》 字符串+引用类型.toString 
	 * 
	 * 2）使用print方法的时候
	 * 
	 * System.out.println(引用类型)
	 * 等价于
	 * System.out.println(引用类型.toString())
	 * 
	 * System.out.print()
	 * ...
	 */
	private static void dome4() {
		/**
		 * 学生的对象
		 */
		Student2 s1=null;
		Student2 s2=null;
		Student2 s3=new Student2("李冰冰", 90, 3001111);
		/**
		 * 查看学生的的数据
		 */
		System.out.println("学生1的信息："+s1);//不会空指针，自动把null转换为"null"
		//System.out.println("学生2的信息："+s2.toString());//空指针
		System.out.println(s3);
	}
	/**
	 * 使用object的toString -有重写-表示的信息：名字和分数
	 * 
	 */
	private static void dome3() {
		/**
		 * 学生的对象
		 */
		Student2 s1=new Student2("周杰伦", 80, 8001111);
		Student2 s2=new Student2("刘德华", 70, 2001111);
		Student2 s3=new Student2("李冰冰", 90, 3001111);
		/**
		 * 查看学生的的数据
		 */
		System.out.println("学生1的信息："+s1.toString());
		System.out.println("学生2的信息："+s2.toString());
		System.out.println("学生3的信息："+s3.toString());
	}
	/**
	 * 使用object的toString -没有重写-表示的信息：包名.类名+ @  +hashcodde 16进制整数
	 * 
	 */
	private static void dome2() {
		/**
		 * 学生的对象
		 */
		Student s1=new Student("周杰伦", 80, 8001111);
		Student s2=new Student("刘德华", 70, 2001111);
		Student s3=new Student("李冰冰", 90, 3001111);
		/**
		 * 查看学生的的数据
		 */
		System.out.println("学生1的信息："+s1.toString());
		System.out.println("学生2的信息："+s2.toString());
		System.out.println("学生3的信息："+s3.toString());
	}
	/**
	 * 自己实现了类似于toString功能
	 */
	private static void dome1() {
		/**
		 * 学生的对象
		 */
		Student s1=new Student("周杰伦", 80, 8001111);
		Student s2=new Student("刘德华", 70, 2001111);
		Student s3=new Student("李冰冰", 90, 3001111);
		/**
		 * 查看学生的的数据
		 */
		System.out.println("学生1的信息："+s1.stuToString());
		System.out.println("学生2的信息："+s2.stuToString());
		System.out.println("学生3的信息："+s3.stuToString());
	}
	
}
class Student2{
	String name;
	int score;
	long money;
	public Student2(String name, int score, long money) {
		super();
		this.name = name;
		this.score = score;
		this.money = money;
	}
	//学生的对象(当前对象this)-转字符串，字符串描述对象的信息（成员变量..）
	//需求：表示出学生的名字和分数信息
	@Override
	public String toString() {
		//把当前对象的名字，分数拼接为字符串
		String info= "名字："+this.name+"_分数："+this.score;
		//返回信息
		return info;
	}
	
}
class Student{
	String name;
	int score;
	long money;
	public Student(String name, int score, long money) {
		super();
		this.name = name;
		this.score = score;
		this.money = money;
	}
	//学生的对象(当前对象this)-转字符串，字符串描述对象的信息（成员变量..）
	public String stuToString(){
		//把当前对象的名字，分数，钱拼接为字符串
		String info= "名字："+this.name+"_分数："+this.score+"_钱："+this.money;
		//返回信息
		return info;
	}
	
}



