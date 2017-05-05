package day13.arrayOther;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 可变参数类型
		 * 概念：
		 * a）特殊的数据类型
		 * b）只能在参数中使用
		 * c）可变参数类型-》底层就是数组的类型
		 * d）一个方法只能定义一个可变参数，必须是最后一个
		 * 
		 * 定义参数语法：
		 * 数组元素类型   ...  参数名
		 * 
		 * 可变参数的使用
		 * 1）在方法内--》可变参数就是数组类型
		 * 2)在方法实际参数传入值的时候 
		 *    a）可以传入数组
		 *    b）可以传入数组的元素，逗号分割
		 *   
		 */
		/**
		 * a）可以传入数组
		 */
		test4(new int[]{11,22,55});
		test4(new int[]{1222,22123,55});
		/**
		 *  b）可以传入数组的元素，逗号分割
		 */
		test4(1222,22123,55);
		test4(1222,22123,55,21131);
		test4();
	}
	
	public static void test1(int ... nums){}
	//public static void test1(int [] nums){}
	public static void test2(String [] strs){}
	//public static void test3(String ... strs,int ... nums){}

	public static void test4(int ... nums){
		/**
		 * 1）在方法内--》可变参数就是数组类型
		 */
		//方法内-使用nums参数-当作数组使用
		System.out.println("nums数组的元素数量："+nums.length);
		System.out.println("nums数组的第一个元素："+nums[0]);
		int []nums2=nums;
		
	}
	
}
