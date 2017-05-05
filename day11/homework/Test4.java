package day11.homework;

public class Test4 {
	public static void main(String[] args) {
		/**
		 * 3）定义public static String subString(String str , int starIndex , int endIndex)
throws StringIndexOutOfBoundsException;方法
参数：str原字符串，starIndex 新字符串开始下标，endIndex新字符串结束下标
返回值：所得新字符串
需求：
a）方法内部用 String类charAt，length方法，以及循环，字符串拼接+实现。
b）实现把str内容的startIndex下标（包含）到endindex下标（包含）所有字符内容拼接成字符串然后返回给方法调用处。
c）如果startIndex小于0抛出异常StringIndexOutOfBoundsException类的对象并设置异常信息“startIndex-小于0，下标越界”。
d）如果endIndex小于0抛出异常StringIndexOutOfBoundsException类的对象并设置异常信息“endIndex-小于0，下标越界”。
e）如果startIndex-大于length-1抛出异常StringIndexOutOfBoundsException类的对象并设置异常信息“startIndex-大于length-1，下标越界”。
f）如果endIndex-大于length-1抛出异常StringIndexOutOfBoundsException类的对象并设置异常信息“endIndex-大于length-1，下标越界”。
		 */
		String personInfo="柳岩_18岁_java工程师";
		//取出年龄
		String age= subString(personInfo, 3, 5);
		System.out.println("年龄："+age);
		
	}
	public static String subString(String str , int starIndex , int endIndex)
			throws StringIndexOutOfBoundsException{
		/**
		 * 异常处理
		 */
		if(starIndex<0){
			StringIndexOutOfBoundsException se=new StringIndexOutOfBoundsException("startIndex-小于0，下标越界");
			throw se;
		}
		if(endIndex<0){
			StringIndexOutOfBoundsException se=new StringIndexOutOfBoundsException("endIndex-小于0，下标越界");
			throw se;
		}
		if(starIndex>str.length()-1){
			StringIndexOutOfBoundsException se=new StringIndexOutOfBoundsException("startIndex-大于length-1，下标越界");
			throw se;
		}
		if(endIndex>str.length()-1){
			StringIndexOutOfBoundsException se=new StringIndexOutOfBoundsException("endIndex-大于length-1，下标越界");
			throw se;
		}
		/**
		 * 正常逻辑
		 */
		//拼接的字符串
		String concatStr="";
		
		for (int idx = starIndex; idx <=endIndex; idx++) {
			//找到字符
		 	char curChar= str.charAt(idx);
		 	//拼接
		 	concatStr+=curChar;
		}
		return concatStr;
	}
}
