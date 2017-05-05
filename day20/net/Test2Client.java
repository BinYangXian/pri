package day20.net;

import java.io.DataOutputStream;
import java.net.Socket;

public class Test2Client {

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
	}
}
