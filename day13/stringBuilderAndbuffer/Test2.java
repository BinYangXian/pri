package day13.stringBuilderAndbuffer;

public class Test2 {
	public static void main(String[] args) {
		dome3();
	}
	/**
	 * String和Stringbuilder都是字符串的类
	 * -》都提供了对字符串操作的功能
	 * -》使用对方的功能-需要互相转换后进行使用
	 * 
	 * a）String转Stringbuilder
	 * 	Stringbuilder构造器
	 *   new StringBuilder(String对象)
	 * b）Stringbuilder转String
	 *    Stringbuilder对象.toString()
	 */
	private static void dome3() {
		
	}
	/**
	 * 字符串StringBuilder和buffer的常用api
	 * 
 1)append 追加
 2)delete 删除
 3)insert 插入
 4)replace 替换
 5)reverse 反转(倒置存储字符数据)
	 * 
	 */
	private static void dome2() {
		StringBuilder personInfo=new StringBuilder("柳岩_");
		System.out.println("人的信息1："+personInfo);
		/**
		 *  1)append 追加
		 */
		//追加年龄
		personInfo.append("18岁_");
		/**
		 * StringBuilder自身操作可以直接改变自己的内容，也会返回自己的对象（this），
		 * 方便链式编程。
		 */
		//追加性别，工作，地址，手机号
		personInfo.append('女').append('_').append(new char[]{'攻','城','柿','_'}).append("7474741_");
		System.out.println("人的信息2："+personInfo);
		/**
		 * 2)delete 删除
		 */
		personInfo.delete(9, 12);
		System.out.println("人的信息3："+personInfo);
		/**
		 * 3)insert 插入
		 */
		personInfo.insert(9, "模特");
		System.out.println("人的信息4："+personInfo);
		/**
		 * 4)replace 替换
		 */
		personInfo.replace(3, 5, "125");
		System.out.println("人的信息5："+personInfo);
		
	}
	/**
	 * 字符串String的常用api
	 * 
	 *boolean startsWith(String) 是否以某字符串开始
      boolean endsWith(String)  是否以某字符串结束 
      boolean contains(String);  查找子字符串在原字符串是否存在
    
      int length 字符串长度
      public char charAt(int index) 字符串某个下标位置的字符
      boolean equals(Object);    比较内容
      boolean equalsIgnoreCase(String) 比较内容，不区分大小写
      String subString(int beginIndex) 从某个位置开始截取后面字符串直到结束
      int indexOf(String) 查找子字符串在原字符串的位置，没有就返回-1
      String replaceAll(String regex, String replacement)  替换所有匹配字符串
      String replaceFirst(String regex, String replacement) 替换第一个匹配字符串
      String trim()    去除左右
      String toLowerCase();   转小写
      String toUpperCase();  转大写
	 * 
	 * 
	 */
	private static void dome1() {
		//明星数组
		String [] starName=new String[]{
				"周杰伦",
				"周杰",
				"周星驰",
				"周润发",
				"2周",
				"刘德华"
		};
		//需求：找到数组里所有姓周（以周作为字符的开始）的人的名字-打印
		for (String curStar : starName) {
			//判断
			if(curStar.startsWith("周")){
				System.out.println(curStar);
			}
		}
	}
}
