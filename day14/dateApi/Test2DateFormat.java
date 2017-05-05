package day14.dateApi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2DateFormat {
	public static void main(String[] args)throws Exception {
		/**
		 * 
		 */
		dome1();
	}
	/**
	 * dateformat 实现String和date的转换
	 * 
	 * a）String 转Date
	 *  1）创建dateformat时间格式化对象
	 *     SimpleDateFormat(String pattern)  
	 *  2）通过格式化对象进行String转 date
	 *  	Date parse(String source) 
 
	 * b） Date转String
	 *  1）创建dateformat时间格式化对象
	 *     SimpleDateFormat(String pattern)  
	 *  2）通过格式化对象进行date转 String
	 *     String format(Date date)  
	 * 
	 */
	private static void dome1()throws Exception {
		/**
		 * 把用户输入的String时间（xxxx/xx/xx）转换为date时间
		 */
		//管理者
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入String时间（xxxx/xx/xx）");
		String dateStr= sc.next();
		// 1）创建dateformat时间格式化对象
		DateFormat df1=new SimpleDateFormat("yyyy/MM/dd");
		// 2）通过格式化对象进行String转 date
		Date date= df1.parse(dateStr);
		System.out.println("输入的date时间："+date);
		
		/**
		 * 把date时间 转换为  指定的String时间-打印
		 * 格式：xxxx年xx月xx日
		 */
//		1）创建dateformat时间格式化对象
		DateFormat df2=new SimpleDateFormat("yyyy年MM月dd日");
//		2）通过格式化对象进行date转 String
		String dateStr2= df2.format(date);
		System.out.println("输入的date时间2："+dateStr2);
		
	}
}
