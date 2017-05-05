package day12.suanfa;

import day12.homework.Test5;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 成绩排序
		 */
		long [] scores=new long[]{80,99,60};
		System.out.println("排序前："+Test5.arrToString(scores));
		//排序
		sort(scores);
		System.out.println("排序后："+Test5.arrToString(scores));
		
	}
	/**
	 * 冒泡排序实现的-升序排序
	 */
	public static void sort(long[] arr){
		/**
		 * 核心逻辑： 
    1）每一趟确定一个数位置
    2）n个数需要（n-1）趟（每一趟确定一个数准确位置）
    3）每一趟需要进行（n-i(第几趟)）次比较(每一次比较，确定比较的两个数的位置)
    4）当前数和下数个的位置，升序和降序，从小到大（升序）    就把大的放后面，反之（降序）把小的放后面。
		 */
		
		//排arr.length-1趟来确定数的位置
		for (int ts = 1; ts <= arr.length-1; ts++) {
			//ts当前的趟数
			/**
			 * 当前趟-确定数的位置
			 * -》比较  arr.length-ts 次 来确定一个数的位置
			 */
			//当前数的下标
			int curIdx=0;
			
			//比较 arr.length-ts 次 
			for (int cs = 0; cs < arr.length-ts; cs++) {
				//cs当前的次数
				
				/**
				 * 当前的数和下一个数进行比较-》大的放后面
				 * 
				 * 当前的数->最开始下标为0，每次+1
				 * 下一个数-》当前的数下标+1
				 */
				//下一个数的下标
				int nextIdx=curIdx+1;
				
				//如果当前数>下一个数-交换位置
				if(arr[curIdx]>arr[nextIdx]){
					//交换
					long temp =arr[curIdx];
					arr[curIdx]=arr[nextIdx];
					arr[nextIdx]=temp;
					
				}
				
				//当前数的下标+1
				curIdx++;
			}
			
		}
		
	}

}
