package day20.thread;

import day20.moniList.MyArrayList1;
import day20.moniList.MyList1;
import day20.moniList.MyVector1;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 
		 * 线程不安全的类：StringBuilder，arrayList，hashMap
		 * 线程安全的类：StringBuffer，vector，hashtable
		 * 
		 * 线程不安全：表示该类的同一个对象，在多线程环境使用的时候，没有进行同步（synchronized），可能出现数据异常。
		 * --》线程不安全的类的对象-只能在单线程环境使用。
		 * 
		 * 线程安全：表示该类的同一个对象，在多线程环境使用的时候，有进行同步（synchronized）有线程在操作该对象的同步代码，其他线程等待。
		 * --》线程安全的类的对象-单线程和多线程都可以使用。
		 * 
		 * --》线程安全的类--》比线程不安全的类速度慢
		 * 
		 */
		dome2();
	}
	/**
	 * vector多线程使用-不会出现线程不安全-
	 */
	private static void dome2() {
		//装水果vector实现的的list的容器
		MyList1 list=new MyVector1();
		
		/**
		 * 柳岩-装水果：苹果，梨子
		 */
		//使用内部类
		Thread t1= new Thread(){
			@Override
			public void run() {
				list.add("苹果");
				list.add("梨子");
			}
		};
		t1.start();
		
		/**
		 * 志玲姐姐-装水果：波罗，葡萄
		 */
		//使用lambda
		new Thread(()->{
			list.add("葡萄");
			list.add("波罗");
		}).start();
		/**
		 * 韩红-吃装的所有水果
		 */
		//休息2.5秒-等待装水果
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//吃
		for (int i = 0; i < list.size(); i++) {
			//取出水果
			Object obj= list.get(i);
			System.out.println("吃："+obj);
		}
		System.out.println("------------");
	}
	
	/**
	 * arrylist多线程使用-可能出现线程不安全-可能异常
	 */
	private static void dome1() {
		//装水果arrylist实现的的list的容器
		MyList1 list=new MyArrayList1();
		
		/**
		 * 柳岩-装水果：苹果，梨子
		 */
		//使用内部类
		Thread t1= new Thread(){
			@Override
			public void run() {
				list.add("苹果");
				list.add("梨子");
			}
		};
		t1.start();
		
		/**
		 * 志玲姐姐-装水果：波罗，葡萄
		 */
		//使用lambda
		new Thread(()->{
			list.add("葡萄");
			list.add("波罗");
		}).start();
		/**
		 * 韩红-吃装的所有水果
		 */
		//休息1.5秒-等待装水果
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//吃
		for (int i = 0; i < list.size(); i++) {
			//取出水果
			Object obj= list.get(i);
			System.out.println("吃："+obj);
		}
		System.out.println("------------");
	}
}
