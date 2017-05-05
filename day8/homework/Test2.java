package day8.homework;

public class Test2 {
	/**
	 * 1、访问修饰符，封装
车类
数据：
    车的名字-》其他类可以访问不能修改
    百公里油耗-》其他类可以访问不能修改
    车的价格-》其他类可以访问，可以修改-》修改的价格必须是（5000以上）
    最高速度-》其他类可以访问不能修改-》存储的是数字（220）访问的是字符串（220码）
	 */
}
class Car{
	private String name;
	private int fuelConsumption;
	private int price;
	private int speed;
	
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		//检查价格
		if(price<=5000){
			return;
		}
		//设置价格
		this.price = price;
	}
	public String getName() {
		return this.name;
	}
	public int getFuelConsumption() {
		return this.fuelConsumption;
	}
	public String getSpeed() {
		return this.speed+"码";
	}
	
}