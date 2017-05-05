
public class Test4{
	public static  void main(String agrs[]){
		/**
			布尔类型boolean
			占用空间：1位（bit）
			两个值：true（成立，满足，对）     false（不成绩，不满足，错）
			
		*/
		boolean b;
		b=true;
		b=false;
		/**
			关系运算符
			作用：判断两个值是否满足对应的关系
			
			> >= < <=   ==(判断是否等于)  !=（判断是否不等于）
		    
			结果值：
				满足true
				不满足 false
		*/
		/**
			需求 ：程序可以输入人的钱（元），如果大于1001111，
				  打印结果（是有钱人——》true）
			否则  打印结果（是有钱人——》false）	
		*/
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//输入钱
		System.out.println("请输入拥有的钱");
	 	long money=  sc.nextLong();
		
		//定义是否有钱的变量（true-有钱 false 没有钱）
		boolean isHaveMoney;
		//判断-把结果存储在isHaveMoney
		isHaveMoney=money>1001111;
		//打印结果
		System.out.println("你是否有钱（true-你有钱，flase-你是穷鬼）"+isHaveMoney);
		
		System.out.println("--------------------------");
		/**
			==(判断是否等于)  !=（判断是否不等于）
		*/
		System.out.println("3==3:"+(3==3));
		System.out.println("3!=3:"+(3!=3));
		System.out.println("5==3:"+(5==3));
		System.out.println("5!=3:"+(5!=3));
		
		
	}
}