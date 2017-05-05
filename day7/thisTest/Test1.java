package day7.thisTest;

public class Test1 {
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
		//17岁的周杰伦上班 
		Worker w1=new Worker();
		w1.goWork(17, "周杰伦");
		//18岁的李冰冰上班 
		Worker w2=new Worker();
		w2.goWork(18, "李冰冰");
				
	}
	
}
/**
 *工作者
 */
class Worker{
	
	/**
	 * 上班的功能
	 * 参数：
	 * age：上班人的年龄
	 * name：上班人的名字
	 */
	/**
	 * 使用工作的人多个信息，分别作为参数传入
	 * 
	 */
	public void goWork(int age,String name){
		System.out.println("----------");
		System.out.println(age+"岁的 "+name+"开始上班了");
		System.out.println(age+"岁的 "+name+"赶车1");
		System.out.println(age+"岁的 "+name+"赶车2");
		System.out.println(age+"岁的 "+name+"赶车3");
		System.out.println(age+"岁的 "+name+"工作1");
		System.out.println(age+"岁的 "+name+"工作2");
		System.out.println(age+"岁的 "+name+"工作3");
	}
}
