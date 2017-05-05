package day16.homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 
1、定义一个Teacher类 name 和 age两属性
2、循环创建n(假设为20)个Teacher对象，（
name 林志玲1 age 10
name 林志玲2 age 20
name 林志玲3 age 10
name 林志玲4 age 20
name 林志玲5 age 10
.......
）
3、分别添加到set容器中
4、删除set容器的元素(name 林志玲3 age 10)
提示！删除的时候，根据对象内容相同认为是相同对象，怎么判断对象内容相同？重写object某方法！
5、两种方式遍历set对象
		 */
		//set容器装teacher
		Set<Teacher> set=new HashSet<Teacher>();
		//2
		//控制年龄的布尔变量 true代表10  false 20
		boolean bAge=true;
		for (int i = 1; i <= 20; i++) {
			//得到现在的年龄
			int age= bAge?10:20;
			//下一次的年龄需要切换
			bAge=!bAge;
			//得到名字
			String name="林志玲"+i;
			//创建teacher
			Teacher tc=new Teacher(name, age);
			// 3 加入set
			set.add(tc);
		}
		System.out.println("set数据1:"+set);
		//4、删除set容器的元素(name 林志玲3 age 10)
		set.remove(new Teacher("林志玲3", 10) );
		System.out.println("set数据2:"+set);
		//5、两种方式遍历set对象
		System.out.println("--迭代器---");
		//a)找到set容器的管理者（迭代器）
		Iterator<Teacher> it= set.iterator();
		//b）通过管理者-遍历元素
		while(it.hasNext()){//有没有下一个元素
			//拿到下一个元素
			Teacher tc= it.next();
			System.out.println(tc);
		}
	}
}
class Teacher{
	String name;
	int age;
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "\nTeacher [name=" + name + ", age=" + age + "]";
	}
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
		Teacher other = (Teacher) obj;
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
