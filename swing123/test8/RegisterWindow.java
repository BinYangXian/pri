package swing.test8;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//RegisterWindow继承JFrame  -RegisterWindow（注册窗口）
public class RegisterWindow extends JFrame{
	//成员变量-保存登录窗口的组件-用户名密码...
	JLabel unameLabel;
	JTextField unameField;
	//注册按钮
	JButton regBtn;
	//去登录的按钮
	JButton goLogBtn;
	
	public RegisterWindow() {
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
		 * 3)设置事件
		 */
		this.setEvent();
	}

	private void setEvent() {
		//去登录事件
		this.goLogBtn.addActionListener((ActionEvent e)-> {
			//注册窗口隐藏
			this.setVisible(false);
			//Test8.regWin.setVisible(false);
			//登录窗口显示
			Test8.logWin.setVisible(true);
		});
	}

	private void initSubCompent() {
		this.unameLabel=new JLabel("用户名：");
		this.unameLabel.setBounds(100, 50, 100, 50);
		this.unameField=new JTextField();
		this.unameField.setBounds(250, 50, 150, 50);
		
		this.regBtn=new JButton("注册");
		this.regBtn.setBounds(250, 150, 150, 50);
		this.goLogBtn=new JButton("去登录");
		this.goLogBtn.setBounds(250, 250, 150, 50);
		
		this.add(this.unameLabel);
		this.add(this.unameField);
		this.add(this.regBtn);
		this.add(this.goLogBtn);
	}

	private void initWindow() {
		//设置标题
		this.setTitle("注册界面");
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
