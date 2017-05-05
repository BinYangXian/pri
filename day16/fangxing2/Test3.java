package day16.fangxing2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		/**
		 * 
		 * 泛型的通配符
作用：为匹配的泛型参数限制一个范围
	 -->通配符使用泛型参数
	1） ？：？泛型参数-》可以匹配所有的类型的泛型参数
	2） ？ super T:？泛型参数-》可以匹配【T类型】或【T类型的超类型】的泛型参数
	3）? extends T:？泛型参数-》可以匹配【T类型】或【T类型的子类型】的泛型参数
		 * 
		 * 
		 * 常用API

addAll 添加可变参数元素到collection
sort 排序
binarySearch 二分法搜索
fill 填充
max 最大值
min 最小值
copy 复制
reverse 反转
		 * 
		 */
		dome2();
	}
	
	private static void dome2() {
		/**
		 * static <T> int 
 binarySearch(List<? extends Comparable<? super T>> list, T key) 
		 */
		List<String> list1=null;
		List<Object> list2=null;
		List<Date> list3=null;
		List<Student1> list4=null;
		List<Student2> list5=null;
		List<Student3> list6=null;
		List<Student4> list7=null;
		//
		Collections.<String>binarySearch(list1, null);
		//Collections.<Object>binarySearch(list2, null);//Object不是Comparable子类型不能传入
		Collections.<Date>binarySearch(list3, null);
		//Collections.<Student1>binarySearch(list4, null);//Student1不是Comparable子类型不能传入
		Collections.<Student2>binarySearch(list5, null);//Student2是Comparable子类型可以传入
		//Collections.<Student3>binarySearch(list6, null);//Student3里实现Comparable<String>，Stirng不是Student3的超类型不能传入
		Collections.<Student4>binarySearch(list7, null);//Student4里实现Comparable<Object>，OBject是Student4的超类型可以传入
	}
	/**
	 * ？  
	 */
	private static void dome1() {
		List<String> list1=null;
		List<Object> list2=null;
		List<Date> list3=null;
		//
		listToArr(list1);//List<?>匹配了List<String> ，？ 匹配了String类型
		listToArr(list2);//List<?>匹配了List<Object> ，？ 匹配了Object类型
		listToArr(list3);//List<?>匹配了List<Date> ，？ 匹配了Date类型
		
		//

		List<Integer> list4=Arrays.asList(11,22,33,66,11,23);
		//反转list4，倒置存储
		Collections.reverse(list4);
		System.out.println("反转后的list4："+list4);
		
	}
	/**
	 * 把list转换为数组
	 * 参数list：可以接收任何元素类型的list
	 */
	public static Object[] listToArr(List<?> list){
		return null;
	}
}
class Student1{
}
class Student2 implements Comparable<Student2>{
	@Override
	public int compareTo(Student2 o) {
		return 0;
	}
}
class Student3 implements Comparable<String>{
	@Override
	public int compareTo(String o) {
		return 0;
	}
}


class Student4 implements Comparable<Object>{
	@Override
	public int compareTo(Object o) {
		return 0;
	}
}