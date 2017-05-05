
public class Test1{
	
	public static void main(String args[]){
		/**
			
方法概念：  方法对应一种功能，方法的多句代码-对应该功能实现的步骤，方法名代表该功能做的事情。
   例如：
吃饭：1）拿筷子2）把饭送入嘴里，3）咬碎吞肚里）
人打游戏：  1）开机2）安装游戏3）打开游戏4）玩游戏

		*/
		//吃6个苹果
		eatApple();
		//吃50个鸡腿 
		eatChicken();
		//吃6个苹果
		eatApple();
	}
	/**
		没有用方法的参数-》【吃苹果6个】和【吃鸡腿50个】
		两个方法-非常相似-代码重复
		——》解决-》把代码定义到一个方法中，不确定的数据-》用参数传入
	*/
	
	
	/**
吃苹果6个
	*/
	public static void eatApple(){
		//吃的个数
		int eatCount=6;
		//吃的食物
		String eatFood="苹果";
		
		for(int i=1;i<=eatCount;i++){
			System.out.println("吃第"+i+"个"+eatFood);
			System.out.println("啃啃啃啃");
			System.out.println("擦嘴巴");
			System.out.println();
		}
	}
	/**
吃鸡腿50个
	*/
	public static void eatChicken(){
		//吃的个数
		int eatCount=50;
		//吃的食物
		String eatFood="鸡腿";
		
		for(int i=1;i<=eatCount;i++){
			System.out.println("吃第"+i+"个"+eatFood);
			System.out.println("啃啃啃啃");
			System.out.println("擦嘴巴");
			System.out.println();
		}
	}
	
}
