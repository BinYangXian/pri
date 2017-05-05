package day19.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSyncTest {
public static void main(String[] args) {
	demo();
}
	private static void demo() {
		Person p1=new Person("yangyang",18);
}
	class Person{
		private String name;
		private int age;
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
	class SmallCave{
		public synchronized void passCave(Person person){
//			String date=""
			System.out.println(new SimpleDateFormat("开始时间："+"hh时mm分ss毫秒SS").format(new Date()));
			System.out.println(person+"正在过小山洞。");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(person+"已经通过小山洞。");
			System.out.println(new SimpleDateFormat("结束时间："+"hh时mm分ss毫秒SS").format(new Date()));
		}
	}
	class Flyover{
		public synchronized void passCave(Person person){
			System.out.println(person+"正在过Flyover。");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(person+"已经通过Flyover。");
		}
	}
	class BigRoad{
		public synchronized void passCave(Person person){
			System.out.println(person+"正在过BigRoad。");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(person+"已经通过BigRoad。");
		}
	}
}
