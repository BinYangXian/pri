package day8.extendsTest;

public class Test1 {
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
         
         
		 */
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
class Animal{
	//名字
	String name;
	//呼吸
	public void breath(){
		System.out.println("动物可以呼吸");
		System.out.println("呼出二氧化碳");
		System.out.println("吸入氧气");
	}
}
class Cat{
	//名字
	String name;
	//尾巴长度
	int weibaLen;
	//呼吸
	public void breath(){
		System.out.println("动物可以呼吸");
		System.out.println("呼出二氧化碳");
		System.out.println("吸入氧气");
	}
}
class Person{
	//名字
	String name;
	//呼吸
	public void breath(){
		System.out.println("动物可以呼吸");
		System.out.println("呼出二氧化碳");
		System.out.println("吸入氧气");
	}
	//学习
	public void study(){
		System.out.println("人可以学习");
		System.out.println("活到老学到老");
	}
	
}
class Chinse{
	//名字
	String name;
	//qq号
	int qqNum;
	//呼吸
	public void breath(){
		System.out.println("动物可以呼吸");
		System.out.println("呼出二氧化碳");
		System.out.println("吸入氧气");
	}
	//学习
	public void study(){
		System.out.println("人可以学习");
		System.out.println("活到老学到老");
	}
}
