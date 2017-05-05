package day15.fanxing;

public class Test1 {
	public static void main(String[] args) {
		/**
		 *    定义一个Person类，有name和age属性
   a）需要装String 类型的name和int 类型的age
   b）需要装StringBuilder类型的name和short类型的age
   c）需要装char[]类型的name和byte类型的age

		 */
		dome1();
	}
	/**
	解决方式2：面向超类型编程
	--》Object
	-->存储具体类型的数据
	a）存储数据的时候-》不能自动类型检查
	b）取出类型的时候-》不能自动类型转换
	 */
	private static void dome1() {
//		 a）需要装String 类型的name和int 类型的age
		Person4 p1=new Person4();
		//存储名字-String可以存储
		p1.name="刘德华";
		/**
		 * a）存储数据的时候-》不能自动类型检查
		 */
		//存储名字-StringBuilder也可以存储--》不能实现a需求只存储String
		//p1.name=new StringBuilder("古力娜扎");
		
		/**
		 * b）取出类型的时候-》不能自动类型转换
		 */
		//取出名字的时候-希望用String，不能自动转
		String p1Name= (String) p1.name;
		
//		 b）需要装StringBuilder类型的name和short类型的age
	}
}
/**
解决方式2：面向超类型编程
--》Object
*/
class Person4{
	Object name;
	Object age;
}
/**
	解决方式1：面向具体类型编程
*/
class Person1{
	String name;
	int age;	
}
class Person2{
	StringBuilder name;
	short age;	
}
class Person3{
	char[] name;
	byte age;	
}
