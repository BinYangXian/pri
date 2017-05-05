package day15.baozhuangClass;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 
		 * 所有包装类
		 * 
  基本类型		对应的包装类型
  byte   -->Byte
  short  -->Short
  int	 -->Integer
  long   -->Long
  float  -->Float
  double -->Double
  char	 -->Character
  boolean -->Boolean
 注意：除了 int 与 char 外其他的都是第一个字母大写
		 * 
		 */
		dome2();
	}
	/**
	 *包装类型 	转	基本类型
	 * -》拆箱
	 * 以 Integer  -》 int 为例
	 * 
	 * 语法：
	 * 	int 变量=Integer的对象.intValue();
	 * 
	 * 注意点
	 * 1）包装类型-是引用类型-比基本类型多一个null值
	 * 2）包装类型值为null，不能拆箱-否则nullpointexception
	 * 
	 * 
	 * 自动拆箱
	 * 
	 * 语法：
	 * 	int 变量=Integer的对象;
	 * -》等价于
	 * int 变量=Integer的对象.intValue();
	 * 
	 */
	private static void dome2() {
		//包装类型的值
		Integer i1=new Integer(50);
		Integer i2=150;
		Integer i3=null;
		/**
		 * 拆箱		
		 */
		int i11= i1.intValue();
		int i21= i2.intValue();
		//int i31= i3.intValue();//2）包装类型值为null，不能拆箱-否则nullpointexception
		
		//查看数据
		System.out.println("i11:"+i11);
		System.out.println("i21:"+i21);
		//System.out.println("i31:"+i31);
		
		/**
		 * 自动拆箱		
		 */
		int i12= i1;//等价于 i1.intValue（）；
		int i22= i2;
		int i32= i3;
		
		//查看数据
		System.out.println("i12:"+i12);
		System.out.println("i22:"+i22);
		System.out.println("i32:"+i32);
		
	}
	/**
	 * 
	 * 基本类型	转	包装类型
	 * -》装箱
	 * 以 int  -》 Integer 为例
	 * 
	 * 语法1：不会利用常量池
	 * 	构造器-》 Integer(int value) 
	 * 
	 * 语法2：会利用常量池，对应范围内容相同的整数直接使用常量池中提前创建好对象。
	 *  静态方法-》  valueOf(int i) 
	 *  
	 *  字符串（String）常量池：位置在方法区
	 *  整数的常量池 ：位置在堆中
	 *  Byte    范围  -128到127
	 *  Short	范围  -128到127
	 *  Integer	范围  -128到127
	 *  Long	范围  -128到127
	 *  Charactor	范围  0到127
	 *  
	 *  选择语法2更好-》可以利用常量池=节约内存
	 *  
	 *  
	 *  自动装箱（语法2）
	 *  Integer  变量=  int的值;
	 *  等价于-》
	 *  Integer  变量= Integer.valueOf(int的值);
	 *  
	 *  
	 */
	private static void dome1() {
		//基本类型
		int a1=50;
		int b1=250;
		/**
		 * 语法1：不会利用常量池
		 */
		Integer a11=new Integer(a1);
		Integer a12=new Integer(a1);
		Integer b11=new Integer(b1);
		Integer b12=new Integer(b1);
		System.out.println("a11和a12不是同一个对象："+(a11==a12));
		System.out.println("b11和b12不是同一个对象："+(b11==b12));
		
		/**
		 * 语法2：会利用常量池，对应范围内容相同的整数直接使用常量池中提前创建好对象。
		 */
		Integer a13=Integer.valueOf(a1);
		Integer a14=Integer.valueOf(a1);
		Integer b13=Integer.valueOf(b1);
		Integer b14=Integer.valueOf(b1);
		System.out.println("a13和a14不是同一个对象："+(a13==a14));
		System.out.println("b13和b14不是同一个对象："+(b13==b14));
		
		/**
		 * 自动装箱（语法2）
		 */
		
		Integer a15=a1;//等价于： Integer.valueOf(a1);
		Integer a16=a1;
		Integer b15=b1;
		Integer b16=b1;
		System.out.println("a15和a16不是同一个对象："+(a15==a16));
		System.out.println("b15和b16不是同一个对象："+(b15==b16));
	}
}	
