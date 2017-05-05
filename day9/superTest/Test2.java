package day9.superTest;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 3）super（父类构造器参数）-》调用父类指定的构造器
		        位置：构造器中，第一句代码
		 * 语法：super（父类构造器参数）-》调用的当前类的【直接父类】的构造器
		 * 
		 * 注意点：
		 * 在构造器中如果没有显示编写super（父类构造器参数），那么默认加入super()
		 * ——》调用父类空构造器，有显示编写super（父类构造器参数），不加入super()
		 * 
		 * new对象的过程
		 * 语法： new 子类型(子类型构造器参数);
		 * 
		 * 1）在堆里创建一个对象
		 * 
		 * 2）调用构造器：从对象所在类的继承连上到下依次调用每个类的构造器
		 *   a）父类构造器：默认调用空构造器-》super（父类构造器参数）-》调用父类指定的构造器
		 *   父类构造器调用原因-》为父类的成员变量进行初始化
		 *   b）子类构造器：根据传入的子类型构造器参数选择调用对应的构造器
		 *   子类构造器调用原因-》为子类的自己的成员变量进行初始化
		 *   
		 * 3）把对象的地址返回
		 * 
		 * 
		 */
		//创建一个中国人的对象（初始化qq号）
		Chinse2 c1=new Chinse2(123456);
		
		//创建一个中国人的对象（初始化qq号和名字）
		Chinse2 c2=new Chinse2(123456,"柳岩");
		
		//创建一个猫的对象（初始化长度和名字）
		Cat2 c3=new Cat2("多拉Am",30);
		
		System.out.println("c1的名字："+c1.getName());
		System.out.println("c2的名字："+c2.getName());
		System.out.println("c3的名字："+c3.getName());
				
	}
}
/***/
class Animal2{
	//名字
	private String name;
	//构造器-初始化-名字-2到5个长度
	public Animal2(String name) {
		int len=name.length();
		if(len>5||len<2){
			System.out.println("名字长度错误，不能设置");
			return;
		}
		//设置名字
		this.name = name;
		System.out.println("Animal2(String name)");
	}
	//构造器-空构造器
	public Animal2() {
		
	}
	//获取名字
	public String getName() {
		return name;
	}
	
}
class Cat2 extends Animal2{
	//尾巴的长度
	int weibaLen;
	//初始化名字和长度的构造器
	public Cat2(String name, int weibaLen) {
		super(name);
		this.weibaLen = weibaLen;
	}
	//初始化名字构造器
	public Cat2(String name) {
		super(name);
	}
}
class Person2  extends Animal2{
	
	//空构造器
	public Person2() {
	}
	
	//初始化名字的构造器
	public Person2(String name) {
		//使用animal的初始化名字的构造器
		super(name);
		System.out.println("Person2(String name) ");
	}
	
}
class Chinse2  extends Person2{
	//手机号
	long qqNum;

	//构造器-初始化qq号
	public Chinse2(long qqNum) {
		super();
		this.qqNum = qqNum;
	}
	//构造器-初始化qq号和名字
	public Chinse2(long qqNum,String name) {
		//使用person的初始化名字的构造器
		super(name);
		this.qqNum = qqNum;
		System.out.println("Chinse2(long qqNum,String name)");
		
	}
}

