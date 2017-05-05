
public class Test2{
	
	public static void main(String args[]){
		/**
			方法的注意点
			1）方法有参数-必须传入参数-》买东西必须给钱
			2）方法有返回值-可以不接收-》买东西可以不带走
			
			方法返回值的注意点
			1）方法有返回值-那么方法执行代码里所有结束位置都必须返回值
			-》一般是在最后一句加return 
			
			return 值;和return ;对比
			
			return 值;的过程
			a）把return 的值 赋值给	  返回值类型变量rn 
				return 的值类  需要<=	 返回值类型
			b）方法在return语句里后面的代码不执行（结束了方法的执行）
			
			c）把方法的返回值变量rn的值  赋值  给接收变量
				返回值类型  需要<=	 接收变量类型
				
			return ;的过程	
		
			a）方法在return语句里后面的代码不执行（结束了方法的执行）
			
			
			结束结构
			1）continue; 结束循环的当次循环
			2）break;  结束循环结构，结束switch结构
			3）return; 结束方法 
			
				
		*/
		//获取600元的等级
		//byte grade1= getSalGrade(600);
		//System.out.println("600元的等级:"+grade1);
		//获取700元的等级
		long grade2= getSalGrade(700);
		System.out.println("700元的等级:"+grade2);
		
		
		System.out.println("---------------------");
		
		//打印20到50里能被3整除的【第一个】整数
		printNum(20,50);
		
		
	}
	/**
		打印min到max范围所有整数里能被3整除的【第一个】整数
	*/
	public static void printNum(int min,int max){
		for(int num=min;num<=max;num++){//找到所有的整数
			//判断被3整除-打印
			if(num%3==0){
				//打印1次
				System.out.println(num);
				//退出方法
				//break;
				return;
			}
		}
		System.out.println("--循环后的代码--");
	}
	
	
	
	
	//求工资等级方法
	// 500 以下等级1，500到2000等级2，2000以上等级3
	public static int getSalGrade(int sal){
		
		if(sal<500){
			return 1;
		}
		System.out.println("return 1;后面的代码");
		if(sal<2000){
			return (byte)2;
		}
		System.out.println("return 2;后面的代码");
		
		//return (long)3;//long不能转换为int不能使用
		return 3;
		
		//System.out.println("return 3;后面的代码");//不能写该句代码-因为return 3一定执行，结束方法，后面代码没有机会
	}
	
}
