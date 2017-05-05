package day17.zuhe;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 
		 * 继承与组合对比-都可以（代码重用）-扩展某个类的功能。
		 * 
A类想使用B类的功能
   继承：调用重用代码方便，直接使用，但是只能（单继承）
语法：A继承B
class A extends B{}

 组合：调用重用代码需要先调用组合的类，再调用重用代码，可以（多组合）
   组合语法：一个类A把另一个类B作为属性(成员变量)，就是组合。
class A {
	//成员变量
	B  b;
}

怎么选择？
   是什么的关系——》       继承
   有什么的关系——》       组合
尽量多组合少继承---》java单继承类，可以多组合类

组合：
a）人类：想要动物的功能，怎么办？
    1）继承
b）人类：想要手的功能，怎么办？
    1）组合
c）人类：想要有车子的功能。
    1）继承：汽车人，直接使用汽车功能
    2）组合：把汽车作为成员变量，通过成员变量使用汽车功能。
		 * 
		 */
		
		//来一个人
		Person per=new Person();
		//使用继承的animla的功能
		per.sleep();
		//使用组合的左手的功能
		per.leftHand.fight();
		//使用组合的右手的功能
		per.rightHand.fight();
				
		
		
	}
}
//动物
class Animal{
	//睡觉
	public void sleep(){
		System.out.println("动物可以睡觉1");
		System.out.println("动物可以睡觉2");
		System.out.println("动物可以睡觉3");
	}
}
//手
class Hand{
	//类型(左手，左手)
	String type;
	
	public Hand(String type) {
		this.type = type;
	}
	//战斗
	public void fight(){
		System.out.println(this.type+"可以打架1");
		System.out.println(this.type+"可以打架2");
		System.out.println(this.type+"可以打架3");
	}
}

/**
 * 人类
 * 有动物的功能--》人 【是】动物-》采用继承
 * 有手的功能--》人 【有】手-》采用组合
 *
 */
class Person extends Animal{
	//左手
	Hand leftHand=new Hand("左手");
	//右手
	Hand rightHand=new Hand("右手");
}




