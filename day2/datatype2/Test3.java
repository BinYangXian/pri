
public class Test3{
	
	public static  void main(String []  aaa){
		/**
			字符类型
			char
			存储的数据：1个字符（文字）
			java的字符数据（char，String...s）：unicode字符集编码进行存储的，双字节编码（占2个字节）
			
			char的变量的定义方式1-》字面值
			语法：  char 变量名='1个字符';
			
			char的变量的定义方式2-》字符对应的整数
			语法：  char 变量名=整数字面值（0到65535）;
			
			
		*/
		/**
		定义方式1
		*/
		//人的性别
		char sex1='男';
		sex1='女';
		//char不能存储空字符（0个字符）
		//char ch='';
		//char不能存储多个字符
		//人的名字
		//char name1='柳岩';
		/**
		定义方式2
		*/
		//定义字符a
		char ch1='a';
		//定义字符a-用对应的整数定义
		char ch2=97;
		//定义字符 男
		char ch3=0x7537;
		System.out.print("ch1:");
		System.out.println(ch1);
		System.out.print("ch2:");
		System.out.println(ch2);
		System.out.print("ch3:");
		System.out.println(ch3);
		
		/**
			有些特殊的字符不能直接或不方便定义
			例如：换行...
			需要-》转义字符（char和String字面值都可以使用）
			
			常用转义字符		对应的代替字符
			\n 					换行
			\t					tab键
			\'					'
			\"					"
			\\					\
		*/
		char ch4='\'';
		char ch5='\\';
		System.out.print("ch4:");
		System.out.println(ch4);
		System.out.print("ch5:");
		System.out.println(ch5);
		
		/**
			char只能存储1个字符
			存储多个字符-》String字符串类型（引用类型）
			
			String的变量的定义方式-》字面值
			语法：  String 变量名="0到多个字符";
			
		*/
		//人的名字
		String name2="柳岩";
		//人的地址
		String addr="布鲁明顿2-4048";
		System.out.print("name2:");
		System.out.println(name2);
		System.out.print("addr:");
		System.out.println(addr);
		//
		//人的名字-"柳岩"
		String name3="\"柳岩\"";
		System.out.print("name3:");
		System.out.println(name3);
		
		/**
			字符串的拼接
			+运算符
		    a）字符串+字符串  -》结果是字符串，把+左右的字符串连接之后返回新字符串
			b）字符串+基本类型 -》结果是字符串，把左边的字符串和右边基本类型（值的字符串）连接之后返回新字符串
			
			java里在使用值的地方（变量赋值，运算，方法参数...）
			->不关心值的获取方式-》只关心值的类型
			值的获取方式
			1)字面值  2）变量  3）运算符参数  4）....
		*/
		//人的信息-包含了名字和地址
		String perosnInfo1=name2+addr;
		System.out.println("人的信息："+perosnInfo1);
		//人的信息2-"名字：xxx_地址:xxx"
		String perosnInfo2="名字："+name2+"_地址:"+addr;
		System.out.println("人的信息2："+perosnInfo2);
		
		//年龄
		int  age=18;
		//人的信息3-"名字：xxx_地址:xxx_年龄：xxx"
		String perosnInfo3=perosnInfo2+"_年龄："+age;
		System.out.println("人的信息3："+perosnInfo3);
		
	}
}