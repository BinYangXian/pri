package day9.superTest;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * this和super对比
		 * 1）指向的对象：都是当前对象
		 * 2）调用资源 
		 *   this：a）当前类  b）当前类的父类  c）继承链上其他类
		 *   super：b）当前类的父类  c）继承链上其他类
		 * 3）使用的位置：成员的（成员方法，构造器。。。不能在静态结构使用）
		 * 
		 * 
		 * super的作用
		 * 1）继承链和当前类有同名的属性--想要调用继承链的-》super
		 * 2）继承链和当前类有同名的方法（方法重写）--想要调用继承链的-》super
		 * 3）super（父类构造器参数）-》调用父类指定的构造器
		 * 
		 */
		//来一个四川人-测试this和super
		new SichuanPerson().testThisAndSuper();
	}
}
/**
动物
睡觉：a）闭上眼睛 b）睁开眼前 c）睡了一觉

人
睡觉：a）闭上眼睛 b）睁开眼前 c）睡了一觉
学习：活到老，学到老

四川人
睡觉：a）玩手机  b）闭上眼睛 c）睁开眼前 d）睡了一觉
e）洗脸精神一下
玩游戏：玩lol。。。决战到天亮   
*/
class SichuanPerson extends Person{
	/**
	 * 对比：this和super调用的资源
	 */
	public void testThisAndSuper(){
		//使用当前对象-玩游戏
		this.playGame();
		//super.playGame();
		//使用当前对象-四川人-睡觉
		this.sleep();
		//使用当前对象-人-睡觉
		super.sleep();
		//使用当前对象-人的-sleepAnimal睡觉
		this.sleepAnimal();
		super.sleepAnimal();
		
	}
//	睡觉：a）玩手机  b）闭上眼睛 c）睁开眼前 d）睡了一觉
//	e）洗脸精神一下
	@Override
	public void sleep(){

		System.out.println("玩手机");
		
		//使用person的sleep
		super.sleep();
		
		System.out.println("洗脸精神一下");
		
	}
//	玩游戏：玩lol。。。决战到天亮   
	public void playGame(){
		System.out.println("玩lol。。。决战到天亮 1");
		System.out.println("玩lol。。。决战到天亮 2");
	}
	
	
}
class Animal{
	//睡觉：a）闭上眼睛 b）睁开眼前 c）睡了一觉
	public void sleep(){
		System.out.println("动物的睡觉");
		System.out.println("闭上眼睛");
		System.out.println("睁开眼前");
		System.out.println("睡了一觉");
	}
}
class Person extends Animal{
	//睡觉：a）闭上眼睛 b）睁开眼前 c）睡了一觉
	//继承得到
	//学习：活到老，学到老
	public void study(){
		System.out.println("活到老，学到老1");
		System.out.println("活到老，学到老2");
	}
	
	//睡觉：a）闭上眼睛 b）睁开眼前 c）睡了一觉
	public void sleep(){
		System.out.println("人的睡觉");
		System.out.println("闭上眼睛");
		System.out.println("睁开眼前");
		System.out.println("睡了一觉");
	}
	//动物睡觉：a）闭上眼睛 b）睁开眼前 c）睡了一觉
	public void sleepAnimal(){
		//动物睡觉
		super.sleep();
	}
		
	
}
