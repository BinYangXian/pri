
public class Test4{
	
	public static void main(String args[]){
	
		printCountChar(3,'A');
		printCountChar(5,'B');
		System.out.println();
		//
		printSanjiao(3,'+');
		printSanjiao(6,'-');
	}	
		/**
		定义如下方法，并在main方法中调试使用方法
2、封装一个方法，打印任意高的直角任意字符三角形  printSanjiao(int n,char ch);-》n为三角形的高，ch为打印的字符
例如：
printSanjiao(3,'+')
-----打印------
+
++
+++
printSanjiao(4,'B')
-----打印------
B
BB
BBB
BBBB
		*/
	public static void printSanjiao(int n,char ch){
		for(int rowNum=1;rowNum<=n;rowNum++){
			//打印rownum次ch
			for(int i=0;i<rowNum;i++){
				System.out.print(ch);
			}
			//打印换行 
			System.out.println();
		}
	}	
		
	/**
	1、封装一个方法，打印任意个任意字符  printCountChar(int n,char ch);
	
	-》n为打印字符的个数，ch为打印的字符
例如：
printCountChar(3,'A')-->打印：AAA
printCountChar(5,'B')-->打印：BBBBB
	*/
	//参数：n为打印字符的个数，ch为打印的字符
	public static void printCountChar(int n,char ch){
		for(int i=1;i<=n;i++){
			System.out.print(ch);
		}
	}
	
	
}
