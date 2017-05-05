package xml.homework;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Test3 {
	public static void main(String[] args) throws Exception{
		dome1();
	}
	private static void dome1()throws Exception {
		//a）得到一个dom解析器的工厂
		DocumentBuilderFactory fac= DocumentBuilderFactory.newInstance();
		//b）通过工程得到dom解析器
		DocumentBuilder builder= fac.newDocumentBuilder();
		//c）通过dom解析器解析xml文件得到装数据Document对象
		File xmlFile=new File("src/xml/homework/test3.xml");
		Document dom=builder.parse(xmlFile);
		
		/**
		 * d）通过dom对象找到需要的数据
		 */
		//找到dom跟标记root
		Element root= dom.getDocumentElement();
		//找到root里的users标记
		Element users= (Element) root.getElementsByTagName("users").item(0);
		//找到users里所有的user
		NodeList userList= users.getElementsByTagName("user");
		//装user的list
		List<User> list=new ArrayList<User>();
		//遍历出所有的user
		for (int i = 0; i <userList.getLength() ; i++) {
			//拿到当前的user
			Element user= (Element) userList.item(i);
			//取出年龄
			int age= Integer.parseInt(user.getAttribute("age"));
			//判断
			if(age>18){
				//取出名字和地址
				String name= user.getAttribute("name");
				String addr= user.getTextContent().trim();
				User u=new User(name, age, addr);
				//
				list.add(u);
			}
		}
		System.out.println("查看数据："+list);
	}
}
//user类
class User{
	String name;
	int age;
	String addr;
	public User(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "\nUser [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
}