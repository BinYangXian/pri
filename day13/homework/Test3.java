package day13.homework;

import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) {
		/**
		 * 
    3）把a1数组存放的值倒序存储-例如：{1,3,2,4}->{4,2,3,1}
		 */
		byte [] a1=new byte[]{1,3,2,4};
		
		/**
		 * 思路：
		 * 1）倒序取出a1指向的数组里的数据-顺序的加入到新数组中
		 * 2）a1指向新数组
		 */
		//新数组
		byte [] newArr=new byte[a1.length];
		//倒序取出所有a1的数据
		for (int a1Idx = a1.length-1; a1Idx>=0; a1Idx--) {
			//取出数据
			byte num= a1[a1Idx];
			//新数组的下标（最后第一个到第一个）
			int newArrIdx=a1.length-1-a1Idx;
			//顺序-加入新数组中
			newArr[newArrIdx]=num;
		}
		//a1指向倒序的新数组
		a1=newArr;
		//打印
		System.out.println("倒序的a1："+Arrays.toString(a1));
		
		
	}
}
