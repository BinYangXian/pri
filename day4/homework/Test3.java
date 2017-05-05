
public class Test3{
	
	public static void main(String args[]){
		/**
			----------利用，方法分解，重复利用代码

1. 打印用户输入的高和字符的如下三角形
如：输入3 ，B

B
BB
BBB

如：输入5 ，C
C
CC
CCC
CCCC
CCCCC

打印三角形的思路
	1）循环 n次，打印所有的行
	2）循环里-打印行内容-》循环行号次打印【字符】，再换行
	
		*/
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//输入-高
		System.out.println("请输入三角形的高");
		int n=sc.nextInt();
		//输入-组成的字符
		System.out.println("请输入三角形的组成的字符");
		String ch=sc.next();
		
		//打印三角形
		//循环n次
		for(int curRow=1;true;curRow++){
			//打印一行内容：a）打印行号curRow个【字符】b）再打印换行
			//a 
			for(int i=0;i<curRow;i++){
				System.out.print(ch);
			}
			//b
			System.out.print("\n");
			
			//循环n次后-结束 
			if(curRow==n){
				break;
			}
			
		}
		
		
		
		
	}
	
}
