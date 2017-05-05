package swing.test8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//LoginWindow继承JFrame  -LoginWindow（登录窗口）
public class LoginWindow extends JFrame{
	//成员变量-保存登录窗口的组件-用户名密码...
	JLabel unameLabel;
	JTextField unameField;
	//登录按钮
	JButton logBtn;
	//去注册的按钮
	JButton goRegBtn;
	
	public LoginWindow() {
		/**
		 *  1）创建顶级容器及其配置：创建顶级容器组件对象，设置相关配置信息。初始化窗口的信息
		 * 
		 */
		this.initWindow();
		/**
		 * 2）添加子组件及其配置：往顶级容器组件对象里添加子组件（普通容器，普通组件），及相关信息配置。
		 */
		this.initSubCompent();
	
		/**
		 * 3）设置事件
		 */
		this.setEvent();
		
	}
	private void setEvent() {
		//去注册事件
		this.goRegBtn.addActionListener((ActionEvent e)-> {
			//登录窗口隐藏
			this.setVisible(false);
			//注册窗口显示
			Test8.regWin.setVisible(true);
		});
		
	}

	private void initSubCompent() {
		this.unameLabel=new JLabel("用户名：");
		this.unameLabel.setBounds(100, 50, 100, 50);
		this.unameField=new JTextField();
		this.unameField.setBounds(250, 50, 150, 50);
		
		this.logBtn=new JButton("登录");
		this.logBtn.setBounds(250, 150, 150, 50);
		this.goRegBtn=new JButton("去注册");
		this.goRegBtn.setBounds(250, 250, 150, 50);
		
		this.add(this.unameLabel);
		this.add(this.unameField);
		this.add(this.logBtn);
		this.add(this.goRegBtn);
	}

	private void initWindow() {

		//设置标题
		this.setTitle("登录界面");
		//设置位置
		this.setLocation(420, 100);
		//设置大小
		this.setSize(600, 400);
		//点击窗口关闭程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//绝对布局
		this.setLayout(null);
	}
	
	
}
