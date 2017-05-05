
public class Test1{
	
	public static void main(String args[]){
		/**
			方法的注意点
			1）方法有参数-必须传入参数-》买东西必须给钱
			2）方法有返回值-可以不接收-》买东西可以不带走
			
			方法返回值的注意点
			1）方法有返回值-那么方法执行代码里所有结束位置都必须返回值
			-》一般是在最后一句加return 
			
		*/
		
	}
	public static void dome2(){
		
		
	}
	/**
		求指定【工资】的【工资级别】并返回
		0-2000  -》屌丝
		
		2001-5000-》蓝领
		5001-10000-》白领
		10000>富二代
		
		最后一句返回值
	*/
	public static String getSalGrade2(int sal){
		
		//工资级别的变量
		String grade;
		
		if(sal>=0&&sal<=2000){//屌丝
			grade= "屌丝";
		}else if(sal>=2001&&sal<=5000){//蓝领
			grade= "蓝领";
		}else if(sal>=5001&&sal<=10000){//白领
			grade= "白领";
		}else if(sal>10000){//富二代
			grade= "富二代";
		}
		//赋值穷光蛋
		grade="穷光蛋";
		
		//-返回级别
		return grade;
	}
	/**
		求指定【工资】的【工资级别】并返回
		0-2000  -》屌丝
		
		2001-5000-》蓝领
		5001-10000-》白领
		10000>富二代
		
		所有结束的位置-都返回值
	*/
	public static String getSalGrade(int sal){
		
		if(sal>=0&&sal<=2000){//屌丝
			return "屌丝";
		}else if(sal>=2001&&sal<=5000){//蓝领
			return "蓝领";
		}else if(sal>=5001&&sal<=10000){//白领
			return "白领";
		}else if(sal>10000){//富二代
			return "富二代";
		}
		//-穷光蛋
		return "穷光蛋";
	}
	
	
	public static void dome1(){
		/**
		方法的注意点
		*/
		//sum1();//必须传入参数
		int rs1= sum1(2,3);//接收返回值
		sum1(4,3);//不接收返回值
	}
	
	//求和
	public static int sum1(int num1,int num2){
		int sum1=num1+num2;
		return sum1;
	}
}
