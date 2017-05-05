package day19.thread;

public class Test7 {
	public static void main(String[] args) {
		/**
		 * 每一个线程都有名字
		 * 
		 * 1）创建线程的时候设置名字
		 * Thread(Runnable target, String name) 
		   Thread(String name) 
 		   2）修改线程的名字
 		    setName
 		   3）获取线程的名字
 		    getName

*线程的操作
		 *1）thread.sleep:当前的线程休息一定毫秒数，再继续执行
		 *2）thread.yield:当前的线程让出当前的cpu权限，让系统重新分配使用权，当前的线程也可能再次拿到cpu使用权。
		 *3）thread.currentThread:找到正在执行当前代码的线程对象,谁执行thread.currentThread代码-就返回那个线程对象。
		 * 
		 */
		dome1();
	}
	
	private static void dome1() {
		/**
		 * 创建线程
		 * 
		 */
		Runnable r1=new VrGameTask2();
		Thread t1=new Thread(r1,"老板");
	
		Runnable r2=new VrGameTask2();
		Thread t2=new Thread(r2,"经理");
		
		Runnable r3=new VrGameTask2();
		Thread t3=new Thread(r3,"员工");
		/**
		 * 开启线程
		 * 
		 */
		t1.start();
		t2.start();
		t3.start();
	}
}
/**
 * 玩vr游戏的任务（老板，经理，员工）
 */
class VrGameTask2 implements Runnable{
	@Override
	public void run() {
		/**
		 * 当前的run方法可能被【老板，经理，员工】3个线程执行
		 * 找到正在执行run方法的线程
		 * -》thread.currentThread
		 */
		//curTh-当前线程-可能是【老板，经理，员工】
		Thread curTh= Thread.currentThread();
		//当前线程的名字
		String curName= curTh.getName();
		
		//玩200次
		for (int i = 1; i <= 200; i++) {
			//玩一次游戏
			System.out.println(curName+"玩vr游戏，第"+i+"次");
			//当前的游戏的人(当前执行的线程)-让出cpu使用权-重新分配时间
			Thread.yield();
		}
	}
}