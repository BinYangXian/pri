package day16.fangxing2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class Test2 {
	public static void main(String[] args) {
		/**
		 * 
		 */
		dome3();
	}
	/**
	 * 泛型方法的api：
	 * colleciton的<T> T[] toArray(T[] arr)
	 * --》把list或set的容器转换为对应具体元素类型的数组
	 * 参数arr：传入对应元素类型的数组（长度应该和当前容器元素数量相同）
	 */
	private static void dome3() {
		//装明星的list
		List<String> listStar=Arrays.<String>asList("柳岩","刘德华","古力娜扎");
		/**
		 * list转数组
		 */
		String [] arr1= listStar.<String>toArray(new String[listStar.size()]); 
		System.out.println("arr1的数据："+Arrays.toString(arr1));
		
		//装数字的list
		List<Integer> listNum=Arrays.<Integer>asList(11,1321,21313,312);
		/**
		 * list转数组
		 */
		Integer [] arr2= listNum.<Integer>toArray(new Integer[listNum.size()]); 
		System.out.println("arr2的数据："+Arrays.toString(arr2));
		
	}
	private static void dome2() {
		List<String> list1=null;
		List<Object> list2=null;
		List<Date> list3=null;
		/**
		 * 方法使用的时候传入具体类型参数
		 */
		Test2.<String>listToArr2(list1);
		Test2.<Object>listToArr2(list2);
		/**
		 * 方法使用的时候 不传入具体类型参数
		 * -》只有使用泛型参数的地方-类型兼容即可
		 */
		  Date[] arr1= listToArr2(list3);//自动传入了Date类型-返回Date[]
		 // Date[] arr2= listToArr2(list1);//自动传入了String类型-返回String[]
		  String[] arr3= listToArr2(list1);//自动传入了String类型-返回String[]
		  
	}
	/**
	 * 把list转换为数组
	 * 
	 * 泛型参数：EleType 元素的类型-list和数组一致
	 */
	public static <EleType>  EleType[] listToArr2(List<EleType> list){
		return null;
	}
	private static void dome1() {
		List<String> list1=null;
		List<Object> list2=null;
		//
		//listToArr(list1);//List<String>和List<Object>泛型参数不同，不能赋值
		
		listToArr(list2);
	}
	/**
	 * 把list转换为数组
	 */
	public static Object[] listToArr(List<Object> list){
		return null;
	}
}
