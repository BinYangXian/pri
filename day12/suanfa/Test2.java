package day12.suanfa;

import day12.homework.Test5;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 二分法查找：查找容器里指定元素的位置-不存在返回特殊值（抛异常）
    核心逻辑： 
 　1）先对容器的元素进行升序排列
 　2）遍历容器 进行搜索元素，假设搜索的元素就在中间的位置-》最初时候-》开始和结束位置-》0和len-1
　 3）把中间位置的元素与我们要找的元素进行比较，改变我们的开始和结束的查找位置    
              a） 中间位置大：结束位置设置为中间位置-1
              b）中间位置小：开始位置设置为中间位置+1
              c）相等：找到了，返回中间的下标
 
例子：
 1,    8,  18，  9,    5,    11,    13,     22,    33
在排好序的情况

 1     5        8         9       11          13         18         22         33
		 */
		//成绩数组
		long[] scores=new long[]{1, 8,  18,  9,    5,    11,    13, 22,33};
		//排序
		Test1.sort(scores);
		System.out.println("排序后："+Test5.arrToString(scores));
		//二分法查找
		System.out.println("18的位置："+binarySearch(scores, 18));
		System.out.println("22的位置："+binarySearch(scores, 22));
		System.out.println("222的位置："+binarySearch(scores, 222));
	}
	/**
	 * 二分法查找的算法
	 * 
	 * @param scores 查找的数组
	 * @param value 查找的目标值
	 * @return 找到目标值的下标，没找到返回-1
	 */
	public static int binarySearch(long[] scores,long value){
		
		//查找的开始位置和结束位置
		int starIdx=0,endIdx=scores.length-1;
		//循环的查找
		for (int i = 0; i < scores.length; i++) {//最大查找次数-数组的长度
			//中间值的下标
			int centerIdx=(starIdx+endIdx)/2;
			//中间值
			long centerValue=scores[centerIdx];
			//中间值和目标值比较
			if(value==centerValue){// =
				//找到了
				return centerIdx;
			}else
			if(value<centerValue){// <
				//结束位置= 中间位置-1
				endIdx=centerIdx-1;
			}else{ // >
				//开始位置= 中间位置+1
				starIdx=centerIdx+1;
			}
			System.out.println("找了一次");
		}
		
		//没有找到
		return -1;
	}
	
}
