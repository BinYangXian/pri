package day19.propertiesTest
;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;







import day18.homework.IoCloseUtil;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 需求：把多个注册用户的用户名和密码存储在文件中长期保存起来
方式1：
以下格式：
-------------------------------------
#用户信息列表
#用户名及用户密码
zhangsan1-111
zhangsan2-222
zhangsan3-333
zhangsan4-444
-------------------------------------
需要把文件中的用户信息读取到程序中,检查当前的登录是否成功。
用map容器存储（key：用户名，value：密码）
思路：1）buffererdReader读取行，2）每一行按"-"分割 3）装入map

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
		 */
		app();
	}
	/**
	 * 模拟用户注册
	 */
	private static void app() {
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
		Map<Object,Object> map=  readRegFileInfoToMap();
		System.out.println("原来存储的用户名和密码："+map);
		
		/**
		 * 3）新的用户名和密码装入map
		 */
		map.put(uname, pwd);
		
		/**
		 * 4）存储用户名和密码到文件
		 */
		writeRegInfoToFile(map);
		
		
	}
	/**
	 * 存储用户名和密码到文件
	 * @param map
	 */
	private static void writeRegInfoToFile(Map<Object, Object> map) {

//		 a）创建数据源
		File file =new File("src/day19/propertiesTest/userRegInfo.txt");
//	     b）通过数据源创建需要的输出流
		BufferedWriter bw=null;
		try {
			bw=new BufferedWriter(new FileWriter(file));
//		     c）创建要写出的数据
//		     d）通过流把数据写到对应的数据源
			bw.write("#用户信息列表");
			bw.newLine();
			bw.write("#用户名及用户密码");
			bw.newLine();
			for (Object key : map.keySet()) {
				Object val=map.get(key);
				//写出
				bw.write(key+"-"+val);
				//换行
				bw.newLine();
			}
//		     e）刷新流flush（如果需要数据-立即传入到数据源时，则需要调用）
			bw.flush();
			System.out.println("注册完成！");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
//		     f）关闭流close
			IoCloseUtil.close(bw);
		}
	}
	/**
	 * 把文件里的用户名和密码读取到程序中
	 * ->手动通过流操作完成！
	 * @return
	 */
	private static Map<Object, Object> readRegFileInfoToMap() {
		
//			 a）创建数据源
		File file =new File("src/day19/propertiesTest/userRegInfo.txt");
//		     b）通过数据源创建需要的输入流
		BufferedReader br=null;
		//map
		Map<Object, Object> map=new HashMap<Object, Object>();
		try {
			br=new BufferedReader(new FileReader(file));
//		     c）通过流从对应的数据源循环读取数据
			String buff;
			while ((buff=br.readLine())!=null) {
//			     d）处理读取的数据
//				#用户名及用户密码
//				zhangsan1-111
				if(!buff.startsWith("#")){//排除注释
//					zhangsan1-111
					String[] arr=buff.split("-");
					String uname=arr[0];
					String pwd=arr[1];
					map.put(uname, pwd);
				}
			}
			//返回map
			return map;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
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
