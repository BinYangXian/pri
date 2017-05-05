
public class Test1{
	
	public static void main(String args[]){
		/**
			分支的嵌套：分支结构里又出现的分支结构
			循环的嵌套：循环结构里又出现的循环结构
			
			注意点：每一次外层循环执行的时候，都需要把内层循环执行一次！！！
			
		*/
		dome2();
	}
	/**
	b）n行m列的数字1
1    1    1    1
1    1    1    1
1    1    1    1
1    1    1    1

	思路:
	1)先循环 n次，每次打印一行
	2）循环内-》循环m次-每次打印一列
	*/
	public static void dome2(){
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//输入n
		System.out.println("请输入高n");
		int n=sc.nextInt();
		//输入m
		System.out.println("请输入高m");
		int m=sc.nextInt();
		//先循环 n次
		for(int i=0;i<n;i++){
			/**
				打印一行内容 
				a）打印m个1
				b）打印换行
			*/
			//a 
			for(int j=0;j<m;j++){
				//打印1一个1
				System.out.print("1\t");
				
			}
			//b 
			System.out.print("\n");
		}
		
	}
	
	
	/**
	a）n行3列的数字1
1    1    1    
1    1    1  
1    1    1    
1    1    1  
	*/
	public static void dome1(){
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//输入
		System.out.println("请输入高n");
		int n=sc.nextInt();
		//循环打印
		for(int i=0;i<n;i++){
			//打印 1	1	1
			System.out.println("1	1	1");
		}
	}
}
