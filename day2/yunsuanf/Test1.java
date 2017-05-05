
public class Test1{
	public static  void main(String agrs[]){
		/**
		
		运算符
作用:对数据按需求进行计算处理。
例如：买东西总价，平均速度，总分，平均分...

		算数运算符
		+ -  *（乘）  /(除)  %(模-数学的求余数)
		
		
		注意点
		1）运算的时候，小类型和大类型运算，小的自动转换为大运算，结果以大类型为主。
		*/
		
		/**
		+ -  *（乘） -->和数学规则一致
		*/
		System.out.println(2+3);
		System.out.println(2-3);
		System.out.println(2*3);
		
		/**
			/(除)
			
			整数相处-》结果是整数
		*/
		int b;
		b=6/2;
		System.out.println("b="+b);
		b=5/2;
		System.out.println("b="+b);
		
		double c;
		c=5/2;//5/2得到是int的结果2，赋值给c，c存储2.0
		System.out.println("c="+c);
		
		/**
			让运算的时候有小数参与就可以得到小数的结果
		*/
		c=5.0/2;
		System.out.println("c="+c);
		c=5/2.0;
		System.out.println("c="+c);
		c=5/(double)2;
		System.out.println("c="+c);
		c=5f/2;
		System.out.println("c="+c);
		
		/**
			%(模-数学的求余数)
		*/
		int d;
		d=12%3;
		System.out.println("d="+d);
		d=8%3;
		System.out.println("d="+d);
		d=5%3;
		System.out.println("d="+d);
		
		/**
			模运算-》有负数参与的时候
			结果值
			1)先忽略负数-直接取余数
			2）结果值符号-与被除数相同
		*/
		System.out.println("----------------------------------------------");
		d=5%3;
		System.out.println("d="+d);
		d=-5%3;
		System.out.println("d="+d);
		d=5%-3;
		System.out.println("d="+d);
		d=-5%-3;
		System.out.println("d="+d);
	}
}