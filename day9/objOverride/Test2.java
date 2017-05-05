package day9.objOverride;

public class Test2 {
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
		 * 
		 * 2)hashcode：把当前对象this-转为整数（哈希值）
		 * 哈希值-》可以用来判断对象的内容是否相同（成员变量）
		 * 约定：如果两个对象的内容相同，那么他们的hashcode必须相同
		 * 
		 * obj实现：对象内容相同-》如果对象地址相同那么就相同
		 * 不满足要求
		 * -》需要重写（判断对象的内容（成员变量））
		 * 通过成员变量（由需求决定） -》生成整数
		 * 
		 * 3)equals：比较两个对象的内容是否相同
		 * 
		 * 约定：如果两个对象的内容相同，返回true，否则false
		 * obj实现：对象内容相同-》如果对象地址相同那么就相同
		 * 
		 * 注意点：
		 * 1)系统的常用类String，文件，时间... 都重写了hashcode和equals并且满足对应的规范（约定）
		 * 2)equals和hashcode都是用来判断对象的内容-需要同时重写-内容相同的标准相同
		 * 
		 */
		dome3();
	}
	/**
	 * 使用重写的 hashcode-生成的整数由对象内容（成员变量）
	 */
	private static void dome3() {
		/**
		 * 学生的对象
		 */
		Student5 s1=new Student5("周杰伦", 80, 8001111);
		Student5 s2=new Student5("周杰伦", 80, 8001111);
		Student5 s3=s2;
		Student5 s4=new Student5("周杰伦", 80, 600);
		Student5 s5=new Student5("李冰冰", 90, 3001111);
		Student5 s6=new Student5("周杰伦1", 81, 3001111);
		Student5 s7=new Student5("周杰伦2", 80, 3001111);
		/**
		 * 查看学生的hashcode
		 */
		System.out.println("s1对应的hash整数："+s1.hashCode());
		System.out.println("s2对应的hash整数："+s2.hashCode());
		System.out.println("s3对应的hash整数："+s3.hashCode());
		System.out.println("s4对应的hash整数："+s4.hashCode());
		System.out.println("s5对应的hash整数："+s5.hashCode());
		System.out.println("s6对应的hash整数："+s6.hashCode());
		System.out.println("s7对应的hash整数："+s7.hashCode());
		//比较equals
		System.out.println("s1和s2是否内容相同:"+(s1.equals(s2)));
		System.out.println("s2和s3是否内容相同:"+(s3.equals(s2)));
		System.out.println("s4和s3是否内容相同:"+(s3.equals(s4)));
		System.out.println("s4和s5是否内容相同:"+s4.equals(s5));
	}
	/**
	 * 使用重写的 hashcode-生成的整数由对象内容（成员变量）
	 */
	private static void dome2() {
		/**
		 * 学生的对象
		 */
		Student4 s1=new Student4("周杰伦", 80, 8001111);
		Student4 s2=new Student4("周杰伦", 80, 8001111);
		Student4 s3=s2;
		Student4 s4=new Student4("周杰伦", 80, 600);
		Student4 s5=new Student4("李冰冰", 90, 3001111);
		Student4 s6=new Student4("周杰伦1", 81, 3001111);
		Student4 s7=new Student4("周杰伦2", 80, 3001111);
		/**
		 * 查看学生的hashcode
		 */
		System.out.println("s1对应的hash整数："+s1.hashCode());
		System.out.println("s2对应的hash整数："+s2.hashCode());
		System.out.println("s3对应的hash整数："+s3.hashCode());
		System.out.println("s4对应的hash整数："+s4.hashCode());
		System.out.println("s5对应的hash整数："+s5.hashCode());
		System.out.println("s6对应的hash整数："+s6.hashCode());
		System.out.println("s7对应的hash整数："+s7.hashCode());
		//比较equals
		System.out.println("s1和s2是否内容相同:"+(s1.equals(s2)));
		System.out.println("s2和s3是否内容相同:"+(s3.equals(s2)));
		System.out.println("s4和s5是否内容相同:"+s4.equals(s5));
	}
	
	/**
	 * 使用object的 hashcode-生成的整数由对象地址来决定
	 */
	private static void dome1() {
		/**
		 * 学生的对象
		 */
		Student3 s1=new Student3("周杰伦", 80, 8001111);
		Student3 s2=new Student3("周杰伦", 80, 8001111);
		Student3 s3=s2;
		Student3 s4=new Student3("李冰冰", 90, 3001111);
		/**
		 * 查看学生的hashcode
		 */
		System.out.println("s1对应的hash整数："+s1.hashCode());
		System.out.println("s2对应的hash整数："+s2.hashCode());
		System.out.println("s3对应的hash整数："+s3.hashCode());
		System.out.println("s4对应的hash整数："+s4.hashCode());
	}
	
}
class Student5{
	String name;
	int score;
	long money;
	public Student5(String name, int score, long money) {
		super();
		this.name = name;
		this.score = score;
		this.money = money;
	}
//	//重新hashcode
//	//需求：（比较学生的名字，分数）-由名字和分数生成hashcode
//	@Override
//	public int hashCode() {
//		//简单算法：各成员变量的hash加起来返回
//		int hash= this.name.hashCode()+this.score;
//		return  hash;
//	}
//	//重写equals
//	@Override
//	public boolean equals(Object obj) {
//		//比较 this和obj的内容是否相同
//		if(obj instanceof Student5){//比较的是学生
//			Student5 other=(Student5)obj;
//			//比较this和other
//			if(this.name.equals(other.name)&&this.score==other.score){
//				return true;
//			}
//			
//		}
//		//比较的不是学生-或不相同
//		return false;
//	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student5 other = (Student5) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	
	
}
class Student4{
	String name;
	int score;
	long money;
	public Student4(String name, int score, long money) {
		super();
		this.name = name;
		this.score = score;
		this.money = money;
	}
	//重新hashcode
	//需求：（比较学生的名字，分数）-由名字和分数生成hashcode
	@Override
	public int hashCode() {
		//简单算法：各成员变量的hash加起来返回
		int hash= this.name.hashCode()+this.score;
		return  hash;
	}
	
	
}
class Student3{
	String name;
	int score;
	long money;
	public Student3(String name, int score, long money) {
		super();
		this.name = name;
		this.score = score;
		this.money = money;
	}
	
}


