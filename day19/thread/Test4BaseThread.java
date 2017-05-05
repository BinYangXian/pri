package day19.thread;

public class Test4BaseThread {
	public static void main(String[] args) {
		/**
		 * 
		 * java开启线程
		 * 1）新定义类实现runnable接口
		 * 2）新定义类继承thread类
		 * 
		 * 新定义类继承thread类-步骤
		 * 
		 * a）新定义的类继承thread类
		 * b)重写run 方法-提供任务代码
		 * c）创建新定义线程类的对象
		 * d)开启线程-执行任务对象的run的方法
		 * 线程.start()->等待系统为线程分配cpu资源，分配到之后才开始执行run方法（过程大概..需要几毫秒）
		 * 
		 * 
		 * --新定义类-继承thread或实现runnable都可以开启线程
		 * -》实现runnable方式更好-》原因-》java类单继承，类多实现
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
		//c）创建新定义线程类的对象
		MusicThread mt=new MusicThread();
		
		//d开启线程-执行任务对象的run的方法
		System.out.println("t1start代码前");
		mt.start();//等待系统分配cpu给t1线程-分配之后t1线程执行任务对象mt的run方法（mt.run()）
		System.out.println("t1start代码后");
		
		/**
		 * 打游戏-main线程完成
		 */
		playGame(10);
		
	}
	private static void playGame(int gameTime) {
		for (int i=1;i<=gameTime;i++) {
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
播放音乐的线程类
*/
//a新定义的类实现runnable接口
class MusicThread extends Thread{
	
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