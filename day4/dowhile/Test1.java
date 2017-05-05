
public class Test1{
	
	public static void main(String args[]){
		/**
		do while循环
		语法：
		do{
			//循环内容
		}while(循环条件);

		执行的过程
		1）执行循环内容
		2）执行循环条件true
		1）执行循环内容
		2）执行循环条件true
		...
		1）执行循环内容
		2）执行循环条件false
		
		
		
		while循环语法
		语法：
		while(循环条件){
			//循环内容
		}
		执行的过程
		2）执行循环条件true
		1）执行循环内容
		2）执行循环条件true
		...
		1）执行循环内容
		2）执行循环条件false
		
		
		while和dowhile 的对比 
		1）执行顺序：
		    while：先循环条件，再循环内容 
			do while：先循环内容，再循环条件
		2）执行的次数：
			while: 0到多次
			dowhile 1到多次 
			
		*/
		dome2();
	}
	/**
		需求：用户输入（0到10的数字），吃对应数字个鸡腿（a）买鸡腿，b）炸鸡腿，c）吃鸡腿）
	*/
	public static void dome2(){
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//输入数字 
		System.out.println("请输入吃鸡腿的个数");
		int count=sc.nextInt();
		/**
			while解决
		*/
		int a=0;
		while(a<count){
			//循环的业务内容
			System.out.println("买鸡腿");
			System.out.println("炸鸡腿");
			System.out.println("吃鸡腿");
			System.out.println();
			//改变循环变量
			a++;
			
		}
		System.out.println("-----------------------");
		/**
			do while解决
		*/
		int b=0;
		do{
			//鸡腿数量不为0
			if(count!=0){
					//循环的业务内容
				System.out.println("买鸡腿");
				System.out.println("炸鸡腿");
				System.out.println("吃鸡腿");
				System.out.println();
			}
			//改变循环变量
			b++;
			
		}while(b<count);
		
		
		
		
		
	}
	
	/**
		需求：得到用户控制输入的正确月份（1-12）的数字，并打印-》循环
		执行的过程
		1）输入数字 
		2）判断数字错误-true 
		
		1）输入数字 
		2）判断数字错误-true 
		
		...
		1）输入数字 
		2）判断数字错误-false 

		3)打印数字
	*/
	public static void dome1(){
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		/**
			while解决
		*/
		
		//输入数字 
		System.out.println("请输入月份数字");
		int month=sc.nextInt();
		//循环的判断和输入 
		while(month>12||month<1){//判断数字错误-true 
			//输入数字 
			System.out.println("请输入月份数字");
			month=sc.nextInt();
		}
		//打印数字 
		System.out.println("while-正确的数字："+month);
		/**
			do while解决
		*/
		//提高作用域-方便在 while里使用
		int month2;
		do{
			//输入数字 
			System.out.println("请输入月份数字");
			month2=sc.nextInt();
			
		}while(month2>12||month2<1);//判断数字错误-true 
		//打印数字 
		System.out.println("do while-正确的数字："+month2);
	}
	
	
}
