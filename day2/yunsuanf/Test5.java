
public class Test5{
	public static  void main(String agrs[]){
		/**
			关系运算符：判断一个条件是否满足要求
		   
		    多个条件一起判断-》逻辑运算符
			
			逻辑运算符
			1）逻辑与&&（并且-两个条件必须都满足）
			语法：
			 布尔条件1  && 布尔条件2
			结果值：两个条件都满足（true），结果为true-》否则false、
			
			2）逻辑或||（或者-两个条件满足一个就ok）
			语法：
			 布尔条件1  || 布尔条件2
			结果值：两个条件满足一个（true），结果为true-》否则false、
			
			3）逻辑非
		*/
		
		/**
			判断一个人是否【高富】-》高并且富
			高-》身高>180
			富-》钱>10001111
		*/
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//输入身高
		System.out.println("请输入身高");
	 	Short height=  sc.nextShort();
		//输入钱
		System.out.println("请输入拥有的钱");
	 	long money=  sc.nextLong();
		//是否高
		boolean isHigh= height>180;
		//是否富
		boolean isHaveMoney= money>10001111;
		
		//是否高并且富
		boolean isHeightAndMoney= isHigh&&isHaveMoney;
		
		System.out.println("是否高："+isHigh);
		System.out.println("是否富："+isHaveMoney);
		System.out.println("是否高并且富："+isHeightAndMoney);
		
		System.out.println("-------------------------");
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&false);
		System.out.println(false&&true);
		System.out.println("-------------------------");
		
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||false);
		System.out.println(false||true);
		
	}
}