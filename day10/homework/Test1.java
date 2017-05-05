package day10.homework;

public class Test1 {
	public static void main(String[] args) {
		
		//人的变量
		Person p1;
		//手机的变量
		Phone sp;
		
		/**
		 * 熊大用三星手机发短信
		 */
		//来一个人
		p1=new Person("熊大");
		//来一个手机
		sp=new SanxinPhone();
		//人用手机发短信
		p1.usePhoneSendMsg(sp);
		/**
		 * 熊二用苹果手机发短信
		 */
		//来一个人
		p1=new Person("熊二");
		//来一个手机
		sp=new ApplePhone();
		//人用手机发短信
		p1.usePhoneSendMsg(sp);
		
	}
	
	/**
	 * 得到一个指定的手机
	 * 参数：phName “三星”，“苹果”，“小米”
	 * 返回值：对应的手机-三星，小米，苹果-->没有对应手机返回null
	 */
	public static Phone getPhone(String phName){
		if("三星".equals(phName)){// null.equals("三星")会空指针    "三星".equals(null)  不会空指针
			return new SanxinPhone();
		}
		if("苹果".equals(phName)){
			return new ApplePhone();
		}
		if("小米".equals(phName)){
			return new MiPhone();
		}
		//没有对应手机
		return null;
	}
	
}
/**
 * 1、继承+重写+多态

苹果手机类：
    功能： 发短信-（速度一般）
三星手机类：
    功能：发短信-（速度快）
小米手机类：
    功能：发短信-（速度慢）
...
人类：
    数据：名字
    功能：
    用手机发短信
        发短信过程（1）人拿着手机编写短信 2）手机发短信 3）人放下手机 ）
        手机：可以是（三星，苹果，小米）--》尝试多态解决
需求：
a）测试类中提供一个方法，根据参数“三星”，“苹果”，“小米”--》返回对应的手机对象。
b）熊大用三星手机发短信，熊二用苹果手机发短信
 * 
 * */
//超类型-手机PHone-规范所有的手机
//定义通用api：发短信sendMsg
class Phone{
	//发短信
	public void sendMsg(){
		System.out.println("手机可以发短信，不知道速度快还是慢！！！");
	}
}

class ApplePhone extends Phone{

	@Override
	public void sendMsg() {
		System.out.println("速度一般");
	}
	
}
class SanxinPhone extends Phone{
	@Override
	public void sendMsg() {
		System.out.println("速度快");
	}	
}
class MiPhone  extends Phone{
	@Override
	public void sendMsg() {
		System.out.println("速度慢");
	}
}
class Person{
	//名字
	String name;
	public Person(String name) {
		this.name = name;
	}
	
	//用手机发短信
	//参数phone 所使用的手机
	public void usePhoneSendMsg(Phone phone){
		//1）人拿着手机编写短信 2）手机发短信 3）人放下手机
		System.out.println(this.name+"拿着手机编写短信");
		//手机发短信
		phone.sendMsg();
		System.out.println(this.name+"放下手机");
	}
}

