package day7.thisTest;

public class Test2 {
	/**
	 * 需求：
	 * 实现
	 * 
	 * 17岁周杰伦上班的过程

17岁的周杰伦开始上班了
17岁的周杰伦赶车1
17岁的周杰伦赶车2
17岁的周杰伦赶车3
17岁的周杰伦工作1
17岁的周杰伦工作2
17岁的周杰伦工作3

18岁的李冰冰上班

18岁的 李冰冰开始上班了
18岁的李冰冰赶车1
18岁的李冰冰赶车2
18岁的李冰冰赶车3
18岁的李冰冰工作1
18岁的李冰冰工作2
18岁的李冰冰工作3
	 */
	
	public static void main(String[] args) {
		//周杰伦对象
		Worker2 w1=new Worker2("周杰伦",17 );
		//李冰冰对象
		Worker2 w2=new Worker2( "李冰冰",18);
		
		//17岁的周杰伦上班 
		w1.goWork(w1);
		//18岁的李冰冰上班 
		w2.goWork(w2);
				
	}
	
}
/**
 *工作者
 */
class Worker2{
	
	//成员变量-每个上班的人，都有名字和年龄
	String name;
	int age;
	//构造器-初始化名字和年龄
	public Worker2(String name2, int age2) {
		name = name2;
		age = age2;
	}
	
	/**
	 * 上班的功能
	 * 参数：当前上班的人curWorker
	 * Worker2 对象
	 * -》这里上班的人-需要传入的是-gowork方法的当前调用对象【当前对象】
	 */
	/**
	 * 使用工作的人多个信息-》直接把工作的人作为对象传入
	 * -》需要的数据-从对象取出来
	 * 
	 */
	public void goWork(Worker2 curWorker){
		System.out.println("----------");
		System.out.println(curWorker.age+"岁的 "+curWorker.name+"开始上班了");
		System.out.println(curWorker.age+"岁的 "+curWorker.name+"赶车1");
		System.out.println(curWorker.age+"岁的 "+curWorker.name+"赶车2");
		System.out.println(curWorker.age+"岁的 "+curWorker.name+"赶车3");
		System.out.println(curWorker.age+"岁的 "+curWorker.name+"工作1");
		System.out.println(curWorker.age+"岁的 "+curWorker.name+"工作2");
		System.out.println(curWorker.age+"岁的 "+curWorker.name+"工作3");
	}
	
}
