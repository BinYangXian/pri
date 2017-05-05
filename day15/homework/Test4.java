package day15.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test4 {
	public static void main(String[] args) {
		/**
		 * List基础练习

1、定义一个Person类 name 和 age两属性
2、创建n(假设为5)个person对象，（
name 柳岩1 age 10
name 柳岩2 age 20
name 柳岩3 age 30
name 柳岩4 age 40
name 柳岩5 age 50
）
3、分别添加到list容器中
4、删除容器里的【name 柳岩5 age 50】元素
5、把第4个位置的元素设置为新的Person对象（name 柳岩444 age  44），
6、把list容器中所有人的【名字】打印到控制台
a）普通for ->利用 下标
b）增强for 
c）Iterator
		 */
		//list容器-装person
		List<Person> list=new ArrayList<Person>();
		//2
		for (int i = 1; i <= 5; i++) {
			//创建person
			Person p=new Person("柳岩"+i, i*10);
			//3 装入list
			list.add(p);
		}
		System.out.println("list数据1："+list);
		//4 -删除容器里的【name 柳岩5 age 50】元素
		//通过内容删除
		list.remove(new Person("柳岩5", 50));
		System.out.println("list数据2："+list);
		//5、把第4个位置的元素设置为新的Person对象（name 柳岩444 age  44），
		list.set(3, new Person("柳岩444", 44));
		System.out.println("list数据3："+list);
//		6、把list容器中所有人的【名字】打印到控制台
//		a）普通for ->利用 下标
		System.out.println("------普通for---------");
		for (int idx = 0; idx <= list.size()-1; idx++) {
			 //取出下标对应的当前的元素
			 Person curPerson= list.get(idx);
			 //打印名字
			 System.out.println(curPerson.name);
		}
		
//		b）增强for-》利用 list继承了Iterable（实现该接口就可以使用增强for）
		System.out.println("------增强for---------");
		for(Person curPerson :list){
			 //打印名字
			 System.out.println(curPerson.name);
		}
		/**
		 * Iterable:该接口规定了我们的实现类可以进行遍历（增强for）
		 * Iterator（迭代器-容器的管理者）：该接口规定了我们的实现类怎么进行遍历（怎么从容器取出元素数据）
		 *   a）hasNext 看有没有下一个元素
		 *   b）next   拿到下一个元素
		 *   
		 *  迭代器-遍历容器的步骤 
		 * a）通过容器找到容器的管理者（迭代器）
		 *   Iterator 管理者=  容器.iterator() ;
		   b）通过管理者循环访问容器的所有的数据
		        1）  管理者.hasNext  ->有没有下一个元素   true
		   		2）  管理者.next  ->拿到下一个元素   
		   		1）  管理者.hasNext  ->有没有下一个元素   true
		   		2）  管理者.next  ->拿到下一个元素   
		   		...
		   		1）  管理者.hasNext  ->有没有下一个元素   false
		 * 
		 */
//		c）Iterator（迭代器）
		System.out.println("------Iterator---------");
		//a）通过容器找到容器的管理者（迭代器）
		Iterator<Person> it= list.iterator();
		//b）通过管理者循环访问容器的所有的数据
		while(it.hasNext()){//1)看有没有下一个元素
			Person curPerson= it.next();//2)拿到下一个元素   
			//打印名字
			System.out.println(curPerson.name);
		}
		
	}
}
//1
class Person{
	String name ;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "\nPerson [name=" + name + ", age=" + age + "]";
	}
	
	
	/**
	 * 比较内容：名字和年龄
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}