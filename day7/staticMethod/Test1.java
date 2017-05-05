package day7.staticMethod;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 在类中定义方法（功能）
		 * 
		 * a）成员方法
		 * -》如果该方法每一个对象执行的效果都不一致，那么用成员方法
		 * -》如：吃饭，当前对象的-体重>150-吃的多，否则吃的少
		 * 
		 * -》定义语法：
		 * public 返回值类型    方法名(参数列表){}
		 * 
		 * -》访问语法：
		 * 对象引用.成员方法
		 * 
		 * 
		 * b）静态方法
		 * -》如果该方法每一个对象执行的效果都一致，那么用静态方法
		 * -》如：求所有学生的平均分，任何学生求出的平均分都一致
		 * 
		 * -》定义语法：
		 * public static 返回值类型    方法名(参数列表){}
		 * 
		 * -》访问语法：
		 *   1）类名.静态方法（推荐）  ---》-》如果是当前类的静态变量访问可以省略类名.
		 * 	 2）对象引用.静态方法
		 * 
		 * 
		 * 注意点
		 * 1）静态的结构（静态属性，方法，块）  不能直接访问   非静态的结构（成员属性，方法）
		 * 原因->静态的不能访问this
		 * 2）非静态的结构（成员属性，方法） 可以直接访问   静态的结构（静态属性，方法，块）
		 * 原因-》静态的先于非静态的存在
		 */
		dome1();
	}

	private static void dome1() {
		//周杰伦
		Student s1=new Student("周杰伦", 160,88);
		//胡一菲
		Student s2=new Student("胡一菲", 110,99);
		
		Student.sumStu+=1;
		Student.sumScore+=s2.score;
		
		/**
		 * 使用成员方法-不同对象-效果不一致
		 */
		//周杰伦吃饭
		s1.eat();
		//胡一菲吃饭
		s2.eat();
		

		/**
		 * 使用静态方法-不同对象-效果一致
		 * 
		 */
		s1.printAvgScore();
		s2.printAvgScore();		
		Student.printAvgScore();
		
	}
}
class Student{
	/**
	 * 静态变量
	 */
	//总人数
	static int sumStu;
	//总分
	static int sumScore;
	/**
	 * 成员变量
	 */
	//名字
	String name;
	//体重
	int weight;
	//分数
	long score;
	/**
	 * 构造器
	 */
	public Student(String name, int weight) {
		//super();
		this.name = name;
		this.weight = weight;
	}
	public Student(String name, int weight, long score) {
		//super();
		this.name = name;
		this.weight = weight;
		this.score = score;
		
		//更新总人数
		sumStu+=1;//等价于：Student.sumStu+=1;
		//更新总分
		Student.sumScore+=score;
		
	}
	/**
	 * 成员方法
	 * 
	 * 吃饭
	 * 
	 * 当前对象的-体重>150-吃的多，否则吃的少
	 * 
	 */
	public void eat(){
		System.out.println("当前学生人数："+sumStu);
		System.out.println("当前吃饭的人："+this.name);
		if(this.weight>150){
			System.out.println("吃的多");
		}else{
			System.out.println("吃的少");
		}
	}
	
	
	/**
	 * 静态的方法
	 * 
	 * 求出并打印平均分
	 */
	public static void printAvgScore(){
		//System.out.println("当前计算的人："+name);
		//总分 
		int s=Student.sumScore;
		//总人数
		int c=Student.sumStu;
		//总分/总人数
		int avgScore= s/c;
		//打印
		System.out.println("平均分："+avgScore);
		
	}
}
