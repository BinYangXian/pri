package day19.thread;

public class Test2BaseThread {
	public static void main(String[] args) {
		/**
		 * 
		 * java开启线程
		 * 1）新定义类实现runnable接口
		 * 2）新定义类继承thread类
		 * 
		 * 
		 * 新定义类实现runnable接口-步骤
		 * 
		 * a）新定义的类实现runnable接口
		 * b)重写run 方法-提供任务代码
		 * c）创建新定义任务类的对象
		 * d）创建线程对象-绑定任务对象
		 * e)开启线程-执行任务对象的run的方法
		 * 线程.start()->等待系统为线程分配cpu资源，分配到之后才开始执行run方法（过程大概..需要几毫秒）
		 * 
		 * 如果没有开启线程
		 * -》那么java程序默认有一个main线程
		 * 
		 * main线程：任务就是把main方法的代码执行完成
		 * 新的thread线程：任务就是把run方法的代码执行完成
		 * 
		 */
		
		
		/**
		 * 需求：
		 * 两个任务
		 * a）播放音乐-8秒
		 * b）打游戏-10秒
		 */
		dome1();
	}
	/**
	 * 多线程 执行两个任务
	 * -》可以同时进行
	 */
	private static void dome1() {
	
		
		/**
		 * 播放音乐-新thread线程完成
		 */
		//c）创建新定义任务类的对象
		MusicTask mt=new MusicTask();
		//d）创建线程对象-绑定任务对象
		Thread t1=new Thread(mt);
		//e)开启线程-执行任务对象的run的方法
		System.out.println("t1start代码前");
		t1.start();
		System.out.println("t1start代码后");
		
		/**
		 * 打游戏-main线程完成
		 */
		playGame();
		
	}
	private static void playGame() {
		for (int i=1;i<=10;i++) {
			//打游戏
			System.out.println("打游戏"+i);
			//休息1秒
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
/**
播放音乐的任务类
*/
//a新定义的类实现runnable接口
class MusicTask implements Runnable{

	
	//b 重写run 方法-提供任务代码
	@Override
	public void run() {
		System.out.println("-----播放音乐-----");
		for (int i=1;i<=8;i++) {
			//播放
			System.out.println("播放音乐"+i);
			//休息1秒
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}