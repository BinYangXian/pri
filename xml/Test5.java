package xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.xml.sax.InputSource;

public class Test5 {
	public static void main(String[] args)throws Exception {
		/**
		 * 
		 * jdk提供的原生sax和dom解析都有明星的缺点
		 * -》一般解析xml用第三方框架功能（jdom，dom4j...）
		 * 
		 * jdom优点：a）内存占用不多b）api使用简洁
		 * 
		 * 在java项目使用第三方框架功能（jar文件（封装了很多class文件的压缩文件））
		 * 
		 * -->需要为项目配置classpath环境
		 * 
		 * -》eclipse配置
		 * 项目右键build path-->configure build path-->libraries
		 * -》add jars 找到对应的jar文件配置即可
		 * 
		 * 
		 * jdom操作xml文件
		 * 1）读取（解析）xml文件的数据
		 * 
		 * 2）把程序的数据写到xml文件中
		 * 
		 * 3）更新xml文件的数据
		 *  a）读取xml的数据到程序中-》document对象
		 *  b）根据业务修改document对象 内容
		 *  c)把修改后的document对象 写出到文件中
		 *  
		 * 
		 * 
		 *读取（解析）xml文件的数据-步骤
		 *
		 * a）创建解析器的对象
		 *   new  SAXBuilder()
		 * b)通过解析器解析xml文件得到document对象
		 *  Document	build(java.io.File file)
		 *  
		 * c）通过 document对象找到业务所需要的数据
		 * 
			 * 1)获取docuemnt的跟标记
			 * 	Element	getRootElement()
			 * 
			 * 2）找到Element标记里指定【标记名】的【所有】子标记
			 *  java.util.List<Element>	getChildren(java.lang.String cname)
			 *  
			 *  
			 * 3）找到Element标记里指定【标记名】的【第一个】子标记 
			 * Element	getChild(java.lang.String cname)
			 * 
			 * 
			 * 4）找到Element标记里指定【属性名】的属性值-【String值】
 				java.lang.String	getAttributeValue(java.lang.String attname) 
			 * 
			 * 5）找到Element标记里指定【属性名】的属性值-【其他基本类型值】
 				标记.getAttribute(java.lang.String attname).get基本类型名value()
			 * 
			 * 4)找到Element标记里文本内容
			 * java.lang.String	getText() ->原始内容
			 * java.lang.String	getTextTrim()-》取出左右空白的内容
		 * 
		 */
		readXml();
	}
	/**
	 * 解析之后把所有年龄大于18的人的信息存储在List<User>对象中，
User类：有三个成员变量（String name，int age String addr）
并遍历输出list里所有人的名字。
	 */
	private static void readXml() throws Exception{
//		a）创建解析器的对象
		SAXBuilder sb= new  SAXBuilder();
//		b)通过解析器解析xml文件得到document对象
		File xmlFile=new File("src/xml/test5.xml");
		Document doc= sb.build(xmlFile);
		/**
		 * c）通过 document对象找到业务所需要的数据
		 */
		//找到跟标记root标记
		Element root= doc.getRootElement();
		//找到跟标记root的子标记users
		Element users= root.getChild("users");
		//找到users标记里的所有的user
		List<Element> list= users.getChildren("user");
		//list
		List<User2> listUser2=new ArrayList<User2>();
		//遍历所有的user
		for (Element user : list) {
			int age= user.getAttribute("age").getIntValue();
			//
			if(age>18){
				String name=user.getAttributeValue("name");
				String addr=user.getTextTrim();
				//
				User2 u2=new User2(name, age, addr);
				listUser2.add(u2);
			}
		}
		System.out.println("查看数据："+listUser2);
	}
}

//user类
class User2{
	String name;
	int age;
	String addr;
	public User2(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "\nUser [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
}