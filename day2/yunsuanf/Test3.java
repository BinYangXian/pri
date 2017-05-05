
public class Test3{
	public static  void main(String agrs[]){
		/**
			自增自减运算符
			--  ++
			作用：简化了变量+1或-1的操作
			
			
			
			自增自减运算符做的事情
			1）取出当前变量的值
			2）让变量自身+1或-1
			
			语法：
			a)变量++或-- ：先 1）后 2）
			b)++或--变量 ：先 2）后 1）
			
		*/
		
		//小明年龄10岁
		int age=10;
		System.out.println("age："+age);
		//过了一年后的年龄
		//算数运算符实现
		age= age+1;
		System.out.println("age："+age);
		//过了一年后的年龄
		//扩展运算符实现
		age+=1;
		System.out.println("age："+age);
		//过了一年后的年龄
		//自增运算符实现
		age++;
		System.out.println("age："+age);
		
		//数字num为10
		int num=10;
		//数字num2
		int num2;
		//把数字num的值赋值给num2，并且再让num自己增加1
		/**
		方式1
		*/
		num2=num;
		num=num+1;
		System.out.println("num:"+num);
		System.out.println("num2:"+num2);
		
		//还原num的值为10
		num=10;
		/**
		方式2
		*/
		num2=num++;
		System.out.println("num:"+num);
		System.out.println("num2:"+num2);
		
	}
}