
public class Test2{
	
	public static void main(String args[]){
		/**
		使用方法返回值的步骤
		
		1）定义方法-加入返回值类型（定义我们要返回的数据的类型）
			语法：
			public static  返回值类型  方法名(形式参数列表){//方法的代码}
		void：空，不用返回数据。
		返回值类型:具体返回的数据类型,不需要返回数据-用void。
		
		2）定义方法的代码里-》加入return 值（把需要返回的数据带回给调用位置）
			语法：
		public static  返回值类型  方法名(形式参数列表){
			//方法的代码
			//1)业务代码
			...
			//2)把结果数据返回 
			return 结果数据值;
			}
			
		3)使用执行方法的时候-接收方法产生的数据
			语法：
		  返回值类型  接收变量名 = 方法名(实际参数);
			
		*/
		//求和2+3 -把结果存储sum2变量中
		int sum2= sum1(2,3);
		//使用sum2
		System.out.println("2与3的和："+sum2);
	}
	
	/**
	需求：求任何两个数的和的方法
	参数：num1，num2求和的两个数
	返回值：把所求的和返回给方法的调用位置
	*/
	public static int  sum1(int num1,int num2){
		//求和
		int sum=num1+num2;
		//把和带回给方法调用位置
		return sum;
	}
	
}
