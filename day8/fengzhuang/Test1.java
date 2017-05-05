package day8.fengzhuang;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 封装:encapsulation :
        把数据（属性）和功能（方法）封装到类中，通过类管理这些资源，通过对象体现，
        配合访问修饰符，把用户（类的使用者）需要的资源公开出来，不需要的隐藏-私有化。
		 */
		/**
		 * 需求：
  上班打滴滴叫车
          过程：  司机开车

   a）司机小王，18岁 1）开车（
          过程：  1）点火 2）油门  3)车子跑   4）刹车 
            ）
   b）车子，奔驰，50w，1）跑（
          过程：2）汽油燃烧  3）轮胎转动） 
		 */
		dome1();
	}
	private static void dome1() {
		/**
		 * 叫车：
		 * 18 岁范冰冰 开     2001111  法拉利  送你去公司
		 */
		//来一个司机
		Driver d1=new Driver("范冰冰", 18);
		//来一个车
		Car c1=new Car("法拉利", 2001111);
		//司机开车
		d1.driverCar(c1);
		
		System.out.println("-------------------------");
		/**
		 * 叫车2：
		 * 18 岁柳岩 开     3001111  拉博基尼  送你去公司
		 */
		//来一个司机
		Driver d2=new Driver("柳岩", 18);
		//来一个车
		Car c2=new Car("拉博基尼", 3001111);
		//司机开车
		d2.driverCar(c2);
	}
}
/**
 * 司机类
 */
class Driver{
	/**
	 * 成员变量
	 */
	String name;
	int age;
	/**
	 * 构造器
	 */
	public Driver(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/**
	 * 成员方法
	 */
	/**
	 * 用户关心的是-司机有开车的功能
	 * driverCar-》公开 -public
	 */
	
	//开车-
	public void driverCar(Car car){
		//点火
		this.dianhuo();
		//油门
		this.youmen();
		//车跑
		car.run();
		//刹车
		this.shache();
	}
	/**
	 * 用户不关心的是-司机-点火，油门，刹车
	 * dianhuo，youmen，shache-》隐藏 -private
	 */
//	点火
	private void dianhuo(){
		System.out.println(this.name+"点火  1");
		System.out.println(this.name+"点火  2");
	}
//	油门 
	private void youmen(){
		System.out.println(this.name+"油门  1");
		System.out.println(this.name+"油门  2");
	}	
//	刹车 
	private void shache(){
		System.out.println(this.name+"刹车 1");
		System.out.println(this.name+"刹车 2");
	}	
}
/**
 * 汽车类
 */
class Car{
	/**
	 * 成员变量
	 */
	String name;
	int price;
	/**
	 * 构造器
	 */
	public Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	/**
	 * 成员方法
	 */
	//跑
	public void run(){
		//汽油燃烧
		this.ranshao();
		//轮胎转动
		this.zhuandong();
	}
	//轮胎转动
	public void zhuandong(){
		System.out.println(this.name+"转动1");
		System.out.println(this.name+"转动2");
	}
	//汽油燃烧
	public void ranshao(){
		System.out.println(this.name+"燃烧1");
		System.out.println(this.name+"燃烧2");
	}
	
}
