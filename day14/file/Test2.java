package day14.file;

import java.io.File;

public class Test2 {
	public static void main(String[] args) {
		dome1();
	}
	/**
	 * 通过file对象获取对应的文件或文件夹的信息
   
---------------------------------------------------
    public boolean exists()     是否存在
    public boolean isDirectory()	是否是文件夹
    public boolean isFile()    是否是文件
    public boolean isHidden()	是否隐藏

    public String getName()     文件名字，包含后缀
    public String  getAbsolutePath  	文件绝对路径

    public String[] list()     子文件名字数组
    public File[] listFiles()    子文件file对象数组

---------------------------------------------------
    public boolean canRead()    是否可读 --window不能设置
    public boolean canWrite()	是否可写
    public long lastModified()  最后修改时间（毫秒）
    public long length()	文件的长度，内容长度，不是文件名的长度 单位是字节
    public String getPath()	文件路径(如果是相对路径构造的file返回相对路径)
	 */

	private static void dome1() {
		//用相对路径创建file对象表示t2文件
		File t2=new File("src\\day14\\file\\t2.ddd");
		//使用file类 separator  常量作为名称分割符
		//用相对路径创建file对象表示t3文件夹
		File t3=new File("src"+File.separator+"day14"+File.separator+"file"+File.separator+"t3.abc");
		//用相对路径创建file对象表示t4文件
		File t4=new File("src\\day14\\file\\t4.ddd");
				
		System.out.println("t2存在吗?"+t2.exists());
		System.out.println("t4存在吗?"+t4.exists());
		
		System.out.println("t2是文件吗？"+t2.isFile());
		System.out.println("t3是文件吗？"+t3.isFile());
		System.out.println("t4是文件吗？"+t4.isFile());
		
		/**
		 * 取出并打印t2文件的名字（不包含后缀）
		 */
		String t2Name1= t2.getName();
		System.out.println("t2名字带后缀："+t2Name1);
		String t2Name2= t2Name1.split("\\.")[0];
		System.out.println("t2名字不带后缀："+t2Name2);
		/**
		 * 打印出file文件夹里所有的子文件的名字
		 * 格式：
		 * 名字：...
		 * 名字：...
		 * 名字：...
		 */
		//创建表示file文件夹的对象
		File file=new File("src\\day14\\file");
		//获取所有子文件名字
		String[] subNames= file.list();
		//打印
		for (String subName : subNames) {
			System.out.println("名字："+subName);
		}
		/**
		 * 打印出file文件夹里所有的子文件的名字和大小
		 * 格式：
		 * 名字：...  大小：...
		 * 名字：...	大小：...
		 * 名字：...	大小：...
		 */
		//获取所有子文件file对象
		File[] subFiles= file.listFiles();
		//打印
		for (File subFile : subFiles) {
			System.out.print("名字："+subFile.getName());
			System.out.println(" 大小："+subFile.length());
		}
	}
}
