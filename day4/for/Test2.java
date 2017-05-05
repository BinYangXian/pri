
public class Test2{
	
	public static void main(String args[]){
		/**
			循环的4大结构-》有限次数的循环-必须4个结构都拥有
			1）循环变量初始化
			2）循环条件
			3）循环的业务内容
			4）步进语句--》改变循环变量的代码
		
		
			for循环结构
			语法：
			for( 表达式1;表达式2 ;表达式3 ){
				//循环内容
			}
			while和for对比
			1）执行的顺序是完全一致 
			2）for为循环的四大结构提供了单独位置-》while只提供了（循环条件，循环内容）
			
			
			for为循环的四大结构
			for( 1）循环变量初始化;2）循环条件 ;4）步进语句--》改变循环变量的代码 ){
				//3）循环的业务内容
			}
			
			while只提供了（循环条件，循环内容）
			
			//1）循环变量初始化
			while(){//2）循环条件
				//3)循环的业务内容
				//4）步进语句-改变循环变量
			}
			
			(for和while)执行的顺序是完全一致 
			1）循环变量初始化
			2）循环条件-true
			3)循环的业务内容
			4）步进语句-改变循环变量
			
			2）循环条件-true
			3)循环的业务内容
			4）步进语句-改变循环变量
			...
			2）循环条件-false
			
			注意点
			1）while定义的循环变量-作用域比较大-在while结构外也可以访问
			2）for 定义的循环变量-作用域只在for的{}里
			
			怎么选择
			1）4个结构都需要单独的位置-》for
				a）for的循环变量作用域更小
				b）for有单独的步进语句的位置
			2）只需要-循环条件，循环业务内容-》while
			
		*/
		dome3();
	}
	public static void dome3(){
		/**
			for的注意点
			1）表达式1，2，3，（不一定写4大结构）可以写任何内容
			2）表达式2写语句-必须产生布尔值-》不写默认为true
		*/
		for(System.out.println("for表达式1");;System.out.println("for表达式3")){
			System.out.println("for循环的内容");
		}
		
		//for的死循环
		//for(;;){}
		//for的死循环
		//for(;;);
		
	}
	
	public static void dome2(){
		/**
		 死循环-跳舞
		*/
		boolean b=true;
		
		/**
			while 实现 
		*/
		while(b){
			System.out.println("while跳舞");
		}
		/**
			for 实现 
		*/
		for(;b;){
			System.out.println("for跳舞");
		}
	}
	
	
	
	
	/**
	吃4个鸡腿
	*/
	public static void dome1(){
		/**
			while解决
		*/
		//1）循环变量初始化
		int a=0;
		while(a<4){//2）循环条件
			//3)循环的业务内容
			System.out.println("买鸡腿");
			System.out.println("炸鸡腿");
			System.out.println("吃鸡腿");
			System.out.println();
			//4）步进语句-改变循环变量
			a++;
		}
		System.out.println("--------------");
		/**
			for解决
		*/
		for(int b=0;b<4;b++){//1）循环变量初始化  2）循环条件 4）步进语句
			//3)循环的业务内容
			System.out.println("买鸡腿");
			System.out.println("炸鸡腿");
			System.out.println("吃鸡腿");
			System.out.println();
		}
		
		//不能定义a
		//int a;
		//可以定义b
		int b;
		
	}
}
