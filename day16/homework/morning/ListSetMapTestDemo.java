package day16.homework.morning;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ListSetMapTestDemo {
	public static void main(String[] args) {
		//spiltStr();
		lensons();
		Map<String,Set<String>> map = new HashMap<>();
		Set<String> set = new HashSet<>();
		set.add("123");
		set.add("456");
		map.put("1", set);
		set.clear();
		set.add("789");
		map.put("2", set);
		System.out.println(map);
	}

	private static void lensons() {
/**
 * 原map ：
   课程名key（String） 老师名value （String）
   java         曾老师
   数据库     曾老师
   web         卢老师
   体育         刘老师
 */
		Map<String,String> map = new HashMap<>();
		map.put("java", "曾老师");
		map.put("数据库", "曾老师");
		map.put("web", "卢老师");
		map.put("体育", "刘老师");
		System.out.println(map);
		Set<String> keyset = map.keySet();
	
		//拿到所有老师
		Collection<String> values = map.values();
		//去重
		Set<String> teacherSet = new HashSet<>();
		for (String string : values) {
			teacherSet.add(string);
		}
		System.out.println("teacherSet"+teacherSet);
		Map<String,Set<String>> newMap = new HashMap<>();
		Set<String> courseSet = null;
		//通过value得到key
		for (String teacherStr : teacherSet) {
			courseSet = new HashSet<>();
			for (String keyStr : keyset) {
				if(map.get(keyStr).equals(teacherStr)){
					courseSet.add(keyStr);
				}
			}
			newMap.put(teacherStr, courseSet);
		}
		System.out.println(newMap);

		
		
	}

	private static void spiltStr() {
		// 假如有以下email数据“aa@sohu.com,bb@163.com,cc@sina.com,..”
		// 现需要把 email中的用户部分（如aa）和邮件地址部分(如sohu.com)分离，
		// 分离后以键值对应的方式放入HashMap，并遍历打印map的键和值。
		Map<String, String> map = new HashMap<>();
		String str = "aa@sohu.com,bb@163.com,cc@sina.com";
		String[] emails = str.split(",");
		for (String string : emails) {
			String[] newEmails = string.split("@");
			map.put(newEmails[0], newEmails[1]);
		}
		System.out.println(map);
	}
}
