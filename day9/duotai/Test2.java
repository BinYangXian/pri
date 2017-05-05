package day9.duotai;

public class Test2 {
	public static void main(String[] args) {
		dome2();
	}
	/**
	 * 
	 * 重复代码-》放入方法定义-多次调用
	 * --》没有超类型-面向具体类编程-》每一个具体类（枪）都定义一个方法
	 * 
	 */
	private static void dome2() {
		//玩水枪
		playWaterGun(new WaterGun1());
		//玩气枪
		playAirGun(new AirGun1());
		//玩水枪
		playWaterGun(new WaterGun1());
	}
	/**
	 * 玩水枪
	 * 参数：g1 所玩的水枪
	 */
	public static void playWaterGun(WaterGun1 g1){
		System.out.println();
		System.out.println("1）孩子用手拿着枪");
		System.out.println("2）孩子装填子弹");
		//3）孩子枪开火
		g1.aaa();
		System.out.println("4）孩子高兴的笑了");
	}
	
	/**
	 * 玩气枪
	 * 参数：g1 所玩的气枪
	 */
	public static void playAirGun(AirGun1 g1){
		System.out.println();
		System.out.println("1）孩子用手拿着枪");
		System.out.println("2）孩子装填子弹");
		//3）孩子枪开火
		g1.bbb();
		System.out.println("4）孩子高兴的笑了");
	}
	
	/**
	 * 
	 * 代码重复
	 * 
	 */
	private static void dome1() {
		/**
		 * 玩一次水枪
		 */
		System.out.println();
		System.out.println("1）孩子用手拿着枪");
		System.out.println("2）孩子装填子弹");
		//3）孩子枪开火
		WaterGun1 g1=new WaterGun1();
		g1.aaa();
		System.out.println("4）孩子高兴的笑了");
	    
		/**
		 * 玩一次气枪
		 */
		System.out.println();
		System.out.println("1）孩子用手拿着枪");
		System.out.println("2）孩子装填子弹");
		//3）孩子枪开火
		AirGun1 g2=new AirGun1();
		g2.bbb();
		System.out.println("4）孩子高兴的笑了");
		/**
		 * 玩一次水枪
		 */
		System.out.println();
		System.out.println("1）孩子用手拿着枪");
		System.out.println("2）孩子装填子弹");
		//3）孩子枪开火
		WaterGun1 g3=new WaterGun1();
		g3.aaa();
		System.out.println("4）孩子高兴的笑了");
		
	}
	
	/**
水枪
    方法：开火--》喷水

气枪
    方法：开火--》打出bb塑料子弹，威力一般

真枪
    方法：开火--》打出真子弹，威力巨大

孩子玩枪：
水枪，气枪，真枪
（多种类型的对象）。
玩枪过程： 
            1）孩子用手拿着枪
            2）孩子装填子弹
            3）孩子枪开火
            4）孩子高兴的笑了
	 */
}
//水枪
class WaterGun1{
	//开火
	public void aaa(){
		System.out.println("喷水1");
		System.out.println("喷水2");
	}
}
//气枪
class AirGun1{
	//开火
	public void bbb(){
		System.out.println("打出bb塑料子弹，威力一般1");
		System.out.println("打出bb塑料子弹，威力一般2");
	}
}
//真枪
class RealGun1{
	//开火
	public void ccc(){
		System.out.println("打出真子弹，威力巨大1");
		System.out.println("打出真子弹，威力巨大2");
	}
}