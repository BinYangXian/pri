package day14.homework;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 2、字符串转换练习
提示：
1)String和StringBuilder的replace都可以进行替换，分析选择合适的api。
2)"15"->15;字符串转对应字面值的整数，Integer类有相关功能，查询相关资料自学。

需求：
1个字符的替换
a)_转换为@
b)@转换为_

2个字符的替换
c)数字后面跟字母转换为该数字个字母（0不用考虑，数字只考虑一位数）
d)如果最后一个是'_'  去掉  

例如：
1）__am3j@t4u6_   转换为：  @@amjjj_tuuuu6  
2）_0j2a3     转换为： @0jaa3
		 */
		StringBuilder sb1=new StringBuilder("__am3j@23b9t4u6_");
		StringBuilder sb2=new StringBuilder("_0j2a3");
		
		stringBuilderConvert(sb1);
		stringBuilderConvert(sb2);
		
		System.out.println("sb1转换后："+sb1);
		System.out.println("sb2转换后："+sb2);
		
	}
	/**
	 * 字符串转换的功能
	 */
	public static void stringBuilderConvert(StringBuilder oldStr){
		//d 检查最后一个字符是_删除
		//最后的下标
		int lastIdx=oldStr.length()-1;
		if(oldStr.charAt(lastIdx)=='_'){
			oldStr.deleteCharAt(lastIdx);
		}
		/**
		 * 
		 * a,b,c的替换操作对应oldstr每一个字符都需要检查替换
		 * -》（遍历）找到所有的字符检查-替换
		 * 
		 * 
		 * __a_m3j@t4u6_
		 */
		for (int idx = 0; idx <=oldStr.length()-1; idx++) {
			//当前字符
			char curChar=oldStr.charAt(idx);
//			a)_转换为@
			if(curChar=='_'){
				oldStr.replace(idx, idx+1, "@");
			}else
//			b)@转换为_
			if(curChar=='@'){
				oldStr.replace(idx, idx+1, "_");
			}else
			/**
			 * c)数字后面跟字母转换为该数字个字母（0不用考虑，数字只考虑一位数）
			 * 
			 */
			//当前的字符是数字
			if(curChar>='1'&&curChar<='9'){
				//判断有下一个字符
				if(idx!=oldStr.length()-1){
					//取出下一个字符
					char nextChar=oldStr.charAt(idx+1);
					//判断下一个字母
					if((nextChar>='a'&&nextChar<='z')||
							(nextChar>='A'&&nextChar<='Z')){
						System.out.print("当前字符:"+curChar);
						System.out.println(" 下一个字符:"+nextChar);
						
						//拼接次数
						int  count=Integer.parseInt(curChar+"");
						//替换后的字符串
						StringBuilder replaceStr=new StringBuilder();
						//循环拼接
						for (int i = 0; i < count; i++) {
							replaceStr.append(nextChar);
						}
						//替换
						oldStr.replace(idx, idx+2, replaceStr.toString());
					}
				}
			}
		}
	}
}
