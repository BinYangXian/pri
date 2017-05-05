package day18.serializable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import day18.homework.IoCloseUtil;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 序列化概念
  
   a)序列化（输出）:把程序中的数据    （基本类型，引用类型）以【字节数据】写出            到一个数据源

   b)反序列化（输入）：把数据源序列化的数据  【字节数据】          读取到            程序中的数据（基本类型，引用类型）

注意：
    这里写出的数据不是简单的字符数据是java内部的一种格式，也可以理解写的字节数据，所以序列化后的数据，不是给人看的，给程序看的！！

 例子：  
    1）游戏本地存档
    2）网络传输，java里非（byte和char）的其他类型的数据。
    3）hibernate框架底层使用了

-- 基本类型数据的序列化的流

--》处理 【基本类型+String数据】

DataInputstream  反序列化（输入）
新增api：不能面向超类型编程
read基本类型名()
readUTF()

DataOutputstream  序列化（输出）

新增api：不能面向超类型编程
write基本类型名(基本数据)
writeUTF(字符串数据)



-- 对象类型数据的序列化的流
--》处理 【基本类型+对象数据（引用）】

ObjectInputstream  反序列化（输入）
ObjectOutputstream   序列化（输出）

序列化注意点
a）序列化和反序列化处理数据的顺序必须一致-否则可能EOFException

		 */
		dome2();
	}
	/**
	 * 读取游戏数据文件gameInfo1.txt中
	 * 数据：
	 * String playerName ="赵日天";
     * long score=8001111;
     * short  grade=999;
     * 到程序中-并打印
     * 
	 */
	private static void dome2() {
//		 a）创建数据源
		File file=new File("src/day18/serializable/gameInfo1.txt");
//	     b）通过数据源创建需要的输入流
		DataInputStream dis=null;
		try {
			dis=new DataInputStream(new FileInputStream(file));

//		     c）通过流从对应的数据源读取数据
			String palyerName= dis.readUTF();
			long score= dis.readLong();
			short grade= dis.readShort();
//		     d）处理读取的数据
			System.out.println("你保存的游戏信息：");
			System.out.println("角色名："+palyerName);
			System.out.println("分数："+score);
			System.out.println("等级："+grade);
			
		} catch (FileNotFoundException e) {
			System.out.println("你没有保存存档信息！");
		} catch (IOException e) {
			e.printStackTrace(System.err);
			System.out.println("读取存储信息遇到问题-请稍后尝试");
		}finally{
//		     e）关闭流close
			IoCloseUtil.close(dis);
		}
	}
	/**
	 * 存储游戏的数据到文件gameInfo1.txt中
	 * 数据：
	 * String playerName ="赵日天";
     * long score=8001111;
     * short  grade=999;
	 */

	private static void dome1() {
//		   	 a）创建数据源
		File file=new File("src/day18/serializable/gameInfo1.txt");
//		     b）通过数据源创建需要的输出流
		DataOutputStream dos=null;
		try {
			dos=new DataOutputStream(new FileOutputStream(file));
//		     c）创建要写出的数据
			String playerName ="赵日天";
		    long score=8001111;
		    short  grade=999;
//		     d）通过流把数据写到对应的数据源
		    dos.writeUTF(playerName);
		    dos.writeLong(score);
		    dos.writeShort(grade);
//		     e）刷新流flush（如果需要数据-立即传入到数据源时，则需要调用）
			dos.flush();
			System.out.println("存储游戏数据完成！");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
//		     f）关闭流close
			IoCloseUtil.close(dos);
		}
	}
	
}
