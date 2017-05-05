
public class Test1{
	
	public static void main(String args[]){
		/**
		
			需求：
			1）吃鸡腿->a）买鸡腿 b）炸鸡腿 c）吃鸡腿 d）洗手
			2）打游戏->a）安装游戏 b）打开游戏  c）登录账号 d）玩游戏
			3）吃鸡腿->a）买鸡腿 b）炸鸡腿 c）吃鸡腿 d）洗手
			4）吃鸡腿->a）买鸡腿 b）炸鸡腿 c）吃鸡腿 d）洗手
			5）打游戏->a）安装游戏 b）打开游戏  c）登录账号 d）玩游戏
			
			方法的概念：一个方法就是一个大的功能，方法的每一句代码对应功能实现的步骤，方法名
			代表功能所做的事情。
			
			使用方法步骤
			1）定义方法——》编写方法所需要执行的代码
			位置：在类中，与其他方法同级别
			语法：
			public static void 方法名(){
				//方法的代码
			}
			
			2）调用（执行）方法-》执行对应方法的代码
			语法：方法名();
			
			
			编写代码到自定义新方法的好处
			1）避免main方法代码过多，调试更方便
			2）重复的代码多次利用
		*/
		/**
			没有新方法-代码都写在main方法里
		*/
		//吃鸡腿
		eatChicken();
		//打游戏
		playGame();
		//吃鸡腿
		eatChicken();
		//吃鸡腿
		eatChicken();
		//打游戏
		playGame();
	}
	/**
		吃鸡腿的方法
	*/
	public static void eatChicken(){
		System.out.pritnln("买鸡腿");
		System.out.pritnln("炸鸡腿");
		System.out.pritnln("吃鸡腿");
		System.out.pritnln("洗手");
	}
	/**
		打游戏的方法
	*/
	public static void playGame(){
		System.out.pritnln("安装游戏");
		System.out.pritnln("打开游戏");
		System.out.pritnln("登录账号");
		System.out.pritnln("玩游戏");
	}
	
}