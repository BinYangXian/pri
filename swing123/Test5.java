package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javafx.scene.image.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Test5 {
	public static void main(String[] args) {
		/**
		 * 
		 * 5、边框布局3，窗口加入容器子组件（jpanel）。（基本聊天界面）
		 * 
		 * jlabel设置对齐：new JLabel(文字，对其方式)
		 * 
		 * 组件设置边框：
		 * 1）创建边框-》BorderFactory 的静态方法
		 * 2）设置边框-》组件.setBorder
		 * 
		 */
		showWindow();
	}
	private static void showWindow() {
		/**
		 * 1）创建顶级容器及其配置：创建顶级容器组件对象，设置相关配置信息。
		 */
		//来一个窗口
		JFrame jf=new JFrame();
		//设置标题
		jf.setTitle("聊天界面！");
		//设置位置
		jf.setLocation(420, 100);
		//设置大小
		jf.setSize(400, 600);
		//点击窗口关闭程序
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//1）创建边框布局BorderLayout对象
		BorderLayout bl= new BorderLayout(5,10);
		//2）容器设置边框布局到布局管理器
		jf.setLayout(bl);
	    /**
	     * 2）添加子组件及其配置：往顶级容器组件对象里添加子组件（普通容器，普通组件），及相关信息配置。
	     */
		/**
		 * 北边 的容器
		 */
		JPanel northPa=new JPanel();
		//把（北边 的容器）高度设置为100
		northPa.setPreferredSize(new Dimension(3000, 100));
		//北边容器-采用边框布局
		northPa.setLayout(new BorderLayout());
		/**
		 * 北边 的容器-添加两个标签-设置文字和图片
		 */
		JLabel lab1=new JLabel(new ImageIcon("src/resoures/imgs/touxiang.png"));
		lab1.setBorder(BorderFactory.createLineBorder(Color.green, 2));
		
		JLabel lab2=new JLabel("欢迎你：xxx",SwingConstants.CENTER);
		northPa.add(lab1,BorderLayout.WEST);
		northPa.add(lab2,BorderLayout.CENTER);
		
		JButton btn2=new JButton("按钮2");
		//把按钮2的宽度设置为150
		btn2.setPreferredSize(new Dimension(150, 13213));
		JButton btn3=new JButton("按钮3");
		
		JButton btn4=new JButton("按钮4");
//		3）容器添加子组件容器.add(子组件，对应的位置（中，北...）)
		jf.add(northPa,BorderLayout.NORTH );
		jf.add(btn2,BorderLayout.WEST );
		jf.add(btn3,BorderLayout.SOUTH );
		jf.add(btn4,BorderLayout.CENTER);
	    /**
	     * 3）显示所有组件：通过顶级容器调用setVisible来显示顶级组件及所有子组件。
	     */
		jf.setVisible(true);
	}
}
