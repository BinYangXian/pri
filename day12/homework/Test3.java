package day12.homework;

public class Test3 {
	public static void main(String[] args) {
		/**
		 * 1、编程实现：
a）定义一个Person类，有属性name和age，重写toString要求表示出name和age信息。
b）定义一个Cat类，有属性name和color，重写toString要求表示出name和color信息。
c）定义一个长度为10的数组，要求既可以装person又可以装cat的对象。
d）循环创建5个name和age不同的Person对象，装入数组对象里。
e）循环创建5个name和color不同的Cat对象，装入数组对象里。
f）遍历打印数组所有数组元素的toString信息。
提示：不同的Person对象-可以利用下标，随机数等。。。
		 */
		//c 
		Object [] objArr=new Object[10];
		//d 
		for (int i = 0; i <5; i++) {
			//创建person
			Person p=new Person("古力娜扎"+i, i*10);
			//放入数组
			objArr[i]=p;
		}
		//e 
		for (int i = 5; i <=objArr.length-1; i++) {
			//颜色-奇数-白色 -偶数-黑色
			String color;
			if(i%2!=0){
				color="白色";
			}else{
				color="黑色";
			}
			//创建cat
			Cat c=new Cat("汤姆猫"+i,color);
			//放入数组
			objArr[i]=c;
		}
		//f）遍历打印数组所有数组元素的toString信息。
		for (int i = 0; i < objArr.length; i++) {
			//当前person或者cat
			Object obj = objArr[i];
			//打印toString
			System.out.println(obj.toString());
//			System.out.println(obj);
		}
		
		
	}
}
//a
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
// b
class Cat{
	String name;
	String color;
	public Cat(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + "]";
	}
	
}
