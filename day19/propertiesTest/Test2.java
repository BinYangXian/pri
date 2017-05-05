package day19.propertiesTest
;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;













import day18.homework.IoCloseUtil;

public class Test2 {
	public static void main(String[] args) throws Exception {
		/**
		 *
一、Properties特点

1）实现了map接口
2）继承Hashtable  键值都不为null
3）键与值 只能为字符串，其他类型不能与文件交互
4）存在大量的新增方法，不建议发生多态

二、与文件交互 
a)对应.properties文件
   格式：
      1）#后面跟注释
      2）一行一个键值对（格式：键=值）
例如：
-----------------------
#这是注释
zhangsan=张三
lisi=李四
-----------------------

Properties新增添加和读取数据的方法（只能是String类型）

 Object setProperty(String key, String value)
          调用 Hashtable 的方法 put。 
 String getProperty(String key)
          用指定的键在此属性列表中搜索属性。 
b）存储：把Properties 对象数据写入到文件。
            注意：此时Properties对象必须键值都是String，不然classCastException。
   
   store(OutputStream out, String comments)  采用ISO 8859-1字符集
   store(Writer writer, String comments)
 
c）读取：把文件数据读取到Properties 对象中。
            注意：此时会把文件里所有键值对追加放入Properties对象中，不会
清除原有Properties 对象。
   
   load(InputStream inStream)   采用ISO 8859-1字符集
   load(Reader reader)

		 */
		app();
	}
	/**
	 * 模拟用户注册
	 */
	private static void app()  throws Exception{
		/**
		 * 1）用户输入用户名和密码
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入用户名：");
		String uname= sc.next();
		System.out.println("请输入密码：");
		String pwd= sc.next();
		
		/**
		 * 2）把文件里的用户名和密码读取到程序中
		 */
		Properties ps=  readRegFileInfoToMap();
		System.out.println("ps原来存储的用户名和密码："+ps);
		
		/**
		 * 3）新的用户名和密码装入map
		 */
//		ps.put(uname, pwd);
//		ps.put(111, 222);//不建议put-错误的不是String的数据也可以写进去，存储store会报错
		ps.setProperty(uname, pwd);
//		ps.setProperty(111, 222);
		
		/**
		 * 4）存储用户名和密码到文件
		 */
		writeRegInfoToFile(ps);
		
		
	}
	/**
	 * 存储用户名和密码到文件
	 * @param map
	 */
	private static void writeRegInfoToFile(Properties ps) throws Exception{

//	     a）创建连接到文件字符输出流
		Writer fw=new FileWriter(new File("src/day19/propertiesTest/userRegInfo2.properties"));
		//b）把properties容器（map）的键值对写出到对应输出流的数据源（文件）
		ps.store(fw, "这是用户信息，用户名和密码-（注释不能中文）this comments");
		System.out.println("存储注册数据完成！");
	}
	/**
	 * 把文件里的用户名和密码读取到程序中
	 * ->Properties load完成！
	 * @return
	 */
	private static Properties readRegFileInfoToMap() {
		
		Reader isr=null;
		try {
			//a）创建properties容器（map）
			Properties ps=new Properties();
			//b）创建一个连接到文件的字符输入流
			File file =new File("src/day19/propertiesTest/userRegInfo2.properties");
			isr=new InputStreamReader(new FileInputStream(file), "gbk");
			//c)通过properties的load把reader的数据加载到容器中
			ps.load(isr);
			//d）返回map（properties）
			return ps;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			IoCloseUtil.close(isr);
		}
		return null;
	}
}
