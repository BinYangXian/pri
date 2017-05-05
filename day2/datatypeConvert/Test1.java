
public class Test1{
	public static  void main(String agrs[]){
		/**
			为什么需要类型转换？

因为有些类型（基本类型）之间有些内容是通用的！
例如：
1)数字125，byte short char int long 都可以存储。
2)小数类型也可以表示整数。

java编译器：
1)看懂【变量】的类型，不能看懂的值，
2）可以看懂【字面值的类型和值】    

			基本类型转换的规则
			
			a）自动类型转换-编译器自动完成
				
				大类型A  变量= 小类型B的值;
				
			b）手动（强制）类型转换-编译器不会自动完成-需要手动语法指定
				-》不能直接转换
				小类型A  变量= 大类型B的值;
				
				强转语法-把一种类型的值转换为另一种类型的值
				(类型A)类型B的值  -》
				
				-》通过强转语法进行
				小类型A  变量= (类型A)大类型B的值;

		基本类型数字的大小关系
		小到大
		1）byte-》short-》int -》long
		2）char-》int
		3）整数-》小数（只有int转doule是安全的）
			
			注意点
			1）整数转小数-》打印-自动加.0
			2）强制有风险可能数据异常-需要程序员进行控制
			3）小数转整数->直接去掉小数部分
		*/
		//商品价格1
		int price1=88;
		//价格2
		byte price2;
		//价格1存储price2中
		//price2=price1;//编译器只知道price1是int类型-比byte范围大，转换可能有风险-不能转换
		//价格3
		long price3;
		//价格1存储price3中
		price3=price1;//编译器只知道price1是int类型-比long范围小，可以转换
		System.out.println("price3:"+price3);
		//价格4
		double price4=price1;
		System.out.println("price4:"+price4);
		
		//价格1存储price2中
		//price2=price1;//编译器只知道price1是int类型-比byte范围大，转换可能有风险-不能转换
		//我们知道price1存储是88 byte可以存储-进行手动强转
		price2=(byte)price1;
		System.out.println("price2:"+price2);
		
		//价格1-涨价888
		price1=888;
		//价格1存储price2中
		price2=(byte)price1;//把888强制存储在byte-出现越界
		System.out.println("price2:"+price2);
		//价格1-降价130
		price1=130;
		//价格1存储price2中
		price2=(byte)price1;//把130强制存储在byte-出现越界
		System.out.println("price2:"+price2);
		
		
		/**
		编译器
		2）可以看懂【字面值的类型和值】    
		*/
		byte b=99;//把int类型99赋值给byte的b-》《编译器知道字面值99的值可以在byte存储》
		byte b2=130;//把int类型130赋值给byte的b2-》《编译器知道字面值130的值不能在byte存储-不能转换》
	}
}