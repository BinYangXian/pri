package day11.customException;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 自定义异常：自己定义exception的子类
		 * 作用—》更加准确的描述异常问题
		 * 
		 * 语法：
		 * a）类名：异常问题+Exception
		 * b）继承exception，runtimeexception
		 * c）定义两个构造器
		 *   1)空构造器
		 *   2）有参数设置异常消息的构造器
		 * 
		 */
		dome1();
	}
	private static void dome1() {
		//来一个人
		Person p=new Person();
		//设置名字
		p.setName2("张无忌");
		System.out.println("p的名字："+p.getName());
		//设置名字
		p.setName2("justin biber");//没有把justin biber设置成功-抛异常
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
}
/**
 * 自定义异常
 * -》名字参数错误的异常
 */
class NameParamException extends RuntimeException{
	
	public NameParamException() {
	}
	public NameParamException(String msg) {
		super(msg);//使用RuntimeException(String message) 设置消息
	}
	
}
