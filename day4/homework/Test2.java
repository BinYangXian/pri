
public class Test2{
	
	public static void main(String args[]){
		
		dome2();
	}
	public static void dome2(){
		/**
2、输出1-1000之间能被5整除的数，且每行输出3个。

		思路分析
		a）找到1-1000里所有的数-》利用for循环-》循环变量 1增加到1000
		b）循环内-判断当前数-被5整除-打印
		c）定义打印数字的次数变量-》每次打印-变量+1，每打印3次（模3==0）换一次行
		*/
		//打印数字的次数
		int printNumCount=0;
		for(int num=1;num<=1000;num++){//a 
			//b 
			if(num%5==0){
				//打印
				System.out.print(num+"\t");
				//打印次数+1 
				printNumCount++;
			}
			//c-当前的数被5整除-且打印次数刚好是3的倍数换行
			if(printNumCount%3==0&&num%5==0){
				System.out.print("\n");
				//System.out.println();
			}
		}
		
		
	}
	
	/**
	
1、逆序输出a---z的全部小写英文字母。提示-字母和整数有对应关系。

	思路分析
	a）得到z-a所有的字母-先得到122到97整数-》（整数可以转换为字母）
	b）得到122到97整数--》利用 for循环 -循环变量从122减少到97
	c）循环内容把整数转换为字母-》打印
	*/
	public static void dome1(){
		
		int maxNum='z';
		int minNum='a';
		for(int charNum=maxNum;charNum>=minNum; charNum--){//得到22到97整数
			//整数转字母 
			char curChar=(char)charNum;
			System.out.print(curChar);
		}
		
	}
	
}
