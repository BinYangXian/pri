package xml;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class Test6 {
	public static void main(String[] args)throws Exception {
		/**
		 * 
		 * 把程序的数据写到xml文件中-步骤
		 * 
		 * 1）根据业务数据-创建出对应的document对象
		 * 
		 * 例如：数据：
				李冰冰，18,四川省成都高新区布鲁明顿广场2-1002	
				张无忌，19,四川省成都高新区布鲁明顿广场2-1004			
		 * -》设计xml
		 * <persons>
		 * 		<person name="李冰冰" age="18">
		 * 			四川省成都高新区布鲁明顿广场2-1002	
		 * 		</person>
		 * 		<person name="张无忌" age="19">
		 * 			四川省成都高新区布鲁明顿广场2-1004	
		 * 		</person>
		 * </persons>
		 * 
		 * 根据xml创建document对象描述数据
		 * a）创建document对象
		 *   new Document()
		 * b)创建出elemnet对象表示跟标记persons
		 *   new Element("persons")
		 * c)把跟标记设置到docuemnt对象中
		 * 	setRootElement(Element rootElement)
		 * d）创建出elemnet对象表示子标记person
		 *   new Element("person")
		 * e）设置标记的属性
		 *   setAttribute(java.lang.String name, java.lang.String value)
		   f）设置标记的文本内容
			 setText()
		   g）给标记添加子标记
		     addContent(Content 子标记)
		 */
		createXml();
	}
	private static void createXml() throws Exception{
		/**
		 * 1）根据业务数据-创建出对应的document对象
		 */
		//a）创建document对象
		Document doc =new Document();
		//b)创建出elemnet对象表示跟标记persons
		Element persons=new Element("persons");
		//c)把跟标记设置到docuemnt对象中
		doc.setRootElement(persons);
		//d)创建子节点person-并设置属性和文本内容
		Element person1=new Element("person");
		person1.setAttribute("name", "李冰冰");
		person1.setAttribute("age", "18");
		person1.setText("四川省成都高新区布鲁明顿广场2-1002");
		
		Element person2=new Element("person");
		person2.setAttribute("name", "张无忌");
		person2.setAttribute("age", "19");
		person2.setText("四川省成都高新区布鲁明顿广场2-1004");
		//e)把子节点放入到根节点中
		persons.addContent(person1);
		persons.addContent(person2);
		
		/**
		 * 2）通过xml的输出器XMLOutputter-的output
		 * 把docuemnt的数据-输出到对应的流的数据源里
		 */
		//xml输出的层次型漂亮的格式
		Format format=Format.getPrettyFormat();
		//设置xml文件声明的字符集
		format.setEncoding("gbk");
		//创建xml输出器-设置格式
		XMLOutputter out=new XMLOutputter(format);
		//连接到文件的输出流writer
		Writer isr=new OutputStreamWriter(new FileOutputStream(new File("src/xml/test6.xml")), "gbk");
		//进行输出
		out.output(doc, isr);
		System.out.println("输出完成！");
	}
}
