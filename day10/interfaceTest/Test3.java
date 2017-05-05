package day10.interfaceTest;

public class Test3 {
	public static void main(String[] args) {
		/**
		 * 需求(面向超类型编程)： 
1）定义方法，实现让所有支持指纹功能的手机进行指纹支付
    过程：a）打开手机app b）指纹支付 c）退出app

2）定义方法，实现让所有支持充电的手机进行充电
    过程：a）连接手机充电线 b）充电 c）充电完成断开充电线

3）定义方法，实现让所有支持（充电和传数据）的手机进行,先充电,再传数据。
   过程：a）连接手机充电线 b）充电 c）传数据 d）断开充电线
		 */
		//苹果充电
		useCharge(new ApplePhone());
		//小米充电
		useCharge(new MiPhone());
		//波导充电
		useCharge(new BodaoPhone());
		
	}
	/**
	 * 2）定义方法，实现让所有支持充电的手机进行充电
    过程：a）连接手机充电线 b）充电 c）充电完成断开充电线
    参数：ph   充电设备  
	 */
	public static void useCharge(Chargeable  ph){
		System.out.println();
		System.out.println("连接手机充电线 ");
		//充电设备-充电
		ph.charge();
		System.out.println("充电完成断开充电线");
	}
}
