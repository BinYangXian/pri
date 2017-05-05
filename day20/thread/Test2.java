package day20.thread;

public class Test2 {
	public static void main(String[] args) throws Exception{
		/**
		 * 死锁：
		 * 
死锁描述：  多个线程，都抢占了对方的资源，又都等待对方释放资源。   
死锁原因： 死锁是逻辑问题造成的！
解决办法：让一方先释放资源。
		 * 
		 * 
		 * 例子：如两个人分别拿着水和食物，都不放手，又都等待对方释放资源！！形成循环等待
		 */
		dome1();
	}

	private static void dome1()throws Exception {
		/**
		 * 两个线程
		 */
		Thread t1=new Thread(new LuoTask());
		Thread t2=new Thread(new LiTask());
		/**
		 * 开启线程
		 */
		t1.start();
		Thread.sleep(100);
		t2.start();
	}
}
/**
 * 食物类
 */
class Food{
	//一碗面
	public static Food noodle=new Food("康师傅牛肉面");
	//一瓶水
	public static Food water=new Food("农夫三拳有点悬");
	
	//食物的名字
	String name;
	//
	public Food(String name) {
		this.name = name;
	}
}

/**
 * 	罗启豪任务
 */
class LuoTask implements Runnable{

	@Override
	public void run() {
		//先抢面
		synchronized (Food.noodle) {
			//吃面
			System.out.println("罗启豪吃面第一口");
			System.out.println("罗启豪吃面第二口");
			System.out.println("罗启豪吃面完成");
			
			//休息500毫秒
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}//放下面
		
		//放下面-继续抢水
		synchronized (Food.water) {
			//-喝水
			System.out.println("罗启豪喝水第一口");
			System.out.println("罗启豪喝水第二口");
			System.out.println("罗启豪喝水完成");
		}//放下水
	}
}
/**
 * 	李靖任务
 */
class LiTask implements Runnable{

	@Override
	public void run() {
		//先抢水
		synchronized (Food.water) {
			//喝水
			System.out.println("李靖喝水第一口");
			System.out.println("李靖喝水第二口");
			System.out.println("李靖喝水完成");
			//休息500毫秒
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//拿着水-继续抢面
			synchronized (Food.noodle) {
				//-吃面
				System.out.println("李靖吃面第一口");
				System.out.println("李靖吃面第二口");
				System.out.println("李靖吃面完成");
			}
		}
		//放下面和水
	}
}