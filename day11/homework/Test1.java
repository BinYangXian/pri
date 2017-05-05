package day11.homework;

public class Test1 {
	/**
	 * 1、类设计（抽象类，接口，普通类）
需求1：
旋转门: 
    功能：旋转、开、关，
    数据：大小，颜色
防火门:
    功能：防火、开、关，
    数据：大小，颜色

玻璃窗：
    功能：挡雨，看窗外，开、关、
    数据：材料类型
沙窗：
    功能：看窗外，开、关、
    数据：材料类型
防弹玻璃窗：
    功能：挡子弹，挡雨，看窗外，开、关、
    数据：材料类型

需求2：
易拉罐：
    功能：开，装饮料
	 */
}
/**
 * 玻璃窗：
 * 继承 窗户 
 * 新增挡雨功能
 * 实现：开，关，看窗外功能
 * */
/**
 * 沙窗：
 * 继承 窗户 
 * 实现：开，关，看窗外功能
 * */
/**
 * 防弹玻璃窗：
 * 继承玻璃窗
 * 新增防弹功能
 * */

/**
 * 易拉罐：
 * 实现可以打开的接口
 * 新增装饮料功能
 * */

/***
 * 超类型-可以打开的
 */
interface Openable{
	public abstract void open();
}
/***
 * 超类型-可以关闭的
 */
interface Closeable{
	 void close();;
}


/**
 * 超类型-开关-规范了所有窗户和门具有的通用的信息
 * 功能：开、关
 */
interface Switch extends Openable,Closeable{
	//开、关
}

/**
 * 超类型-窗户-规范了所有窗户具有的通用的信息
 * 数据：材料类型
 * 功能：看窗外，开、关
 */
abstract class Window implements Switch{
	//材料类型
	String type;
	//看窗外，开、关
	public abstract void lookWindowOuter();
}

/**
 * 超类型-门-规范了所有门具有的通用的信息
 * 数据：大小，颜色
 * 功能：开，关
 */
abstract class Door implements Switch{
	//大小，颜色
	String color;
	double size;
	//开，关
	@Override
	public void open(){
		System.out.println("门都可以打开的！");
	}
}
//防火门
class FanghuoDoor extends Door{

	@Override
	public void close() {
		System.out.println("防火门，可以关闭，一般都是关闭");
	}
	//新增-防火-普通方法
	
}
//旋转门
class XuanzhuanDoor extends Door{

	@Override
	public void close() {
		System.out.println("旋转门，可以关闭，旋转着关闭");
	}
	@Override
	public void open() {
		System.out.println("旋转门，可以打开，旋转着打开");
	}

	//新增-旋转-普通方法
}
