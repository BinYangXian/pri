
public class Test1{
	
	public static void main(String args[]){
		/**
		开发java程序的时候，java开发环境提供了很多内置（方法）功能
   例如：1）打印内容到控制台2）随机数 3）获取用户控制台输入内容
   
   我们怎么使用这些功能？--》通过查看api
   api：程序开发帮组文档--》类似于 小学学习汉语，词典，字典。
   api：提供很多功能的使用介绍，不用背，需要知道怎么去使用，怎么去查询！！
   
   
   java系统提供了很多对"字符串"处理的相关的功能-放到了String类中。
字符串类型（String）基本api使用

String 类：封装了各种操作字符串的功能。
注意：如下api都是针对某一个具体的字符串。
所以使用的时候得先有一个字符串。
再通过字符串调用下面的方法。

语法：[返回值类型   变量=] 字符串.方法([实际参数]);
		*/
	
		dome3();
	}
	/**
	c）方法重载
 String substring(int beginIndex, int endIndex)
          返回一个新字符串，它是此字符串的一个子字符串。
 String substring(int beginIndex)  
          返回一个新的字符串，它是此字符串的一个子字符串。
----（自学）
    equalsIgnoreCase(其他字符串):忽略大小写比较两个字符串内容是否相等

 int indexOf(String str)
          返回指定子字符串在此字符串中第一次出现处的索引。 
 indexOf(String str, int fromIndex)
          返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。
	*/
	public static void dome3(){
		//人的信息
		String personInfo="柳岩_18_java工程师_女_布鲁明顿";
		//取出工作 
		String job= personInfo.substring(6,13);
		System.out.println("工作："+job);
		//取出地址
		String addr1= personInfo.substring(16,personInfo.length());
		System.out.println("地址1："+addr1);
		//取出地址
		String addr2= personInfo.substring(16);
		System.out.println("地址2："+addr2);
		
		
	}
	/**
	b）方法参数及返回值
    charAt(索引):获取索引[0,length())对应的单个字符
    equals(其他字符串):比较两个字符串内容是否相等
    replaceAll("旧字符串","新字符串"):替换所有的字符串为新的字符串，支持正则
    + 拼接:不是追加，会产生新的字符串
	*/
	public static void dome2(){
		//人的信息
		String personInfo="柳岩_18_java工程师_女";
		//把人的信息里的【年龄】取出来-打印
		char ch1= personInfo.charAt(3);
		char ch2= personInfo.charAt(4);
		//拼接年龄
		String age= ""+ch1+ch2;
		//打印：
		System.out.println("年龄："+age);
		//取出性别并打印
		char sex=personInfo.charAt(personInfo.length()-1);
		System.out.println("性别："+sex);
		
		System.out.println("---------------------------");
		//判断用户输入用户名是否可以登录成功-正确用户名"zeng"
		//输入 
		String inUname= inputString("用户名");
		//判断（==）不能判断引用类型
		System.out.println("(==)是否登录成功-"+(inUname=="zeng"));
		//判断（equals）可以判断引用类型
		System.out.println("(equals)是否登录成功-"+(inUname.equals("zeng")));
		System.out.println("---------------------------");
		//论坛消息
		String msg="helo，不错哦，第三【很黄】季【很黄】【很黄】获利【很暴力】是否萨芬";
		//替换 很黄 
		msg=msg.replaceAll("很黄","xxx");
		//替换 很暴力 
		msg=msg.replaceAll("很暴力","yyyy");
		//查看数据 
		System.out.println("替换后的："+msg);
		
	}
	
	/**
	方法返回值

    length() :长度
    trim(); -->去除左右所有空白字符 -->String
	*/
	public static void dome1(){
		
		/**
			length
		*/
		String uname1="柳岩";
		String uname2="斯蒂芬-库里";
		//判断名字-是或不是汉族人的名字（2-3个字符）
		//判断名字1
		//名字1的长度
		int len1= uname1.length();
		if(len1>=2&&len1<=3){
			System.out.println("名字1是汉族人的名字");
		}
		//判断名字2
		//名字2的长度
		int len2= uname2.length();
		if(len2>=2&&len2<=3){
			System.out.println("名字2是汉族人的名字");
		}
		
		/**
			trim
		*/
		String uname3=inputString("注册的用户名"); 
		System.out.println("你输入的用户名：["+uname3+"]");
		//去除左右的空白字符 -去除后的存储在uname4
		String uname4= uname3.trim();
		System.out.println("你输入的用户名去除左右空白后（自己不会改变）：["+uname3+"]");
		System.out.println("你输入的用户名去除左右空白后（改变的字符串返回了）：["+uname4+"]");
		
	}
	/**
		得到用户输入的字符串
	*/
	public static String inputString(String tishi){
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//提示
		System.out.println("请输入"+tishi);
		//
		String data= sc.nextLine();
		//
		return data;
	}
	
}
