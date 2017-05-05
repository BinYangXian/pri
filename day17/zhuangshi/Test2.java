package day17.zhuangshi;

public class Test2 {
	
	public static void main(String[] args) {
		dome1();
	}

	private static void dome1() {
//		a)需求1！直接给对应的号码发送消息
		System.out.println("--------需求1-----------");
		Phone2  bp=new BasePhone2();
		bp.sendMessage("13688889999", "hi美女");
		bp.sendMessage("13688889999", "  ");
		bp.sendMessage("110", "hi美女");
//		b）需求2！号码正确验证
		System.out.println("--------需求2-----------");
		Phone2  cnp=new CheckNumberPhone2(bp);
		cnp.sendMessage("13688889999", "hi美女");
		cnp.sendMessage("13688889999", "  ");
		cnp.sendMessage("110", "hi美女");
//		c ）需求3！消息内容长度验证
		System.out.println("--------需求3-----------");
		Phone2  ccp=new CheckContentPhone2(bp);
		ccp.sendMessage("13688889999", "hi美女");
		ccp.sendMessage("13688889999", "  ");
		ccp.sendMessage("110", "hi美女");
//		c ）需求4！消息内容长度和号码验证
		System.out.println("--------需求4-a----------");
		/**
		 * * 解决方案
 * a）检查内容-包装-》检查号码-》包装-》基本手机
 * b）检查号码-包装-》检查内容-》包装-》基本手机
		 */
		//a
		//来一个基本手机
		Phone2  bp2=new BasePhone2();
		//来一个检查号码手机
		Phone2  cnp2=new CheckNumberPhone2(bp2);
		//来一个检查内容手机
		Phone2  ccp2=new CheckContentPhone2(cnp2);
		
		ccp2.sendMessage("13688889999", "hi美女");
		ccp2.sendMessage("13688889999", "  ");
		ccp2.sendMessage("110", "hi美女");
		System.out.println("--------需求4-b----------");
		//b
		Phone2  cnp3= new CheckNumberPhone2(new CheckContentPhone2(new BasePhone2()));  
		cnp3.sendMessage("13688889999", "hi美女");
		cnp3.sendMessage("13688889999", "  ");
		cnp3.sendMessage("110", "hi美女");
	}
}
/**
 * 基本手机-发短信-直接发送内容
*/
class BasePhone2 extends Phone2{
	//发短信-直接发送
	public boolean sendMessage(String number,String content){
		System.out.println();
		System.out.println("发生的号码："+number);
		System.out.println("发生的内容："+content);
		System.out.println("发生成功");
		return true;
	}
}
/**
 * 检查号码手机-发短信-先检查号码-再发送内容
 */
class CheckNumberPhone2 extends Phone2{
	//成员变量-组合【其他手机】-使用【其他手机】的功能
	Phone2 ph;
	//创建检查内容手机的时候-传入【其他手机】
	public CheckNumberPhone2(Phone2 ph) {
		this.ph = ph;
	}

	//发短信--先检查号码（11位）-再发送内容
	public boolean sendMessage(String number,String content){
		/**
		 * 检查号码
		 */
		int len =((number==null)?0:number.length());
		if(len!=11){
			System.out.println();
			//号码错误-不发送短信
			System.out.println("号码错误!");
			return false;
		}
		/**
		 * 使用包装的【其他手机】发短信
		 */
		this.ph.sendMessage(number, content);
		return true;
	}
}
/**
 * 检查内容手机-发短信-先检查内容-再发送内容
 */
class CheckContentPhone2 extends Phone2{
	//成员变量-组合【其他手机】-使用【其他手机】的功能
	Phone2 ph;
	//创建检查内容手机的时候-传入【其他手机】
	public CheckContentPhone2(Phone2 ph) {
		this.ph = ph;
	}

	//发短信--先检查内容（去除左右空白后的长度1-5）-再发送内容
	public boolean sendMessage(String number,String content){
		/**
		 * 检查内容
		 */
		int len =((number==null)?0:content.trim().length());
		if(len>5||len<1){
			//内容错误-不发送短信
			System.out.println("内容错误!");
			return false;
		}
		/**
		 * 使用包装的【其他手机】发短信
		 */
		this.ph.sendMessage(number, content);
		return true;
	}
}
/**
 * 检查内容和号码手机-发短信-先检查内容，检查号码，-再发送内容
 * 
 * 目前的设计-实现出现问题
 * 包装【检查内容和号码手机】都有【发送内容】的功能-重复了
 * 解决方案
 * a）检查内容-包装-》检查号码-》包装-》基本手机
 * b）检查号码-包装-》检查内容-》包装-》基本手机
 * ->检查内容和检查号码的手机-要可以包装任何的手机
 * -》所有的手机必须有一个超类型
 * ....
 * 定义超类型手机Phone2（抽象类）-所有的手机继承phone2
 * 统一规范发短信功能：sendMessage
 * 
 */
abstract class Phone2{
	//发短信
	public abstract boolean sendMessage(String number,String content);
}


