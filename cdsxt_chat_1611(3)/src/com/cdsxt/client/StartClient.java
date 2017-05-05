package com.cdsxt.client;

import com.cdsxt.client.util.SocketUtil;

public class StartClient {
	//登录窗口
	public static LoginFrame logWin=new LoginFrame();
	//注册窗口
	public static RegisterFrame regWin=new RegisterFrame();
	
	
	public static void main(String[] args) {
		
		//显示登录窗口
		logWin.setVisible(true);
		//显示聊天窗口
//		ChatFrame cf= new ChatFrame(null);
//		cf.setVisible(true);
	}
}
