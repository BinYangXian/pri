package day16.fangxing2;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 泛型的分类
 1）泛型类--》泛型参数定义到类中
 2）泛型接口--》泛型参数定义到接口中
-》类和接口定义的泛型参数-》只能用在成员的结构--静态的不能使用

 3）泛型方法--》泛型参数定义到方法中
泛型方法
--》主要用于静态方法

 ---》使用泛型方法的过程
1)在[方法]里定义[泛型参数]
语法:->定义方法的时候->指定方法内使用的泛型参数
 [访问修饰符] [static]  [<泛型参数1,泛型参数2...>]   viod|返回值类型   方法名(方法参数列表){}
 
 
2)在[方法]中使用泛型参数代替[类型]
使用位置:1)返回值类型2)参数类型3)方法内局部变量类型

3)在使用(调用)[方法]的时候传入并确定泛型参数的[类型].
 语法1:(成员方法)
对象引用.<具体类型1,具体类型2...>方法名(实际参数);

        语法2:(静态方法)
       类名或接口名.<具体类型1,具体类型2...>方法名(实际参数);
       
方法的泛型参数-可以自动匹配-只需要所有的使用泛型参数的位置->类型兼容就可以  
		 * 
		 */
		
		dome1();
	}
	private static void dome1() {
		//test1方法里nametype是String类型
		//Test1.<String>test1(111);//长如int不匹配String
		Test1.<String>test1("111");
		
		//test1方法里nametype是Long类型
		Test1.<Long>test1(111L);
		
		Long l1= Test1.<Long>test1(111L);
//		String l2= Test1.<Long>test1(111L);//返回是long
	}
	/**
	 * 泛型参数的方法
	 */
	public static <NameType> NameType test1(NameType name ){
		NameType name2;
		
		return null;
	}
	
	
}