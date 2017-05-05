package exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import util.IoCloseUtil;


public class Test7 {
	public static void main(String[] args) {
		/**
		 * 7、编写程序，满足如下需求：  
建立"gbk"编码文件“users.text”内容如下，存储了各人员各年龄的工资信息。
----------------------
键				  值
				姓名 年龄 工资
张飞				张飞-18-5000
熊大				熊大-20-15000
...				关羽-20-20000
				赵云-19-6000
				诸葛亮-19-30000           
----------------------
利用list，set，map容器解决下面需求
1）建立类Person，用其对象来描述某人某年龄的工资信息。
2）把文件里每一行的信息存储在Person对象中，把文件所有行数据存储在Map<String,Person>容器中。
键：人的名字；值：人对应的Perosn对象。
3）把map容器里所有人的年龄取出来放入list或set年龄容器中，再遍历年龄容器打印所有年龄，要求年龄不能重复。
4）把map容器里所有人的工资取出来放入list或set工资容器中，工资可以重复,把工资升序排列。再遍历打印所有工资。
		 */
		Map<String, Person> map= dome2();
		System.out.println("map的内容："+map);
		
	}

	private static Map<String, Person> dome2() {
//		     a）创建数据源
		File file=new File("src/exam/users.text");
//		     b）通过数据源创建需要的输入流
		BufferedReader br=null;
		try {
			br=new BufferedReader(new InputStreamReader(new FileInputStream(file), "gbk"));

//		     c）通过流从对应的数据源循环读取数据
			String buff;
			//map
			Map<String, Person> map=new HashMap<String, Person>();
			while ((buff=br.readLine())!=null) {
//			     d）处理读取的数据
				//姓名 年龄 工资
				//张飞-18-5000
				//排除表头
				if(buff.contains("-")){
					//张飞-18-5000
					String[]arr= buff.split("-");
					String name=arr[0];
					int age=Integer.parseInt(arr[1]);
					int sal=Integer.parseInt(arr[2]);
					Person p=new Person(name, age, sal);
					//加入map中
					map.put(p.name, p);
				}
			}
			//返回
			return map;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
//		     e）关闭流close
			IoCloseUtil.close(br);
			
		}
		return null;
	}
}
//1
class Person{
	String name;
	int age;
	int sal;
	public Person(String name, int age, int sal) {
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
}
