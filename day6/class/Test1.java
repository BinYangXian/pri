public class Test1{
	public static void main(String[] args){
		/**
			java里定义（声明）类
			语法：位置-》与其他class类同级别，不能定义到其他类内部
			class 类名{
				//数据-0到多个成员变量
				//功能-0到多个成员方法
			}
			
			成员变量的语法：
			位置：在类中，与其他方法同级别
			[修饰符] 数据类型	变量名1[=值1],变量名2[=值2]...;
			
			成员方法的语法：
			位置：在类中，与其他方法同级别
			语法：在之前的方法基础上不加static（静态的，类的）
		*/
	}
	
	/**
	数据:

名字        年龄    性别    拥有的手机
张三        20        男        iphone6
熊大        25        男        s6
刘德华    18        男         s7


名字                       大小        cpu
iphone6                 4.7           a8
iphone6s plus       5.5           a9
三星s6                   5.2            e7420


功能:

张三吃饭：1）拿筷子，2）把饭送到嘴里，3）吞肚子里
李四吃饭：1）拿筷子，2）把饭送到嘴里，3）吞肚子里

iphone6 打游戏
iphone6s plus 打游戏
三星s6 放音乐
三星s6 打游戏

	*/
}

/**
学生：
 数据： 名字        年龄    性别    拥有的手机
 功能：吃饭
*/
class Student{
	/**
		数据： 名字        年龄    性别    拥有的手机
	*/
	String name;
	int age;
	char sex;
	//拥有的手机
	/**
		手机-定义了对应的类，类也是特殊的数据类型，可以在成员变量的数据类型里使用
		
		数据类型都是规范了一类数据
		String name-。可以存储很多不同的【字符串】数据
		int age：可以存储很多不同的【整数】数据
		Phone havePhone：可以存储很多不同的【phone对象的】数据
		
	*/
	Phone havePhone;
	/**
		 功能：吃饭
	*/
	public void eat(){
		System.out.println("人可以吃饭！");
	}
}
/**
手机：
 数据： 名字         大小        cpu
 功能：打游戏 	放音乐
*/
class Phone{
	/**
		数据： 名字         大小        cpu
	*/
	String name;
	double size;
	String cpu;
	/**
		 功能：打游戏 	放音乐
	*/
	public void playGame(){
		System.out.println("手机可以打游戏");
	}
	public void playMusic(){
		System.out.println("手机可以放音乐");
	}
}