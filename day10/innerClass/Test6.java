package day10.innerClass;

import day10.innerClass.test4.FindNumberString2;
import day10.innerClass.test4.FindString2;
import day10.innerClass.test4.FindXxString2;

public class Test6 {
	public static void main(String[] args) {
		
		/**
		 * 
		 * 局部内部类-有名字
		 * -》解决java文件过多的问题
		 * 
		 * -》代码复杂
		 * 
		 * 使用匿名的局部内部类-简化代码
		 * 
		 * 匿名内部类的语法:
		 *  new  匿名类的超类型（继承的类或实现的接口） (){
		 *     //匿名类的类体
		 *     //成员方法..变量...
		 *  }; 
		 *  做两件事情
		 *  a）先定义一个没有名字的类-继承或实现了一个超类型
		 *  b）创建出匿名类的一个对象，并返回对象地址
		 * 
		 * 
		 */
		
		//原始字符串
		String str="aDsL2we*tR9EVbnM5ky&r$T+@Csfa2342rsfdsa23424";
		//找数字
		/**
		 * 定义找数字的匿名内部类
		 */
		FindString2 fs=new  FindString2(){
			@Override
			public boolean checkChar(char ch){
				//判断字符是否是数字
				if(ch>='0'&&ch<='9'){
					return true;
				}
				return false;
			}
		};
		/**
		 * 查找
		 */
		String numStr= findStringSubStr(str, fs);
		System.out.println("找到的数字："+numStr);
		
		
		//找小写字母
		String xxStr= findStringSubStr(str, 
			new FindString2(){
				public boolean checkChar(char ch){
					if(ch>='a'&&ch<='z'){
						return true;
					}
					return false;
				}
			}		
		);
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