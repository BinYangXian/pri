package day16.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 遍历map的数据（键-值）
		 * ---只遍历值
		 * 1）values -》找到map的所有的值放入collection容器返回
		 * ---遍历键和值
		 * 2）keySet  -》找到map的所有的键放入set容器返回
		 * 3）entrySet  -》找到map的所有的键值对放入set容器返回
		 */
		/**
		 * 把如下数据装入map中
 名字               年龄        地址             钱
   
  张三丰           18            春熙路        6000
  赵云               19            天府广场    8000
  张辽               20           布鲁明顿    9000
  张飞               20            布鲁明顿    9000

键（String）     值（PersonInfo）

 名字               年龄，地址	钱
   
  张三丰           18,春熙路,6000
  赵云               19,天府广场,8000
  张辽               20,布鲁明顿,9000
  张飞               20,布鲁明顿,9000
		 */
		app();
		
	}
	private static void app() {
		//创建map
		Map<String, PersonInfo> map= createMap();
		//需求 1
		dome1(map);
		//需求 2
		dome2(map);
		//需求 2
		dome3(map);
	}
	
	/**
	 * 创建map的功能
	 */
	public static Map<String, PersonInfo> createMap(){
		//创建map
		Map<String, PersonInfo> map=new HashMap<String, PersonInfo>();
		//装数据
//		  张三丰           18,春熙路,6000
//		  赵云               19,天府广场,8000
//		  张辽               20,布鲁明顿,9000
//		  张飞               20,布鲁明顿,9000
		map.put("张三丰", new PersonInfo(18, "春熙路", 6000));
		map.put("赵云", new PersonInfo(19, "天府广场", 8000));
		map.put("张辽", new PersonInfo(20, "布鲁明顿", 9000));
		map.put("张飞", new PersonInfo(20, "布鲁明顿", 9000));
		
		return map;
	}
	
	/**
	 * entrySet
	 * 
	 * 需求2:打印出map里所有人的名字和年龄的列表
	 * 格式：
	 * 姓名：ｘｘ　　年龄：ｘｘ
	 * ...
	 */
	private static void dome3(Map<String, PersonInfo> map) {
		//找到map里所有的键值对（map.entry）
		Set<Map.Entry<String, PersonInfo>> entrySet= map.entrySet();
		//遍历所有的键值对
		for (Map.Entry<String, PersonInfo> entry : entrySet) {
			//entry当前的键值对
			//取出键
			String perName= entry.getKey();
			//取出值1(性能好)
			PersonInfo perInfo= entry.getValue();
			//取出值2
			PersonInfo perInfo2= map.get(perName);
			//找到值的年龄
			int curAge= perInfo2.age;
			//打印
			System.out.println("姓名："+perName+" 年龄："+curAge);
			
		}
	}
	
	/**
	 * keySet
	 * 
	 * 需求2:打印出map里所有人的名字和年龄的列表
	 * 格式：
	 * 姓名：ｘｘ　　年龄：ｘｘ
	 * ...
	 */
	private static void dome2(Map<String, PersonInfo> map) {
		//找到map里所有的名字（键）
		Set<String> keySet= map.keySet();
		//遍历所有的键
		for (String keyPerName : keySet) {
			//找到键的值-（personInfo）
			PersonInfo per= map.get(keyPerName);
			//找到值的年龄
			int curAge= per.age;
			//打印
			System.out.println("姓名："+keyPerName+" 年龄："+curAge);
		}
		
	}
	/**
	 * 
	 * values
	 * 
	 * 需求1:计算map中所有人的总共的资产-并打印
	 * @param map 
	 */
	private static void dome1(Map<String, PersonInfo> map) {
		//找到map里所有的值（personinfo）
		Collection<PersonInfo> values= map.values();
		//总资产
		long sumMoney=0;
		//遍历所有的值
		for (PersonInfo personInfo : values) {
			//当前的钱
			long curMoney= personInfo.money;
			//统计钱
			sumMoney+=curMoney;
		}
		//
		System.out.println("总资产："+sumMoney);
	}
}
class PersonInfo{
	int age;
	String addr;
	long money;
	public PersonInfo(int age, String addr, long money) {
		this.age = age;
		this.addr = addr;
		this.money = money;
	}
}