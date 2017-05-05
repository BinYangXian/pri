package day20.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test3Server {
	public static void main(String[] args)throws Exception{
		/**
		 * 2）【客户1】给【服务生1】"500元钱"，
		 * 【服务生1】给【客户1】"篮球鞋"(耗时5秒)
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
		 
		 /**
		  * 服务生把“篮球鞋”给客户1
		  */
		//找到当前客户的输出流-包装为可以写字符串的DataOutputStream
		DataOutputStream dos=new DataOutputStream(client1.getOutputStream());
		//
		dos.writeUTF("库里5代篮球鞋");
		dos.flush();
		
		
		
		
		/**
		 * 	      b）nike服务店-派服务生等待客户的到来->没来人一直在门口等待->来了之后把人带入店中，为其服
		 */
         /**
          * accept会暂停执行-等待客户连接-没有客户一致等待
          */
         System.out.println("服务生2等待客户中");
		 Socket client2=  nikeStore.accept();
		 System.out.println("服务生2等待带了一个客户："+client2);
		
		 /**
		  * e）（服务器接收客户端的数据）服务生把【500元】收入柜中
		  */
		//找到当前客户的输入流-包装为可以读字符串的DataInputStream
		 DataInputStream dis2=new DataInputStream(client2.getInputStream());
		 //
		 /**
          * read....会暂停执行-等待对方发送数据，没有数据的时候-一致等待
          */
		 System.out.println("等待收钱！");
		 String readData2=dis2.readUTF();
		 System.out.println("服务生2收的钱："+readData2);
		 
		 /**
		  * 服务生把“篮球鞋”给客户1
		  */
		//找到当前客户的输出流-包装为可以写字符串的DataOutputStream
		DataOutputStream dos2=new DataOutputStream(client2.getOutputStream());
		//
		dos2.writeUTF("库里5代篮球鞋");
		dos2.flush();
		 
	}
}
