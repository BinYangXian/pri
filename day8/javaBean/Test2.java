package day8.javaBean;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 
		 * javabean的规范
		 * -》作用-》规范在类中【访问】和【修改】数据（成员变量，静态变量）
		 * 
		 * 读：访问数据
		 * 写：修改数据
		 * 
		 * javabean的规范语法-》设计类的建议
		 * 1）把数据（成员变量静态变量）私有化
		 * 2）数据可读
		 * -》提供 get方法-访问数据
		 * public  数据的类型    get变量名（首字母大写）(){
		 * 	  //返回数据
		 * } 
		 * 3）数据可写
		 * -》提供 set方法-修改数据
		 * public  void    set变量名（首字母大写）(数据的类型   接收数据的参数){
		 * 	  //修改数据
		 * } 
		 */
		dome1();
	}
	/**
	 * 有javabean规范-》优点
	 * 1）可以控制数据的读写
	 * 2）读的时候：可以改变数据内容
	 * 3）写的时候：可以检查数据的内容
	 */
	private static void dome1() {
		//来一个学生
		Student2 s1=new Student2("叶良辰",90);
		//访问名字：
		System.out.println("s1name:"+s1.getName());
		//修改名字
		//s1.name="王思聪";//可以控制-可以该名字
		//访问名字：
		System.out.println("s1name:"+s1.getName());
		
		//修改分数
		s1.setScore(85);
		System.out.println("s1.score:"+s1.getScore());
		
		//修改分数
		s1.setScore(285);//可以检查错误的数据
		System.out.println("s1.score:"+s1.getScore());
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
class Student2{
	//成员变量
	private String name;
	private int score;
	//构造器
	public Student2(String name, int score) {
		this.name = name;
		this.score = score;
	}
	/**
	 *  ---------------get and setter--------------
	 */
	//获取(当前对象（this）-当前学生)名字的方法
	public String getName(){
		//改数据
		String newName="名字："+this.name;
		//返回
		return newName;
	}
	//修改(当前对象（this）-当前学生)分数的方法
	public void setScore(int score){
		//检查数据
		if(score>150||score<0){
			//错误-结束方法
			return ;
		}
		//修改数据
		this.score=score;
	}
	public int getScore() {
		return this.score;
	}
}
