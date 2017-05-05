package exam;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 1、 使用循环将字符串String str="abcdefg"的每个字符，倒序输出格式为：
		 * "g-f-e-d-c-b-a"的字符串到控制台。
		 */
		String str="abcdefg";
		for (int idx = str.length()-1; idx >=0; idx--) {
			//取出字符
			char curChar= str.charAt(idx);
			//打印字符
			System.out.print(curChar);
			//(除最后一个都打印)打印 -
			if(idx!=0){
				System.out.print('-');
			}
		}
		
		
	}
}
