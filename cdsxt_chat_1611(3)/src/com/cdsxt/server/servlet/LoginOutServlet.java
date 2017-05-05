package com.cdsxt.server.servlet;

import java.io.File;
import java.io.FileReader;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import sun.util.logging.resources.logging;

import com.cdsxt.server.util.SocketUtil;

/**
 * 
 * servlet包：封装处理用户各种业务操作的类
 * 
 * LoginOutServlet：处理用户注销操作的类
 */

public class LoginOutServlet  extends BaseServlet{

	/**
	 *处理登录
	 */
	@Override
	public void service(String data,String userPath,
			SocketUtil su,Map<String, SocketUtil> onlineUserMap)throws Exception{
		//data格式：用户名
		String uname=data;
		//删除服务器登录的对应用户
		onlineUserMap.remove(uname);
		//更新列表
		LoginServlet log= new LoginServlet();
		log.sendUserNamesForAllUser(onlineUserMap);
	}
	
}
