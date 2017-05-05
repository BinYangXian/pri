package com.cdsxt.server.servlet;

import java.util.Map;

import com.cdsxt.server.util.SocketUtil;

/**
 * 业务处理类的超类-》定义通用的功能和数据
 *
 */
public abstract class BaseServlet {
	/**
	 * 处理业务的功能
	 * @param data 当前处理的数据
	 * @param userpath 服务保存用户信息的文件路径
	 * @param su  当前用户连接
	 * 
	 */
	public abstract void service(String data, String userpath,SocketUtil su,Map<String, SocketUtil> onlineUserMap)throws Exception;
	
}
