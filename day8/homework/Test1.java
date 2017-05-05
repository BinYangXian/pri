package day8.homework;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 1、定义一个“点”（Point）类用来表示三维空间中的点（有三个坐标：x，y，z）。
每一个点都需要存储一份x，y，z的值-要求如下：
提示：利用this
b）提供可以设置三个坐标的构造方法和可以设置两个坐标(x，y)（另一个坐标z为默认为0）的构造方法。
c）提供可以计算该“点”距另外点距离平方的方法（利用this）
-- 两个点-（一个点利用this，另一个参数传入）
-- 公式-自己查询
d）提供比较两个点相等的方法（利用this）
		 */
		/**
		 * 测试 -距离平方 
		 */
		Point p1=new Point(3,0,0);
		Point p2=new Point(0,4,0);
		Point p3=null;
		//p1到p2的距离平方
		int d1= p1.distance(p2);
		int d2= p2.distance(p1);
		//
		System.out.println("距离1："+d1);
		System.out.println("距离2："+d2);
		/**
		 * 测试 -相等 
		 */
		p1.equals(p3);
		//p3.equals(p1);
	}
}

class Point{
	/**
	 * 成员变量-x，y，z
	 */
	int x,y,z;
	/**
	 * 构造器
	 */
	public Point() {
	
	}

	public Point(int x, int y, int z) {
		//super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Point(int x, int y) {
		//super();
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 成员方法
	 */
	/**
	 * 提供可以计算该“点”距另外点距离平方的方法（利用this）
-- 两个点-（一个点利用this，另一个参数传入）
-- 公式-自己查询
	 */
	public int distance(Point p2){
		//比较的两个点：p1用this ，p2用参数传入
		int x2=(this.x-p2.x)*(this.x-p2.x);
		int y2=(this.y-p2.y)*(this.y-p2.y);
		int z2=(this.z-p2.z)*(this.z-p2.z);
		
		return x2+y2+z2;
	}
	
	/**
	 * d）提供比较两个点相等的方法（利用this）
	 */
	public boolean equals(Point p2){
		//比较的两个点：p1用this ，p2用参数传入
		/**
		 * 方式1：分别比较 p1和p2的xyz的值是否相等
		 * 
		 * 方式2：计算p1到p2的距离平方为0 
		 * 
		 */
		//
		int d1= this.distance(p2);
		//int d2= p2.distance(this);//不建议-p2可能为null，可能出现空指针异常
		//判断是否相同
		return d1==0;
		/**
		 * 等价于下面代码
		 * 
		 * if(d1==0){
			return true;
		}
		return false;
		 */
	}
	
}
