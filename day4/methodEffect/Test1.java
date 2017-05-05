
public class Test1{
	
	public static void main(String args[]){
		/**
		定义方法的作用（好处）
		1）避免main方法代码过于臃肿，便于调试代码
		2）重复利用方法代码--》方法可以调用多次
		3）分解功能：把复杂的功能，分解为小功能，小功能对应方法分别去处理
		--》好处-》解决小功能-比直接解决复杂功能简单
		*/
		
		/**
		3、用户键盘输入一个月份数字，利用循环打印该月所有日期
例如1月
输出："1月1日","1月2日","1月3日"......,"1月30日","1月31日"

		 思路：
		 1)利用循环-得到正确的月份数字-》错误重写输入
		 2)根据输入月份数字得到最大天数 ->分支结构
			 28 	2
			 30 	4	6	9	11
			 31 	其他7个月份数字
		 3)根据最大天数循环打印该月的每一天
			
	注意点		
		1）控制台在输入基本类型的数据的时候，如果输入内容不能转换为对应的类型-那么会出现-InputMismatchException
		-》程序就崩溃了（停止了）
		*/
		//打印2月所有天
		//printMonthAllDay(2,28);
		//打印3月所有天
		//printMonthAllDay(3,31);
		dome1_2();
		
		
	}
	/**
	3)根据最大天数循环打印该月的每一天
	参数：
	month打印的月份
	maxDay 该月最大的天
	*/
	public static void printMonthAllDay(int month,int maxDay){
		//循环该月最大的天次-每次打印一天
		for(int curDay=1;curDay<=maxDay;curDay++){
			//打印当前天
			System.out.println(month+"月"+curDay+"天");
		}
	}
	
	/**
	2)根据输入月份数字得到最大天数 ->分支结构
			 28 	2
			 30 	4	6	9	11
			 31 	其他7个月份数字
	*/
	public static int getMonthMaxDay(int month){
		int maxDay;
		if(month==2){//28 
			maxDay=28;
		}else
		if(month==4 ||month==6|| month==9|| month==11 ){//30
			maxDay=30;
		}else{//31 
			maxDay=31;
		}
		System.out.println("最大的月份天数："+maxDay);
		//返回最大天数
		return maxDay;
	}
	
	/**
	 1)利用循环-得到正确的月份数字-》错误重新输入
	*/
	public static int  inputMonth(){
		  //管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//输入数字 
		System.out.println("请输入一个数字");
		byte month= sc.nextByte();
		while(month>12||month<1){//判断数字-错误 
			//输入数字 
			System.out.println("请输入一个数字");
			month= sc.nextByte();
		}
		System.out.println("正确的月份数字："+month);
		//返回月份 
		return month;
	}
	/**
		复杂功能-分解为小功能-分别用方法解决小功能-再拼接小功能-完成
		
	*/
	public static void dome1_2(){
		//1 
		int month= inputMonth();
		//2 
		int maxDay= getMonthMaxDay(month);
		//3 
		printMonthAllDay(month,maxDay);
		
	}
	/**
		复杂功能-一个方法完成-解决比较复杂
	*/
	public static void dome1_1(){
		
		//1
	    //管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//输入数字 
		System.out.println("请输入一个数字");
		byte month= sc.nextByte();
		while(month>12||month<1){//判断数字-错误 
			//输入数字 
			System.out.println("请输入一个数字");
			month= sc.nextByte();
		}
		System.out.println("正确的月份数字："+month);
		//2 
		//最大的月份天数
		int maxDay;
		if(month==2){//28 
			maxDay=28;
		}else
		if(month==4 ||month==6|| month==9|| month==11 ){//30
			maxDay=30;
		}else{//31 
			maxDay=31;
		}
		System.out.println("最大的月份天数："+maxDay);
		//3 
		int curDay=1;
		while(curDay<=maxDay){
			//循环业务内容 
			System.out.println(month+"月"+curDay+"日");
			//改变循环变量
			curDay++;
		}
		
	}
}
