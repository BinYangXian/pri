package day10.interfaceTest;

public class Test1 {
	/**
	 * 
	 * 接口是一种类型，和抽象类普通类一样,也有包的概念。

1、接口是什么？
生活中，usb（传输数据，充电），指纹（解锁，支付），wifi（传输数据，上网）就是接口！！
简单理解接口：就是描述了一套
抽象功能的集合，就是能完成的事情，但是不做实现！！！

2、抽象类接口对比

抽象类：部分实现+部分抽象
接口：   全部抽象（公共抽象方法、公共静态常量数据）

注意!接口：只是描述成员功能，不描述成员数据。

3、超类型定义为抽象类还是接口？怎么选择？

抽象类:  子类是什么（抽象类），有数据也有功能，有抽象有实现，子类只能继承一个类
接口：子类能做什么,有什么功能（接口），只有抽象功能，子类可以实现多个接口

	 * 
	 * 
	 */
	public static void main(String[] args) {
		/**
		 *  定义接口的语法：
		 * interface  接口名{
		 *    //0到多个公共的抽象的方法
		 *    //0到多个公共的静态的常量
		 * }
		 
		      公共的抽象的方法的语法：
			 public abstract  返回值类型   方法名(参数列表);
			 
			 注意点：public abstract 可以省略，省略之后自动加入
			
		      公共的静态的常量的语法：
			 public static final 数据类型    常量名;
			注意点：public static final 可以省略，省略之后自动加入
			
			
		 java各类型结构的关系
		 a）类和类：类可以单继承类  -》子类可以直接得到父类及其链上所有类型的资源
		 语法：
		 class 子类   extends 父类{}
		 
		 b）类和接口：类可以多实现接口-》子类可以直接得到父接口及其链上所有类型的资源
		语法：
		 class 子类   [extends 父类] implements 父接口1,父接口2... {} 
		 
		 c）接口和接口：接口可以多继承接口-》子接口可以直接得到父接口及其链上所有类型的资源
			
		语法：
		 interface 子接口   extends 父接口1,父接口2...{}	
			
		 */
	}
}
/**
 * 苹果手机类
    数据：名字，屏幕大小--》手机就拥有该数据
   功能1：手机就拥有该功能
    打电话
    发短信
   功能2：usb拥有该功能
    传数据
    充电
  功能3：指纹模块拥有该功能
    指纹解锁
    指纹支付
小米手机类
    数据：名字，屏幕大小--》手机就拥有该数据
    功能1：手机就拥有该功能
    打电话
    发短信
   功能2：usb拥有该功能
    传数据
    充电
波导手机类
    数据：名字，屏幕大小--》手机就拥有该数据
    功能1：手机就拥有该功能
    打电话
    发短信
   功能2：充电线拥有该功能
    充电
 * */


/**
 * 超类型-Chargeable-》接口
 *规范所有有充电线接口的设备
 *功能：充电
 */
interface Chargeable{
	//充电
	void charge();
}


/**
 * 超类型-usb-》接口
 *规范所有usb的设备
 *功能：传数据，充电
 */
interface Usb extends Chargeable{
	//传数据
	public abstract void transfferData();
	
}


/**
 * 超类型-手机-》抽象类
 *规范所有的手机的
 *数据：名字，屏幕大小
 *功能：打电话，发短信
 */
abstract class Phone{
	//数据
	String name;
	double size;
	//功能
	//具体的功能
	public void sendMsg(){
		System.out.println("手机可以发短信！");
	}
	//抽象的功能
	public abstract void callPhone();
}

/**
 * 苹果手机
 *
 */
class ApplePhone extends Phone implements Usb{
	
	@Override
	public void callPhone() {
		System.out.println("苹果手机可以打电话，触控打电话，很流畅1");
		System.out.println("苹果手机可以打电话，触控打电话，很流畅2");
	}

	@Override
	public void transfferData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void charge() {
		System.out.println("苹果手机可以充电");
	}
}
/**
 * 小米手机
 *
 */
class MiPhone extends Phone  implements Usb{

	@Override
	public void callPhone() {
		System.out.println("小米手机可以打电话，触控打电话，很卡1");
		System.out.println("小米手机可以打电话，触控打电话，很卡2");
	}

	@Override
	public void transfferData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void charge() {

		System.out.println("小米手机可以充电");
	}
	
}
/**
 * 波导手机
 *
 */
class BodaoPhone extends Phone implements Chargeable{

	@Override
	public void callPhone() {
		System.out.println("波导手机可以打电话，按键打电话，流畅1");
		System.out.println("波导手机可以打电话，按键打电话，流畅2");
	}
	//可选重写-发短信

	@Override
	public void sendMsg() {
		System.out.println("波导手机可以发短信，可以收到短信发送状态1");
		System.out.println("波导手机可以发短信，可以收到短信发送状态2");
	}

	@Override
	public void charge() {

		System.out.println("波导手机可以充电");
	}
	
}