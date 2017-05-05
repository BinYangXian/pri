package com.cdsxt.server.servlet;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

import com.cdsxt.server.util.SocketUtil;

/**
 * 
 * servlet包：封装处理用户各种业务操作的类
 * 
 * RegisterServlet：处理用户注册操作的类
 */

public class RegisterServlet extends BaseServlet {
	/**
	 *处理注册
	 */
	@Override
	public void service(String data, String userInfoPath,SocketUtil su)throws Exception{
		//data 格式：用户账号,用户密码
		//取出数据中-用户名和密码
		String []dataArr= data.split(",");
		String uname=dataArr[0];
		String pwd=dataArr[1];
		//读取文件里数据到properties中
		Properties ps=new Properties();
		ps.load(new FileReader(new File(userInfoPath)));
		//检查是否重复注册
		if(ps.containsKey(uname)){
//           用户注册_注册失败,失败原因
			su.writeData("用户注册_注册失败,用户名已经存在了");
		}else{
			//存储用户名和密码到文件
			ps.setProperty(uname, pwd);
			//存储
			ps.store(new FileWriter(new File(userInfoPath)), "comments");
//			 用户注册_注册成功
			su.writeData(" 用户注册_注册成功");
		}
	}
}
