package swing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class SocketUtil {
	
	public Socket client;
	public BufferedReader br;
	public BufferedWriter bw;
	
	public SocketUtil() {
		initSocket("localhost", 8888);
	}
	public SocketUtil(String host,int port) {
		initSocket(host, port);
	}
	private void initSocket(String host,int port){
		try {
			//建立连接
			this.client=new Socket(host, port);
			//封装输入输出流
			br=new BufferedReader(new InputStreamReader(this.client.getInputStream()));
			bw=new BufferedWriter(new OutputStreamWriter(this.client.getOutputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	/**
	 * 业务方法
	 */
	//发送数据给服务器
	public void sendData(String data){
		try {
			bw.write(data);
			bw.newLine();
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	//发送数据给服务器，并接收服务器的数据
	public String sendDataReceiveData(String data){
		try {
			bw.write(data);
			bw.newLine();
			bw.flush();
			//等待接收
			String receiveData= br.readLine();
			return receiveData;
		} catch (Exception e) {
			return null;
		}
	}
	//只是接收服务器数据
	public String receiveData(){
		try {
			//等待接收
			String receiveData= br.readLine();
			return receiveData;
		} catch (Exception e) {
			return null;
		}
	}
}
