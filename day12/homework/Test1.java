package day12.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws IOException {
		/**
		 * 
1）定义方法完成，用户控制台输入字符文件路径，
把对应字符文件的所有内容（不用考虑中文乱码）打印到控制台。
a）如果遇到FileNotFoundException：则打印提示（路径错误）
b）如果遇到IOException：不用处理直接抛给上级
		 */
		app();
	}

	private static void app() throws IOException {
		/**
		 * a）输入文件的路径
		 */
		//管理者
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入文件的路径");
		String filePath= sc.next();
		/**
		 * b)打印文件的内容
		 */
		FileReader fr=null;
		try {
			//建立管道
			fr=new FileReader(filePath);
			//通过管道读取数据
			while(true){
				//读取数据
				int chNum= fr.read();
				
				if(chNum!=-1){
					//判断有数据-转换为字符-打印-继续读取数据(进入下一次循环)
					System.out.print((char)chNum);
				}else{
					//判断没有数据（-1）-退出循环
					break;
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("路径错误");
		}finally{
			//关闭管道
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
