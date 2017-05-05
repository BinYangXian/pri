package day8.extendsTest;

public class Test3 {
	public static void main(String[] args) {
		/**
		 * 继承的注意点
		 * 1）java类的继承是单继承，只能继承一个类
		 * 2)java的类如果没有显示的extends继承类，那么默认继承Object
		 * -》Object类是所有类的超类型-》也是所有【引用类型】的超类型
		 * 3）继承之后，子类型可以获取到【父类】的资源，并且可以获取到【父类的父类】的资源。
		 * 4）继承之后，父类的私有资源不能直接继承使用，可以间距通过公共的功能使用
		 */
		//来一条鱼
		Fish f=new Fish();
		//可以使用object的功能
		System.out.println("使用obj的toStirng："+f.toString());
		//4 
		Cat3 c=new Cat3();
		//不能直接用私有资源
		//c.name="汤姆猫";
		//可以通过公共的方法来使用
		c.setName("汤姆猫");
		System.out.println(c.getName());
	}
}
class Animal3{
	//私有的名字
	private String name;
	//公共的功能来是name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class Person3 extends  Animal3{}
class Dog3 extends  Animal3{}
//1 
//class SichuanPerosn extends Person3,Animal3{}

//2
class Fish {}

//3 
class Cat3 extends Animal3{
	
}