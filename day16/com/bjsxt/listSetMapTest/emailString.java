package com.bjsxt.listSetMapTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 *   1. 假如有以下email数据“aa@sohu.com,bb@163.com,cc@sina.com,..”现需要把     email中的用户部分（如aa）和邮件地址部分(如sohu.com)分离，分离后以键值对应的方式放入HashMap，并遍历打印map的键和值。
提示：参考String split方法
 * @author bin
 *
 */
public class emailString {
	public static void main(String[] args) {
		String str="aa@sohu.com,bb@163.com,cc@sina.com";
		HashMap<String, String> emails=new HashMap<String,String>();
		String s[]=str.split(",");
		for (int i = 0; i < s.length; i++) {
			String[] ss = s[i].split("@");
			emails.put(ss[0], ss[1]);
		}
		Set<String> keySet = emails.keySet();
		Collection<String> values = emails.values();
		for (String value : values) {
			System.out.println(value);
		}
		for (String key : keySet) {
			System.out.println(key);
		}
	}
}
