package day8.javaBean;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 
		 * javabean的规范
		 * -》作用-》规范在类中【访问】和【修改】数据（成员变量，静态变量）
		 * 
		 * 读：访问数据
		 * 写：修改数据
		 * 
		 */
		dome1();
	}
	/**
	 * 没有javabean规范-》缺点
	 * 1）不能控制数据的读写
	 * 2）读的时候：不能改变数据内容
	 * 3）写的时候：不能检查数据的内容
	 */
	private static void dome1() {
		//来一个学生
		Student s1=new Student("叶良辰",90);
		//访问名字：
		System.out.println("s1name:"+s1.name);
		//修改名字
		s1.name="王思聪";//不能控制-不能该名字
		//访问名字：
		System.out.println("s1name:"+s1.name);
		
		//修改分数
		s1.score=85;
		System.out.println("s1.score:"+s1.score);
		
		//修改分数
		s1.score=285;//不能检查错误的数据
		System.out.println("s1.score:"+s1.score);
	}
}
/**
学生类：
---------成员变量------------
名字：只能读，不能写
读的时候：格式-》"名字：xxx"

分数：可读写
写的时候：0-150
*/
class Student{
	//成员变量
	public String name;
	public int score;
	//构造器
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
}
