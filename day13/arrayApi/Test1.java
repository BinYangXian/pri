package day13.arrayApi;

import java.util.Arrays;

import javax.management.RuntimeErrorException;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * Arrays类：封装了数组常见操作的工具方法
对数组里的内容做一定处理满足业务要求

a）数组里所有元素转字符串
    Arrays.toString

b）数组填充-初始化
    Arrays.fill

c）数组copy 
    System.arraycopy
    Arrays.copyOf

d）数组排序
    Arrays.sort(a);
怎么实现对引用类型排序（？？？）
    1)comparable接口
    2)comparator接口(自学)

f）二分法查找（自学）
    Arrays.binarySearch

g）asList（学了容器说）

		 */
		dome3();
	}
	/**
	 * d）数组排序
    Arrays.sort(a);
怎么实现对引用类型排序（？？？）
    1)comparable接口
    2)comparator接口(自学)
	 */
	private static void dome3() {
		/**
		 * 基本类型排序直接使用
		 */
		//成绩数组
		long [] scoreArr=new long[]{60,50,90,120,40};
		//-排序
		Arrays.sort(scoreArr);
		System.out.println("基本类型-排序后："+Arrays.toString(scoreArr));
		/**
		 * 引用类型排序不能直接使用--》在排序的时候-需要比较大小
		 * --》需要提供比较大小的方法（功能）
		 */
		Student[] stuArr1=new Student[]{
			new Student("刘德华", 80, 2001111),
			new Student("周星驰", 90, 1001111),
			new Student("赵子龙", 60, 3001111),
			new Student("曾小贤", 100, 4001111)
		};
		//排序
		//Arrays.sort(stuArr1);
		System.out.println("引用类型-排序后："+Arrays.toString(stuArr1));
		/**
		 * 引用类型排序的步骤--》在排序的时候-需要比较大小-对应的元素的类需要提供比较的功能
		 * 
		 * 1）数组元素类实现-Comparable接口——》表示元素类可以比较
		 * 2）数组元素类重写-compareTo方法-》提供具体比较的功能
		 * 3）再使用Arrays.sort(stuArr1)排序
		 */
		Student3[] stuArr2=new Student3[]{
			new Student3("刘德华", 80, 2001111),
			new Student3("周星驰", 90, 1001111),
			new Student3("赵子龙", 60, 3001111),
			new Student3("曾小贤", 100, 4001111)
		};
		//排序
		Arrays.sort(stuArr2);
		System.out.println("引用类型-排序后2："+Arrays.toString(stuArr2));
		
		
	}
	/**
	 * c）数组copy 
    System.arraycopy :用于数组指定范围内容copy，可以设置新数组copy的位置
    Arrays.copyOf：用于copy所有内容，新数组自动放入第一个位置
	 */
	private static void dome2() {
		//装QQ号的数组
		long [] qqNums=new long[3];
		//装qq号
		qqNums[0]=12345;
		qqNums[1]=66666;
		qqNums[2]=88888;
		//qqNums[3]=99999;//数组空间不足-下标越界
		/**
		 * 需求1：把原数组里所有的内容copy到新数组里-》第一位开始
		 */
		/**
		 *  System.arraycopy 实现
		 */
		//创建新数组
		long [] newQqNums=new long[5];
		//copy
		System.arraycopy(qqNums, 0, newQqNums, 0, qqNums.length);
		System.out.println("新数组内容："+Arrays.toString(newQqNums));
		/**
		 *  Arrays.copyOf 实现
		 */
		//copy
		long [] newQqNums2=Arrays.copyOf(qqNums, 6);
		System.out.println("新数组内容2："+Arrays.toString(newQqNums2));
		/**
		 * 需求2：把原数组里（第2-3个QQ号）copy到新数组里-》第2位置开始
		 */
		/**
		 * 只能 System.arraycopy 实现
		 */
		//创建新数组
		long [] newQqNums3=new long[8];
		//copy
		System.arraycopy(qqNums, 1, newQqNums3, 1, 2);
		System.out.println("新数组内容3："+Arrays.toString(newQqNums3));
		
	}
	/**
	 * 
	a）数组里所有元素转字符串
	    Arrays.toString
	
	b）数组填充-初始化
	    Arrays.fill
	 */
	private static void dome1() {
		/**
		 * a
		 */
		//明星数组
		String[] starArr=new String[]{"柳岩","李冰冰","古力娜扎"};
		//查看数组的信息
		//数组转字符串
		/**
		 * 方式1：object的toString -》不能完成-数组没有重写toString
		 */
		String arrInfo1=starArr.toString();
		System.out.println("数组信息1："+arrInfo1);
		
		/**
		 *  方式2：Arrays.toString
		 */
		String arrInfo2=Arrays.toString(starArr);
		System.out.println("数组信息2："+arrInfo2);
		
		/**
		 * b
		 */
		//明星数组
		String[] starAr2r=new String[6];
		/**
		 * 需要把：第2到第5个位置-设置为-古力娜扎
		 */
		/**
		 *  方式1：手动循环完成
		 */
		for (int idx = 1; idx <=4; idx++) {
			//当前位置-设置古力娜扎
			starAr2r[idx]="古力娜扎";
		}
		System.out.println("数组信息3："+Arrays.toString(starAr2r));
		
		/**
		 *  方式2：
		 *  通过Arrays.fill完成
		 */
		Arrays.fill(starAr2r, 1, 5, "古力娜扎2");
		System.out.println("数组信息4："+Arrays.toString(starAr2r));
		
	}
}
class Student{
	String name;
	int score;
	long money;
	public Student(String name, int score, long money) {
		super();
		this.name = name;
		this.score = score;
		this.money = money;
	}
	@Override
	public String toString() {
		return "\nStudent [name=" + name + ", score=" + score + ", money="
				+ money + "]";
	}
	
}
//自己提供比较功能-系统不知道该功能-不能实现
class Student2{
	String name;
	int score;
	long money;
	public Student2(String name, int score, long money) {
		super();
		this.name = name;
		this.score = score;
		this.money = money;
	}
	/**
	 * 比较两个Student2对象功能
	 * 比较的对象：this和传入对象other
	 * 比较结果：
	 * 大于
	 * 小于
	 * 等于
	 * 
	 * 需求：分数高-学生大
	 */
	public String bijiao(Student2 other){
		if(this.score>other.score){
			return "大于";
		}
		if(this.score<other.score){
			return "小于";
		}
		return "等于";
	}
}
//实现Comparable重写compareTo功能实现比较
class Student3 implements Comparable{
	String name;
	int score;
	long money;
	public Student3(String name, int score, long money) {
		this.name = name;
		this.score = score;
		this.money = money;
	}
	/**
	 * 比较两个Student3对象功能
	 * 比较的对象：this和传入对象other
	 * 比较结果：
	 * 大于
	 * 小于
	 * 等于
	 * 
	 * 需求：分数高-学生大
	 */
	@Override
	public int compareTo(Object other){
		
		if(other instanceof Student3){
			//转换为学生
			Student3 stu=(Student3) other;
			
			if(this.score>stu.score){
				return 1;
			}
			if(this.score<stu.score){
				return -1;
			}
			return 0;
		}
		//传入不是学生-不比较-抛异常
		throw new RuntimeException("传入不是学生-不比较");
	}
	@Override
	public String toString() {
		return "\nStudent3 [name=" + name + ", score=" + score + ", money="
				+ money + "]";
	}
	
	
}
