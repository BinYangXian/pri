
public class Test1{
	
	public static void main(String args[]){
		/**
		1. 打印50-n之间所有的能被3整除的偶数，n由用户输入(n的范围102到  
1000)。

思路分析：
a)输入n在102到1000的数字-》利用循环
b)找出50到n的所有数字-》利用循环
c)判断数字是否是偶数且被3整除-》分支语句

		*/
		app();
	}
	public static void app(){
		//a 
		int n= inputRangeInt(102,1000);
		System.out.println("输入的n："+n);
		for(int num=50;num<=n;num++){//b 
			//c 
			if(num%2==0&&num%3==0){
				System.out.println(num);
			}
		}
		
	}
	
	/**
		得到用户输入的min到max范围的整数
	*/
	public static int inputRangeInt(int min,int max){
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//输入的整数
		int inNum;
		//循环的输入
		while(true){
			//输入整数 
			System.out.println("请输入一个"+min+"到"+max+"的整数");
			inNum= sc.nextInt();
			//判断整数正确-退出循环
			if(inNum>=min&&inNum<=max){
				break;
			}
		}
		//返回正确的整数
		return inNum;
	}
	
}
