package day13.homework;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 1. 源数组  
		 *  {
{1, 2, 3, 4},
{5, 6, 7, 8},
{9,10,11,12},
{13,14,15,16}}
    1. 求两条对角线的和-》提示找规律
    2. 逆序输出-》从16依次打印到1
		 */
		//来一个二维数字
		int [][] nums=new int[][]{
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9,10,11,12},
				{13,14,15,16}};
		//二维数组传入给第一个题使用
		dome2(nums);
		
	}
	/**
	 * 2. 逆序输出-》从16依次打印到1
	 * @param nums
	 */
	private static void dome2(int[][] nums) {
		//遍历所有的行(最后一行遍历到第一行)
		for (int rowIdx = nums.length-1; rowIdx >=0; rowIdx--) {
			//遍历当前行-所有的列(最后一列遍历到第一列)
			for (int colIdx = nums[rowIdx].length-1; colIdx >=0 ; colIdx--) {
				//取出数字
				int num=nums[rowIdx][colIdx];
				System.out.print(num+",");
			}
		}
	}
	/**
	 *  1. 求两条对角线的和-》提示找规律
	 * @param nums
	 */
	private static void dome1(int[][] nums) {
		
		//累加的和
		int sum=0;
		//遍历所有的行
		for (int rowIdx = 0; rowIdx < nums.length; rowIdx++) {
			//遍历当前行-所有的列
			for (int colIdx = 0; colIdx < nums[rowIdx].length; colIdx++) {
				//对角线的数字才取出来-累加
				if(rowIdx==colIdx||rowIdx+colIdx==nums.length-1){
					//取出数字
//					int num=nums[rowIdx][colIdx];
//					//累加
//					sum+=num;
					sum+=nums[rowIdx][colIdx];
				}
			}
		}
		System.out.println("对角线的和是："+sum);
	}
	
}
