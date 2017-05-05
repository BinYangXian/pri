
public class Test2{
	
	public static void main(String args[]){
		/**
		循环结构的分类
		
			a）while循环
			b）do while循环 
			c）for循环
		
		if 单分支语法
		
		if(布尔条件){
			当布尔条件满足时候，执行的代码-->执行完代码-退出了if结构
		}
		
		while循环的语法
		
		while(布尔条件){
			当布尔条件满足时候，执行的代码-》执行完代码-会继续判断条件，如果再次满足会继续执行代码...
		}
		
		执行的过程
		1）布尔条件满足true-》2)执行while的循环代码
		1）布尔条件满足true-》2)执行while的循环代码
		...
		1）布尔条件满足false
		
		*/
		testWhile3();
	}
	/**
		有限次数的循环-》循环一定次数完成业务-停止了循环
		a）需求【知道循环结束的条件】的循环
		
	*/
		public static void testWhile3(){
			/**
			 1）得到用户键盘输入的偶数并打印--》输入的数字可能不是偶数-重新输入
			 
			 循环执行的过程
			 a）输入数字 
			 
			 b）判断数字是奇数-true
			 
			 a）输入数字 
			 
			 b）判断数字是奇数-true
			 
			 ...
			 a）输入数字 
			 
			 b）判断数字是奇数-false
			 
			 -->得到偶数
			 
			 c)打印偶数
			 
			*/
			
			//管理者
			java.util.Scanner sc=new java.util.Scanner(System.in);
			//a）输入数字 
			System.out.println("请输入一个偶数");
			int num= sc.nextInt();
			
			while(num%2!=0){// b）判断数字是奇数-true
				// a）输入数字 
				System.out.println("请输入一个偶数");
				num= sc.nextInt();
			}
			
			// c)打印偶数
			System.out.println("偶数是："+num);
			
		}
	
	/**
		有限次数的循环-》循环一定次数完成业务-停止了循环
		a）需求【知道循环次数】的循环
		 1)循环变量  0 增加到  循环的次数
		   x）定义循环变量初始为0
		   x）循环条件  -》循环变量<次数
		   x）循环内容里-加改变循环变量-》控制循环的次数
		    循环变量++;
		 
		 2）循环变量 循环的次数  减小到   0
		   ...
		  
	*/
	public static void testWhile2(){
		/**
			需求：
			 1）早餐吃8包子，吃的过程：a）吃包子的皮 b）吃包子的馅 c）喝水
		*/
		//循环变量初始为0 
		int a=0;
		
		while(a<8){
			
			//业务要求循环的内容
			System.out.println("吃的包子编号："+(a+1));
			System.out.println("吃包子的皮");
			System.out.println("吃包子的馅");
			System.out.println("喝水");
			System.out.println();
			//改变循环变量-》控制循环的次数
			//a=a+1;
			//a+=1;
			//a++;
			++a;
		}
	
	}
	/**
		1）一次不执行的循环
		2）一直执行的循环
	*/
	public static void testWhile1(){
		//1）一次不执行的循环 ->循环条件开始就为false
		boolean b=false;
		while(b){
			System.out.println("该代码不会执行！！！");
		}
		System.out.println("------------------------------");
		//2）一直执行的循环（死循环）->循环条件一直为true 
		//死循环-一般在服务器程序中使用
		b=true;
		while(b){
			System.out.println("该代码一直执行！！！");
		}
	}
	
}
