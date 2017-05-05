package day9.duotai;

public class Test3 {
	public static void main(String[] args) {
		dome2();
	}
	/**
	 * 
	 * 
	 * 利用多态-》面向超类型编程：
	 * -》把所有子类型里，类似的功能（功能名字相同，实现的过程不一致）-》定义到超类型里（1套api）
	 * -》子类型去重写，利用多态来执行子类型的功能。
	 */
	private static void dome2() {
		//玩水枪
		playGun(new WaterGun2());
		//玩气枪
		playGun(new AirGun2());
		//玩水枪
		playGun(new WaterGun2());
	}
	/**
	 * 玩枪
	 * 参数：g1 所玩的枪
	 */
	public static void playGun(Gun2 g1){
		System.out.println();
		System.out.println("1）孩子用手拿着枪");
		System.out.println("2）孩子装填子弹");
		//3）孩子枪开火(执行的是-具体的枪的开火)
		g1.openFire();
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
/**
 * 定义超类型枪-》
 * Gun2——》所有的具体枪-需要继承Gun2
 * -》Gun2规范定义统一的api：开火  openFire
 * -》不同的枪的不同的开火-》去重写！
 */
//枪
class Gun2{
	//规范-开火
	public void openFire(){
		System.out.println("枪有开火的功能，不知道开火的效果！");
	}
} 
//水枪
class WaterGun2 extends Gun2{
	//开火
	@Override
	public void openFire(){
		System.out.println("喷水1");
		System.out.println("喷水2");
	}
}
//气枪
class AirGun2 extends Gun2{
	//开火
	@Override
	public void openFire(){
		System.out.println("打出bb塑料子弹，威力一般1");
		System.out.println("打出bb塑料子弹，威力一般2");
	}
}
//真枪
class RealGun2 extends Gun2{
	//开火
	@Override
	public void openFire(){
		System.out.println("打出真子弹，威力巨大1");
		System.out.println("打出真子弹，威力巨大2");
	}
}