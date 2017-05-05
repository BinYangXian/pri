package day13.arrayOther;

public class Test3 {
	public static void main(String[] args) {
		/**
		 * 使用数组-解决-传入多个相同数据
		 */
		sum1(new int[]{2,3});
		sum1(new int[]{2,3,5});
		sum1(new int[]{2,3,5,8});
		/**
		 * 使用可变参数-解决-传入多个相同数据
		 */
		//传数组
		sum2(new int[]{2,3});
		sum2(new int[]{2,3,5});
		sum2(new int[]{2,3,5,8});
		//传数组元素
		sum2(2,3);
		sum2(2,3,5);
		sum2(2,3,5,8);
		
	}
	
	/**
	 * 求2个数的和
	 */
	public static void sum1(int num1,int num2){
		int rs=num1+num2;
		System.out.println("和："+rs);
	}
	/**
	 * 求3个数的和
	 */
	public static void sum1(int num1,int num2,int num3){
		int rs=num1+num2+num3;
		System.out.println("和："+rs);
	}
	/**
	 * 求n个数的和
	 * 数字的数量不确定
	 * -》可以使用数组来装入数字-作为参数传入
	 */
	public static void sum1(int [] nums){
		int rs=0;
		for (int num : nums) {
			rs+=num;
		}
		System.out.println("和："+rs);
	}
	/**
	 * 可变参数解决
	 */
	public static void sum2(int ... nums){
		int rs=0;
		for (int num : nums) {
			rs+=num;
		}
		System.out.println("和："+rs);
	}
	
}
