
public class Test1{
	
	public static void main(String args[]){
		/**
			方法的重载：指多个方法的关系
			语法：
			1）同一个类中
			2）方法名相同
			3）方法的参数列表不同
			    a）参数个数不同
				b）参数类型不同
				c）参数的顺序不同
				--》注意-》与参数名没有关系
				
			方法的重载的使用
			-》如果多个方法做完成的功能类似，那么我们可以方法重载！			
				
		*/
		/**
			两个数求和
		*/
		sum(2,3);
		sum(5,3);
		sum(5,3213);
		/**
			三个数求和-没有重载-学习困难
		*/
		qiuhe(11,22,333);
		qiuhe(11,222,33312);
		/**
			三个数求和-有重载-学习简单
		*/
		sum(11,22,333);
		sum(11,222,33312);
	}
	/**
	    需求2：
		三个数求和-->有使用重载-使用该功能学习成本低-名字一样（功能类似）
	*/
	public static int sum(int num1,int num2 int num3){
		int sum=num1+num2+num3;
		return sum;
	}
	
	/**
	    需求2：
		三个数求和-->没有使用重载-使用该功能学习成本更大
	*/
	public static int qiuhe(int num1,int num2 int num3){
		int sum=num1+num2+num3;
		return sum;
	}
	
	/**
	    需求1：
		两个数求和
	*/
	public static int sum(int num1,int num2 ){
		int sum=num1+num2;
		return sum;
	}
	
	/**
		下面两个方法-方法的重载
	*/
	public static void test1(){}
	public static void test1(int num){}
		/**
		下面两个方法-出现了方法重复定义
	*/
	public static void test2(int a){}
	//public static void test2(int b){}
	
	
}
