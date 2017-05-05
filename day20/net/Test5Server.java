package day20.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test5Server {
	public static void main(String[] args)throws Exception{
		/**
		 *需求2：
在需求1的基础上，服务器，需要可以同时处理两个任务
    a）接受客户-->等待当前客户端连接
    b）为客户服务(每次服务一个线程)--》接收钱,和发送“篮球鞋”给当前客户端
提示：多线程解决
		 */
/**
 * 	      a）开启nike服装店--》 设置开店的位置（对应绑定端口）-->一般设置1024之上
 */
         ServerSocket nikeStore=new ServerSocket(9999);
         while (true) {
			/**
			 * 	b）nike服务店-派服务生等待客户的到来->没来人一直在门口等待->来了之后把人带入店中，为其服
			 */
	         System.out.println("服务生等待客户中");
			 Socket curClient=  nikeStore.accept();
			 System.out.println("服务生等待带了一个客户："+curClient);
			 /**
			  * e）（服务器接收客户端的数据）服务生把【500元】收入柜中
			  */
			//找到当前客户的输入流-包装为可以读字符串的DataInputStream
			 DataInputStream dis=new DataInputStream(curClient.getInputStream());
			 System.out.println("等待收钱！");
			 String readData=dis.readUTF();
			 System.out.println("服务生收的钱："+readData);
			 /**
			  * 服务生把“篮球鞋”给客户1
			  */
			new Thread(new SendDataTask(curClient)).start();
		 }
	}
}
/**
 * 给客户打包鞋的任务
 */
class  SendDataTask implements Runnable{
	//成员变量-当前客户端的连接（socket）
	private Socket curClient;
	//创建任务的时候-设置当前客户连接
	public SendDataTask(Socket curClient) {
		this.curClient = curClient;
	}
	@Override
	public void run() {
		try {
			//找到当前客户的输出流-包装为可以写字符串的DataOutputStream
			DataOutputStream dos=new DataOutputStream(curClient.getOutputStream());
			//包装需要5秒
			Thread.sleep(5000);
			dos.writeUTF("库里5代篮球鞋");
			dos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}