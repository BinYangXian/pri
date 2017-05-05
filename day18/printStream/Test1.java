package day18.printStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import day18.homework.IoCloseUtil;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 打印流-（处理流-装饰模式的-装饰对象）
		 * 
		 * 打印流PrintStream,PrintWriter （输出流）
		 * 
		 * 两者主要区别：
    a）超类型不同
        PrintStream：继承OutputStream，传输的最基本数据是byte
        PrintWriter ：继承Writer，传输的最基本数据是char
    b）自动flush机制有点不同
        PrintStream ：输出byte数组、调用println方法、输出换行符或者byte值10（即\n）时自动调用flush方法。
        PrintWriter： 仅在调用println方法时发生auto flushing。
		 * 
		 * 
		 * 增加功能：把【程序的数据】【基本类型-引用类型】  以    【字符串】  的方式  【打印到】【数据源】
		 * -》数据源的数据是字符串，可以看懂
		 * 数据转字符串
		 * a）基本类型：值的字符串
		 * b）引用类型：toString的字符串
		 * 
		 * 
		 * 新api：-使用新api不能面向超类型编程
		 * print(基本类型-引用类型的数据);   打印数据
		 * println(基本类型-引用类型的数据); 打印数据，打印换行
		 * 
		 */
		dome1();
	}
	/**
	 * 把程序中的数据
	 * short age=30
	 * boolean isMrrayed=true;
	 * Person p1=new Person("柳岩",18);
	 * Person p2=new Person("李冰冰",19);
	 * 
	 * 打印（输出）到文件test1.txt中 (存储为字符数据-用户可以看懂)
	 */
	private static void dome1() {
//		   	 a）创建数据源
			File file=new File("src/day18/printStream/test1.txt");
//		     b）通过数据源创建需要的输出流
			PrintStream ps=null;
			try {
				//true-》自动刷新  gbk-新文件的编码方式
				ps=new PrintStream(new FileOutputStream(file),true,"gbk");
//			     c）创建要写出的数据
				short age=30;
				boolean isMrrayed=true;
				Person p1=new Person("柳岩",18);
				Person p2=new Person("李冰冰",19);
//			     d）通过流把数据写到对应的数据源
				ps.print("姓名：");
				ps.println(age);
				ps.print("是否结婚：");
				ps.println(isMrrayed);
				ps.print("人信息1：");
				ps.println(p1);
				ps.print("人信息2：");
				ps.println(p2);
				
//			     e）刷新流flush（如果需要数据-立即传入到数据源时，则需要调用）
				ps.flush();
				System.out.println("输出完成！");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
//			     f）关闭流close
				IoCloseUtil.close(ps);
			}
	}
}
//人类
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "人类 [名字=" + name + ", 年龄=" + age + "]";
	}
	
}