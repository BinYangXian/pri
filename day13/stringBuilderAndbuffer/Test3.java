package day13.stringBuilderAndbuffer;

import java.util.Arrays;

public class Test3 {
	public static void main(String[] args)throws Exception {
		/**
		 * String 数组相关的api
		 * 
		 * 1）分割字符串
		 *    String ->split
		 * 2）String和char[]互相转换
		 *   a)String -》 char []
		 *    String->  toCharArray
		 *   b)char [] -》 String
		 *    String->构造器
		 *    new String(char[])
		 *   
		 * 3）String和byte[]互相转换
		 * 
		 * 计算机存储数据：都是整数
		 * 字符数据-》可以通过整数存储 -》byte[]来存储
		 * 
		 *   a)String -》 byte [] --》字符编码的过程--》设置编码的字符集
		 *   String-》   byte[] getBytes(字符集的名字)  
		 *   
		 *   
		 *   b)byte [] -》 String --》字符解码的过程--》设置编码的字符集
		 *    
		 *      String->构造器
		 *      new String(byte[])
		 */
		dome3();
	}
	private static void dome3()throws Exception {
		/**
		 * 3）String和byte[]互相转换
		 */
		String msg="hi美女";
		
		/**
		 * a)String -》 byte [] --》字符编码的过程--》设置编码的字符集
		 */
		//以 gbk 存储-存储整数
		
		byte[] gbkBytes= msg.getBytes("gbk");
		
		//以 utf8 存储-存储整数
		byte[] utf8Bytes= msg.getBytes("utf-8");
		
		System.out.println("以 gbk 存储-存储整数："+Arrays.toString(gbkBytes));
		System.out.println("以 utf8 存储-存储整数："+Arrays.toString(utf8Bytes));
		
		//把gbk 存储-存储整数-》以gbk字符集 解码为字符串
		String gbkStr=new String(gbkBytes, "gbk");
		
		//把gbk 存储-存储整数-》以utf8字符集 解码为字符串
		String utf8Str=new String(gbkBytes, "utf-8");
		
		System.out.println("gbk解码gbk-内容正常："+gbkStr);
		System.out.println("utf-8解码gbk-内容乱码："+utf8Str);
		
	}
	/**
	 * 
	 */
	
	private static void dome2() {
		//人的信息 
		String personInfo="柳岩_18_java攻城柿_布鲁明顿";
		//把personInfo字符串的信息-装入到数组里存储
		/**
		 *  a)String -》 char []
		 */
		char[] arr= personInfo.toCharArray();
		System.out.println("转换后的字符数组的内容："+Arrays.toString(arr));
		/**
		 * b)char [] -》 String
		 */
		//把arr  的工作信息 取出来-装入字符串String中
		String job=new String(arr, 6, 7);
		System.out.println("工作信息："+job);
	}

	private static void dome1() {
		/**
		 * 1）分割字符串
		 */
		//人的信息 
		String personInfo="柳岩_18_java攻城柿_布鲁明顿";
		//把人的信息-通过"_"分割为4个子信息
		String []personInfoArr= personInfo.split("_");
		//打印子类型
		System.out.println("人的信息："+Arrays.toString(personInfoArr));
	}
}
