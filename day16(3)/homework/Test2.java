package day16.homework;

import java.util.HashMap;
import java.util.Map;


public class Test2 {
	public static void main(String[] args) {
		/**
		 * 1. 假如有以下email数据“aa@sohu.com,bb@163.com,cc@sina.com,..”
		 * 现需要把     email中的用户部分（如aa）和邮件地址部分(如sohu.com)分离，
		 * 分离后以键值对应的方式放入HashMap，并遍历打印map的键和值。
提示：参考String split方法
		 */
		app();
	}

	private static void app() {
		//原始数据
		String emailStr="aa@sohu.com,bb@163.com,cc@sina.com,..";
		//分割为多个子数据
		String[] emailArr= emailStr.split(",");
		//创建map
		Map<String, String> map=new HashMap<String,String>();
		
		//遍历所有的子数据(包含..)
		for (String email : emailArr) {
			//判断子数据是一个邮箱才处理
			if(email.contains("@")){
				// aa@sohu.com
				//分割出用户和地址部分
				String []arr= email.split("@");
				//取出用户和地址
				String uName=arr[0];
				String addr=arr[1];
				//装入map
				map.put(uName, addr);
			}
		}
		//查看数据
		System.out.println("map的数据："+map);
	}
}
