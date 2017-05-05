package day18.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 1、把a.txt文本文件（gbk）和b.ttt文本文件（utf-8）的内容读取出来，
把a.txt内容加b.ttt内容一起写到c.txt文件（gbk），先写a再写b。
--》要求-流同时拥有设置字符集和缓冲区的功能。
		 */
		app();
	}
	private static void app() {
		//a）创建输入输出的数据源
		File fileInA=new File("src/day18/homework/a.txt");
		File fileInB=new File("src/day18/homework/b.ttt");
		File fileOutC=new File("src/day18/homework/c.txt");
		//b)根据数据源创建输入输出流（管道）
		Reader brA=null;
		Reader brB=null;
		Writer bwC=null;
		try {
			brA= new BufferedReader(new InputStreamReader(new FileInputStream(fileInA),"gbk"),1024*1024);
			brB= new BufferedReader(new InputStreamReader(new FileInputStream(fileInB),"utf-8"),1024*1024);
			bwC=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOutC), "gbk"));
			
			//缓冲数据的数组
			char [] buff=new char[512];
			int len;
			
			//c)通过输入管道A循环的读取数据
			while((len=brA.read(buff))!=-1){//a）读取存储数据 b）存储长度  c）判断有数据
				//d)通过输出管道C循环的写出数据
				bwC.write(buff, 0, len);
			}
			//e)通过输入管道B循环的读取数据
			while((len=brB.read(buff))!=-1){//a）读取存储数据 b）存储长度  c）判断有数据
				//f)通过输出管道C循环的写出数据
				bwC.write(buff, 0, len);
			}	
			//g)通过输出管道C刷新数据
			bwC.flush();
			System.out.println("copy完成！@");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//h）关闭所有流
			//传入数组关闭
			//IoCloseUtil.close(new Closeable[]{bwC,brB,brA});
			//传入数组元素关闭
			IoCloseUtil.close(bwC,brB,brA);
		}
	}
}
