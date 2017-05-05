package day19.thread;

public class Test6 {
	public static void main(String[] args) {
		/**
		 * 
2）三个人(老板,经理,员工)玩VR打游戏->同时玩
       a）老板->优先级最高
       b）经理->优先级一般
       c）员工->优先级最低
		 * 
		 * 
		 *线程的操作
		 *1）thread.sleep:当前的线程休息一定毫秒数，再继续执行
		 *2）thread.yield:当前的线程让出当前的cpu权限，让系统重新分配使用权，当前的线程也可能再次拿到cpu使用权。
		 * 
		 * java的线程的优先级
		 * -》优先级越高-线程到分配的cpu几率越大
		 * 
		 * 优先级：1到10   -》依次增加
		 * 
		 * 设置优先级setPriority(int newPriority) 
		 * 获取优先级getPriority() 
		 * -》如果没有手动设置优先级默认为5
		 * 
		 * 常用优先级设置有常量
static int MAX_PRIORITY  最高优先级 10
static int MIN_PRIORITY  最低优先级 1
static int NORM_PRIORITY 一般优先级5

		 * 
		 */
		dome2();
	}
	/**
	 * 三个人玩游戏-
	 * a）老板->玩游戏-》优先级最高
       b）经理->玩游戏-》优先级一般
       c）员工->玩游戏-》优先级最低
	 */
	private static void dome2() {
		/**
		 * 创建线程
		 * 
		 */
		Runnable r1=new VrGameTask("老板");
		Thread t1=new Thread(r1);
		//设置老板优先级
		t1.setPriority(Thread.MAX_PRIORITY);
		
		
		Runnable r2=new VrGameTask("经理");
		Thread t2=new Thread(r2);
		
		Runnable r3=new VrGameTask("员工");
		Thread t3=new Thread(r3);
		//设置员工优先级
		t3.setPriority(Thread.MIN_PRIORITY);
		System.out.println("老板的优先级："+t1.getPriority());
		System.out.println("经理的优先级："+t2.getPriority());
		System.out.println("员工的优先级："+t3.getPriority());
		/**
		 * 开启线程
		 * 
		 */
		t1.start();
		t2.start();
		t3.start();
	}
	/**
	 * 三个人玩游戏-优先级相同-》都有可能最先完成游戏任务
	 * a）老板->玩游戏
       b）经理->玩游戏
       c）员工->玩游戏
	 */
	private static void dome1() {
		/**
		 * 创建线程
		 * 
		 */
		Runnable r1=new VrGameTask("老板");
		Thread t1=new Thread(r1);
		
		Runnable r2=new VrGameTask("经理");
		Thread t2=new Thread(r2);
		
		Runnable r3=new VrGameTask("员工");
		Thread t3=new Thread(r3);
		
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
class VrGameTask implements Runnable{
	//任务执行的人的名字
	String name;
	public VrGameTask(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		//玩200次
		for (int i = 1; i <= 200; i++) {
			//玩一次游戏
			System.out.println(this.name+"玩vr游戏，第"+i+"次");
			//当前的游戏的人(当前执行的线程)-让出cpu使用权-重新分配时间
			Thread.yield();
		}
	}
}