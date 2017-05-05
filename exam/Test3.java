package exam;

public class Test3 {
	public static void main(String[] args) {
		/**
		 * 3、
a）编写计算min到max累加的方法int sum(int min,int max)throws ParamValueErrorException，
    参数：min和max表示累加的范围
    返回值：表示累加的和
    抛出异常：如果min大于max则抛出自定义异常ParamValueErrorException的对象并设置异常消息：“最小值min不能大于最大值max”。
b）main方法测试：1）7到5的累加 2）1到5的累加
		 */
		try {
			System.out.println("7到5的累加:"+sum(7, 5));
		} catch (ParamValueErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("1到5的累加:"+sum(1, 5));
		} catch (ParamValueErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	static int sum(int min,int max)throws ParamValueErrorException{
		/**
		 * 正常逻辑
		 */
		if(min<=max){
			int sum=0;
			for (int num = min; num <=max; num++) {
				sum+=num;
			}
			return sum;
		}
		/**
		 * 异常逻辑
		 */
		ParamValueErrorException pe=new ParamValueErrorException("最小值min不能大于最大值max");
		throw pe;
	}
}
//自定义异常
class ParamValueErrorException extends Exception{

	public ParamValueErrorException() {
		super();
	}
	public ParamValueErrorException(String message) {
		super(message);
	}
}