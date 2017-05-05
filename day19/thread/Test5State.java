package day19.thread;

public class Test5State {
	public static void main(String[] args) {
		/**
		 * 线程间的状态转换：

1. 新建(new)：
    新创建了一个线程对象。
2. 可运行(runnable)：
    线程可以运行了，还没有分配到cpu时间，等待分配cpu
3. 运行(running)：
    线程获得了cpu 时间，正在执行代码。
4. 阻塞(block)（暂停）：
     阻塞状态是指线程因为【某种原因-a）输入，b)sleep】
放弃了cpu 使用权，暂停执行代码，阻塞可能恢复到可运行状态
 a）输入完成
 b）sleep时间用完

5. 死亡(dead)：
    线程run()、main() 方法执行结束，或者因异常退出了run()方法，则该线程结束生命周期。死亡的线程不可再次复生。
		 */
	}
}	
