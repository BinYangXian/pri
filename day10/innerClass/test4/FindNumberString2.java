package day10.innerClass.test4;
//找数字的类
public class FindNumberString2 implements FindString2{
	
	/**
	 * 找数字的方法
	 * 
	 * 判断指定的【字符】是不是数字
	 * 参数：指定的字符
	 * 返回值：是数字-true，不是 false
	 */
	@Override
	public boolean checkChar(char ch){
		//判断字符是否是数字
		if(ch>='0'&&ch<='9'){
			return true;
		}
		return false;
	}
	
}