package day19.thread;

public class Test8Sync2 {
	public static void main(String[] args) {
		/**
		 * 
		 *   synchronized关键字概念
保证某一个对象的同步代码（所有的synchronized修饰的代码）在某一个时刻只会被一个线程执行，其他线程只能等待执行完成才可以执行。

   对象锁：执行同步代码的时候需要把对象锁住。
    1)每个对象都有一个对象锁
    2)线程在执行对象synchronized修饰的代码时，会先【自动获取对象锁】,然后把该对象的synchronized修饰的所有代码锁住
    3）执行完成synchronized代码后会【自动释放对象锁】，其他线程才可以继续【自动获取对象锁】,然后其他线程把该对象的synchronized修饰的所有代码锁住。

synchronized 关键字：会【自动获取锁和释放锁】，也可以手动获取和释放！java.util.concurrent.locks包提供了丰富的支持。


synchronized使用

a）synchronized块：锁【指定对象】的【指定的同步代码】【synchronized修饰的代码】
语法：
synchronized(【指定对象】){
	【指定的同步代码】
	【指定的同步代码】
	...
}

b）synchronized成员方法:锁【当前调用成员方法的对象】的【指定的同步代码】【synchronized修饰的代码】

语法：
访问修饰符   synchronized  返回值类型   方法名  (参数列表){方法代码}

c）synchronized静态方法:锁的是类的（static）同步代码


		 * 
		 */
		dome1();
	}

	private static void dome1() {
		/**
		 * 三个人和一个Atm2
		 */
		Person2 p1=new Person2("罗启豪", 0, 7000);
		Person2 p2=new Person2("任诗诗", 0, 5000);
		Person2 p3=new Person2("进这种", 0, 9000);
		Atm2 Atm2=new Atm2("布鲁明顿成都银行Atm2", 20000);
		
		/**
		 * 创建三个线程
		 */
		GetMoneyTask2 gt1=new GetMoneyTask2(p1, Atm2);
		Thread t1=new Thread(gt1,"罗启豪");
		
		GetMoneyTask2 gt2=new GetMoneyTask2(p2, Atm2);
		Thread t2=new Thread(gt2,"任诗诗");
		
		GetMoneyTask2 gt3=new GetMoneyTask2(p3, Atm2);
		Thread t3=new Thread(gt3,"进这种");
		
		
		/**
		 * 开启三个线程
		 */
		t1.start();
		t2.start();
		t3.start();
	}
}
/**
 * 取钱的人
 */
class Person2{
	//名字
	String name;
	//自己的钱
	int selfMoney;
	//要取的钱
	int needMoney;
	
	public Person2(String name, int selfMoney, int needMoney) {
		this.name = name;
		this.selfMoney = selfMoney;
		this.needMoney = needMoney;
	}
}
/**
 * Atm2
 */
class Atm2{
	//名字
	String name;
	//自己的钱
	int selfMoney;
	public Atm2(String name, int selfMoney) {
		this.name = name;
		this.selfMoney = selfMoney;
	}
}

/**
取钱的任务
*/
class GetMoneyTask2 implements Runnable{
	
	//取钱任务的=取钱人
	Person2 curPerosn;
	//取钱任务的=取钱的Atm2
	Atm2 curAtm2;
	//创建任务-设置取钱人和Atm2
	public GetMoneyTask2(Person2 curPerosn, Atm2 curAtm2) {
		this.curPerosn = curPerosn;
		this.curAtm2 = curAtm2;
	} 
	
	@Override
	public void run() {
/**
 * 	1）下楼到1楼，进入银行
 */
		System.out.println(this.curPerosn.name+"1）下楼到1楼，进入银行1");
		System.out.println(this.curPerosn.name+"1）下楼到1楼，进入银行2");
		System.out.println(this.curPerosn.name+"1）下楼到1楼，进入银行3");
/**
 *      2）开始取钱-----》需要同步
 */
		synchronized (this.curAtm2) {
			//a）Atm2的钱是否足够
			if(this.curAtm2.selfMoney>this.curPerosn.needMoney){
				//抽根烟-1000毫秒
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//b）取钱-人的钱增加，Atm2的钱减少
				this.curPerosn.selfMoney+=this.curPerosn.needMoney;
				this.curAtm2.selfMoney-=this.curPerosn.needMoney;
			}
		}
		
		System.out.println(this.curAtm2.name+"【剩余的钱】："+this.curAtm2.selfMoney);
		System.out.println(this.curPerosn.name+"【剩余的钱】："+this.curPerosn.selfMoney);
		
/**
 *     3）数取到的钱，并装入钱包
 */
		System.out.println(this.curPerosn.name+"3）数取到的钱，并装入钱包1");
		System.out.println(this.curPerosn.name+"3）数取到的钱，并装入钱包2");
		System.out.println(this.curPerosn.name+"3）数取到的钱，并装入钱包3");
	}
	
}