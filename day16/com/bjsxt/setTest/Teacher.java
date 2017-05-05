package com.bjsxt.setTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Teacher {
	private String name;
	private int age;
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
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
	public static void main(String[] args) {
		Set<Teacher> teacherSet=new HashSet<Teacher>();
		teacherSet.add(new Teacher("��־��1",10));
		teacherSet.add(new Teacher("��־��2",20));
		teacherSet.add(new Teacher("��־��3",10));
		teacherSet.add(new Teacher("��־��4",20));
		teacherSet.add(new Teacher("��־��5",10));
		//��ǿfor ����set��
		for (Teacher teacher : teacherSet) {
			System.out.println(teacher);
		}
		//ɾ��set������ָ��Ԫ�غ�
		teacherSet.remove(new Teacher("��־��3",10));
		System.out.println(teacherSet);
		//������ ����set��
		Iterator<Teacher> iterator = teacherSet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}
}
