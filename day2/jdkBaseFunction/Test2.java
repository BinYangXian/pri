
public class Test2{
	
	public static void main(String agrs[]){
  		/**
			java内置的功能
			1）打印功能
			System.out.println(打印的内容)   打印内容，然后打印换行
			System.out.print(打印的内容)   打印内容不换行
			
			2）产生随机小数
			Math.random()   每次执行都产生一个[0,1)的随机double值
		
			3)得到控制台用户输入的数据
				a）找到控制台的管理者
				java.util.Scanner sc=new java.util.Scanner(System.in);
				b)通过管理者拿到用户输入的数据
				  x）拿到输入的字符串
				    sc.next()    
				  x）拿到输入的基本类型数据
					sc.next基本类型名（首字母大写）() 
					例如：sc.nextInt();  sc.nextDouble() ...
			注意点
			1）一个管理者可以获取多次用户输入的数据
			2）sc.nextXXX的功能执行的时候，会暂停程序执行，让用户输入数据，输入到回车的时候，把
			回车之前的数据返回到程序中继续执行。
			
		*/
		/**
			程序得到用户输入的名字和年龄，打印“欢迎xx岁的xx来到我们尚学堂”
		*/
		//人的名字
		String name;
		//人的年龄
		int age;
		
		//找到管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		//提示
		System.out.println("请输入你的名字");
		
		//从控制台输入名字
		name=sc.next();
		
		//提示
		System.out.println("请输入你的年龄");
		//从控制台输入年龄
		age=sc.nextInt();
		
		//打印欢迎信息
		System.out.println("欢迎"+age+"岁的"+name+"来到我们尚学堂");
		
	}
}