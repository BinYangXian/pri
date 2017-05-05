
public class Test1{
	
	public static void main(String args[]){
		/**
		1、为什么需要返回值？

    某些情况下，方法执行完成，还需要把执行后产生的一些数据带回给方法的调用处，这时候方法就需要返回值！

    例如：
 1）买了东西，需要把东西带走，钱退回来。
 2）网吧上网后，要把钱退回来。
 3）计算两个数的和的方法，计算之后返回和。
		*/
		//求和2+3 
		sum1(2,3);
		//使用sum1的结果数据sum-不能直接使用-作用域结束了
		System.out.println("2与3的和："+sum);
	}
	
	/**
	需求：求任何两个数的和的方法
	参数：num1，num2求和的两个数
	*/
	public static void  sum1(int num1,int num2){
		//求和
		int sum=num1+num2;
		//
	}
	
}
