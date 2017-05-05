package day11.homework;

public class Test3 {
	public static void main(String[] args) throws ValueOutOfRangeException{
		/**
		 * 2）定义两个数求和方法 int sum(int a,int b) throws ValueOutOfRangeException{//...};
参数：a和b为两个加数
返回值：所得和
异常处理：要求在方法内部处理，a，b值加起来越界问题，抛出自定义异常。

		 */
		//测试类对象
		Test3 t3=new Test3();
		
		//原来21e存了21e的结果
		int rs1=t3.sum(2100001111, 2100001111);
		System.out.println("原来21e存了21e的结果："+rs1);
		//原来21存了21的结果
		int rs2=t3.sum(21, 21);
		System.out.println("原来21存了21的结果："+rs2);
		
	}
	int sum(int a,int b) throws ValueOutOfRangeException{
		/**
		 * 异常逻辑 
		 */
		long rs=(long)a+b;
		if(rs>2100001111||rs<-2100001111){
			
			throw new ValueOutOfRangeException("计算的值超过了int范围不能计算！");
		}
		/**
		 * 正常逻辑
		 */
		
		
		return (int)rs;
	}
}
//值越界的异常
class ValueOutOfRangeException extends Exception{

	public ValueOutOfRangeException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ValueOutOfRangeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}