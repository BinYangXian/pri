package day17.inputOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 
		 * 使用输出流的步骤
	 a）创建数据源
     b）通过数据源创建需要的输出流
     c）创建要写出的数据
     d）通过流把数据写到对应的数据源
     e）刷新流flush（如果需要数据-立即传入到数据源时，则需要调用）
     f）关闭流close
		 * 
		 * 
		 * 2)OutputStream  
 void close()
          关闭此输出流并释放与此流有关的所有系统资源。
 void flush()
          刷新此输出流并强制写出所有缓冲的输出字节。
 void write(byte[] b)
          将 b.length 个字节从指定的 byte 数组写入此输出流。
abstract  void write(int b)
          将指定的字节写入此输出流。
		 * 
		 */
		dome1();
	}
	/**
	 * 把程序中[人的信息]"古力娜扎_16_java攻城柿"写出到
	 * 文件中
	 * personInfo2.ttt
	 * 
	 * 注意点
	 * 1）读取文件数据的时候-文件必须存在
	 * 2）写出数据到文件-》文件可以不存在
	 */

	private static void dome1() {
//		  a）创建数据源
		File file=new File("src/day17/inputOutputStream/personInfo2.ttt");
		//提高作用域
		OutputStream fos=null;
		try {
//			b）通过数据源创建需要的输出流
			fos=new FileOutputStream(file);
//   		 c）创建要写出的数据
			String data1= "古力娜扎_16_java攻城柿";
			//String编码为字节数组-按gbk字符集
			byte []data2= data1.getBytes("gbk");
//			 d）通过流把数据写到对应的数据源
			fos.write(data2);
//		     e）刷新流flush（如果需要数据-立即传入到数据源时，则需要调用）
			fos.flush();
			System.out.println("写出数据完成！");
		} catch (FileNotFoundException e) {
			System.out.println("文件路径错误！");
		} catch (IOException e) {
			System.out.println("流断开了，不能继续操作!");
		}finally{
//			 f）关闭流（管道）
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
