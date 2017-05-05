package day18.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Test3 {
	public static void main(String[] args) {
		/**
		 * 1、copy文件数据
建立utf-8编码的文件person.info，内容如下
------------------------
张三丰===布鲁明顿
李逍遥===春熙路
叶良成===天府广场
叶良成===春熙路
------------------------
把文件内容写到gbk编码的新文件，内容如下
-----------------------
姓名------地址
张三丰---布鲁明顿
李逍遥---春熙路
叶良成---天府广场
叶良成---春熙路
-----------------------
1）内容前加：姓名------地址
2）姓名和地址的分隔符：--- 
		 */
		app();
	}

	private static void app() {
//		  	a）创建输入输出数据源
		File fileIn=new File("src/day18/homework/person.info");
		File fileOut=new File("src/day18/homework/person_new.info");
//		    b）通过数据源创建输入输出流
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			br=new BufferedReader(new InputStreamReader(new FileInputStream(fileIn), "utf-8"));
			bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOut), "gbk"));
//		    c）通过输入流循环的读取数据
			String buff;
			//控制是否写标题-变量
			boolean isWriteHead=true;
			
			while ((buff=br.readLine())!=null) {
//			    d）通过输出流循环的写出数据
				//判断 ------
				if(!buff.contains("=")){
					//写出 ------
					bw.write(buff);
					bw.newLine();
					
					//写出1个标题
					if(isWriteHead){
						//内容前写标题(1次)-》姓名------地址
						bw.write("姓名------地址");
						bw.newLine();
						//写1次不写
						isWriteHead=false;
					}
				}else{//张三丰===布鲁明顿
					//替换内容
					buff=buff.replaceAll("=", "-");
					//写内容
					bw.write(buff);
					bw.newLine();
				}
			}
			
//		    e）刷新流flush（如果需要数据-立即传入到数据源时，则需要调用）
			bw.flush();
			System.out.println("写出完成！");
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
//		    f）关闭流close
			IoCloseUtil.close(bw,br);
		}
		
	}
}
