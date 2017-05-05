package day10.innerClass;

import day10.innerClass.test4.FindNumberString2;
import day10.innerClass.test4.FindString2;
import day10.innerClass.test4.FindXxString2;

public class Test4 {
	public static void main(String[] args) {
		/**
		 * 编写一个程序，找到字符串中所有的
【数字】
【大写字母】
【小写字母】
【a或b或c】并拼接打印

  String s =“aDsL2we*tR9EVbnM5ky&r$T+@C”；
打印的结果：

你所提供的字符串是：aDsL2we*tR9EVbnM5ky&r$T+@C

大写字母分别是：  DLREVMTC
小写字母分别是：  aswwtbnkyr
		 */
		
		/**
		 * 定义了【找数字】【找字母】【找135】的方法
		 * -》找的数据-不确定-对应的方法不断增长
		 * 
		 * --》把类似的找数据的方法-想办法定义到一个位置
		 * 
		 * 问题-》
		 * 每一个找数据的方法的判断条件的代码不一致：
		 * 【找数字】  curChar>='0'&&curChar<='9'
		 * 【找字母】  curChar>='a'&&curChar<='z'
		 * 【找135】  curChar=='1'||curChar=='3'||curChar=='5'
		 * 
		 * -》代码想要在方法外部使用的时候传入-》在方法内部执行
		 * 
		 * --》方法的参数不能直接传代码
		 * --》代码可以封装到成员方法中
		 * --》成员方法属于对象
		 * 
		 * --》解决办法
		 * 把代码封装到成员方法，把成员方法封装到对象，把对象通过方法参数传入。
		 * 
		 * 
		 * -->面向具体类编程-》出现重复查找【指定字符串】里【满足要求的指定字符数据】
		 * 
		 * --》面向超类型编程解决
		 * 
		 * -->子类型使用外部类-》java文件太多
		 * --》解决-》内部类
		 */
		//原始字符串
		String str="aDsL2we*tR9EVbnM5ky&r$T+@Csfa2342rsfdsa23424";
		//找数字
		String numStr= findStringSubStr(str, new FindNumberString2());
		System.out.println("找到的数字："+numStr);
		//找小写字母
		String xxStr= findStringSubStr(str, new FindXxString2());
		System.out.println("找到的小写字母："+xxStr);
	}
	
	
	
	/**
	 * 定义一个找【指定字符串】里【满足要求的指定字符数据】并返回
	 * 参数：
	 * oldStr 原始字符串
	 * fs 查找字符 的对象(包含检查的方法checkChar)
	 * 返回值： 满足要求的字符串
	 */
	public static String findStringSubStr(String oldStr,FindString2 fs){
		
		//拼接的字符串
		String concatNumStr="";
		//找到所有的字符
		for(int idx=0;idx<=oldStr.length()-1;idx++){
			//当前字符
			char curChar= oldStr.charAt(idx);
			//判断字符是否是指定字符
			if(fs.checkChar(curChar)){//多态
				//拼接
				concatNumStr+=curChar;
			}
		}
		return concatNumStr;
	}
	
	
}