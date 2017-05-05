
public class Test1{
	
	public static void main(String args[]){
		/**
			需求：
			打印10次 美女你好。
		*/
		dome1();
		System.out.println("--------------------------------");
		dome2();
	}
	/*
		有循环结构-解决
		
		好处：
		1）重复的循环代码只需要写1次
		2）代码维护更方便
	*/
	public static void dome2(){
		
		int printCount=10;
		while(printCount>0){
			System.out.println("美女你好");
			printCount--;
		}
	}
	
	/*
		没有循环结构-解决
	*/
	public static void dome1(){
		
		System.out.println("美女你好");
		System.out.println("美女你好");
		System.out.println("美女你好");
		System.out.println("美女你好");
		System.out.println("美女你好");
		System.out.println("美女你好");
		System.out.println("美女你好");
		System.out.println("美女你好");
		System.out.println("美女你好");
		System.out.println("美女你好");
	}
	
}
