package day19.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import day18.homework.IoCloseUtil;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 编写程序完成如下需求

1）将如下Person类的20个对象序列化到本地文件person.data文件中
Person(name:熊二1，age：20)
Person(name:熊二2，age：21)
......
Person(name:熊二19，age：38)
Person(name:熊二20，age：39)
2）再把person.data文件反序列化，把所有Person对象从文件中取出来，并拼装为如下格式信息，
写到文件person.txt（gbk字符集）中。
注意！这里每个人信息之间有换行符，最后一个人后不能有换行符（一共19个换行符）
----------------------------
名字:熊二1_年龄：20
名字:熊二2_年龄：21
......
名字:熊二19_年龄：38
名字:熊二20_年龄：39
----------------------------
		 */
		dome2();
	}
	
	private static void dome2() {
//	  	 a）创建数据源
	File fileIn=new File("src/day19/homework/person.data");
	File fileOut=new File("src/day19/homework/person.txt");
	
	ObjectInputStream ois=null;
	BufferedWriter bw=null;
	try {
//	     b）通过数据源创建需要的输入输出流
		ois=new ObjectInputStream(new FileInputStream(fileIn));
		bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOut), "gbk"));
		
//	     c）通过输入流读取数据
		List<Person> list= (List<Person>) ois.readObject();
//	     d）通过输出流写出数据
		for (int idx=0;idx<=list.size()-1;idx++) {
			//写出人的信息
			bw.write(list.get(idx).toString());
			//最后一个不换行
			if(idx!=list.size()-1){
				bw.newLine();
			}
		}
		//e）刷新数据
		bw.flush();
		System.out.println("写出数据完成！");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
//	     f）关闭流close
		IoCloseUtil.close(ois);
	}
}

	private static void dome1() {
//		  	 a）创建数据源
		File file=new File("src/day19/homework/person.data");
		ObjectOutputStream oos=null;
		try {
//		     b）通过数据源创建需要的输出流
			oos=new ObjectOutputStream(new FileOutputStream(file));
//		     c）创建要写出的数据
			List<Person> list=new ArrayList<Person>();
			for (int i = 1; i <=20; i++) {
				Person p=new Person("熊二_"+i, i+19);		
				list.add(p);
			}
//		     d）通过流把数据写到对应的数据源
			oos.writeObject(list);
//		     e）刷新流flush（如果需要数据-立即传入到数据源时，则需要调用）
			oos.flush();
			System.out.println("写出数据完成！");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
//		     f）关闭流close
			IoCloseUtil.close(oos);
		}
	}
}
class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "名字:" + name + "_年龄：" + age ;
	}
	
}
