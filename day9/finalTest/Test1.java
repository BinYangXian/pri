package day9.finalTest;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 1、final 关键字理解
        最终的，不希望别人改变的。

2、final 关键字作用
    a）不希望定义的变量不被重新赋值！如固定的数据如：Math.PI
    b）不希望子类重写已有的功能，认为该功能完美！
    c）不希望其他类继承某类，认为某类已经完美，不需要扩充，
    如：String 类，基本类型包装类，这些类功能固定没有扩充的必要
    
    
    命名规范
    1）类名：...
    2）变量方法名：...
    3)常量名：多个单词组成，每一个字母大写，通过下划线分割
   			PERSON_ID_CARD
    	
    常量和变量
    变量:定义一次，赋值多次
    常量:定义一次，赋值一次		
    		
    		
    
    1）final 修饰变量  -》常量
    
    a）局部变量-》局部常量
    
    
    ------------------------------
    b）成员变量-》成员常量
    c）静态变量-》静态常量
    注意点：
    1）成员常量和静态的常量没有自动初始化默认值
    2）成员常量和静态的常量必须手动初始化值
    3)成员常量初始化：a）定义就初始化  b）在构造器初始化 ｛构造块（代码里基本不出现）也可以初始化-》自己了解｝
    4)静态常量初始化：a）定义就初始化   ｛静态块（代码里出现几率小）也可以初始化-》自己了解｝
		 */
		dome1("111");
		
	}
	private static void dome1(final String ID_CARD2) {
		//局部常量
		final String ID_CARD;
		//局部变量
		int age ;
		
		//设置局部常量值 （只能一次）
		ID_CARD="x005";
//		ID_CARD="x005";
//		ID_CARD="x006";
		//设置局部变量值 （可以多次）
		age=3;
		age=18;
		age=25;
		age=60;
		/**
		 *方法参数是常量 
		 *-》在调用方法的时候已经赋值，在方法内不能改变值
		 */
		//ID_CARD2="x005";
		
		/**
		 * 常量的类型
		 * 
		 * 1）基本类型：不能改变值-》基本类型存储的数据-业务数据不能改变
		 * 
		 * 2）引用类型：不能改变值-》基本类型存储的数据-对象的地址-》不能改变对象的地址！
		 */
		//基本类型的常量
		final char sex1 ='男';
		//引用类型的常量
		final Student sex2 =new Student('男');
		//改变值
		//sex1='女';
		sex2.sex='女';//没有改变sex2的对象地址
		System.out.println("sex2-sex："+sex2.sex);
		//sex2=new Student('男');//改变sex2的对象地址
	}
}
class Student{
	/**
	 * 静态常量
	 */
	//腿的数量不能改变
	//静态常量初始化：a）定义就初始化
	final static int FOOT_COUNT=2;
	
	/**
	 * 成员常量
	 */
	//学号不能改变
	//成员常量初始化：a）定义就初始化
	final String STUDY_NUM1="没有学号";
	//成员常量初始化：b）构造器初始化
	final String STUDY_NUM2;
	
	
	char sex;
	public Student(char sex) {
		this.sex = sex;
		this.STUDY_NUM2="没有学号";
	}
	public Student(char sex,String STUDY_NUM2) {
		this.sex = sex;
		this.STUDY_NUM2=STUDY_NUM2;
	}
	public Student() {
		this.STUDY_NUM2="没有学号";
	}
}