package day17.readerWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 计算机存储的数据：声音，视频，文本，图片...
		 * 
		 * 字符文件：文本文件（存储文字信息）
		 * 字节文件：其他文件（存储不是文字信息）
		 * 
		 * 
		 * 字节流：a）可以处理字符数据->手动的编码的解码  b）可以处理字节数据
		 * 字符流：a）可以处理字符数据->自动编码的解码 
		 * 
		 * 
		 * reader常用api
		 * 
		 * abstract  void close() 
          关闭该流并释放与之关联的所有资源。 
          
          int read() 
          读取单个字符。 
 int read(char[] cbuf) 
          将字符读入数组。 

		 */
		
		/**
		 * FileReader在读取字符数据的时候-
		 * 解码-默认按照当前的java文件（一般utf8）的【字符集】进行解码
		 * 
		 * 
		 *  FileWriter在写出字符数据的时候-
		 * 解码-默认按照当前的java文件（一般utf8）的【字符集】进行解码
		 */
		System.out.println("-------读取utf-8的字符数据-------");
		String utf_8FilePath="my17day/day17/readerWriter/utf8File.ttt";
		printCharFileInfo(utf_8FilePath);
		System.out.println("\n-------读取gbk的字符数据-------");
		String gbkFilePath="my17day/day17/readerWriter/gbkFile.ttt";
		printCharFileInfo(gbkFilePath);
	}
	/**
	 * 把【指定字符文件路径的字符数据】读取到程序中
	 * 打印到控制台
	 * int read(char[] b)->读取很多字符（字符数组）
	 */

	public static void printCharFileInfo(String filePath) {
//		 a）创建输入的数据源（文件，字节数组...）
		File file=new File(filePath);
		//提高作用域
		Reader fr=null;
		try {
//			 b）根据数据源创建输入流（管道）
			/**
			 * FileReader在读取字符数据的时候-
			 * 解码-默认按照当前的java文件（一般utf8）的【字符集】进行解码
			 */
			fr=new FileReader(file);
//			 c）通过管道读取数据
			//缓冲数据的字符数组-实际开发512或1024
			char[] buff=new char[7];
			//读取的数量的长度
			int buffLen;
			while((buffLen=fr.read(buff))!=-1){//a)读取数据 b）存储数据 c）判断有数据
				//d）处理数据
//				 d）根据业务处理数据
				//System.out.println("读取的字符数组："+Arrays.toString(buff));
				//System.out.println("读取的字符数组的长度："+buffLen);
				//转换为字符串
				String data=new String(buff, 0, buffLen);
				System.out.print(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("文件路径错误！");
		} catch (IOException e) {
			System.out.println("流断开了，不能继续操作!");
		}finally{
//			 e）关闭流（管道）
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
