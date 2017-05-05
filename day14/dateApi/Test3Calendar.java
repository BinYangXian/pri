package day14.dateApi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test3Calendar {
	public static void main(String[] args) {
		dome3();
	}
	
	/**
	 * 获取和修改时间对应字段值（统一set和get）
	 * 
	 * set(int field, int value) 
          将给定的日历字段设置为给定值。
       int get(int field) 
          返回给定日历字段的值。 
     
     
     
getMaximum 返回此 Calenda r 实例给定日历字段所有时间的最大值。
例如：2月最大月天数，返回31
  getActualMaximum    给定此 Calendar 的时间值，返回指定日历字段当前时间拥有的最大值。
例如：2月最大月天数，返回28
          
	 */
	
	private static void dome3() {
		//小红的生日
		Calendar xhBirCa=new GregorianCalendar(2008,2-1,12);
		//小明的生日
		Calendar xmBirCa=new GregorianCalendar(2008,5-1,12);
		//小明出生的号数
		int dayOfMonth= xmBirCa.get(Calendar.DAY_OF_MONTH);//可读性好
//		int dayOfMonth= xmBirCa.get(5);//可读性差
		System.out.println("小明出生的号数:"+dayOfMonth);
		int dayOfWeek= xmBirCa.get(Calendar.DAY_OF_WEEK);//可读性好
		System.out.println("小明周几出生的(1-7表示周日到周六):"+dayOfWeek);
		
		
		/**
		 * 获取时间相关的最大天数 getActualMaximum
		 */
		System.out.println("2月的最大天数："+xhBirCa.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("5月的最大天数："+xmBirCa.getActualMaximum(Calendar.DAY_OF_MONTH));
		/**
		 * 获取字段相关的最大天数 getMaximum
		 */
		System.out.println("月中天的最大天数："+xhBirCa.getMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("月中天的最大天数："+xmBirCa.getMaximum(Calendar.DAY_OF_MONTH));
		
	}

	/**
	 * calendar和date都会对时间处理的功能-使用对方的功能需要转换
	 * 
	 * a）calendar转date
	 * 
	 *    calendar时间.getTime()
	 * 
	 * b）date转calendar
	 * 	 1)创建打酱油的calendar
	 *      GregorianCalendar()
	 *      
	 *   2)把date时间设置到calendar对象上
	 *   calendar时间.setTime(date时间)
	 * 
	 */
	private static void dome2() {
		/**
		 * ....
		 */
	}
	/**
	 * 
	 * calendar转String时间的功能
	 * a)calendar转date
	 * b）date转String   -》dateformat
	 * 格式： xxxx年xx月xx号 xx时xx分xx秒
	 */
	public static String calendarToString(Calendar ca){
		//a
		Date date= ca.getTime();
		//b
		DateFormat df=new SimpleDateFormat("yyyy年MM月dd号 HH时mm分ss秒");
		String dateStr= df.format(date);
		return dateStr;
	}
	
	
	/**
	 * a）创建对象
 
    Calendar 是抽象的，不能直接实例化
  1）通过Calendar中静态方法getInstance() 当前时间
  2）通过创建子类GregorianCalendar 对象
  当前时间
  GregorianCalendar()
  指定年月日时间
  GregorianCalendar(int year, int month, int dayOfMonth)

	 */
	private static void dome1() {
		//qq注册时间
		Calendar qqRegCa=new GregorianCalendar();
		//小明的生日
		Calendar xmBirCa=new GregorianCalendar(2008,5-1,12);
		
		
		//查看时间
		System.out.println("qq注册时间："+calendarToString(qqRegCa));
		System.out.println("小明的生日："+calendarToString(xmBirCa));
				
	}
}
