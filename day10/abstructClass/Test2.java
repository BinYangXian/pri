package day10.abstructClass;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 设计类
市场部员工（具体类）
    工作（具体的）：陪客户玩，陪喝酒，聊天，跑业务
    
开发部员工（具体类）
    工作（具体的）：    写代码，调试bug

需求
1）市场部员工-柳岩上班
    a）赶车去公司
    b）陪客户玩，陪喝酒，聊天，跑业务
    c）赶车回家
2）开发部员工-刘德华上班
    a）赶车去公司
    b）写代码，调试bug
    c）赶车回家
3）开发部员工-周杰伦上班
    a）赶车去公司
    b）写代码，调试bug
    c）赶车回家
//		 */
//		//市场部员工-柳岩上班
		new MarketStaff2("柳岩").goWork();
		
//		//开发部员工-刘德华上班
		//来一个开发部员工-刘德华
		Staff2 s2=  new  CoderStaff2("刘德华");
		//刘德华上班
		s2.goWork();
//		//开发部员工-周杰伦上班
		//来一个开发部员工-周杰伦
		Staff2 s3=  new  CoderStaff2("周杰伦");
		//周杰伦上班
		s3.goWork();
		
		
		/**
		 * staff2类是用来规范具体员工的-不应该创建对象-》普通类不能实现
		 */
		Staff2 s4=new Staff2("王宝强");
		s4.goWork();
		
		/**
		 * boss类没有实现 工作功能，编译器没有检查
		 */
		Boss s5=new Boss("周星驰");
		s5.goWork();
	}
	
}
/**
超类型：员工-规范所有的员工
统一api：工作 working

超类型是普通类定义的
a）超类型的对象可以创建-》业务不需要-》可能出现错误代码
b）超类型里的不知道怎么实现的功能-》，父类不应该有实现的代码，
，子类必须重写该方法，普通的方法不能实现
*/
class Staff2{
	String name;
	
	public Staff2(String name) {
		this.name = name;
	}

	/**
	 * 工作
	 * -》工作的功能员工不知道怎么实现-》只知道员工有该功能，父类不应该有实现的代码，
	 * 子类必须重写该方法
	 */
	public void working(){
		System.out.println("员工必须工作，不知道具体怎么工作！");
	}
	/**
	 * 上班的功能-》上班的功能员工知道怎么实现-》有实现步骤
	 * 
	 * this(当前对象)： 上班的员工
	 */
	public  void goWork(){
		System.out.println();
		//赶车上班
		System.out.println(this.name+"赶车去公司");
		//工作-利用多态-调用具体员工的工作
		this.working();
		//赶车回家
		System.out.println(this.name+"赶车回家");
	}
}
/**
市场部员工
*/
class MarketStaff2 extends Staff2{

	
	public MarketStaff2(String name) {
		super(name);
	}

	@Override
	public void working() {
		System.out.println("陪客户玩，陪喝酒，聊天，跑业务1");
		System.out.println("陪客户玩，陪喝酒，聊天，跑业务2");
	}
}
/**
开发部员工
*/
class CoderStaff2 extends Staff2{

	
	public CoderStaff2(String name) {
		super(name);
	}
	@Override
	public void working() {
		System.out.println("写代码，调试bug1");
		System.out.println("写代码，调试bug2");
	}
}

/**
老板
*/
class Boss extends Staff2{
	public Boss(String name) {
		super(name);
	}
	/**
	 * 没有提供工作功能，编译器没有强制重写
	 */
}