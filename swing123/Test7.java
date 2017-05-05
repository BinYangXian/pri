package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Test7 {
	public static void main(String[] args) {
		/**
		 * 
		 * 7、绝对布局3，登录窗口，添加，登录事件，重置事件--
		 * 普通类（需要把当前类的数据（成员变量，局部变量，静态变量）传入才可以使用）。
		 * 
		 *点击登录按钮——》把用户名和密码拿到打印到控制台
		 * 
		 */
		showWindow();
	}
	private static void showWindow() {
/**
 * 		1）创建顶级容器及其配置：创建顶级容器组件对象，设置相关配置信息。
 */
		//来一个窗口
		JFrame jf=new JFrame();
		//设置标题
		jf.setTitle("登录窗口");
		//设置位置
		jf.setLocation(420, 200);
		//设置大小
		jf.setSize(600, 400);
		//点击窗口关闭程序
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//窗口布局管理器设置为绝对布局
		jf.setLayout(null);
/**
 * 	    2）添加子组件及其配置：往顶级容器组件对象里添加子组件（普通容器，普通组件），及相关信息配置。
 */
		//用户名和密码标签
		JLabel unameLabel=new JLabel("用户名：");
		JLabel pwdLabel=new JLabel("密    码：");
		
		unameLabel.setBounds(100, 50, 100, 50);
		pwdLabel.setBounds(100, 150, 100, 50);
		
		//用户名和密码输入框
		JTextField unameField=new JTextField();
		JTextField pwdField=new JTextField();
		
		unameField.setBounds(250, 50, 150, 50);
		pwdField.setBounds(250, 150, 150, 50);
		
		//登录的按钮
		JButton logBtn=new JButton("登录");
		logBtn.setBounds(200, 250, 80, 50);
		JButton resetBtn=new JButton("重置");
		resetBtn.setBounds(300, 250, 80, 50);
		
		/**
		 * 给登录按钮设置事件
		 * 
		 * 点击登录按钮——》把用户名和密码拿到打印到控制台
		 * 
		 */
		/**jdk 1.6
		 * 匿名内部类的方式添加事件
		 * 
		 * logBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 //点击登录按钮时-执行的代码
				String uname=unameField.getText();
				String pwd=pwdField.getText();
				System.out.println("输入的用户名："+uname);
				System.out.println("输入的密码："+pwd);
			}
		});
		 */
		
		/**
		 * jdk 1.8
		 * 
		 * 
		 */
		logBtn.addActionListener((ActionEvent e)-> {
				 //点击登录按钮时-执行的代码
				String uname=unameField.getText();
				String pwd=pwdField.getText();
				System.out.println("输入的用户名："+uname);
				System.out.println("输入的密码："+pwd);
			}
		);
		
		//
		jf.add(unameLabel);
		jf.add(pwdLabel);
		jf.add(unameField);
		jf.add(pwdField);
		jf.add(logBtn);
		jf.add(resetBtn);
		
/**
 * 	    3）显示所有组件：通过顶级容器调用setVisible来显示顶级组件及所有子组件。
 */
		jf.setVisible(true);
	}
}
