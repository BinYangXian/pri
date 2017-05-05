package day10.homework;

public class Test2 {
	public static void main(String[] args) {
		
	}
}
/**
 * 规范所有的员工-定义staff
 */
abstract class Staff{
	//通用的数据
	String name;
	String adrr;
	//通用的功能
	//具体的功能-知道名字-知道实现细节
	//吃饭
	public void eat(){
		System.out.println("食堂吃饭，给钱，打饭，吃饭，擦嘴巴1");
		System.out.println("食堂吃饭，给钱，打饭，吃饭，擦嘴巴2");
	}
	//赶车
	public void takeBus(){
		System.out.println("搭公交，上车，站着玩手机，下车1");
		System.out.println("搭公交，上车，站着玩手机，下车2");
	}
	
	//抽象的功能-知道名字-不知道实现细节
	//工作
	public abstract void working();
	//上班
	public void goWork() {
//		  1、赶车
		  this.takeBus();
//        2、工作
		  /**
		   * this可以直接使用working功能
		   * -》因为this指向的对象，是staff子类型的对象，而子类型
		   * 肯定实现了working功能！
		   * 
		   */
		  this.working();
//        3、吃饭
		  this.eat();
//        4、工作
		  this.working();
//        5、赶车
		  this.takeBus();
	}
}
/**
 * 开发员工
 */
class CorderStaff extends Staff{

	@Override
	public void working() {
		System.out.println("写代码1调bug1");
		System.out.println("写代码2调bug2");
	}

	
}

/**
 * 市场部员工
 */
class MarketStaff extends Staff{

	@Override
	public void working() {
		System.out.println("陪聊天，喝酒，吃饭1");
		System.out.println("陪聊天，喝酒，吃饭2");
	}

	
}


