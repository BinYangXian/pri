
public class Test3{
	
	public static void main(String args[]){
		/**
		---通过【方法重载】【方法重复利用代码】完成下面功能 
		
4）在main方法测试上述方法
		*/
		System.out.println("得到2-6的用户输入的整数："+inputInt("请输入2-6的整数",2,6));
	}
	/**
	3、定义获取控制台输入整数，带指定提示，带指定范围（最小值和最大值之间）的方法，
方法一定要返回最小值和最大值之间的输入整数-》输入值不对-需要重新输入。
参数：提示内容（提示用户输入的字符串），范围最小值，范围最大值
返回值：输入的整数
	*/
	public static int inputInt(String tishi2,int min,int max){
		while(true){
			//输入整数 -带指定提示 
			//使用inputInt(String tishi)方法进行输入
			int num=inputInt(tishi2);
			//判断整数-正确-退出循环-退出方法
			if(num>=min&&num<=max){
				return num;
			}
		}
	}
	
	/**
	1、定义获取控制台输入整数的方法-给出用户提示"请输入整数"
返回值：输入的整数
	*/
	public static int inputInt(){
		//使用inputInt(String tishi)方法进行输入
		int num=inputInt("请输入整数");
		//返回整数 
		return num;
	}
	/**
	2、定义获取控制台输入整数，带指定提示的方法
参数：提示内容（提示用户输入的-描述字符串）
返回值：输入的整数
	*/
	public static int inputInt(String tishi){
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//提示
		System.out.println(tishi);
		//输入 
		int in= sc.nextInt();
		//返回整数 
		return in;
	}
}
