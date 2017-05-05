package day15.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 数组：
		 * 1）一种容器，可以装很多元素
		 * 2）元素和下标（0到len-1）绑定
		 * 3）通过下标访问元素
		 * 4）数组的长度固定-》创建时候确定了长度
		 * 
		 * 
		 * List（动态的数组）：
		 * 1）一种容器，可以装很多元素
		 * 2）元素和下标（0到size-1）绑定
		 * 3）通过下标访问元素
		 * 4）元素数量不固定-》创建list的时候，元素数量为0，装入几个算几个。
		 * 
		 * 
		 * 
		 */
		dome2();
	}
	/**
	 * 创建容器存储qq号
	 * -》用List解决
	 */
	private static void dome2() {
		//存储qq号的容器
		List<Long> qqNums = new ArrayList<Long>();
		//装数据
		System.out.println("qq容器数据："+qqNums);
		qqNums.add(12313L);
		qqNums.add(12313L);
		qqNums.add(12313L);
		System.out.println("qq容器数据："+qqNums);
		qqNums.add(12313L);
		qqNums.add(12313L);
		qqNums.add(12313L);
		qqNums.add(12313L);
		System.out.println("qq容器数据："+qqNums);
	}
	/**
	 * 创建容器存储qq号
	 * -》用数组解决
	 */
	private static void dome1() {
		//存储qq号的容器
		long []qqNums =new long[3];
		//装数据
		qqNums[0]=12345;
		qqNums[1]=123456;
		qqNums[2]=1234567;
		//qqNums[3]=12345678;
		System.out.println("qq容器数据："+Arrays.toString(qqNums));
		/**
		 * 手动扩容
		 */
		qqNums= Arrays.copyOf(qqNums, 5);
		//装数据
		qqNums[3]=111;
		qqNums[4]=222;
		System.out.println("qq容器数据："+Arrays.toString(qqNums));
		/**
		 * 手动扩容
		 */
		qqNums= Arrays.copyOf(qqNums, 8);
		//装数据
		qqNums[5]=4444;
		qqNums[6]=13213;
		
		System.out.println("qq容器数据："+Arrays.toString(qqNums));
	}
}
