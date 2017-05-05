package day9.homework.test2;

import day9.homework.test1.NorthPerson;
import day9.homework.test1.SichuanPerson;


public class Test1 {
	public static void main(String[] args) {
		/**
		 * 1、继承+重写+访问修饰符：
设计如下类

在test1包下建立
普通人类
四川人类
北方人类
在test2包下建立
测试类
b）普通人类加入有一个睡觉的功能 protected修饰，四川人和北方人都继承了。
c）四川人睡觉和普通人一样，北方人睡在炕上。注意：死循环。
d）在测试类中创建四川人的对象和北方人的对象，使用睡觉功能
		 */
		//四川人
		SichuanPerson sp=new SichuanPerson();
		//四川人睡觉
		sp.sleep2();
		
		//北方人
		NorthPerson np=new NorthPerson();
		//睡觉
		np.sleep();
		
	}
}
