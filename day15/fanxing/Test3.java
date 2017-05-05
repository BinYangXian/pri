package day15.fanxing;

public class Test3 {
	public static void main(String[] args) {
	
	}
}

class Person6<NameType> implements Comparable {
	NameType name;
	int age;
	@Override
	public int compareTo(Object o) {
		return 0;
	}	
}

class Person7<NameType> implements Comparable<Object> {
	NameType name;
	int age;
	/**
	 * 比较年龄
	 */
	@Override
	public int compareTo(Object o) {
		if(o instanceof Person7){
			Person7 other=(Person7) o;
			if(this.age>other.age){
				return 1;
			}
			if(this.age<other.age){
				return -1;
			}
			return 0;
		}
		//不是Person7-抛异常
		throw new RuntimeException("传入的数据不是person7不比较");
		
	}	
}

class Person8<NameType> implements Comparable<Person8> {
	NameType name;
	int age;
	/**
	 * 比较年龄
	 */
	@Override
	public int compareTo(Person8 other) {
		if(this.age>other.age){
			return 1;
		}
		if(this.age<other.age){
			return -1;
		}
		return 0;
	}	
}