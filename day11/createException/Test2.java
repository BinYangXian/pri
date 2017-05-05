package day11.createException;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * c）手动throw产生-自己制造了一个问题
        	 语法：
        	 throw 异常对象;
        	 
        	 作用--》如果我们的业务代码执行的过程中，不满足业务要求的时候，我们可以手动throw丢出异常（问题）。
		 */
		dome2();
	}
	private static void dome2() {
		//来一个人
		Person p=new Person();
		/**
		 * 没有抛出异常
		 */
		//设置名字
		p.setName1("张无忌");
		System.out.println("1p的名字："+p.getName());
		//设置名字
		p.setName1("justin biber");//没有把justin biber设置成功-使用者不知道
		System.out.println("2p的名字："+p.getName());
		/**
		 * 有抛出异常
		 */
		//设置名字
		p.setName2("志玲姐姐");
		System.out.println("3p的名字："+p.getName());
		//设置名字
		p.setName2("justin biber");//没有把justin biber设置成功-使用得到异常
		System.out.println("4p的名字："+p.getName());
	}
	private static void dome1() {
		//来一个人
		Person p=new Person();
		//设置名字
		p.setName1("张无忌");
		System.out.println("p的名字："+p.getName());
		//设置名字
		p.setName1("justin biber");//没有把justin biber设置成功-使用者不知道
		System.out.println("p的名字："+p.getName());
	}
}
class Person{
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	/**
	 * 设置名字-必须2到5个字符
	 * 
	 * 传入了不满足要求的名字-》不进行设置名字-没有抛出异常-》使用者不知道时候设置成功
	 */
	public void setName1(String name) {
		int len=name.length();
		if(len>5||len<2){
			//结束方法不设置名字
			return ;
		}
		//设置名字
		this.name = name;
	}
	/**
	 * 设置名字-必须2到5个字符
	 * 
	 * 传入了不满足要求的名字-》不进行设置名字-抛出异常-使用的时候就会发生异常-知道了问题
	 */
	public void setName2(String name) {
		int len=name.length();
		if(len>5||len<2){
			//创建异常
			 RuntimeException re=new  RuntimeException("名字-必须2到5个字符，你的名字是："+name);
			//抛出异常
			throw re;
		}
		//设置名字
		this.name = name;
	}
	
	
}