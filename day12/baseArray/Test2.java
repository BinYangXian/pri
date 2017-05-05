package day12.baseArray;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 
		 * 数组的注意点
    
    1）统一类型：存储的数组元素是统一的类型,可以类型兼容,自动类型转换
           a)基本类型:	小数据范围类型	转	大数据范围类型
           b)引用类型:	子类型	转	超类型
    2）长度固定：创建数组对象的时候，长度就设置好了以后不能改变
    3）数组下标-范围（0到len-1）-》访问的时候不能越界
     --》否则报错ArrayIndexOutOfBoundsException
    
    4）内存连续:数组底层内存区域是连续的，访问（读取和设置效率 高）
    5）存储在堆中：引用类型，每一个数组的对象都是存储在堆中
    
    6）数组的元素类型是引用类型，那么数组所有元素位置存储的是对象地址
    7）数组的超类型指向子类型
    满足：数组引用的数组元素的类型  是数组对象 的数组元素的类型的超类型
    8）Object也是数组的超类型
		 * 
		 */
		
		//6 
		Object[] objArr=new Object[3];
		//装入person
		objArr[0]=new Person("柳岩", 19);
		objArr[1]=new Person("古力娜扎", 17);
		//改柳岩的年龄-25
		((Person)objArr[0]).age=25;
		//7
		Exception [] arr1=new Exception[2];
		Exception [] arr2=new RuntimeException[2];
		//Exception [] arr3=new Throwable[2];
		//8
		Object[] objArr2=new Object[3];
		Object[] objArr3=new Exception[3];
		
		Object[] objArr4=new RuntimeException[3];
		Object objArr5=new RuntimeException[3];
		
	}
}
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
