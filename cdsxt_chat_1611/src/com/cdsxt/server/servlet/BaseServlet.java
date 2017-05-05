package com.cdsxt.server.servlet;

import com.cdsxt.server.util.SocketUtil;

/**
 * 业务处理类的超类-》定义通用的功能和数据
 *
 */
public abstract class BaseServlet {
	/**
	 * 处理业务的功能
	 * @param uSER_INFO_FILE_PATH 
	 */
	public abstract void service(String data, String uSER_INFO_FILE_PATH,SocketUtil su)throws Exception;
	
}
