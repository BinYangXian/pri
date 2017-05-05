
public class Test1{
	
	public static void main(String args[]){
		/**
需求
		1、有如下老师列表
编号    	老师名
1          曾老师
2          卢老师
30          刘老师
4          赵老师

要求用户输入编号，打印出编号对应的老师的名字

思路
1）输入编号
2）判断-打印
 a）==1			打印曾老师
 b）==2			打印卢老师 
 c）==30 		打印刘老师 
 d）==4			打印赵老师 
 e）其他数字	没有对应的老师		
			*/
		

		/**
			分支结构
			if 结构：分支的条件-》可以是任意的条件（> < == != ）
			switch结构：对于==的分支条件-进行优化
			
			
			常量值：所有的字面值都是常量值
			
			语法：
			switch(分支变量){
				[
				case  常量值 :
					分支变量==常量值时执行的代码
					[break;]
				case  常量值 :
					分支变量==常量值时执行的代码	
					[break;]
				...
				
				]
				[
				default:上述所有的case不满足执行的代码
				]
			}
			执行的过程：
			1）根据分支变量由上到下依次判断满足条件case，有case满足就执行对应case的代码，
			执行完成会继续向下执行，直到遇到break为止
			2）如果所有的case都不满足条件，那么执行default
		
		*/
		dome3();
	}
	public static void dome3(){
		/**
			switch的注意点
			1）分支变量类型：jdk1.6：int或枚举类型   jdk1.7之后可以用字符串String
			2）case后跟的是常量不能是变量
		*/	
		String str1="hello";
		int num1=11;
		long num2=33;
		byte num3=44;
		switch(str1){}
		switch(num1){}
		//switch(num2){} long不能自动转int =不能使用
		switch(num3){} //byte可以自动转int =可以使用
		
		int a=5;
		switch(num1){
			case 1:
			case 2:
			case a: // a 是变量不能在case中使用
			case 6:
		}
		
	}
	/**
		switch结构实现
	*/
	public static void dome2(){
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//输入编号
		System.out.println("请输入编号");
		int num=sc.nextInt();
		//判断-打印
		
		switch(num){
			case  1 :
				System.out.println("曾老师");
				break;
			case  2 :
				System.out.println("卢老师");
				break;
			case  30 :
				System.out.println("刘老师");
				break;
			case  4 :
				System.out.println("赵老师");
				break;
			default:
				System.out.println("没有对应的老师，输入错误！");
		}
	}
	/**
		if else结构实现
	*/
	public static void dome1(){
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//输入编号
		System.out.println("请输入编号");
		int num=sc.nextInt();
		//判断-打印
		if(num==1){
			System.out.println("曾老师");
		}else
		if(num==2){
			System.out.println("卢老师");
		}else
		if(num==30){
			System.out.println("刘老师");
		}else
		if(num==4){
			System.out.println("赵老师");
		}else{
			System.out.println("没有对应的老师，输入错误！");
		}
		
	}
}
