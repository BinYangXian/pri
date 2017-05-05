package day17.zhuangshi;

public class Test1 {
	/**
	 * 手机类       BasePhone
发短信       public boolean senMsg(String number,String content);

最开始的需求
需求1！
a）手机类的sendMsg功能：直接给对应的号码发送消息
加了需求-->加需求之后可以同时使用-所有需求
需求2！
b）号码正确验证
需求3！
c ）消息内容长度验证
需求4！
d ）消息内容长度验证，号码正确验证


不改手机类源代码的情况下，怎么处理？？

继承还是组合？？
组合更好！！更灵活
	 */
	public static void main(String[] args) {
		dome1();
	}

	private static void dome1() {
//		a)需求1！直接给对应的号码发送消息
		System.out.println("--------需求1-----------");
		BasePhone  bp=new BasePhone();
		bp.senMsg("13688889999", "hi美女");
		bp.senMsg("13688889999", "  ");
		bp.senMsg("110", "hi美女");
//		b）需求2！号码正确验证
		System.out.println("--------需求2-----------");
		CheckNumberPhone  cnp=new CheckNumberPhone(bp);
		cnp.senMsg222("13688889999", "hi美女");
		cnp.senMsg222("13688889999", "  ");
		cnp.senMsg222("110", "hi美女");
//		c ）需求3！消息内容长度验证
		System.out.println("--------需求3-----------");
		CheckContentPhone  ccp=new CheckContentPhone(bp);
		ccp.ccccc("13688889999", "hi美女");
		ccp.ccccc("13688889999", "  ");
		ccp.ccccc("110", "hi美女");
	}
}
/**
 * 基本手机-发短信-直接发送内容
*/
class BasePhone{
	//发短信-直接发送
	public boolean senMsg(String number,String content){
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
class CheckNumberPhone{
	//成员变量-组合BasePhone-使用BasePhone的功能
	BasePhone bp;
	//创建检查号码手机的时候-传入基本手机
	public CheckNumberPhone(BasePhone bp) {
		this.bp = bp;
	}

	//发短信--先检查号码（11位）-再发送内容
	public boolean senMsg222(String number,String content){
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
		 * 发送内容
		 */
		this.bp.senMsg(number, content);
		return true;
	}
}
/**
 * 检查内容手机-发短信-先检查内容-再发送内容
 */
class CheckContentPhone{
	//成员变量-组合BasePhone-使用BasePhone的功能
	BasePhone bp;
	//创建检查内容手机的时候-传入基本手机
	public CheckContentPhone(BasePhone bp) {
		this.bp = bp;
	}

	//发短信--先检查内容（去除左右空白后的长度1-5）-再发送内容
	public boolean ccccc(String number,String content){
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
		 * 发送内容
		 */
		this.bp.senMsg(number, content);
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
 */
