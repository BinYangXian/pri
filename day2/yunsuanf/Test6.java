
public class Test6{
	public static  void main(String agrs[]){
		/**
		    布尔条件1&&或|| 布尔条件2
			
			逻辑与和逻辑或的短路：如果布尔条件1执行完，已经能够产生结果了，那么布尔条件2是否
			执行就不重要，条件2就不执行。
			
			逻辑与短路
			布尔条件1&& 布尔条件2
		    --》当条件1为false会出现短路，此时条件2为true或false对结果没有影响。
			
			逻辑或短路
			布尔条件1||布尔条件2
		    --》当条件1为true会出现短路，此时条件2为true或false对结果没有影响。
		
		*/
		//变量a为10
		int a=10;
		boolean b;
		b=false&&a++>2;//出现了短路-a++没有执行，a为10
		System.out.println("b:"+b);
		System.out.println("a:"+a);
		
		a=10;
		b=a++>10&&a++<2;
		System.out.println("b:"+b);
		System.out.println("a:"+a);
		
		
		/**
			位运算符（了解即可）
			& |  >>   <<  ....
		  特点：
		  1）底层都是转换为二进制数据运算-》效率高
		  2）可读性差
		  
		  &位与-》a）运算的结果和逻辑与一致。b）不会出现短路
		  |位或-》a）运算的结果和逻辑或一致。b）不会出现短路
		  
		*/
		a=10;
		b=a++>10&a++<2;
		System.out.println("b:"+b);
		System.out.println("a:"+a);
		
		/**
			逻辑非!：
			语法：
			!布尔值
			--》取出布尔值相反的值。
		
		*/
	}
}