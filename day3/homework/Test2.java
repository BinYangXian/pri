
public class Test2{
	
	public static void main(String args[]){
	
		dome2();
	}
	public static void dome2(){
		/**
		//switch练习--结合switch和if-else
2、根据用户输入的月份，打出该月份的天数(不需要考虑润年、闰月)，

输入1-12之外数字则打印-不是月份数字。
    4 6 9 11 -->30
    2 -->28
    1 3 5 7 8 10 12  -->31
	
	思路分析
		1）输入数字
		2）判断打印
		  a）4 6 9 11 -->30
		  b） 2 -->28
		  c) 1 3 5 7 8 10 12  -->31
		  d）其他 		不是月份数字
		*/
		//1  
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//输入
		System.out.println("请输入1-12的数字！");
		short month= sc.nextShort();
		//2 
		//不是月份的数字
		if(month>12||month<1){
			System.out.println("不是月份数字");
		}else{
			//是月份的数字-》1-12 
			switch(month){
				case 2: 
					System.out.println("28天");
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println("30天");
					break;
				default :
					System.out.println("31天");
			}
		}
		
	}
	public static void dome1(){
		/**
		1、利用switch下穿（遇到break之前继续往下执行），
		用户输入1-7以内一个数字(整数)，判断工作日、周末。
		输入1-7之外数字则打印-不是周里数字。
		
		思路分析
		1）输入数字
		2）判断打印
		  a）1-5        工作日
		  b）6-7		周末 
		  c）其他 		不是周里数字
		*/
		//1  
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//输入
		System.out.println("请输入1-7的数字！");
		short weekDay= sc.nextShort();
		//2 
		//不是周里的数字
		if(weekDay>7||weekDay<1){
			System.out.println("不是周里数字");
		}else{
			//是周里的数字-》1-7 
			switch(weekDay){
				case 6: 
				case 7:
					System.out.println("周末");
					break;
				default :
					System.out.println("工作日");
			}
		}
		
		
	}
	
}