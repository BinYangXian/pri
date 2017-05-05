package day8.homework;

public class Test3 {
	public static void main(String[] args) {
		/**
		 * 访问修饰符，封装,继承（利用继承设计类）
安卓手机类
数据：屏幕大小，cpu
功能：打电话，发短信，root刷机，google now

苹果手机类
数据：屏幕大小，cpu
功能：打电话，发短信，face time，imessage

iphone 6s类
数据：屏幕大小，cpu
功能：打电话，发短信，face time，imessage，指纹，3d touch

--》要求屏幕大小和cpu不能更改。
		 */
		
		//创建6s 
		Iphone6s i6s=new Iphone6s();
		
	}
}
/**
 * iphone 6s手机
 */
class Iphone6s extends ApplePhone{
//	//构造器-设置大小和cpu
//	public Iphone6s(String cpu,double size) {
//		this.cpu;
//		this.size;
//	}
	
	//指纹
	public void finger(){
		System.out.println("iphone6s可以使用指纹支付和指纹解锁");
	}
}
/**
 * 苹果手机
 */
class ApplePhone extends Phone{
	
	//face time
	public void faceTime(){
		System.out.println("苹果手机可以使用faceTime进行视频通话");
	}
}
/**
 * 安卓手机
 */
class AndroidPhone extends Phone{
	
	//googleNow
	public void googleNow(){
		System.out.println("安卓手机可以使用googleNow语音助手");
	}
}

/**
 * 统一定义
 * 
数据：屏幕大小，cpu
功能：打电话，发短信
-》放入超类型  手机类中 -其他手机继承得到
 * 
 */
class Phone{
	//成员变量
	private double size;
	private String cpu;
	//构造器
	public Phone() {
	}
	public Phone(double size, String cpu) {
		this.size = size;
		this.cpu = cpu;
	}
	//set get
	public double getSize() {
		return size;
	}
	
	public String getCpu() {
		return cpu;
	}
	//打电话
	public void callPhone(){
		System.out.println("手机可以打电话");
	}
	//发短信
	public void sendMsg(){
		System.out.println("手机可以发短信");
	}
	
	
}

