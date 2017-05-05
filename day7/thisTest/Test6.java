package day7.thisTest;

public class Test6 {
	
	
	public static void main(String[] args) {
		
		/**
		 * 
		 * this的使用 
		 * 
		 * 1）this.成员变量
		 * 2）this.成员方法
		 * 3）this(构造器参数);-->通过当前对象在构造器中调用重载的构造器
		 * 语法：
		 * 位置：１）必须是构造器中　２）必须第一句
		 */
		
		
		
		//周杰伦对象
		Worker6 w1=new Worker6("周杰伦11111" );
		//李冰冰对象
		Worker6 w2=new Worker6( "李冰冰222222",'女');
		
		System.out.println(w1.name);	
		System.out.println(w2.name);		
	}
	
}
/**
 *工作者
 */
class Worker6{
	
	//成员变量-每个上班的人，都有名字和年龄
	String name;
	int age;
	/**
	 * 构造器-初始化名字和年龄
	 */
	public Worker6(String name2, int age2) {
		
		//this.Worker6(name2);//构造器不能直接调用
		/**
		 * 使用Worker6(String name2) 初始化名字
		 */
		this(name2);
		
		age = age2;//等价于 this.age=age2;
	}
	/**
	 * 构造器-初始化名字
	 * 
	 * 名字必须是2到5个字符
	 * 
	 */
	public Worker6(String name2) {
		//检查名字 
		
		int len;
		if(name2==null){//null相当于 0
			len=0;
		}else{
			len=name2.length();
		}
		if(len>5||len<2){//错误
			//结束方法
			return ;
		}
		
		//设置名字
		this.name=name2;
	}
	
	
}
