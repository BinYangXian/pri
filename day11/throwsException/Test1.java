package day11.throwsException;


public class Test1 {
	public static void main(String[] args)throws NameParamException2 {
		/**
		 * java程序发生了异常-如果没有处理-交给jvm处理
		 * 
		 * -》jvm处理
        	a） 把错误的信息打印到控制台
        	b）把程序（错误的线程）停止了-后面代码不执行
        	
        	手动处理异常的方式
        	a）throws： 方法发生异常（问题），方法自己内部不处理，报告给上级（方法上级）处理
        		-》如果上级也没有处理-继续报告上级-如果所有上级不处理-那么报告给jvm处理
        	
        	b）try catch finally：方法发生异常（问题），方法自己内部处理，不报告给上级        	
		 * 
		 * exception和runtimeexcepiton的对比
		 * a）exception：程序运行的问题，该问题可以处理。
		 * b）runtimeexcepiton：程序运行的问题，该问题可以处理。该类异常通常是程序员经验不足（语法错误...）
		 * 造成的，发生几率高，所以方法自动添加了throws语句。
		 * 
		 * throws处理的语法
		 * 	访问修饰符  [static] 返回值类型   方法名(参数列表)[throws 异常类1,异常类2...]{方法体}
		 * 
		 * 
		 */
		dome1();
	}
	private static void dome1()throws NameParamException2 {
		//来一个人
		Person p=new Person();
		//设置名字
		p.setName3("张无忌");
		System.out.println("p的名字："+p.getName());
		//设置名字
		p.setName3("justin biber");//没有把justin biber设置成功-抛异常
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
	 * 传入了不满足要求的名字-》不进行设置名字-抛出异常-使用的时候就会发生异常-知道了问题
	 * 
	 * 发生的异常NameParamException是runtimeexcption子类-自动throws 
	 */
	public void setName2(String name) {
		int len=name.length();
		if(len>5||len<2){
			//创建异常
			NameParamException re=new  NameParamException("名字-必须2到5个字符，你的名字是："+name);
			//抛出异常
			throw re;
		}
		//设置名字
		this.name = name;
	}
	/**
	 * 设置名字-必须2到5个字符
	 * 
	 * 传入了不满足要求的名字-》不进行设置名字-抛出异常-使用的时候就会发生异常-知道了问题
	 * 
	 * 发生的异常NameParamException2不是runtimeexcption子类-手动throws 
	 * @throws NameParamException2 
	 */
	public void setName3(String name) throws NameParamException2{
		int len=name.length();
		if(len>5||len<2){
			//创建异常
			NameParamException2 re=new  NameParamException2("名字-必须2到5个字符，你的名字是："+name);
			//抛出异常
			throw re;
		}
		//设置名字
		this.name = name;
	}
}
/**
 * 自定义异常-继承了RuntimeException 自动throws
 * -》名字参数错误的异常
 */
class NameParamException extends RuntimeException{
	
	public NameParamException() {
	}
	public NameParamException(String msg) {
		super(msg);//使用RuntimeException(String message) 设置消息
	}
	
}
/**
 * 自定义异常-继承了Exception 手动throws
 * -》名字参数错误的异常
 */
class NameParamException2 extends Exception{
	
	public NameParamException2() {
	}
	public NameParamException2(String msg) {
		super(msg);//使用RuntimeException(String message) 设置消息
	}
	
}