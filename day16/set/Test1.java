package day16.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * List（动态的数组）：
		 * 1）一种容器，可以装很多元素
		 * 2）元素和下标（0到size-1）绑定
		 * 3）通过下标访问元素
		 * 4）元素数量不固定-》创建list的时候，元素数量为0，装入几个算几个。
		 * 5）可以存储重复元素
		 * 
		 * Set
		 * 1）一种容器，可以装很多元素
		 * 2)元素没有下标
		 * 3）通过（增强for-迭代器）访问元素
		 * 4）元素数量不固定-》创建set的时候，元素数量为0，装入几个算几个。
		 * 5）不能存储重复元素
		 * 
		 * 
		 * set和list对比
		 * set：不能重复，元素没有下标。
		 * list：可以重复，元素有下标，下标有序。
		 * 
		 * set是一个接口
		 * 定义规范了：set实现类所需要用到的api
		 * 增加，删除，是否包含元素，元素数量...
		 * 
		 * set是接口不能直接创建对象-使用实现类创建对象
		 * 
		 * 实现类
		 * 
		 * hashset：底层是通过hashMap存储数据，
		 * hashset性能通常比treeset好。
		 * 
		 * treeset：底层是通过treeMap存储数据
		 * treeset增加了对加入set的元素自动升序排序功能（通常不使用，性能差，在需要排序的时候使用对应的api）
		 * 
		 * 
		 * Collection和set和list的关系
		 * Collection:一种容器，可以装很多元素
		 * set:一种容器，可以装很多元素，增加功能：元素没有下标，元素不能重复
		 * list:一种容器，可以装很多元素，增加功能：元素有下标，下标有序，元素可以重复
		 * 
		 * 
		 */
		dome1();
	}
	
	
	
	/**
	 * 需求1：
	 * 
	 * 把如下所有账号装入容器中
用户名       
   
liuyan1        
liuyan2       
liudehua1         
--->错误数据
liuyan1     
	 */
	private static void dome1() {
		/**
		 * list-可以存储重复的数据-重复的用户名也存储-不满足要求！
		 */
		List<String> listUser=new ArrayList<String>();
		//装数据
		listUser.add("liuyan1");
		listUser.add("liuyan2");
		listUser.add("liudehua1");
		listUser.add("liuyan1");
		System.out.println("list 的数据："+listUser);
		
		/**
		 * set-不能存储重复的数据-重复的用户名不存储-满足要求！
		 */
		Set<String> setUser=new HashSet<String>();
		//装数据
		setUser.add("liuyan1");
		setUser.add("liuyan2");
		setUser.add("liudehua1");
		setUser.add("liuyan1");
		System.out.println("set 的数据："+setUser);
		
	}
	
	
	
	
	
}
