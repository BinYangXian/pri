package day16.map;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * list是特殊的map
		 * list：教师里的所有的人（元素），每一个人（元素）绑定下标（编号-整数（0到size-1））
		 * map：教师里的所有的人（值），每一个人（值）绑定键（任何数据值）
		 * 
		 * 
		 * 
		 * List（动态的数组）：
		 * 1）一种容器，可以装很多元素
		 * 2）元素和下标（0到size-1）绑定
		 * 3）通过下标访问元素
		 * 4）元素数量不固定-》创建list的时候，元素数量为0，装入几个算几个。
		 * 5）可以存储重复元素
		 * 
		 * 
		 * map：
		 * 1）一种容器，可以装很多（键-对应下标）（值-对应元素）对
		 * 2）值和键（任何类型任何值）绑定
		 * 3）通过键 访问  值
		 * 4）键值对数量不固定-》创建map的时候，元素数量为0，装入几个算几个。
		 * 5）可以存储重复值，不能存储重复的键
		 * 
		 * 
		 * map接口：定义规范了所有的map实现类的通用的api功能
		 * 添加，删除，访问，元素数量...
		 * map是接口不能直接创建对象
		 * -》通过实现类
		 * 
		 * 实现类
		 * HashMap：底层通过单向链表加数组存储数据，
		 * 	hashMap通常性能比treeMap好。
		 *  线程不安全，键和值可以为null
		 * treeMap：底层通过红黑树存储数据，
		 *  treeMap增加了对map里的数据按键自动进行升序排列（通常不使用）
		 * Hashtable：底层通过单向链表加数组存储数据，
		 *  线程安全，键和值不能为null
		 * Properteis：继承了Hashtable，增加了和Properteis（格式的流（主要文件的流））处理的功能（读取和写出数据）
		 * 
		 */
		dome1();
	}

	/**
	 * 需求2-
把如下所有账号和密码装入容器中
用户名        密码
   
liuyan1              111
liuyan2           111
liudehua1           222
--->错误数据
liuyan1       333
liuyan1       222
	 */
	
	/**
	 * map常用api：
	 * 
	 *  a）添加 修改 数据:     map.put(key, value); key 已存在就是修改
 b）查找值value:    map.get(键key)    
 c） 删除数据:  remove(Object key);
 删除全部：clear();
 d )获得总个数(键值对)：size();   
boolean containsKey(Object key)
          如果此映射包含对于指定键的映射关系，则返回 true。
 boolean containsValue(Object value)
          如果此映射将一个或多个键映射到指定值，则返回 true。
          
	 */
	private static void dome1() {
		//创建一个hashmap实现的map-装用户信息（键-用户名String,值-密码-long）
		Map<String, Long> userMap=new HashMap<String, Long>();
		/**
		 * 装数据-已经存在键，修改数据
		 */
		/**
		 * put添加-如果键不存在就添加
		 */
		userMap.put("liuyan1", 111L);
		userMap.put("liuyan2", 111L);
		userMap.put("liudehua1", 222L);
		/**
		 * put修改-如果键存在就修改
		 */
		userMap.put("liuyan1", 333L);
		userMap.put("liuyan1", 222L);
		//查看数据
		System.out.println("map数据1："+userMap);
		//删除所有数据
		userMap.clear();
		/**
		 * 装数据-已经存在键，不装入数据
		 */
		if(!userMap.containsKey("liuyan1")){
			userMap.put("liuyan1", 111L);
		}
		if(!userMap.containsKey("liuyan2")){
			userMap.put("liuyan2", 111L);
		}
		if(!userMap.containsKey("liudehua1")){
			userMap.put("liudehua1", 222L);
		}
		if(!userMap.containsKey("liuyan1")){
			userMap.put("liuyan1", 333L);
		}
		if(!userMap.containsKey("liuyan1")){
			userMap.put("liuyan1", 222L);
		}
		//查看数据
		System.out.println("map数据2："+userMap);
		
		/**
		 * 查看  数据
		 */
		//查看liudehua1 的密码
		System.out.println("liudehua1 的密码:"+userMap.get("liudehua1"));
		//查看liuyan1 的密码
		System.out.println("liuyan1 的密码:"+userMap.get("liuyan1"));
		/**
		 * 删除  数据-》删除某一个键值对
		 * remove(键值对的键);
		 */
		//删除liudehua1
		userMap.remove("liudehua1");
		System.out.println("map数据3："+userMap);
		
	}
}