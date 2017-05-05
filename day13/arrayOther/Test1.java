package day13.arrayOther;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 
		 * 增强for(foreach)：一种循环结构
		 * 作用：快速遍历 容器(数组，list，set...)里的元素(访问元素的内容)
		 * 语法：
		 * for(元素类型   接收的变量   : 容器对象){
		 *    //对应的业务代码
		 * }
		 * --》执行过程：自动把容器里所有元素取出来交给接收变量，执行业务代码。
		 * 
		 */
		dome2();
	}
	/**
	 * 为数组里所有位置设置新的元素数据
	 * a）普通for-可以实现
	 * b）增强for-不能实现
	 *
	 */
	private static void dome2() {
		//明星数组
		String [] starsArr=new String[]{"古力娜扎","杨幂","张飞","包青天"};
		/**
		 * 把数组所有名字-修改为"志林姐姐"
		 */
		System.out.println("--------普通for实现--------");
		for (int i = 0; i < starsArr.length; i++) {
			//为当前数组位置-设置"志林姐姐"
			starsArr[i]="志林姐姐";
		}
		System.out.println("修改后1："+Arrays.toString(starsArr));
		System.out.println("--------增强for不能实现--------");
		
		for(String curStar :starsArr){
			//为当前数组位置-设置"志林姐姐2"
			curStar="志林姐姐2";
		}
		System.out.println("修改后2："+Arrays.toString(starsArr));
		/**
		 * 等价于如下代码
		 */
		for (int i = 0; i < starsArr.length; i++) {
			//取出数据
			String curStar=starsArr[i];
			//为当前数组位置-设置"志林姐姐"
			curStar="志林姐姐3";
		}
		System.out.println("修改后3："+Arrays.toString(starsArr));
		
	}
	/**
	 * 访问数组里所有元素的数据
	 * a）普通for-可以实现
	 * b）增强for-可以实现
	 *
	 * 对比
	 * 普通for：代码复杂，可以访问下标
	 * 增强for：代码简洁，没有下标
	 */
	private static void dome1() {
		//明星数组
		String [] starsArr=new String[]{"古力娜扎","杨幂","张飞","包青天"};
		/**
		 * 把所有的明星名字打印到控制台（每个名字之间需要换行）
		 */
		System.out.println("--------普通for实现--------");
		for (int idx = 0; idx < starsArr.length; idx++) {
			//取出明星
			String curStar = starsArr[idx];
			//打印
			System.out.println(curStar);
			System.out.println("当前元素的下标："+idx);
		}
		System.out.println("--------增强for实现--------");
		for(String curStar :starsArr){
			//打印
			System.out.println(curStar);
		}
		
	}
}
