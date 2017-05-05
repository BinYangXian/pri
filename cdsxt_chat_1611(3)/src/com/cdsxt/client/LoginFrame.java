package com.cdsxt.client;

import java.awt.Color;
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
 * 登录窗口的类-
 * 包含了-登录窗口显示组件和事件的代码
 *
 */
public class LoginFrame extends JFrame{
	
	/**
	 * 成员变量-窗口里有些子组件需要多个成员方法共享-设置为成员变量-通过this共享
	 */
	JButton logBtn;
	JButton resetBtn;
	JTextField unameField;
	JTextField pwdField;
	//去注册的按钮
	JButton goRegBtn;
	/**
	 * 构造器：创建一个登录窗口
	 * 1）初始化窗口的信息
	 * 2）添加子组件及初始化子组件信息
	 * 3）设置事件
	 */
	public LoginFrame() {
		
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
	
		
		//登录的事件
		this.setLogingEvent();
		
		//去注册事件
		this.setGoRegEvent();
		
	}
	
	private void setGoRegEvent() {
		this.goRegBtn.addActionListener((ActionEvent e)-> {
			//登录窗口隐藏
			this.setVisible(false);
			//等待
			try {
				Thread.sleep(300);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			//注册窗口显示
			StartClient.regWin.setVisible(true);
		});
	}
	private void setLogingEvent() {
		this.logBtn.addActionListener((ActionEvent e)-> {
			//取出用户名和密码
			String uname= this.unameField.getText();
			String pwd= this.pwdField.getText();
			//拼接数据格式
			// 用户登录_用户账号,用户密码  
			String sendData="用户登录_"+uname+","+pwd;
			//发送数据到服务器
			//来一个连接
			SocketUtil su=new SocketUtil("localhost", 7788);
			//通过连接发数据
			su.writeData(sendData);
			//接收登录结果
			String recData= su.readData();
			String []recDataArr= recData.split("_");
			/**
			 * 数据格式：
			 * 
			 * 用户登录_登录成功
                                       用户登录_登录失败,失败原因
			 */
			if(recDataArr[1].equals("登录成功")){
				/**
				 * 显示主界面
				 */
				//JOptionPane.showMessageDialog(this, "显示主界面");
				//来一个主界面-传入当前登录用户的管道，和名字
				ChatFrame cf=new ChatFrame(su,uname);
				//显示
				cf.setVisible(true);
				//隐藏登录界面
				this.setVisible(false);
			}else{
				JOptionPane.showMessageDialog(this, "登录失败-》"+recData.split(",")[1]);
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
		this.setTitle("登录界面");
		//设置位置
		this.setLocation(x, y);
		//设置大小
		this.setSize(400, 250);
		//背景色
		this.getContentPane().setBackground(new Color(19,43,11));
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
		unameLabel.setForeground(Color.white);
		JLabel pwdLabel=new JLabel("密    码：");
		pwdLabel.setForeground(Color.white);
		
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
		this.logBtn=new JButton("登录");
		this.resetBtn=new JButton("重置");
		//登录和重置的按钮-位置和大小
		this.logBtn.setBounds(70, 125, 90, 40);
		this.resetBtn.setBounds(190, 125, 90, 40);
		//
		this.goRegBtn=new JButton("去注册");
		this.goRegBtn.setBounds(300, 135, 80, 30);
		
		//添加子组件到窗口中
		this.add(unameLabel);
		this.add(pwdLabel);
		this.add(unameField);
		this.add(pwdField);
		this.add(logBtn);
		this.add(resetBtn);
		this.add(this.goRegBtn);
	}
	
}
