package day7.thisTest;

public class Test5 {
	
	
	public static void main(String[] args) {
		
		
		//周杰伦对象
		Worker5 w1=new Worker5("周杰伦",'男' );
		//李冰冰对象
		Worker5 w2=new Worker5( "李冰冰",'女');
		
		System.out.println(w1.sex);
		System.out.println(w1.name);		
	}
	
}
/**
 *工作者
 */
class Worker5{
	
	//成员变量-每个上班的人，都有名字和年龄
	String name;
	int age;
	char sex;
	//构造器-初始化名字和年龄
	/**
	 * 
	 * new Worker4(Stirng字符串,int整数); 
	 * 对象后会用对象调用Worker4(String name2, int age2)
	 * 需要-把对象里成员变量-的数据-设置为传入的数据
	 */
	public Worker5(String name2, int age2) {
		this.name = name2;
		age = age2;//等价于 this.age=age2;
	}
	/**
	 * 
	 */
	public Worker5(String name2,char sex) {
		/**
		 * this在使用的时候可以省略
		 * -》如果成员变量和局部变量（或方法参数）有同名时不能省略this.
		 * 同名
		 * 1）直接名字-》访问局部变量（或方法参数）
		 * 2）this.名字-》成员变量
		 * 
		 */
		this.name = name2;
		
		//sex=sex;  //当前参数sex赋值给sex自己
		this.sex=sex;
	}
	
	
}
