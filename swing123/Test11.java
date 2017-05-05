package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Test11 {
	public static void main(String[] args) {
		/**
		 * 3、背景色，前景色，字体，图片。
		 * --》累加计算器
		 * 
		 * 在红色的纸上用蓝色笔画图-》
		 * 背景色：纸的颜色-》红色
		 * setBackground
		 * 
		 * 前景色：笔的颜色-》蓝色
		 * 
		 * setForeground
		 * 
		 * 字体
		 * setFont
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
		jf.setTitle("累加计算器");
		//设置位置
		jf.setLocation(420, 200);
		//设置大小
		jf.setSize(600, 400);
		//点击窗口关闭程序
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//窗口布局管理器设置为绝对布局
		jf.setLayout(null);
		/**
		 * 窗口jframe的颜色
		 * jframe添加组件的时候-加在内容容器中-设置内容容器背景色
		 */
		jf.getContentPane().setBackground(Color.gray);
		
/**
 * 	    2）添加子组件及其配置：往顶级容器组件对象里添加子组件（普通容器，普通组件），及相关信息配置。
 */
		//用户名和密码标签
		JLabel unameLabel=new JLabel("最小值：");
		
		//显示边框
		unameLabel.setBorder(BorderFactory.createLineBorder(Color.gray));
		/**
		 * jlabel设置背景色-需要把背景设置-不透明
		 * setOpaque(true)
		 */
		//最小值-背景不透明
		unameLabel.setOpaque(true);
		//最小值-背景色-黄色
		unameLabel.setBackground(Color.yellow);
		//最小值-前景色-红色
		unameLabel.setForeground(Color.red);
		
		JLabel pwdLabel=new JLabel("最大值：");
		
		unameLabel.setBounds(100, 50, 100, 50);
		pwdLabel.setBounds(100, 150, 100, 50);
		
		//用户名和密码输入框
		JTextField unameField=new JTextField();
		JTextField pwdField=new JTextField();
		
		unameField.setBounds(250, 50, 150, 50);
		pwdField.setBounds(250, 150, 150, 50);
		
		//累加的按钮
		JButton logBtn=new JButton("累加");
		//累加-背景色-黄色
		logBtn.setBackground(Color.yellow);
		
		//累加按钮-的字体
		logBtn.setFont(new Font("微软雅黑",Font.BOLD , 18));
		
		logBtn.setBounds(200, 250, 80, 50);
		JButton resetBtn=new JButton("重置");
		resetBtn.setBounds(300, 250, 80, 50);
		
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
