
public class Test1{
	
	public static void main(String args[]){
		/**
			循环的4大结构-》有限次数的循环-必须4个结构都拥有
			1）循环变量初始化
			2）循环条件
			3）循环的业务内容
			4）步进语句--》改变循环变量的代码
		*/
		
		
		/**
		吃10个鸡腿
		*/
		
		//1）循环变量初始化
		int a=0;
		
		while(a<10){//2）循环条件
		
			//3)循环的业务内容
			System.out.println("买鸡腿");
			System.out.println("炸鸡腿");
			System.out.println("吃鸡腿");
			System.out.println();
			//4）步进语句-改变循环变量
			a++;
			
		}
		
	}
}
