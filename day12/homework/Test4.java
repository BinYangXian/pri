package day12.homework;

public class Test4 {
	public static void main(String[] args) {
		/**
		 * 2、定义一个由整数组成的数组{11,22,33,44,44,55,66,66}，
		 * 要求，求出其中的奇数个数和偶数个数。
		 * 
		 * 思路：
		 * 1）静态初始化创建数组
		 * 2)循环找到数组所有的元素
		 * 3）判断当前元素是奇数-并统计个数（累加）
		 * 4）偶数个数——》数组长度减 奇数个数
		 */
		//1
//		int[] nums1= {11,22,33,44,44,55,66,66};
//		nums1= {11,21,23,44,44,55,66,66};
		int[] nums2=new int[] {11,22,33,44,44,55,66,66};
		//nums2= new int[]{11,21,23,44,44,55,66,66};
		
		//2 
		//统计奇数个数的变量
		int countJs=0;
		for (int i = 0; i < nums2.length; i++) {
			//取出数字
			int num = nums2[i];
			//判断奇数-统计1次
			if(num%2!=0){
				countJs++;
			}
		}
		//偶数的数量
		int countOs=nums2.length-countJs;
		System.out.println("奇数个数："+countJs);
		System.out.println("偶数个数："+countOs);
	}
}
