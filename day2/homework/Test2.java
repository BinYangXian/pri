
public class Test2{
	public static  void main(String agrs[]){
		/**
		1、公司活动，用户控制台输入int的年龄，String的名字，
		然后通过随机数为其抽奖（产生5-100元的奖金），
		打印出如下格式字符串到控制台。
		格式：xxx岁的xxx你好，恭喜你中奖xxx元;
		
		思路分析
		1）输入用户名字
		2）输入年龄
		3）产生随机整数
		4）拼接对应格式字符串
		5）打印
		*/
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//1
		System.out.println("请输入名字");
		String name=  sc.next();
		//2
		System.out.println("请输入年龄");
		int age=  sc.nextInt();
		//3 
		int rnMoney=(int)(Math.random()*(100-5+1))+5;
		//4 
		String concat=age+"岁的"+name+"你好，恭喜你中奖"+rnMoney+"元";
		//5 
		System.out.println(concat);
	}
}