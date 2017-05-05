package day11.throwsException;


public class Test2 {
	public static void main(String[] args) throws Exception  {
		/**
		 *
		 * throws处理的语法
		 * 	访问修饰符  [static] 返回值类型   方法名(参数列表)[throws 异常类1,异常类2...]{方法体}
		 * 
		 * 注意点
		 * 1）throws可以抛（报告）多个异常类，通过逗号分割
		 * 2)代码中遇到了多个异常类，可以直接抛出他们的父类（超类型）
		 */
		dome1();
	}
	private static void dome1()throws Exception {
		//来一个人
		Person2 p=new Person2();
		//设置名字和年龄
		p.setNameAndAge1("柳岩", 20);
		System.out.println("p的名字："+p.getName());
	}
}
class Person2{
	String name;
	int age;
	public String getName() {
		return name;
	}
	//设置名字(2到5个字符)和年龄（0到120）
	public void setNameAndAge1(String name,int age) throws NameParamException2,AgeParamException{
		//检查名字
		int len=name.length();
		if(len>5||len<2){
			//创建异常
			NameParamException2 re=new  NameParamException2("名字-必须2到5个字符，你的名字是："+name);
			//抛出异常
			throw re;
		}
		//设置名字
		this.name = name;
		
		//检查年龄
		if(age>120||age<0){
			//创建异常
			AgeParamException re=new  AgeParamException("年龄必须（0到120），你的年龄是："+age);
			//抛出异常
			throw re;
		}
		
	}
}
/**
 * 年龄参数异常
 */
class AgeParamException extends Exception{

	public AgeParamException() {
//		super();
	}
	public AgeParamException(String message) {
		super(message);
	}
}

