package day15.baozhuangClass;

import java.util.List;
import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 包装类的作用

   1)、以面向对象操作基本类型数据

a）容器类不能存储基本类型
数组：    存储的是引用类型（对象）加基本类型
java容器类：存储的元素是引用类型（对象）

b）泛型参数不能用基本类型，怎么办？

通过包装类解决！所有基本类型都对应了包装类-》可以互相转换,
基本类型的值对应包装类型的对象。

c)、大量方法和属性方便操作基本类型的数据
      类型转换（基本类型，包装类型，字符串）， 最大值，最小值等
		 */
		
		//装任何引用类型数据的list容器
		List list=new ArrayList();
		//装字符串
		list.add("张无忌");
		list.add(new StringBuilder("柳岩"));
		//装基本类型-数字
		//基本类型
		int age=28;
		//基本类型转包装类型
		Integer age2=new Integer(age);
		list.add(age2);
		
		
		int age3=38;
		list.add(age3);//age3会自动转换为integer装入list
		System.out.println("----------------");
		
		//b）泛型参数不能用基本类型，怎么办？
		//装byte数据的list容器
		//List<byte> list2=new ArrayList<byte>();//基本类型不能作为泛型参数
		List<Byte> list2=new ArrayList<Byte>();//基本类型不能作为泛型参数
		
//		c)、大量方法和属性方便操作基本类型的数据
		System.out.println("int的最大值："+Integer.MAX_VALUE);
		System.out.println("byte的最小值："+Byte.MIN_VALUE);
	}
}
