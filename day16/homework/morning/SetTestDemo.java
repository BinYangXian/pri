package day16.homework.morning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTestDemo {
public static void main(String[] args) {

	Set<Teacher> set = new HashSet<>();
	for (int i = 1; i < 6; i++) {
		Teacher t = new Teacher();
		t.setName("林志玲"+i);
		if(i % 2 ==0){
			t.setAge(20);
		}
		t.setAge(10);
		set.add(t);
	}
	System.out.println(set);
	//删除set容器的元素(name 林志玲3 age 10)
	set.remove(new Teacher("林志玲3", 20));
	System.out.println("-------------foreach-------------------");
	for (Teacher teacher : set) {
		System.out.println(teacher);
	}
	System.out.println("-------------iterator-------------------");
	Iterator<Teacher> iter = set.iterator();
	while (iter.hasNext()) {
		System.out.println(iter.next());
	}
}
}
class Teacher{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Teacher() {
		super();
	}
	@Override
	public String toString() {
		return "\nTeacher [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}