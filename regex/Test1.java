package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import util.FileUtil;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 
		 * 正则表达式概念：
一个包含各种特殊字符的表达式字符串，可以用来匹配对应的字符串数据。

正则表达式的作用

1)验证:检查指定的字符串是否是满足[正则表达式]要求的数据.
例如:检查用户名,邮箱,手机号...
	
2)查询:在一堆复杂的字符数据里找到我们需要的正确数据匹配[正则表达式].
例如:有干扰数据里的正确的所有邮箱信息.
	
3)替换:把字符串数据里满足[正则表达式]的数据给替换了.
例如:聊天的非法信息的屏蔽
对应api:String.replaceAll(正则表达式,替换后的字符串)
	
4)分割:把字符串数据里按指定的[正则表达式]把数据分割为多个部分
对应api:String.split(正则表达式)
    例如:把字符串里"柳岩+18岁=模特儿_50万"
		 * 
		 */
		queryString();
	}
	/**
	 * 查找字符串
	 */
	private static void queryString() {
		//要查找的数据
		String emialData= FileUtil.readFileInfoToString("src/regex/email.data", "utf-8");
		/**
		 * a)通过【正则字符串】编译为【正则的对象】
		 */
		Pattern pt= Pattern.compile("(\\w{1,20})@([a-zA-Z0-9.]{1,20})");
		/**
		 * b）把【正则对象】和【要匹配的数据】绑定=得到【匹配器对象】
		 */
		Matcher  mc=pt.matcher(emialData);
		
		/**
		 * 通过【匹配器对象】去【匹配的数据】查找所需要的邮箱数据
		 * 
		 * 查找过程
		 * 1）find查找下一个匹配的数据 -找到true
		 * 2）group拿到刚找到匹配的数据 
		 * 1）find查找下一个匹配的数据 -找到true
		 * 2）group拿到刚找到匹配的数据 
		 * ...
		 * 1）find查找下一个匹配的数据 -没找到false
		 */
		while(mc.find()){// 1）find查找下一个匹配的数据 -找到true
			//2）group拿到刚找到匹配的数据 
			String email= mc.group();
			String emai2= mc.group(0);
			String uname=mc.group(1);
			String addr=mc.group(2);
			//查看
			System.out.print(" 找到是邮箱数据："+emai2);
			System.out.print(" 找到是邮箱用户部分："+uname);
			System.out.println(" 找到是邮箱地址部分："+addr);
		}
		
		
	}
	/**
	 * 验证字符串
	 */
	private static void checkString() {
		/**
		 * 程序的数据
		 */
		String data1="12580@qq.com";
		String data2="111111111111111";
		String data3="+=12580@qq.com---==-=-()";
		//邮箱正则：\w{1,20}@[a-zA-Z0-9.]{1,20}
		/**
		 * a)通过【正则字符串】编译为【正则的对象】
		 */
		Pattern pt= Pattern.compile("\\w{1,20}@[a-zA-Z0-9.]{1,20}");
		/**
		 * b）把【正则对象】和【要匹配的数据】绑定=得到【匹配器对象】
		 */
		//绑定数据1
		Matcher mc1= pt.matcher(data1);
		//绑定数据2
		Matcher mc2= pt.matcher(data2);
		//绑定数据3
		Matcher mc3= pt.matcher(data3);
		/**
		 * 验证 匹配的数据【是不是】对应的数据（邮箱）
		 */
		System.out.println("[12580@qq.com]是不是邮箱？"+mc1.matches());
		System.out.println("[111111111111111]是不是邮箱？"+mc2.matches());
		System.out.println("[+=12580@qq.com---==-=-()]是不是邮箱？"+mc3.matches());
		/**
		 * 重置匹配器的查找位置为第一个位置
		 */
		mc1.reset();
		mc2.reset();
		mc3.reset();
		/**
		 * 验证 匹配的数据【有没有】对应的数据（邮箱）
		 */
		System.out.println("[12580@qq.com]有没有邮箱？"+mc1.find());
		System.out.println("[111111111111111]有没有邮箱？"+mc2.find());
		System.out.println("[+=12580@qq.com---==-=-()]有没有邮箱？"+mc3.find());
		
		
	}
}
