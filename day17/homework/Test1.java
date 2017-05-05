package day17.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

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
		 */
		
		/**
		 * copy字符文件
		 */
		String oldPath="src/day17/homework/personInfo1.ttt";
		String newPath="src/day17/homework/new_personInfo1.ttt";
		copyFile(oldPath,newPath);
		/**
		 * copy字节文件
		 */
		String oldPath2="e:/cpuz_x64.exe";
		String newPath2="e:/new_cpuz_x64.exe";
		copyFile(oldPath2,newPath2);
	}
	/**
	 * copy文件的功能
	 * @param oldPath 旧文件路径
	 * @param newPath 新文件路径
	 */
	private static void copyFile(String oldPath,String newPath) {
		//a)创建输入输出的数据源
		File fileIn=new File(oldPath);
		File fileOut=new File(newPath);

		InputStream fis=null;
		OutputStream fos=null;
		try {
			//b)创建输入输出流（管道）
			fis=new FileInputStream(fileIn);
			fos=new FileOutputStream(fileOut);
			//c)通过输入管道循环的读取数据
			//缓冲数据的字节数组
			byte [] buff=new byte[512];
			//读取到数组的长度
			int buffLen;
			while((buffLen=fis.read(buff))!=-1){
				//处理数据
				//d)通过输出管道循环的写出数据
				fos.write(buff,0,buffLen);
			}
			//e)刷新输出管道
			fos.flush();
			System.out.println("copy完成！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//f)关闭所有的流(1到多个流)
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
