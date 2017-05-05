package day8.extendsAndOveride;

public class Test2 {
	public static void main(String[] args) {
		
		/***
		 * 
		 * 子类型继承了父类不满足自己需求的功能-需要重写
		 * -》有重写
		 * a）便于学习  -》使用的方法名和参数与父类相同
		 * b）屏蔽父类不满足要求的功能-》重写之后，调用的是子类的功能
		 * 
		 */
		//动物
		Animal2 a=new Animal2();
		//动物呼吸
		a.breath();
		
		//北京人
		BeijinPerson2 bp=new BeijinPerson2();
		/**
		 * 使用北京人的呼吸
		 */	
		System.out.println("--------------");
		bp.breath();//a）便于学习
		System.out.println("--------------");
		bp.breath();//b）屏蔽父类不满足要求的功能
		
	}
}
/**
动物：
睡觉（动物睡觉不知道怎么睡觉）
呼吸（呼出二氧化碳，吸入氧气）

中国人：

睡觉（躺在床上睡觉，还要玩会儿手机）
呼吸（呼出二氧化碳，吸入氧气）
学习（学习技能，为了生活奋斗）

北京人
 睡觉（躺在床上睡觉，还要玩会儿手机）
 呼吸（呼出二氧化碳，吸入氧气和雾霾）
学习（拼命学习技能，为了生活奋斗，不然没钱买房娶媳妇）
*/
class Animal2{
	//睡觉（动物睡觉不知道怎么睡觉）
	public void sleep(){
		System.out.println("动物睡觉不知道怎么睡觉");
	}
	//呼吸（呼出二氧化碳，吸入氧气）
	public void breath(){
		System.out.println("呼出二氧化碳，吸入氧气");
	}
	
}
class Chinse2 extends Animal2{
//	睡觉（躺在床上睡觉，还要玩会儿手机）
	//中国人继承到动物睡觉-不满足自己的需求
	//新增功能：重写方法
	public void sleep(){
		System.out.println("躺在床上睡觉，还要玩会儿手机");
	}
//	呼吸（呼出二氧化碳，吸入氧气）
	//中国人继承到动物呼吸-》满足要求-直接使用
//	学习（学习技能，为了生活奋斗）
	//动物没有学习-
	//新增功能：普通方法
	public void study(){
		System.out.println("学习技能，为了生活奋斗");
	}
}
class BeijinPerson2 extends Chinse2{
//	 睡觉（躺在床上睡觉，还要玩会儿手机）
	//北京人继承到中国人的睡觉-》满足要求-直接使用
//	 呼吸（呼出二氧化碳，吸入氧气和雾霾）
	//北京人继承到动物呼吸-不满足自己的需求
	//新增功能：重写方法
	public void breath(){
		System.out.println("呼出二氧化碳，吸入氧气和雾霾");
	}
//	学习（拼命学习技能，为了生活奋斗，不然没钱买房娶媳妇）
	//北京人继承到中国人学习-不满足自己的需求
	//新增功能：重写方法
	public void study(){
		System.out.println("拼命学习技能，为了生活奋斗，不然没钱买房娶媳妇");
	}
}
