package com.cdsxt.server;

public class StartServer {
	public static void main(String[] args) {
		//来一个服务器
		Server server=new Server(7788, "src/com/cdsxt/server/7788ServerUserInfo.properties");
		//启动服务器
		server.startServer();
	}
}
