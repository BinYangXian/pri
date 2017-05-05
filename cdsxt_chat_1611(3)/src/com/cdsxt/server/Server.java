package com.cdsxt.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import com.cdsxt.server.servlet.BaseServlet;
import com.cdsxt.server.servlet.LoginOutServlet;
import com.cdsxt.server.servlet.LoginServlet;
import com.cdsxt.server.servlet.RegisterServlet;
import com.cdsxt.server.servlet.SendMsgServlet;
import com.cdsxt.server.util.SocketUtil;

/**
 * 服务器类
 * -》一个对象就是一个聊天的服务器
 */
public class Server {
	
	//成员变量
	private ServerSocket ss;
	//服务器用于存储用户信息的文件的路径
	public final String USER_INFO_FILE_PATH;
	//服务器所登录的用户信息（key：用户名，value：连接）
	public Map<String, SocketUtil> onlineUserMap=new HashMap<String, SocketUtil>();
	/**
	 * 启动服务器-服务器运行-可以循环进行接收客户端请求
	 */
	public void startServer(){
		System.out.println("服务器启动了");
		while(true){
	 		try {
	 			//接收一个客户连接
	 			Socket curClient=this.ss.accept();
	 			System.out.println("服务器来了一个连接"+curClient);
	 			//把socket包装为socketutil
	 			SocketUtil su=new SocketUtil(curClient);
	 			//开新线程循环的读取用户的数据并做对应的处理
	 			this.startNewThreadReadData(su);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	private void startNewThreadReadData(SocketUtil su) {
		new Thread(()->{
			while (true) {
				//接受发送的数据
				String revData= su.readData();
				//格式：数据操作类型_数据
				//格式：用户注册_用户账号,用户密码
				String []revDataArr= revData.split("_");
				String type=revDataArr[0];
				String data=revDataArr[1];
				//处理用户对应的操作
				dispatchUserOperation(type,data,su);
			}		
		}).start();
	}
	/**
	 * 处理用户对应的操作
	 * @param data 操作类别
	 * @param type 对应操作的数据
	 * @param su 当前客户的连接
	 */
	public void dispatchUserOperation(String type, String data,SocketUtil su){
		
		try {
			//判断操作
			if("用户注册".equals(type)){
				//使用registerSevlet的service22功能
				BaseServlet bs=new RegisterServlet();
				bs.service(data,this.USER_INFO_FILE_PATH,su,this.onlineUserMap);
				
			}else
			if("用户登录".equals(type)){
				//使用LoginSevlet的service11功能
				BaseServlet bs=new LoginServlet();
				bs.service(data,this.USER_INFO_FILE_PATH,su,this.onlineUserMap);
				
			}else
			if("用户注销".equals(type)){
				BaseServlet bs=new LoginOutServlet();
				bs.service(data,this.USER_INFO_FILE_PATH,su,this.onlineUserMap);
			}else
			if("发送消息".equals(type)){
				BaseServlet bs=new SendMsgServlet();
				bs.service(data,this.USER_INFO_FILE_PATH,su,this.onlineUserMap);
			}else{
				//其他未知操作！！
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	/**
	 * 初始化服务器的套接字
	 * 初始化服务器的存储用户的路径
	 */
	public Server(int port,String userInfoFilePath) {
		
		this.USER_INFO_FILE_PATH=userInfoFilePath;
		try {
			//创建服务器套接字-用于接收客户端连接
			this.ss=new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
