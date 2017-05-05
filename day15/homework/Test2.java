package day15.homework;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		app();
	}
	/**
	 * 思路：
   * 1）用户控制台循环输入字符串，得到正确的时间
   * 2）打印周的时间列表（周日到周六）
   * 3）打印输入时间的月里第一天所在周里天数个空格（周1-6，打印对应空格，周7打印0个）
   * 4）拿到输入时间所在月里的最后一天，循环这么多次进行打印（当天的信息【数字，星号，tab，换行】）
   * 数字：每次循环都打印
   * 星号：当前的月中天就是输入的时间就打印星号
	 */
	private static void app() {
		//1
		Calendar inCa= inputCalendar("yyyy-MM-dd");
		//2
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		//3
		printKb(inCa);
		//System.out.print("1号");
		//4
		printAllDay(inCa);
	}
	/**
	 * 4）拿到输入时间所在月里的最后一天，循环这么多次进行打印（当天的信息【数字，星号，tab，换行】）
   * 数字：每次循环都打印
   * 星号：当前的月中天就是输入的时间就打印星号
	 * @param inCa
	 */
	private static void printAllDay(Calendar inCa) {
		//输入的月中天
		int inDayOfMonth=inCa.get(Calendar.DAY_OF_MONTH);
		
		//得到当前月最大的天数
		int maxDay=inCa.getActualMaximum(Calendar.DAY_OF_MONTH);
		//循环进行打印
		for (int curDay = 1; curDay <=maxDay; curDay++) {
			//打印当前天
			System.out.print(curDay+" ");
			//如果当前的天是输入的天-打印星号
			if(curDay==inDayOfMonth){
				System.out.print("*");
			}
			//把当前curday转换为对应的calendar时间
			inCa.set(Calendar.DAY_OF_MONTH,curDay);
			//查看当前天对应的周里的天数（1-7 表示周日到周六）
			int dayOfWeek= inCa.get(Calendar.DAY_OF_WEEK);
			//判断是周六
			if(dayOfWeek==Calendar.SATURDAY){
				System.out.print('\n');
			}else{//判断不是周六
				System.out.print('\t');
			}
			
		}
		
	}
	/**
	 * 3）打印输入时间的月里第一天所在周里天数个空格（周1-6，打印对应空格，周7打印0个）
	 * @param inDate
	 */
	private static void printKb(Calendar ca) {
		//得到输入时间的1号的时间
		ca.set(Calendar.DAY_OF_MONTH, 1);
		//得到1号的周里的天数（1-7 表示周日到周六）
		int dayOfWeek= ca.get(Calendar.DAY_OF_WEEK);
		//打印空白次数
		int printCount=dayOfWeek-1;
		//循环打印
		for (int i = 0; i < printCount; i++) {
			System.out.print('\t');
		}
		//还原当前的时间为输入时间
		
	}
	/**
	 * 获取用户输入的时间
	 * 
	 * 参数：dateFormat 时间的格式
	 * @return  输入的对应的时间
	 */
	public static Calendar inputCalendar(String dateFormat){
		//管理者
		Scanner sc=new Scanner(System.in);
		//格式化对象
		DateFormat df=new SimpleDateFormat(dateFormat);
		//循环的输入
		while(true){
			
			try {
				//用户输入时间字符串
				System.out.println("请输入一个时间-格式为"+dateFormat);
				String dateStr= sc.next();
				//解析
				Date date= df.parse(dateStr);
				//判断时间字符串-正确-退出循环-返回时间
				//date转calendar
				Calendar ca=new GregorianCalendar();
				ca.setTime(date);
				return ca;
			} catch (ParseException e) {
				//判断时间字符串-错误-继续循环
				System.out.println("输入错误！");
			}
		}
	}
}
