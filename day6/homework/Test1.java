public class Test1{
	public static void main(String[] args){
		dome2();
	}
	/**
	
	2、编写一个程序，计算并输出下列字符串中的大写英文字母数，小写英文字母数以及非英文字母数。
提示-查看ascii字符集找规律，可利用字符串拼接。

  String s =“aDsL2we*tR9EVbnM5ky&r$T+@C”；
  打印的结果：

你所提供的字符串是：aDsL2we*tR9EVbnM5ky&r$T+@C
以上字符串中：
大写字母分别是：  D   L  R  E  V  M   T  C   共有 8 个
小写字母分别是：  a   s w  w  t  b  n  k y r 共有 8 个
     数字分别是：  2  9  5 共有  3  个
其他字符分别是：  *   &  $  +   @ 共有5个 */
	public static void dome2(){
		/**
			分析
			1）找到字符串中所有的字符-》for循环
			2）判断字符-》字符集数字，字母是连续的-》>=最小的 <=最大的字符
			3）打印出对应格式的字符串-》找到对应的字符存储在对应的变量中，循环结束再打印
		*/
		
		//原始字符串
		String s ="aDsL2we*tR9EVbnM5ky&r$T+@C";
		//拼接各种字符的字符串
		String dxStr="",xxStr="",numStr="",otStr="";
		for(int idx=0;idx<=s.length()-1 ;idx++ ){//1）找到字符串中所有的字符
			//当前字符
			char curChar=s.charAt(idx);
			//char与char、比较会自动转换为整数进行比较
			//2）判断字符
			if(curChar>='0'&&curChar<='9'){//数字
				numStr=	numStr+curChar+"\t";
			}else
			if(curChar>='a'&&curChar<='z'){//小写
				xxStr+=curChar+"\t";
			}else
			if(curChar>='A'&&curChar<='Z'){//大写 
				dxStr+=curChar+"\t";
			}else{//其他
				otStr+=curChar+"\t";
			}
		}
		
		//打印
		System.out.println("字符串是:"+s);
		System.out.println("大写:"+dxStr+" 个数："+dxStr.length()/2);
		System.out.println("小写:"+xxStr+" 个数："+xxStr.length()/2);
		System.out.println("数字:"+numStr+" 个数："+numStr.length()/2);
		System.out.println("其他:"+otStr+" 个数："+otStr.length()/2);
		
		
	}
	
		/**
1,把字符串"abcd非法1234非法" 
中“非法”字符转换为"xxx"并倒序输出所有字符，
用循环加字符串方法处理。
		*/
	public static void dome1(){
		String str="abcd非法1234非法";
		//替换-非法
		str=str.replaceAll("非法","xxx");
		//倒序输出
		//倒序找到所有字符的下标（位置，标号，索引）
		for(int idx=str.length()-1;idx>=0;idx--){
			//取出字符
			char curChar= str.charAt(idx);
			//打印
			System.out.print(curChar);
		}
	}
}