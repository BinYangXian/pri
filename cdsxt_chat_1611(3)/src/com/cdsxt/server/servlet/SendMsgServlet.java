package com.cdsxt.server.servlet;

import java.util.Map;

import com.cdsxt.server.util.SocketUtil;

public class SendMsgServlet extends BaseServlet {

	@Override
	public void service(String data, String userpath, SocketUtil su,
			Map<String, SocketUtil> onlineUserMap) throws Exception {
		//数据格式：消息内容-发送人-接收人1,接收人2....
		String [] dataArr= data.split("-");
		String msgContent=dataArr[0];
		String sendUname=dataArr[1];
		String [] recUnames=dataArr[2].split(",");
		//给所有的接收人发送消息
		for (String recUname : recUnames) {
			//找到接收人的管道
			SocketUtil recUnameSu= onlineUserMap.get(recUname);
			//发送数据：用户消息_发送人,消息内容
			String sendData="用户消息_"+sendUname+","+msgContent;
			//发送
			recUnameSu.writeData(sendData);
		}
	}
}
