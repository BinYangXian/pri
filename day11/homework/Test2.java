package day11.homework;

public class Test2 {
	public static void main(String[] args)throws ParamValueException {
		/**
		 * 1）定义方法产生指定范围（最小值，最大值）
		 * 随机整数 int random(int min,int max)throws ParamValueException{//....}
参数：min范围的最小值，max 范围的最大值
返回值：所得随机数
异常处理：最小值比最大值大的时候，抛出自定义异常。
    
    	
    	throw和return对比
    	a）return  值;     1)把值带回到方法调用处   2）方法执行结束
    	b）throw  异常对象;  1）把异常对象（问题）带回到方法调用处  2）方法执行结束
		 */
		System.out.println("1-5的值："+random(1, 5));
		System.out.println("7-5的值："+random(7, 5));
		System.out.println("3-5的值："+random(3, 5));
		
	}
	static int random(int min,int max)throws ParamValueException{
		/**
		 * 处理异常
		 */
		if(min>max){
		    //创建异常对象
			ParamValueException pe=new ParamValueException("最小值min不能比最大值max大");
			//丢出异常
			throw pe;
		}
		System.out.println("--正常逻辑代码--");
		/**
		 * 正常逻辑
		 * 
		 */
		int rnNum=(int)(Math.random()*(max-min+1))+min;
		return rnNum;
		
	}
}
class ParamValueException extends Exception{

	public ParamValueException() {
	}
	public ParamValueException(String message) {
		super(message);
	}
}
