package day19.thread;

public class Test1BaseThread {
	public static void main(String[] args) {
		/**
		 *   同时执行多个任务-提高效率：
    例如：
        1）播放音乐，打游戏 
        2）同时copy多个文件


	线程的操作
	1）thread.sleep(毫秒数)——》当前执行代码的线程-休息一定毫秒数之后再继续执行代码

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
	 * 单线程 执行两个任务
	 * -》不能同时进行-一个任务执行完，才能执行另外的任务
	 */
	private static void dome1() {
		/**
		 * 播放音乐
		 */
		playMusic();
		/**
		 * 打游戏
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
	private static void playMusic() {
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
