package com.cdsxt.server.servlet;

import java.io.File;
import java.io.FileReader;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.cdsxt.server.util.SocketUtil;

/**
 * 
 * servlet包：封装处理用户各种业务操作的类
 * 
 * LoginServlet：处理用户登录操作的类
 */

public class LoginServlet  extends BaseServlet{

	/**
	 *处理登录
	 */
	@Override
	public void service(String data,String userPath,
			SocketUtil su,Map<String, SocketUtil> onlineUserMap)throws Exception{
		//数据格式：用户账号,用户密码
		String []dataArr= data.split(",");
		String uname=dataArr[0];
		String pwd=dataArr[1];
		
		/**
		 *  处理重复登录的代码
		 */
		if(onlineUserMap.containsKey(uname)){
			//已经登录
			su.writeData("用户登录_登录失败,不能重复登录！！");
			//结束方法
			return ;
		}
		//把注册的文件数据加载到properties容器中
		Properties ps=new Properties();
		//加载
		ps.load(new FileReader(new File(userPath)));
		//判断有没有该用户
		/**
		 * 返回数据格式
		 * 用户登录_登录成功
		 * 用户登录_登录失败,失败原因
		 */
		if(ps.containsKey(uname)){
			//取出正确密码
			String realPwd= ps.getProperty(uname);
			//判断密码
			if(realPwd.equals(pwd)){
				//登录成功
				//把当前的用户名和连接存储到服务器
				onlineUserMap.put(uname, su);
				System.out.println("当前服务器的登录用户列表："+onlineUserMap);
				//返回登录状态
				su.writeData("用户登录_登录成功");
				/**
				 * TODO  把服务器里所有在线用户的名字-发送给所有的用户
				 */
				this.sendUserNamesForAllUser(onlineUserMap);
				
			}else{
				//登录失败-密码错误
				su.writeData("用户登录_登录失败,密码错误");
			}
		}else{
			//登录失败-用户名不存在
			su.writeData("用户登录_登录失败,用户名不存在");
		}
	}
	/**
	 * 把服务器里所有在线用户的名字-发送给所有的用户
	 * @param onlineUserMap
	 */
	public void sendUserNamesForAllUser(Map<String, SocketUtil> onlineUserMap) {
		//拿到名字的set
		Set<String> names= onlineUserMap.keySet();
		//格式：列表更新_用户名1,用户名2,用户名3...
		StringBuilder sendData=new StringBuilder("列表更新_");
		for (String name : names) {
			sendData.append(name);
			sendData.append(',');
		}
		//删除最后一个逗号
		sendData.deleteCharAt(sendData.length()-1);
		//找到所有用户的管道
		Collection<SocketUtil> userSocketUtil= onlineUserMap.values();
		//遍历所有的管道分别发数据
		for (SocketUtil su : userSocketUtil) {
			su.writeData(sendData.toString());
		}
	}
}
