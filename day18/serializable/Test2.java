package day18.serializable;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

import day18.homework.IoCloseUtil;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 
-- 对象类型数据的序列化的流
--》处理 【基本类型+对象数据（引用）】

ObjectInputstream  反序列化（输入）

新增api：不能面向超类型编程
read基本类型名()
readUTF()
readObject()


ObjectOutputstream   序列化（输出）

新增api：不能面向超类型编程
write基本类型名(基本数据)
writeUTF(字符串数据)
writeObject()

序列化注意点
a）序列化和反序列化处理数据的顺序必须一致-否则可能EOFException
b)类的对象要序列化或反序列化-那么类必须实现Serializable
		 */
		dome2();
	}
	/**
	 * 读取游戏数据文件gameInfo2.txt中
	 * 数据：
	 * 两个palyer对象
	 * 
     * 到程序中-并打印
     * 
	 */
	private static void dome2() {
//		 a）创建数据源
		File file=new File("src/day18/serializable/gameInfo2.txt");
//	     b）通过数据源创建需要的输入流
		ObjectInputStream ois=null;
		try {
			ois=new ObjectInputStream(new FileInputStream(file));

//		     c）通过流从对应的数据源读取数据
			Player p1= (Player) ois.readObject();
			Player p2= (Player) ois.readObject();
//		     d）处理读取的数据
			System.out.println("你保存的游戏信息：");
			System.out.println("角色1："+p1);
			System.out.println("角色2："+p2);
			
		} catch (FileNotFoundException e) {
			System.out.println("你没有保存存档信息！");
		} catch (IOException e) {
			e.printStackTrace(System.err);
			System.out.println("读取存储信息遇到问题-请稍后尝试");
		} catch (ClassNotFoundException e) {
			System.out.println("读取对象数据的时候，当前环境找不到对应对象的类");
		}finally{
//		     e）关闭流close
			IoCloseUtil.close(ois);
		}
	}

	/**
	 * 存储游戏的数据到文件gameInfo2.txt中
	 * 数据：
	 * String playerName ="赵日天";
     * long score=8001111;
     * short  grade=999;
     * 
     * String playerName2 ="叶良辰";
     * long score2=9001111;
     * short  grade2=1000;
	 */

	private static void dome1() {
//		   	 a）创建数据源
		File file=new File("src/day18/serializable/gameInfo2.txt");
//		     b）通过数据源创建需要的输出流
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(new FileOutputStream(file));
//		     c）创建要写出的数据
		    Player p1=new Player("赵日天", 8001111, (short)999);
		    Player p2=new Player("叶良辰", 9001111, (short)1000);
		    
//		     d）通过流把数据写到对应的数据源
		    oos.writeObject(p1);
		    oos.writeObject(p2);
//		     e）刷新流flush（如果需要数据-立即传入到数据源时，则需要调用）
			oos.flush();
			System.out.println("存储游戏数据完成！");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
//		     f）关闭流close
			IoCloseUtil.close(oos);
		}
	}	
}
/**
 * 角色类
 */
class Player implements Serializable{
	
	String playerName;
	long score;
    short  grade;
    char sex;
	public Player(String playerName, long score, short grade) {
		this.playerName = playerName;
		this.score = score;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", score=" + score
				+ ", grade=" + grade + "]";
	}
}
