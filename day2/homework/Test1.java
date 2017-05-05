
public class Test1{
	public static  void main(String agrs[]){
		/**
		1、类型转换
a)定义byte 类型变量 b1值为112，把b1的值赋值给新的long类型变量 n1，把变量n1的值赋值给int类型变量 i1，打印相关变量。
b)定义 int 类型变量i2值为97，把i2的值对应的字符赋值给char变量c2，打印出c2对应的字符值和整数值。
c)定义char类型变量ch1,ch2,ch3，分别存储('Y','e','s')三个字符，把三个字符连接起来打印为Yes。
d)定义小数float变量price存储商品围巾单价为95.85元，小明买了3条，付款的时候进行优惠，自动把总价的小数部分抹掉，打印出：你需求支付xxx元。
		*/
		//a
		byte b1=112;
		long n1=b1;
		//int i1=(int)n1;
		int i1=(short)n1;
		System.out.println("b1:"+b1);
		System.out.println("n1:"+n1);
		System.out.println("i1:"+i1);
		//b
		int i2=97;
		char c2=(char)i2;
		System.out.println("c2字符值："+c2);
		System.out.println("c2整数值："+(byte)c2);
		//c 
		char ch1='Y',ch2='e',ch3='s';
		String concat=""+ch1+ch2+ch3;
		System.out.println("连接的字符串值："+concat);
		//d
		float price=95.85f;
		float sumPrice1= price*3;
		int sumPrice2=(int)sumPrice1;
		System.out.println("总价："+sumPrice2);
	}
}