package com.cdsxt.client.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 封装了socket的工具类
 * 
 * -为socket提供了便捷的读取和写出字符串String的功能
 *
 */
public class SocketUtil {

	//成员变量-
	Socket socket;
	BufferedReader br;
	BufferedWriter bw;
	
	//创建
	public SocketUtil(String host,int port) {
		try {
			Socket socket=new Socket(host, port);
			this.socket=socket;
			Reader isr=new InputStreamReader(this.socket.getInputStream(),"gbk");
			this.br=new BufferedReader(isr);
			
			Writer osw=new OutputStreamWriter(this.socket.getOutputStream(),"gbk");
			this.bw=new BufferedWriter(osw);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//创建SocketUtil对象-传入socket进行包装
	public SocketUtil(Socket socket) {
		try {
			this.socket=socket;
			Reader isr=new InputStreamReader(this.socket.getInputStream(),"gbk");
			this.br=new BufferedReader(isr);
			
			Writer osw=new OutputStreamWriter(this.socket.getOutputStream(),"gbk");
			this.bw=new BufferedWriter(osw);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * 读取字符串
	 */
	public String readData(){
		String data;
		try {
			data = this.br.readLine();
			return data;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 写出字符串
	 */
	public void writeData(String data){
		try {
			this.bw.write(data);
			this.bw.newLine();
			this.bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
