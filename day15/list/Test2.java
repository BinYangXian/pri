package day15.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
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
		 * list的接口
		 * -》规范list容器用的功能api
		 * 添加，删除，插入，读取，修改...
		 * 
		 * list是接口不能直接创建对象
		 * -》创建实现类的对象
		 * 
		 * 实现类
		 * a）ArrayList:底层用数组存储数据
		 *  ArrayList读取，修改，添加元素的性能比LinkedList好
		 *  线程不安全
		 *  
		 * b）LinkedList:底层用双向链表存储数据
		 * LinkedList 删除，插入元素的性能比ArrayList好
		 * 
		 * c）Vector:底层用数组存储数据
		 * 线程安全-比ArrayList略慢-多线程
		 * 
		 * 注意点：所有容器的实现类都有空构造器，用于创建0个元素的容器。
		 * 
		 */
		dome1();
	}
	/**
	 * list的常用的api：
	 * 
	 *
a）增 ：add(添加内容)--》添加到尾部;   
     插入：add（索引，添加内容）--》添加到指定位置
b)删： remove(索引 || 内容) ;   删除失败-》返回false，成功-》返回true
    删除全部：clear()；
c)改：set(索引，替换内容) ;
d)查：get(索引);
e)获得总个数：size();  
	 * 
	 */
	private static void dome1() {
		//装喜欢的明星的名字（String）-arrayList实现的list容器
		List<String> listStar=new ArrayList<String>();
		/**
		 * 添加数据-到尾部
		 */
		listStar.add("刘亦菲");
		listStar.add("柳岩");
		System.out.println("list1："+listStar);
		listStar.add("古力娜扎1");
		listStar.add("古力娜扎2");
		listStar.add("刘亦菲");
		System.out.println("list2："+listStar);
		System.out.println("数量："+listStar.size());
		/**
		 * 插入
		 */
		//柳岩-后面-插入 -大鹏
		listStar.add(2,"大鹏");
		System.out.println("list3："+listStar);
		System.out.println("数量："+listStar.size());
		/**
		 * 删除-古力娜扎1
		 * -》通过下标
		 */
		listStar.remove(3);
		System.out.println("list4："+listStar);
		System.out.println("数量："+listStar.size());
		/**
		 * 删除-刘亦菲
		 * -》通过内容(删除第一个)
		 */
		listStar.remove("刘亦菲");
		System.out.println("list5："+listStar);
		/**
		 * 删除所有
		 */
		//listStar.clear();
		//System.out.println("list6："+listStar);
		/**
		 * 访问数据
		 */
		System.out.println("第一个位置："+listStar.get(0));
		System.out.println("最后一个位置："+listStar.get(listStar.size()-1));
		/**
		 * 修改数据
		 */
		//第一个改为-李冰冰
		listStar.set(0, "李冰冰");
		/**
		 * 访问数据
		 */
		System.out.println("第一个位置："+listStar.get(0));
		System.out.println("最后一个位置："+listStar.get(listStar.size()-1));
	}
}
