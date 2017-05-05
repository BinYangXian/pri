package day12.homework;

public class Test5 {
	public static void main(String[] args) {
		/**
		 * 3、定义一个包含10个元素的数组，对其进行赋值，
		 * 使每个元素的值等于其下标， 然后输出，
		 * 最后将数组里元素倒置存储，然后输出。
倒置存储思路：
    1）数组前后元素交换
    2）创建新数组倒置存储老数组元素。
		 */
		app();
	}
	private static void app() {
		// a）动态初始化创建数组
		long [] nums=new long[10];
		
		// b）数组每个元素赋值为其下标
		for (int idx = 0; idx < nums.length; idx++) {
			//为当前数组位置赋值-当前下标
			nums[idx]=idx;
		}
		// c)输出数组里元素的内容
		//System.out.println("数组的内容："+nums.toString());
		System.out.println("数组的内容1："+arrToString(nums));
		// d）倒置存储数组元素内容
		
		//思路： 1）数组前后元素交换
		for (int i = 0; i < nums.length/2; i++) {//循环nums.length/2进行交换
			//交换 前面元素(下标 preIdx)和后面元素（下标 lastIdx）
			int preIdx=i;
			int lastIdx=nums.length-1-preIdx;
			/**
			 * 交换
			 * 临时变量 temp
			 */
			long temp=nums[lastIdx];
			nums[lastIdx]=nums[preIdx];
			nums[preIdx]=temp;
			
		}
		// e)输出数组里元素的内容
		System.out.println("数组的内容2："+arrToString(nums));
	}
	
	/**
	 * 数组转 字符串
	 * 
	 * 把数组的元素内容拼接为字符串返回
	 * 
	 *格式： {元素1, 元素2, ...}
	 */
	public static String arrToString(long [] nums){
		//数组信息
		String arrInfo="{";
		
		for (int idx = 0; idx < nums.length; idx++) {
			//取出数字
			long num=nums[idx];
			//
			arrInfo+=num+", ";
		}	
		
		arrInfo+="}";
		return arrInfo;
	}
	
}
