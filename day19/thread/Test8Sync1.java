package day19.thread;

public class Test8Sync1 {
	public static void main(String[] args) {
		/**
		 * 
		 * 多个人去银行排队在一个atm取钱，那么atm同一时刻不能有多个人同时取钱。
取钱过程：
        1）下楼到1楼，进入银行
        2）开始取钱-----》需要同步
        3）数取到的钱，并装入钱包
        
        同时取钱
        
        罗启豪：取钱7000
        任诗诗：取钱5000
        进这种：取钱9000
		 * 
		 */
		dome1();
	}

	private static void dome1() {
		/**
		 * 三个人和一个atm
		 */
		Person p1=new Person("罗启豪", 0, 7000);
		Person p2=new Person("任诗诗", 0, 5000);
		Person p3=new Person("进这种", 0, 9000);
		Atm atm=new Atm("布鲁明顿成都银行atm", 20000);
		
		/**
		 * 创建三个线程
		 */
		GetMoneyTask gt1=new GetMoneyTask(p1, atm);
		Thread t1=new Thread(gt1,"罗启豪");
		
		GetMoneyTask gt2=new GetMoneyTask(p2, atm);
		Thread t2=new Thread(gt2,"任诗诗");
		
		GetMoneyTask gt3=new GetMoneyTask(p3, atm);
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
class Person{
	//名字
	String name;
	//自己的钱
	int selfMoney;
	//要取的钱
	int needMoney;
	
	public Person(String name, int selfMoney, int needMoney) {
		this.name = name;
		this.selfMoney = selfMoney;
		this.needMoney = needMoney;
	}
}
/**
 * atm
 */
class Atm{
	//名字
	String name;
	//自己的钱
	int selfMoney;
	public Atm(String name, int selfMoney) {
		this.name = name;
		this.selfMoney = selfMoney;
	}
}

/**
取钱的任务
*/
class GetMoneyTask implements Runnable{
	
	//取钱任务的=取钱人
	Person curPerosn;
	//取钱任务的=取钱的atm
	Atm curAtm;
	//创建任务-设置取钱人和atm
	public GetMoneyTask(Person curPerosn, Atm curAtm) {
		this.curPerosn = curPerosn;
		this.curAtm = curAtm;
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
		//a）atm的钱是否足够
		if(this.curAtm.selfMoney>this.curPerosn.needMoney){
			//抽根烟-1000毫秒
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//b）取钱-人的钱增加，atm的钱减少
			this.curPerosn.selfMoney+=this.curPerosn.needMoney;
			this.curAtm.selfMoney-=this.curPerosn.needMoney;
		}
		System.out.println(this.curAtm.name+"【剩余的钱】："+this.curAtm.selfMoney);
		System.out.println(this.curPerosn.name+"【剩余的钱】："+this.curPerosn.selfMoney);
		
/**
 *     3）数取到的钱，并装入钱包
 */
		System.out.println(this.curPerosn.name+"3）数取到的钱，并装入钱包1");
		System.out.println(this.curPerosn.name+"3）数取到的钱，并装入钱包2");
		System.out.println(this.curPerosn.name+"3）数取到的钱，并装入钱包3");
	}
	
}