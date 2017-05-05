package day11.exceptionApi;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 
		 * 打印语句
		 * 
		 * System.out.println(打印的内容);  周杰伦  用黑色 笔在控制台写内容
		 * System.err.println(打印的内容);	   古力娜扎  用红色 笔在控制台写内容
		 * 
		 * 
		 * 
		 * 
		 * 异常对象的api
		 * 
		 * a）访问异常对象所在类的名字(包名.类名)
		 *   异常对象.getClass().getName()
		 * b）取出异常对象的消息（错误的原因）
		 * Throwable-》   getMessage()   
		 *
		 * c)把异常对象的详细信息（1）异常类名 2）异常消息 3）错误的位置）打印到控制台（红色的文字信息）
		 * Throwable-》printStackTrace()
		 */
		app();
	}
	private static void app() {
		
		

		System.out.println("----------try catch 前-----------------");
		//来一个同学学习
		try {
			study();
		} catch (Exception e) {//-》老师处理有问题的同学
			//处理了=LaterException, UndoHomeWorkException
			//异常类名
			String clsName=e.getClass().getName();
			System.out.println("错误的异常类名："+clsName);
			System.out.println("异常的消息（惩罚的原因）："+e.getMessage());
			if("day11.exceptionApi.LaterException".equals(clsName)){
				System.out.println("处理方式：做50个俯卧撑");
			}else
			if("day11.exceptionApi.UndoHomeWorkException".equals(clsName)){
				UndoHomeWorkException ue=(UndoHomeWorkException) e;
				System.out.println("处理方式：一个题"+(ue.undoCount*5)+"个俯卧撑");
			}
			//把错误的详细信息-打印到控制台
			e.printStackTrace();
			
		} 
		System.out.println("----------try catch 后-----------------");
	}
	/**
	 * 某一个同学学习的过程
	 */
	public static void study()throws  LaterException, UndoHomeWorkException{
		System.out.println("赶车来学校");
		System.out.println("检查作业");
		//随机出现-迟到问题（异常）
		if(Math.random()>0.5){
			LaterException ue=new LaterException("迟到了");
			throw ue;
		}
		System.out.println("讲作业");
		System.out.println("讲知识点");
		System.out.println("吃饭");
		//随机出现-未做作业问题（异常）
		if(Math.random()>0.5){
			//随机未做题的数量（3-6）
			int rnUndoCount=(int)(Math.random()*(6-3+1))+3;
			UndoHomeWorkException ue=new UndoHomeWorkException("未做作业,数量："+rnUndoCount,rnUndoCount);
			throw ue;
		}
		System.out.println("唱歌");
		System.out.println("讲知识点");
		System.out.println("讲作业");
		System.out.println("赶车回家");
	}
}
/**
 * 
 * 未做作业异常
 */
class UndoHomeWorkException extends Exception{
	/**
	 * 自定义的异常类-也是一个普通类-可以定义成员变量，方法...
	 */
	//未做作业数量
	int undoCount;
	
	public UndoHomeWorkException() {
		super();
	}
	public UndoHomeWorkException(String message) {
		super(message);
	}
	public UndoHomeWorkException(String message,int undoCount) {
		super(message);
		this.undoCount=undoCount;
	}
}
/**
 * 
 * 迟到的异常
 */
class LaterException extends Exception{

	public LaterException() {
		super();
	}
	public LaterException(String message) {
		super(message);
	}
}

