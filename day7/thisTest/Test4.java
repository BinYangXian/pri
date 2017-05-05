package day7.thisTest;

public class Test4 {
	
	
	public static void main(String[] args) {
		/**
		 * this关键字有什么用？
        在我们用某个对象调用成员方法（构造块，构造器）时，有时候需要在【方法内部】访问当前对象的资源（属性和方法），
可以通过this来进行访问，this可以省略。

		this概念
		1）系统定义好的【引用类型的变量】
		2）类型是this所在【当前类】的类型
		3）this所指向的对象-是【当前对象】-》调用了（成员方法，构造块，构造器）的当前的对象。
		 */
		
		
		//周杰伦对象
		Worker4 w1=new Worker4("周杰伦",17 );
		//李冰冰对象
		Worker4 w2=new Worker4( "李冰冰",18);
		
		//17岁的周杰伦上班 
		w1.goWork();
		//18岁的李冰冰上班 
		w2.goWork();
				
	}
	
}
/**
 *工作者
 */
class Worker4{
	
	//成员变量-每个上班的人，都有名字和年龄
	String name;
	int age;
	//构造器-初始化名字和年龄
	public Worker4(String name2, int age2) {
		name = name2;
		age = age2;
	}
	
	/**
	 * 上班的功能
	 * 当前功能-需要用到当前上班的人
	 * -》这里上班的人-需要传入的是-gowork方法的当前调用对象【当前对象】
	 * -》不需要参数传入
	 * -》直接通过this访问
	 */
	/**
	 * 使用工作的人多个信息-》直接把工作的人作为对象传入
	 * -》需要的数据-从对象取出来
	 * 
	 */
	public void goWork(){
		
		System.out.println("----------");
		System.out.println(this.age+"岁的 "+this.name+"开始上班了");
		//赶车-》当前上班的人（this）-去赶车
		this.takeBus();
		//工作-》当前上班的人（this）-去工作
		//省略this. 
		working();//等价于- this.working();
	}
	
	//赶车
	public void  takeBus(){
		System.out.println(this.age+"岁的 "+this.name+"赶车1");
		//this可以省略
		System.out.println(age+"岁的 "+name+"赶车2");
		System.out.println(age+"岁的 "+name+"赶车3");
	}
	//工作
	public void  working(){
		System.out.println(age+"岁的 "+name+"工作1");
		System.out.println(age+"岁的 "+name+"工作2");
		System.out.println(age+"岁的 "+name+"工作3");
	}
}
