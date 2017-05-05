package com.cdsxt.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.Socket;


import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;








import javax.swing.SwingConstants;
import javax.swing.border.Border;


import com.cdsxt.client.util.SocketUtil;



/**
 * 
 * 登录窗口的类-
 * 包含了-登录窗口显示组件和事件的代码
 *
 */
public class ChatFrame extends JFrame{
	
	
	/**
	 * 构造器：创建一个登录窗口
	 * 1）初始化窗口的信息
	 * 2）添加子组件及初始化子组件信息
	 * 3）设置事件
	 * @param curSu 登录的用户的连接
	 * a）用户取出服务器发送数据（消息，更新列表）
	 * b）可以用于发送消息
	 */
	//用于存储当前登录过的用户的连接
	SocketUtil curSu;
	//用于存储当前登录过的用户名字
	String curUname;
	//在线用户列表
	JList onLineList;
	//发送消息按钮
	JButton sendBtn;
	//消息输入框
	JTextField msgField;
	JTextArea msgList;
	/**
	 * @param su 用于接收登录界面传入的登录过的用户的连接
	 * @param uname 
	 */
	public ChatFrame(SocketUtil su, String uname) {
		//存储数据
		this.curSu=su;
		this.curUname=uname;
		//1
		this.initMainWindow();
		//2
		this.initSubCompent();
		//3
		this.setEvent();
		//读取服务器的数据
		this.readServerData();
	}
	/**-新线程接收数据（不能阻塞ui线程）
	 * 接收服务器数据(更新列表的数据，消息数据，提示数据)
	 */
	private void readServerData() {
		new Thread(()->{
			while(true){
				//读服务器数据
				String recData= this.curSu.readData();
				//取出数据和类别
				String type=recData.split("_")[0];
				String data=recData.split("_")[1];
				//根据接收的数据类型进行不同的处理
				if("列表更新".equals(type)){
					//data格式：用户名1,用户名2,用户名3...
					String[] listData= data.split(",");
					//把数据设置到在线用户列表中（jlist）
					this.onLineList.setListData(listData);
				}else if("用户消息".equals(type)){
					//data格式：发送人,消息内容
					String[]dataArr= data.split(",");
					//显示格式：[柳岩]：你好啊
					String dispalyData="["+dataArr[0]+"]:"+dataArr[1]+"\n";
					//把数据-追加到消息列表
					this.msgList.append(dispalyData);
				}
			}
		}).start();
	}
	/**
	 * 3）设置事件
	 */
	private void setEvent() {
		//关闭的事件-注销（下线）
		this.setCloseEvent();
		//发送消息
		this.setSendMsgEvent();
		
	}
	private void setSendMsgEvent() {
		this.sendBtn.addActionListener((ActionEvent e)-> {
			//数据格式： 发送消息_消息内容-发送人-接收人1,接收人2....
			StringBuilder sendData= new StringBuilder("发送消息_");
			String msgContent=this.msgField.getText();
			sendData.append(msgContent);
			sendData.append("-");
			String sendUname=this.curUname;
			sendData.append(sendUname);
			sendData.append("-");
			//拿到所有选中的名字
			Object[] selNames= this.onLineList.getSelectedValues();
			for (Object name : selNames) {
				sendData.append(name);
				sendData.append(',');
			}
			sendData.deleteCharAt(sendData.length()-1);
			
			//发送数据
			this.curSu.writeData(sendData.toString());
			
		});
	}
	private void setCloseEvent() {
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				//发送下线的数据给服务器
				//格式：用户注销_用户名
				String sendData="用户注销_"+ChatFrame.this.curUname;
				//String sendData="用户注销_"+curUname;
				//发送数据
				ChatFrame.this.curSu.writeData(sendData);
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
		int x=(int) (d.getWidth()/3);
		int y=(int) (d.getHeight()/8);
		
		//设置标题
		this.setTitle("聊天界面");
		//设置位置
		this.setLocation(x, y);
		//设置大小
		this.setSize(400, 600);
		//点击窗口关闭程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//边框布局
		this.setLayout(new BorderLayout(5,5));
	}
	/**
	 *  2）添加子组件及初始化子组件信息
	 */
	public void initSubCompent(){
		//初始化上方的子组件
		initTopSubCompent();
		//初始化左方的子组件
		initLeftSubCompent();
		//初始化下方的子组件
		initDownSubCompent();
		//初始化中间的子组件
		initCenterSubCompent();
	}
	private void initCenterSubCompent() {
		//中间的容器
		JPanel centerPa=new JPanel();
		centerPa.setLayout(new BorderLayout());
		
		//提示文字
		JLabel tishi=new JLabel("用户消息列表",SwingConstants.CENTER);
		tishi.setFont(new Font("微软雅黑", Font.BOLD, 18));
		tishi.setForeground(Color.WHITE);
		tishi.setOpaque(true);
		tishi.setBackground(Color.black);
		tishi.setBorder(BorderFactory.createLineBorder(new Color(75,130,5), 2));
		tishi.setPreferredSize(new Dimension(0, 80));
		//消息列表
		this.msgList=new JTextArea();
		this.msgList.setBackground(new Color(19,43,11));
		this.msgList.setFont(new Font("微软雅黑", Font.BOLD, 15));
		this.msgList.setForeground(Color.WHITE);
		this.msgList.setLineWrap(true);
		JScrollPane msgListSp=new JScrollPane();
		msgListSp.setViewportView(this.msgList);
		//把子组件加入到中间容器
		centerPa.add(tishi,BorderLayout.NORTH);
		centerPa.add(msgListSp,BorderLayout.CENTER);
		//把中间容器放入窗口
		this.add(centerPa,BorderLayout.CENTER);
	}
	private void initDownSubCompent() {
		//下方的容器
		JPanel downPa=new JPanel();
		downPa.setLayout(new BorderLayout());
		downPa.setPreferredSize(new Dimension(0, 60));
		
		//全部选择和取消的按钮
		JComboBox box=new JComboBox(new String[]{"全部选择","全部取消"});
		box.setPreferredSize(new Dimension(120, 0));

		box.setBackground(new Color(75,130,5));
		box.setFont(new Font("微软雅黑", Font.BOLD, 18));
		box.setForeground(Color.WHITE);
		//消息输入框
		this.msgField=new JTextField();
		this.msgField.setFont(new Font("微软雅黑", Font.BOLD, 18));
		//发送消息按钮		
		this.sendBtn=new JButton("发送");
		this.sendBtn.setBackground(new Color(75,130,5));
		this.sendBtn.setFont(new Font("微软雅黑", Font.BOLD, 18));
		this.sendBtn.setForeground(Color.WHITE);
//		tishi2.setBorder(BorderFactory.createLineBorder(new Color(75,130,5), 2));
		//把三个子组件放入下方容器
		downPa.add(box,BorderLayout.WEST);
		downPa.add(msgField,BorderLayout.CENTER);
		downPa.add(this.sendBtn,BorderLayout.EAST);
		//把下方容器放入窗口
		this.add(downPa,BorderLayout.SOUTH);
	}
	private void initLeftSubCompent() {
		//左方的容器
		JPanel leftPa=new JPanel();
		leftPa.setLayout(new BorderLayout());
		leftPa.setPreferredSize(new Dimension(120, 0));
		//提示文字1
		JLabel tishi1=new JLabel("在线用户列表",SwingConstants.CENTER);
		tishi1.setFont(new Font("微软雅黑", Font.BOLD, 18));
		tishi1.setOpaque(true);
		tishi1.setBackground(Color.black);
		tishi1.setForeground(Color.WHITE);
		tishi1.setBorder(BorderFactory.createLineBorder(new Color(75,130,5), 2));
		tishi1.setPreferredSize(new Dimension(0, 80));
		//提示文字2
		JLabel tishi2=new JLabel("点击Ctrl多选",SwingConstants.CENTER);
		tishi2.setFont(new Font("微软雅黑", Font.BOLD, 18));
		tishi2.setOpaque(true);
		tishi2.setBackground(Color.black);
		tishi2.setForeground(Color.WHITE);
		tishi2.setBorder(BorderFactory.createLineBorder(new Color(75,130,5), 2));
		tishi2.setPreferredSize(new Dimension(0, 80));
		//在线用户列表
		this.onLineList=new JList(new String[]{"柳岩","刘德华"});
		this.onLineList.setFont(new Font("微软雅黑", Font.BOLD, 18));
		this.onLineList.setBackground(new Color(75,130,5));
		this.onLineList.setForeground(Color.WHITE);
		this.onLineList.setBorder(BorderFactory.createLineBorder(new Color(75,130,5), 2));
		//把提示文字和列表装入左方容器
		leftPa.add(tishi1,BorderLayout.NORTH);
		leftPa.add(this.onLineList,BorderLayout.CENTER);
		leftPa.add(tishi2,BorderLayout.SOUTH);
		//把左方容器放入窗口
		this.add(leftPa,BorderLayout.WEST);
	}
	private void initTopSubCompent() {
		//上方的容器
		JPanel topPa=new JPanel();
		topPa.setLayout(new BorderLayout());
		//头像
		JLabel touxiang=new JLabel(new ImageIcon("src/resources/images/touxiang.png"));
		touxiang.setBorder(BorderFactory.createLineBorder(new Color(75,130,5), 2));
		//欢迎文字
		JLabel welcome=new JLabel("欢迎你："+this.curUname,SwingConstants.CENTER);
		welcome.setFont(new Font("微软雅黑", Font.BOLD, 22));
		welcome.setOpaque(true);
		welcome.setBackground(Color.black);
		welcome.setForeground(Color.WHITE);
		welcome.setBorder(BorderFactory.createLineBorder(new Color(75,130,5), 2));
		//头像文字装入上方容器
		topPa.add(touxiang,BorderLayout.WEST);
		topPa.add(welcome,BorderLayout.CENTER);
		//上方容器加入窗口
		this.add(topPa,BorderLayout.NORTH);
	}
	
}
