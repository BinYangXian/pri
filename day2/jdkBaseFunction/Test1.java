
public class Test1{
	public static  void main(String agrs[]){
		/**
			java内置的功能
			1）打印功能
			System.out.println(打印的内容)   打印内容，然后打印换行
			System.out.print(打印的内容)   打印内容不换行
			
			2）产生随机小数
			Math.random()   每次执行都产生一个[0,1)的随机double值
		
		
			注意点
			1）在运算的过程中，小类型会自动转换为大类型再进行运算，结果以大类型为主
			2)运算符中=是优先级最低的
			3）运算符可以通过()提高优先级
		
		*/
		//产生[0,1)的随机小数
		double rn1= Math.random();
		double rn2= Math.random();
		System.out.println("rn1:"+rn1);
		System.out.println("rn2:"+rn2);
		
		//产生[0,10)的随机小数
		double rn3= Math.random()*10;
		System.out.println("rn3:"+rn3);
		
		//产生[0,10]的随机整数
		int rn4= (int)(Math.random()*11);
		System.out.println("rn4:"+rn4);
		
		//产生[5,15]的随机整数
		int rn5= (int)(Math.random()*11)+5;
		System.out.println("rn5:"+rn5);
		//产生[5,10]的随机整数
		int rn6= (int)(Math.random()*6)+5;
		System.out.println("rn6:"+rn6);
		/**
			产生【min到max】之间的随机整数的公式
			int rnNum= (int)(Math.random()*(max-min+1))+min;
		*/
		//产生[-2,3]的随机整数
		int rnNum =(int)(Math.random()*(3+2+1))-2;
		
		System.out.println("rnNum:"+rn6);
	}
}