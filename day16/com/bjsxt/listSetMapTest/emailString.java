package com.bjsxt.listSetMapTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 *   1. ����������email���ݡ�aa@sohu.com,bb@163.com,cc@sina.com,..������Ҫ��     email�е��û����֣���aa�����ʼ���ַ����(��sohu.com)���룬������Լ�ֵ��Ӧ�ķ�ʽ����HashMap����������ӡmap�ļ���ֵ��
��ʾ���ο�String split����
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
