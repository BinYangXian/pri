
public class Test1{
	
	public static void main(String args[]){
		/**
			逻辑非!
			语法:
			！布尔值-》 得到布尔值相反的值
		
		*/
	
		/*
			判断用户输入数字，是否是奇数-》是奇数打印true，不是打印false
		*/
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//输入
		System.out.println("请输入一个整数");
		int num= sc.nextInt();
		//判断是否是奇数
		//方式1-》判断模上2等于1或等于-1
		boolean isJs1=(num%2==1||num%2==-1);
		//方式2-》判断模上2等于0（偶数）-》取反（不是偶数）（奇数）
		boolean isJs2=(!(num%2==0));
		System.out.println("是否奇数1："+isJs1);
		System.out.println("是否奇数2："+isJs2);
		
	}
}