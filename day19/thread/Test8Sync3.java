package day19.thread;

public class Test8Sync3 {
	public static void main(String[] args) {
		/**
		 * 
		 *   
b）synchronized成员方法:锁【当前调用成员方法的对象】的【指定的同步代码】【synchronized修饰的代码】

语法：
访问修饰符   synchronized  返回值类型   方法名  (参数列表){方法代码}
		 * 
		 */
		dome1();
	}

	private static void dome1() {
		/**
		 * 三个人和一个Atm3
		 */
		Person3 p1=new Person3("罗启豪", 0, 7000);
		Person3 p2=new Person3("任诗诗", 0, 5000);
		Person3 p3=new Person3("进这种", 0, 9000);
		Atm3 Atm3=new Atm3("布鲁明顿成都银行Atm3", 20000);
		
		/**
		 * 创建三个线程
		 */
		GetMoneyTask3 gt1=new GetMoneyTask3(p1, Atm3);
		Thread t1=new Thread(gt1,"罗启豪");
		
		GetMoneyTask3 gt2=new GetMoneyTask3(p2, Atm3);
		Thread t2=new Thread(gt2,"任诗诗");
		
		GetMoneyTask3 gt3=new GetMoneyTask3(p3, Atm3);
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
class Person3{
	//名字
	String name;
	//自己的钱
	int selfMoney;
	//要取的钱
	int needMoney;
	
	public Person3(String name, int selfMoney, int needMoney) {
		this.name = name;
		this.selfMoney = selfMoney;
		this.needMoney = needMoney;
	}
}
/**
 * Atm3
 */
class Atm3{
	//名字
	String name;
	//自己的钱
	int selfMoney;
	public Atm3(String name, int selfMoney) {
		this.name = name;
		this.selfMoney = selfMoney;
	}
	
	/**
	 * 取钱的操作
	 * 人：
	 * atm：
	 * @param curPerosn 
	 * @param curAtm3 
	 */
	public synchronized void getMoney(Atm3 curAtm3, Person3 curPerosn){
		//a）Atm3的钱是否足够
		if(curAtm3.selfMoney>curPerosn.needMoney){
			//抽根烟-2000毫秒
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//b）取钱-人的钱增加，Atm3的钱减少
			curPerosn.selfMoney+=curPerosn.needMoney;
			curAtm3.selfMoney-=curPerosn.needMoney;
		}
	}
}

/**
取钱的任务
*/
class GetMoneyTask3 implements Runnable{
	
	//取钱任务的=取钱人
	Person3 curPerosn;
	//取钱任务的=取钱的Atm3
	Atm3 curAtm3;
	//创建任务-设置取钱人和Atm3
	public GetMoneyTask3(Person3 curPerosn, Atm3 curAtm3) {
		this.curPerosn = curPerosn;
		this.curAtm3 = curAtm3;
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
		this.curAtm3.getMoney(this.curAtm3,this.curPerosn);
		
		System.out.println(this.curAtm3.name+"【剩余的钱】："+this.curAtm3.selfMoney);
		System.out.println(this.curPerosn.name+"【剩余的钱】："+this.curPerosn.selfMoney);
		
/**
 *     3）数取到的钱，并装入钱包
 */
		System.out.println(this.curPerosn.name+"3）数取到的钱，并装入钱包1");
		System.out.println(this.curPerosn.name+"3）数取到的钱，并装入钱包2");
		System.out.println(this.curPerosn.name+"3）数取到的钱，并装入钱包3");
	}
	
}