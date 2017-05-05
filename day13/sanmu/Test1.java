package day13.sanmu;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 三目运算符
		 * 
		 * 语法：
		 * 布尔条件值 ?  值1:值2  
		 * 
		 * 结果值：
		 *   条件满足-》true -得到值1
		 *   条件不满足-》false -》得到值2
		 * 
		 * 作用：根据条件得到两个值中的一个值。
		 * 
		 * 选择性的为变量赋值
		 * 三目运算符解决：代码简洁，可读性差
		 * if else解决：代码复杂，可读性好
		 * 
		 */
		/**
		 * 根据用户控制台输入的工资，为工资级别变量赋值（
		 * a）工资>20000 "高富帅" 
		 * b） 5000<=工资<=20000 "白领"
		 * c) <5000  "屌丝"
		 * 
		 * 打印工资级别
		 */
		dome2();
	}
	/**
	 * 三目运算符 实现
	 */
	private static void dome2() {
		//提示
		System.out.println("请输入工资");
		//输入
		int sal= new Scanner(System.in).nextInt();
		//工资级别
		String salGrade;
		//根据工资赋值
		salGrade=(sal>20000? "高富帅": (sal<5000 ? "屌丝":"白领"));
		System.out.println("你所在的级别："+salGrade);
		
	}
	/**
	 * if else 实现
	 */
	private static void dome1() {
		//提示
		System.out.println("请输入工资");
		//输入
		int sal= new Scanner(System.in).nextInt();
		//工资级别
		String salGrade;
		//根据工资赋值
		if(sal>20000){//高富帅
			salGrade="高富帅";
		}
		else if(sal>=10000){//白领
			salGrade="白领";
		}else{//屌丝
			salGrade="屌丝";
		}
		System.out.println("你所在的级别："+salGrade);
		
	}
}
