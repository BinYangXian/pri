package com.cdsxt.client;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.cdsxt.client.util.SocketUtil;



/**
 * 
 * 注册窗口的类-
 * 包含了-注册窗口显示组件和事件的代码
 *
 */
public class RegisterFrame extends JFrame{
	
	/**
	 * 成员变量-窗口里有些子组件需要多个成员方法共享-设置为成员变量-通过this共享
	 */
	JButton regBtn;
	JButton resetBtn;
	JTextField unameField;
	JTextField pwdField;
	/**
	 * 构造器：创建一个注册窗口
	 * 1）初始化窗口的信息
	 * 2）添加子组件及初始化子组件信息
	 * 3）设置事件
	 */
	public RegisterFrame() {
		
		//1
		this.initMainWindow();
		//2
		this.initSubCompent();
		//3
		this.setEvent();
	}
	/**
	 * 3）设置事件
	 */
	private void setEvent() {
		//注册的事件
		this.regBtn.addActionListener((ActionEvent e)->{
			//取出用户名和密码
			String uname= this.unameField.getText();
			String pwd= this.pwdField.getText();
			//拼接传给服务器的数据的格式
			//格式：用户注册_用户账号,用户密码
			String sendData= "用户注册_"+uname+","+pwd;
			System.out.println("客户端发送的数据："+sendData);
			//来一个连接
			SocketUtil su=new SocketUtil("localhost", 7788);
			//发数据
			su.writeData(sendData);
			//接收数据
			String recData= su.readData();
			String []recDataArr= recData.split("_");
//		  	  用户注册_注册成功
//            用户注册_注册失败,失败原因
			//根据数据显示注册的结果
			if(recDataArr[1].equals("注册成功")){
				JOptionPane.showMessageDialog(this, "注册成功");
			}else{
				JOptionPane.showMessageDialog(this, "注册失败-》"+recData.split(",")[1]);
			}
			
		});
	}
	/**
	 *  1）初始化窗口的信息
	 */
	public void initMainWindow(){
		//屏幕大小
		Dimension d= Toolkit.getDefaultToolkit().getScreenSize();
		//计算并设置窗口的大小和位置
		int x=(int) (d.getWidth()/4);
		int y=(int) (d.getHeight()/4);
		
		//设置标题
		this.setTitle("注册界面");
		//设置位置
		this.setLocation(x, y);
		//设置大小
		this.setSize(400, 250);
		//点击窗口关闭程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//绝对布局
		this.setLayout(null);
	}
	/**
	 *  2）添加子组件及初始化子组件信息
	 */
	public void initSubCompent(){
		//用户名密码标签
		JLabel unameLabel=new JLabel("用户名：");
		JLabel pwdLabel=new JLabel("密    码：");
		
		//用户名密码标签-位置和大小
		unameLabel.setBounds(50, 35, 70, 30);
		pwdLabel.setBounds(50, 75, 70, 30);
		
		//用户名和密码输入框
		this.unameField=new JTextField();
		this.pwdField=new JTextField();
		//用户名和密码输入框-位置和大小
		unameField.setBounds(140, 35, 160, 30);
		pwdField.setBounds(140, 75, 160, 30);
		
		//登录和重置的按钮
		this.regBtn=new JButton("注册");
		this.resetBtn=new JButton("重置");
		//登录和重置的按钮-位置和大小
		this.regBtn.setBounds(70, 125, 90, 40);
		this.resetBtn.setBounds(190, 125, 90, 40);
		
		//添加子组件到窗口中
		this.add(unameLabel);
		this.add(pwdLabel);
		this.add(unameField);
		this.add(pwdField);
		this.add(regBtn);
		this.add(resetBtn);
	}
	
}
