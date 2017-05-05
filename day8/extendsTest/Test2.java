package day8.extendsTest;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 什么是继承？

        继承指的是如果一个类A是另一个类B，那么就说A继承了B;
例如：
    a）人是动物，鸟是动物，所以人和鸟都继承了动物
    b）动物是生物，植物也是生物，所以动物和植物都继承了生物。
    c）所以人和鸟间接继承了生物。人和鸟都是生物。（继承链）
继承链：
         人-》动物-》生物
         鸟-》动物-》生物
         
         
         继承的好处：
         -》【子类型】可以直接获取【超类型】的资源【属性】【方法】
         
        继承链： 中国人-》人-》动物-》生物
         
         假设：
         子类型为：中国人
         超类型：人-》动物-》生物
      
               假设：
          超类型：动物
         子类型：中国人-》人
         
         继承的语法：
         实现：人类继承动物类
    class 人类  extends 动物类{}     
         
		 */
		
		//中国人的对象
		Chinse2 c=new Chinse2();
		//使用自己类的-资源
		c.qqNum=12345;
		//使用父类person的-资源
		c.study();
		//使用父类的父类Animal的-资源
		c.breath();
		
	}
}
/**
动物    
    属性：名字
    方法：呼吸（呼出二氧化碳，吸入氧气）
猫    
    属性：名字，尾巴长度
    方法：呼吸（呼出二氧化碳，吸入氧气）
人
    属性：名字
    方法：呼吸（呼出二氧化碳，吸入氧气）、学习
中国人
    属性：名字、qq号
    方法：呼吸（呼出二氧化碳，吸入氧气）、学习
    
    
    -->没有采用继承-各子类型里用到的重复的（数据和功能）多次出现
*/
class Animal2{
	//名字
	String name;
	//呼吸
	public void breath(){
		System.out.println("动物可以呼吸");
		System.out.println("呼出二氧化碳");
		System.out.println("吸入氧气");
	}
}
class Cat2 extends Animal2{
	
	//尾巴长度
	int weibaLen;
	
}
class Person2 extends Animal2{
	
	//学习
	public void study(){
		System.out.println("人可以学习");
		System.out.println("活到老学到老");
	}
	
}
class Chinse2 extends Person2{
	//qq号
	int qqNum;
	
}
