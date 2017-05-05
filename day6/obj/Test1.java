public class Test1{
	public static void main(String[] args){
		/**
		
		*/
		dome2();
	}
	/**
		通过【对象的引用】来操作对象->点语法
		
		a）存储数据（成员变量）到对象中
			对象的引用.成员变量=数据值;
			
		b）取出数据（成员变量）到对象中
		  成员变量的类型  接收变量= 对象的引用.成员变量;
			
		c）使用对象的功能（成员方法）
			 对象的引用.成员方法(实际参数);
	*/
	public static void dome2(){
		//创建学生的对象存储下面数据
		//胡一菲        20        男        iphone6
		//来一个对象
		Student huyifei=new Student();
		//存储数据 
		//名字
		huyifei.name="胡一菲";
		//年龄
		huyifei.age=20;
		//性别
		huyifei.sex='男';
		
		//来一个iphone6 
		Phone ip6=new Phone();
		ip6.name="iphone6";
		ip6.size=4.7;
		ip6.cpu="a8";
		//存手机 
		huyifei.havePhone=ip6;
		System.out.println("胡一菲手机的cpu1："+huyifei.havePhone.cpu);
		
		//改变-胡一菲-手机的cpu-为a9
		//方式1：胡一菲引用-操作学生对象-找到手机引用-》操作手机对象-找到手机cpu-设置a9
		huyifei.havePhone.cpu="a9";
		System.out.println("胡一菲手机的cpu2："+huyifei.havePhone.cpu);
		//改变-胡一菲-手机的cpu-为a10
		//方式2:iphone6的引用-》操作手机对象-找到手机cpu-设置a10
		ip6.cpu="a10";
		System.out.println("胡一菲手机的cpu2："+huyifei.havePhone.cpu);
		
		
		
		/**
			成员变量和局部变量对比
			1）位置不同：
			   a）成员变量——》在类中
			   b）局部变量--》在方法中
			2）默认初始值不同：
			   a）成员变量——》没有赋值，有默认初始值（基本类型趋近于0（整数0，小数0.0,字符0对应的字符，布尔false），引用类型为null）
			   b）局部变量--》没有默认字符
		*/
		//陈美嘉       25        男        s6	
		Student chenmeijia=new Student();
		//打印默认值
		System.out.println(chenmeijia.name);
		System.out.println(chenmeijia.sex);
		System.out.println(chenmeijia.age);
		System.out.println(chenmeijia.havePhone);
		
		/**
			null值：引用类型里的特殊值，代表空，引用没有存储对象地址，不能操作对象的资源（成员变量，成员方法）
			否则-》空指针异常  nullpointexception（程序就崩溃了）
		*/
		
		Student liuyan=null;
		//陈美嘉吃饭
		chenmeijia.eat();
		//柳岩吃饭
		liuyan.eat();
	}
	
	
	/**
		创建对象
	*/
	public static void dome1(){
		/**
		创建对象的语法：new，克隆，反射，序列化...
		
		new对象的语法：
			new 类名();
		
			java存储数据-是分区域的
			1）栈内存：局部变量
			2）堆内存：new的对象（成员变量）
		
			new对象的过程（在图书馆放一本书的过程）
			1）在堆内存里创建一个对象  --》在图书馆找一个空余的位置，放好书（位置：2楼3号书架2排3号）
			2）返回对象的地址 -》把位置（2楼3号书架2排3号）返回
		
		*/
		//来一个学生1
		new Student();
		//来一个学生2
		new Student();
		//来一个手机1
		new Phone();
		
		/**
			创建了对象-要使用-必须取名字（设置对象的引用）-》引用就是用来使用对象的
		
			定义变量语法：
			数据类型   变量;
		
			定义对象的引用（引用类型（类）的变量）语法：
			类名	引用变量名;
		*/
		//定义学生引用-liuyan
		Student liuyan;
		//定义学生引用-胡一菲
		Student huyifei;
		/**
			对象的引用要操作对象-》必须存储对应【对象的地址】
			
			引用  存储 (指向) 对象地址的语法：
			引用变量名=new 类名();--》注意：没有类型转换，引用和对象类型必须相同
		*/
		//liuyan -存储一个学生对象的地址
		liuyan=new Student();
		//liuyan -存储一个手机对象的地址
		//liuyan=new Phone();//注意：没有类型转换，引用和对象类型必须相同
		
		/**
			定义引用  同时指向	一个刚创建的对象语法：
				类名   引用变量名=new 类名();
			
		*/
		//来一个引用chenmeijia 指向一个学生对象
		Student chenmeijia=new Student();
		//来一个引用guangu 指向一个学生对象
		Student guangu=new Student();
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