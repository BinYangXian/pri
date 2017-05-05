package day10.stringConstant;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * String字符串的常量池
		 * 位置-》在方法区内存里的一块区域
		 * 作用-》缓冲相同内容的字符串对象，相同字符串内容的对象只存储一份，可以节约内存。
		 * 
		 * java内存区域
		 * 栈：局部变量
		 * 堆：new 对象（成员变量..）
		 * 方法区：类的信息（class字节码），静态变量，String字符串常量池
		 * 
		 */
		
		dome2();
	}
	/**
	 * String对象的创建方式
	 * 
	 * 1）字面值创建  -》可以利用字符串常量池
	 * 语法： "0到多个字符"
	 * 
	 * 2）new对象创建-》不可以利用字符串常量池
	 *  a）new String()  -》对应    ""
	 *  b）new String(字符串的值)对应    "多个字符"
	 * 
	 * 可以利用字符串常量池
	 * --》相同的字符串的内容的对象-》只会存储一份在常量池中
	 * 
	 * 不可以利用字符串常量池-》存储在堆中
	 * --》相同的字符串的内容的对象-》存储多份字符串对象
	 * 
	 * --》尽量选择字面值方式-性能更好
	 * 
	 * 可以通过intern() 返回字符串对象在常量池对应的字符串对象
	 * 
	 */
	private static void dome2() {
		/***
		 * 1）字面值创建  -》可以利用字符串常量池
		 */
		String s1="美女";
		String s2="美女";
		System.out.println("s1和s2是否同一个对象："+(s1==s2));
		System.out.println("s1和s2是否内容相同："+(s1.equals(s2)));
		/***
		 * 2) new对象创建-》不可以利用字符串常量池
		 */
		String s3=new String("美女");
		String s4=new String("美女");
		String s5=new String("美女2");
		System.out.println("s3和s4是否同一个对象："+(s3==s4));
		System.out.println("s3和s4是否内容相同："+(s3.equals(s4)));
		
		System.out.println("s3和s1是否同一个对象："+(s3==s1));
		System.out.println("s3和s1是否内容相同："+(s3.equals(s1)));
		
		
	}
	/**
	 * String 字符串：固定的（不可变，只读）字符串-》其对象的内容是不可改变的。
	 * 原因-->其内部存储数据的数组是常量不能改变！
	 * 
	 * ==:是比较变量（常量）里存储内容：
	 * a）基本类型 -存储的业务值，直接比较业务值
	 * b）引用类型 -存储的对象地址，直接比较对象地址
	 * 
	 * 
	 */
	private static void dome1() {
		
		//人的信息
		String personInfo="柳岩";
		//拼接-年龄
		String personInfo2 =personInfo+"18岁";
		System.out.println("原来的字符串："+personInfo);
		System.out.println("新的字符串："+personInfo2);
		System.out.println("不是同一个对象（字符串String的自身操作会产生新的对象）："+(personInfo==personInfo2));
		
		/**
		 *对于以下字符串对象（内容相同）-存储1个性能更好
		 *-->直接存储在字符串常量池中
		 */
		String s1="hi";
		String s2="hi";
		String s3="hi";
		String s4="hi";
	}
}
