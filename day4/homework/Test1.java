
public class Test1{
	
	public static void main(String args[]){
		/**
		--- 选择while解决下面需求


3、用户键盘输入一个月份数字，利用循环打印该月所有日期
例如1月
输出："1月1日","1月2日","1月3日"......,"1月30日","1月31日"
		*/
		dome3();
	}
	public static void dome3(){
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
	public static void dome2(){
		/**
		
2、求出1-100以内的总和并输出。
提示：定义变量每次循环自身加一个数，加100次即可。


	思路分析：
	 1 ）得到1到100里所有的数字-》循环变量从1增加到100 
	
		*/
		//数字
		int num=1;
		//求和变量
		int sum=0;
		while(num<=100){
			//循环业务内容
			//把当前的数字num-》加到sum里存储
			//把原来的sum加上num=赋值给sum
			sum=sum+num;
			//改变循环变量
			num++;
		}
		//打印和 
		System.out.println("和是："+sum);
		
	}
	
	public static void dome1(){
		/**
		
1、利用循环打印"hello world2","hello world3"...."hello world11"。
		*/
		
		/**
		方式-1-》循环变量和打印的数字分开
		
			//循环打印次数
		int count=10;
		//打印的数字
		int num=2;
		while(count>0){
			//打印hellowolrd
			System.out.print("hello world");
			//打印数字
			System.out.println(num);
			//数字+1 
			num++;
			//减少循环变量
			count--;
		}
		*/
		/**
		方式-2-》循环变量和打印的数字通过同一个变量控制
		
		需要得到—【min到max】范围的所有的整数
		套路：
		1）定义循环变量初始min
		2）循环过程每次循环变量+1 
		3）循环条件-》循环变量<=max
		*/
		//打印的数字和循环变量
		int printNum=2;
		while(printNum<=11){
			//打印hellowolrd
			System.out.print("hello world");
			//打印数字
			System.out.println(printNum);
			//增加 循环变量
			printNum++;
		}
		
	}
	
}
