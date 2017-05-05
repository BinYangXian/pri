package day14.dateApi;

import java.io.File;
import java.util.Date;


public class Test1Date {
	public static void main(String[] args) {
		
		dome1();
	}
	/**
	 *     boolean after(Date when)
           测试此日期是否在指定日期之后。
      语法：    
           时间1.after(时间2)
     结果值：
       >    true
       <=   false
           
      boolean before(Date when)
           测试此日期是否在指定日期之前。
      compareTo(Date anotherDate) 比较返回正数0负数
       equals(Object obj) object中重写的
	 */
	private static void dome3() {
		//多个员工的入职时间
		Date [] hiredates=new Date[]{
			new Date(2008-1900, 12-1, 11),
			new Date(2001-1900, 11-1, 12),
			new Date(2002-1900, 5-1, 18),
			new Date(2009-1900, 8-1, 19),
			new Date(2001-1900, 8-1, 19),
			new Date(2002-1900, 8-1, 19),
			new Date(2012-1900, 8-1, 19)
		};
		/**
		 * 入职时间大于10年（跟2006-12-19比较）的员工发奖金（100万）
		 * 打印信息
		 * 
		 * 员工2   发奖金100万
		 * 员工3   发奖金100万
		 * 
		 */
		//10年前的时间
		Date year10=new Date(2006-1900,12-1,19);
		
		for (int idx = 0; idx < hiredates.length; idx++) {
			//当前入职时间
			Date curDate= hiredates[idx];
			//判断是否发奖金（2006-12-19>当前入职时间）发奖金
			if(year10.after(curDate)){
				//编号
				int num=idx+1;
				System.out.println("员工"+num+"发奖金100万");
			}
			
		}
				
	}
	/**
	 * b）设置或获取时间相关字段（时分秒等等）的值
1）获取
getDate() 月里的某一天
int getDay() 周里的某一天
int getHours() 小时
int getMinutes() 分钟
int getMonth() 月
int getSeconds() 秒
int getYear() 年
long getTime() 转换为1970到该时间的毫秒数 
2）设置
void setDate(int date)
  void setHours(int hours)
void setMinutes(int minutes)
 void setMonth(int month)
   void setSeconds(int seconds)
  void setTime(long time)
  void setYear(int year 
	 */
	private static void dome2() {
		//多个员工的入职时间
		Date [] hiredates=new Date[]{
			new Date(2008-1900, 12-1, 11),
			new Date(2008-1900, 11-1, 12),
			new Date(2008-1900, 5-1, 18),
			new Date(2008-1900, 8-1, 19)
		};
		/**
		 * 把所有的下半年入职的员工信息打印到控制台
		 */
		for (Date date : hiredates) {
			//判断下半年
			if(date.getMonth()>=7&&date.getMonth()<=12){
				System.out.println(date);
			}
		}
		
		/**
		 *  第4个员工的入职的号数-统计错误，改为29号
		 */
		System.out.println("第4个员工的入职时间1："+hiredates[3]);
		
		hiredates[3].setDate(29);
		System.out.println("第4个员工的入职时间2："+hiredates[3]);
		
		System.out.println("第3个员工的入职的号数："+hiredates[2].getDate());
		System.out.println("第3个员工的周几入职(0到6表示-周日到周六)的："+hiredates[2].getDay());
	}
	/**
	 * 创建date对象表示一个具体的时间
	 * 
	 * 创建date对象 
当前系统时间
      Date()
     通过指定的年月日创建时间对象
     year - 减 1900 的年份。
     month - 0-11 的月份。
     date - 一月中 1-31 之间的某一天。
     Date(int year, int month, int date)
     通过制定的年月日 时分秒创建时间对象  
     Date(int year, int month, int date, int hrs, int min, int sec)
            通过1970到指定时间的毫秒数创建时间对象
     Date(long date)
	 * 
	 */

	private static void dome1() {
		//qq注册时间
		Date qqRegDate=new Date();
		//小明的生日
		Date xmBirDate=new Date(2008-1900, 5-1, 12);
		//小明双12买飞机的时间
		Date xmBuyDate=new Date(2016-1900, 12-1, 12,0,1,28);
		//t1文件的修改时间-毫秒数
		long t1Update= new File("src/day14/dateApi/test1.fff").lastModified();
		//t1文件的修改时间-date时间
		Date t1Update2=new Date(t1Update);
		
		//打印时间信息
		System.out.println("qq注册时间："+qqRegDate);
		System.out.println("小明的生日："+xmBirDate);
		System.out.println("小明双12买飞机的时间："+xmBuyDate);
		System.out.println("t1文件的修改时间到1970的毫秒数："+t1Update);
		System.out.println("t1文件的修改时间-date时间："+t1Update2);
	}
}
