package exam;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 2、将字符串"131d-+3fsf42_)4dASsf"中的所有大小写字母装入char[]中。
（要求char[]的长度正好是大小写字母的个数）再把char[]表示的字符输出到控制台。
提示：可利用数组添加字符，字符串拼接，容器添加对应字符。

		 */
		String str="131d-+3fsf42_)4dASsf";
		
		//数组长度
		int arrLen=0;
		//遍历所有的字符
		for (int i = 0; i <str.length(); i++) {
			//取出字符
			char curChar=str.charAt(i);
			//判断大小写字母-长度+1
			if(Character.isLetter(curChar)){
				arrLen++;
			}
		}
		//创建数组
		char[] arr=new char[arrLen];
		//数组的下标
		int arrIdx=0;
		for (int i = 0; i <str.length(); i++) {
			//取出字符
			char curChar=str.charAt(i);
			//判断大小写字母-装入数组
			if(Character.isLetter(curChar)){
				//装入字母
				arr[arrIdx]=curChar;
				//下一次装入下一个位置-下标+1
				arrIdx++;
			}
		}
		//
		System.out.println("字符数组："+Arrays.toString(arr));
	}
}
