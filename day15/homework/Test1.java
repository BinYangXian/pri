package day15.homework;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 1、时间api练习
a）date和dateformat练习
    1）用户输入一个格式为2015-04_06格式的字符串String时间
通过DateFormat把其转换为时间类型Date（遇到ParseException异常，需要循环让用户输入字符串时间，直到输入正确格式的时间-循环结束）
    2）并把输入的Date时间（时分秒）设置为当前系统时间的（时分秒），并打印输出
Date时间-（格式：2015年12月12日 12点13分13秒）
		 * 
		 */
	 	Date inDate= inputDate();
		System.out.println("输入的时间："+inDate);
		
		setDateInfo(inDate);
		System.out.println("输入的时间-2："+inDate);
		
	}
	/**
	 * 2）并把输入的Date时间（时分秒）设置为当前系统时间的（时分秒），并打印输出
Date时间-（格式：2015年12月12日 12点13分13秒）
	 * @param date
	 */
	private static void setDateInfo(Date date) {
		//当前时间
		Date curDate=new Date();
		//设置信息
		date.setHours(curDate.getHours());
		date.setMinutes(curDate.getMinutes());
		date.setSeconds(curDate.getSeconds());
	}
	/**
	 *  1）用户输入一个格式为2015-04_06格式的字符串String时间
通过DateFormat把其转换为时间类型Date（遇到ParseException异常，需要循环让用户输入字符串时间，直到输入正确格式的时间-循环结束）
   
	 */
	public static Date inputDate(){
		//管理者
		Scanner sc=new Scanner(System.in);
		//循环的输入
		while(true){
			
			try {
				//用户输入时间字符串
				System.out.println("请输入一个时间-格式为2015-04_06");
				String dateStr= sc.next();
				//解析
				DateFormat df=new SimpleDateFormat("yyyy-MM_dd");
				Date date= df.parse(dateStr);
				//判断时间字符串-正确-退出循环-返回时间
				return date;
			} catch (ParseException e) {
				//判断时间字符串-错误-继续循环
				System.out.println("输入错误！");
			}
		}
	}
	
}
