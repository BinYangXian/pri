package day20.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test4Server {
	public static void main(String[] args)throws Exception{
		/**
		 * 需求1
tcp编程：利用socket和serversocket编程完成下面需求
客户端：
    1）连接到服务端
    2）给服务端发送数据（要给的钱）-->键盘输入
    3）等待接收服务器发送给自己的数据（收到的鞋）
    4）打印接收到的数据

服务端：
    1）等待当前客户端的连接
    2）接收并打印客户端发送的数据（收到的钱）
    3）发送“篮球鞋”-->给当前客户端，发送需要5秒钟。
    4）上述1，2，3需要循环进行
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
			//找到当前客户的输出流-包装为可以写字符串的DataOutputStream
			DataOutputStream dos=new DataOutputStream(curClient.getOutputStream());
			//包装需要5秒
			Thread.sleep(5000);
			dos.writeUTF("库里5代篮球鞋");
			dos.flush();
		 }
	}
}
