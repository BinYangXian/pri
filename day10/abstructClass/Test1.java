package day10.abstructClass;

public class Test1 {
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
		 */
		//市场部员工-柳岩上班
		goWork(new MarketStaff("柳岩"));
		//开发部员工-刘德华上班
		goWork(new CoderStaff("刘德华"));
		//开发部员工-周杰伦上班
		goWork(new CoderStaff("周杰伦"));
		
		
	}
	/**
	 * 上班的功能
	 * 参数：st 上班的员工
	 */
	public static void goWork(Staff st){
		System.out.println();
		//赶车上班
		System.out.println(st.name+"赶车去公司");
		//工作-利用多态-调用具体员工的工作
		st.working();
		//赶车回家
		System.out.println(st.name+"赶车回家");
	}
}
/**
超类型：员工-规范所有的员工
统一api：工作 working
*/
class Staff{
	String name;
	
	public Staff(String name) {
		this.name = name;
	}

	//工作
	public void working(){
		System.out.println("员工必须工作，不知道具体怎么工作！");
	}
}
/**
市场部员工
*/
class MarketStaff extends Staff{

	
	public MarketStaff(String name) {
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
class CoderStaff extends Staff{

	
	public CoderStaff(String name) {
		super(name);
	}
	@Override
	public void working() {
		System.out.println("写代码，调试bug1");
		System.out.println("写代码，调试bug2");
	}
}