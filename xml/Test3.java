package xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Test3 {
	public static void main(String[] args)throws Exception {
		/**
		 * xml常用解析：sax和dom解析两种方式
    java官方（jdk）提供了javax.xml.parsers包：sax和dom解析xml的包

sax解析特点：
         1）基于事件模型，每次读取数据会调用对应的事件
         2）每次读取的数据不保存
         3）读取消耗的内存小
         4)解析数据-复杂
         
dom解析特点：
        1）直接把整个xml文件读取到程序中封装为一个Document对象， Document对象可以得到根标签Element，通过根标签Element，得到各种子标签
        2)每次读取的数据保存在document中
        3）读取消耗的内存大
        4)解析数据-简单

dom和sax对比：
    1）sax性能好，处理数据麻烦。
    2）dom性能差，处理数据方便。
    3）因为一般处理的xml数据量小--实际开发都使用dom。
		 */
		saxReadXml();
	}
	/**
	 * 
需求：练习1-》找到所有年龄>19的所有人的名字和工作和年龄信息放入
List<User>中，并遍历list<User>
	 */

	private static void saxReadXml() throws Exception{
//		 读取xml数据
//		  1)得到sax解析器工厂
		  SAXParserFactory factory = SAXParserFactory.newInstance();
//		  2)通过工厂得到sax解析器
		  SAXParser saxParser = factory.newSAXParser();
//		  3)通过sax解析器解析xml文件，并注册用于解析的处理器
		  File xmlFile=new File("src/xml/test3.xml");
		   saxParser.parse(xmlFile,new Test3XmlHandler());
//		处理器：用于回调的对象，包含了很多处理xml数据的方法，当解析到xml数据的时候，会
//		调用处理器的对应处理方法。
		   System.out.println("查看数据:"+Test3XmlHandler.list);
	}
}
/**
 * test3.xml文件的sax处理器
 * -》负责保存对应的数据
 */
class Test3XmlHandler extends DefaultHandler{

	//静态信息-保存一个list容器
	static List<User> list=new ArrayList<User>();
	
	//处理-开始标记的数据
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		//排除userlist
		if(qName.equals("user")){
//			System.out.println("开始标记名:"+qName);
//			System.out.println("属性-名字：:"+attributes.getValue("name"));
//			System.out.println("属性-年龄：:"+attributes.getValue("age"));
//			System.out.println("属性-工作：:"+attributes.getValue("job"));
//			System.out.println();
			int age= Integer.parseInt(attributes.getValue("age"));
			if(age>19){
				String job= attributes.getValue("job");
				String name= attributes.getValue("name");
				//创建user
				User user=new User(name, age, job);
				//
				list.add(user);
			}
		}
	}
}
//user类
class User{
	String name;
	int age;
	String job;
	public User(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	@Override
	public String toString() {
		return "\nUser [name=" + name + ", age=" + age + ", job=" + job + "]";
	}
	
}

