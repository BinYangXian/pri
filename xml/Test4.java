package xml;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Test4 {
	public static void main(String[] args) throws Exception{
		/**
		 * dom解析 过程
		 * 
读取xml数据

  1）得到dom解析器工厂
DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
  2）通过工厂得到dom解析器
 DocumentBuilder builder = factory.newDocumentBuilder();
  3）通过dom解析器解析xml文件，得到对应文件的document对象。
  Document doc = builder.parse(in);
  4）通过document对象找xml的数据
		 * 
		 * a)获取docuemnt的跟标记
		 * Element getDocumentElement()  
		 * 
		 * b）找到Element标记里指定【标记名】的子标记
		 *  NodeList getElementsByTagName(String name)  
		 * NodeList-》装子element的容器对象相当于list<Element>
		 * 
		 * c）找到Element标记里指定【属性名】的属性值
		 *  String getAttribute(String name) 
		 *  
		 * d)找到Element标记里文本内容
		 *  String getTextContent()  
		 */
		domReadXml();
	}
	/**
	 * 
需求：练习1-》找到所有年龄>19的所有人的名字和工作和年龄信息放入
List<User>中，并遍历list<User>
	 */
	private static void domReadXml()throws Exception {
//		 1）得到dom解析器工厂
		DocumentBuilderFactory fac= DocumentBuilderFactory.newInstance();
//		 2）通过工厂得到dom解析器
		DocumentBuilder build= fac.newDocumentBuilder();
//		 3）通过dom解析器解析xml文件，得到对应文件的document对象。
		File xmlFile=new File("src/xml/test3.xml");
		Document dom= build.parse(xmlFile);
		/**
		 * 4）通过document对象找xml的数据
		 */
		//装数据的list
		List<User> list=new ArrayList<User>();
		
		//找到跟标记-userList
	    Element userList=dom.getDocumentElement();
	    //找到userlist标记里所有user的子标记
	    NodeList users=  userList.getElementsByTagName("user");
	    //遍历找到users里的所有的user标记element
	    for (int idx = 0; idx <=users.getLength()-1; idx++) {
			//取出当前的user
	    	Element user= (Element) users.item(idx);
	    	//取出年龄
	    	int age= Integer.parseInt(user.getAttribute("age"));
	    	if(age>19){
	    		String name= user.getAttribute("name");
	    		String job= user.getAttribute("job");
	    		//创建user
				User u=new User(name, age, job);
				//
				list.add(u);
	    	}
		}
	    System.out.println("查看数据:"+list);
	}
}
