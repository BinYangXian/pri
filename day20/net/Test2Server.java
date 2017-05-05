package day20.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test2Server {
	public static void main(String[] args)throws Exception{
		/**
		 * 1）【客户1】给【服务生1】"500元钱"
		 */
/**
 * 	      a）开启nike服装店--》 设置开店的位置（对应绑定端口）-->一般设置1024之上
 */
         ServerSocket nikeStore=new ServerSocket(9999);
/**
 * 	      b）nike服务店-派服务生等待客户的到来->没来人一直在门口等待->来了之后把人带入店中，为其服
 */
         /**
          * accept会暂停执行-等待客户连接-没有客户一致等待
          */
         System.out.println("服务生1等待客户中");
		 Socket client1=  nikeStore.accept();
		 System.out.println("服务生1等待带了一个客户："+client1);
		
		 /**
		  * e）（服务器接收客户端的数据）服务生把【500元】收入柜中
		  */
		//找到当前客户的输入流-包装为可以读字符串的DataInputStream
		 DataInputStream dis=new DataInputStream(client1.getInputStream());
		 //
		 /**
          * read....会暂停执行-等待对方发送数据，没有数据的时候-一致等待
          */
		 System.out.println("等待收钱！");
		 String readData=dis.readUTF();
		 System.out.println("服务生收的钱："+readData);
		 
	}
}
