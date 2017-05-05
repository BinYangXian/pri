package day20.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Test3Client {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		/**
		 * 本机的ip：

		 * 真实ip： ipconfig -》查询   192.168.10.222
		 * 固定ip： 127.0.0.1
		 * 
		 * 本机的域名：localhost
		 */
		
		/**
		 * c）（建立连接）客户走到指定服装店和等待的服务生手拉手，进入店里
		 */
		
		Socket client1=new Socket("localhost", 9999);
		
		/**
		 *  d）（客户端给服务器传数据） 客户把【500元】给服务生
		 */
		//找到当前客户的输出流-包装为可以写字符串的DataOutputStream
		DataOutputStream dos=new DataOutputStream(client1.getOutputStream());
		//
		dos.writeUTF("500元");
		dos.flush();
		
		 /**
		  *  客户1把收到的鞋带走
		  */
		//找到当前客户的输入流-包装为可以读字符串的DataInputStream
		 DataInputStream dis=new DataInputStream(client1.getInputStream());
		 //
		 /**
         * read....会暂停执行-等待对方发送数据，没有数据的时候-一致等待
         */
		 System.out.println("等待收鞋！");
		 String readData=dis.readUTF();
		 System.out.println("客户1收的鞋："+readData);
	}
}
