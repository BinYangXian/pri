package day14.file;

import java.io.File;

public class Test1 {
	public static void main(String[] args) throws Exception{
		/**
		 * 文件系统：是对计算机里用到的各种数据（声音，视频，文本、图片）进行管理的一个系统。

文件：文件可以用来装各种的数据,具体的文件，一张简历（可以装很多的内容）
文件夹：文件夹可以对文件进行管理,装文件的袋子简历袋，可以装很多的文件和文件夹
1、file文件类
对应文件系统里的文件和文件夹
文件系统的每一个文件和文件夹都可以映射为一个file对象

注意：file对象对应文件系统的文件或文件夹可以不存在

		 */
	}
	
	/**
	 * 3、通过file对象创建文件或文件夹

      createNewFile()    文件系统中创建文件
      delete()    文件系统中删除文件或文件夹
      mkdir()     文件系统中创建文件夹
      mkdirs()    文件系统中创建文件夹及父辈目录
        renameTo(File dest) 重命名或移动 文件
	 */
	private static void dome2()throws Exception {
		//用相对路径创建file对象表示t4文件
		File t4=new File("src\\day14\\file\\t4.ddd");
		System.out.println("创建出t4对应的文件在文件系统:"+t4.createNewFile());
		//用相对路径创建file对象表示t5文件夹
		File t5=new File("src\\day14\\file\\t5.ddd");
		System.out.println("创建出t5对应的文件夹在文件系统:"+t5.mkdir());
		//用相对路径创建file对象表示t6文件夹里的t1文件夹
		File t6_1=new File("src\\day14\\file\\t6\\t1.ddd");
		System.out.println("mkdir用相对路径创建file对象表示t6文件夹里的t1文件夹:"+t6_1.mkdir());
		System.out.println("mkdirs用相对路径创建file对象表示t6文件夹里的t1文件夹:"+t6_1.mkdirs());
		System.out.println("删除t4表示的文件："+t4.delete());
		
		/**
		 * 把t5的名字（t5.ddd）-改为（t5dir）
		 * 
		 */
		//a）新文件名字路径的file对象
		File newName=new File("src\\day14\\file\\t5dir");
		//b）传入给t5做改名操作
		System.out.println("把t5的名字（t5.ddd）-改为（t5dir）："+t5.renameTo(newName));
		/**
		 * 把t6文件夹-移动到=t5文件夹中
		 * 
		 */
		//用相对路径创建file对象表示t6文件夹
		File t6=new File("src\\day14\\file\\t6");
		//a）新文件名字路径的file对象
		File newName2=new File("src\\day14\\file\\t5dir\\t6");
		//b）传入给t6做移动操作
		System.out.println("把t6文件夹-移动到=t5文件夹中:"+t6.renameTo(newName2));
	}
	/**
	 * 创建file对象表示出文件系统的文件或文件夹
	 * 
	 * 
	 * 
   File(String pathname)        文件及文件夹路径创建
    File(String parent, String child)     文件及文件夹的父目录路径 加文件及文件夹名字创建
pathname：文件或文件夹的路径

绝对路径：直接从磁盘根目录开始写如    d:\\ dd\test.txt  c:\\a.rar
相对路径 :  相对某个位置的填写的路径    src\day15\fileTest\test1.ttt  src\day14
  直接写路径    也是  相对当前项目位置
名称分割符
    window 可以 '\\'或 '/'
    file类 separator  常量
    file类 separatorChar 常量 
	 */
	private static void dome1() {
		//用绝对路径创建file对象表示t1文件
		File t1=new File("D:\\software\\eclipse_javaEE\\workspace4.4\\javaSe_1611_3\\src\\day14\\file\\t1.txt");
		//用相对路径创建file对象表示t2文件
		File t2=new File("src\\day14\\file\\t2.ddd");
		//使用file类 separator  常量作为名称分割符
		//用相对路径创建file对象表示t3文件夹
		File t3=new File("src"+File.separator+"day14"+File.separator+"file"+File.separator+"t3.abc");
		
	}
}
