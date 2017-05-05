
public class Test1{
	
	public static void main(String args[]){
		/**
			变量分类
			1)局部变量-》目前学习的
			2）成员变量
			3）静态变量
		
		局部变量的作用域：局部变量能使用的区域（范围）。
		开始位置：变量定义之后开始
		结束位置：在包裹变量的{}的}之前结束
		
		注意点：
		1）变量的重复定义-》如果两个变量作用域有相同的位置-那么就会出现变量重复定义
		2）变量定义的时候-尽量把作用域设置小-防止作用域冲突。
		*/
		eatChichk();
		//System.out.println("吃的人3："+name);
	}
	
	//吃鸡腿
	public static void eatChichk(){
		//System.out.println("吃的人1："+name);//不能使用name-没有定义
		//吃的人名字
		String name="柳岩";
		System.out.println("吃的人2："+name);
		//吃的人名字
		System.out.println("吃的人4："+name);
		{
			
			
			//吃的人名字2
			String name2="刘德华";
			System.out.println("吃的人名字2："+name2);
			
			//String name="张无忌";//与柳岩冲突
		}
		//
		String name2="周星驰";
		
		
		
		System.out.println("吃的人名字2："+name2);
	}
	//吃牛肉
	public static void eatBeef(){
		//吃的人名字
		String name="刘壮实";
		
		
	}
	
}
