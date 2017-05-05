package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import com.sun.javafx.geom.AreaOp.AddOp;

public class Test12 {
	public static void main(String[] args) {
		/**
		 * 4、jtextarea 多行输入框 jscrollPane	带滚动条的容器 
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
		/**
		 * 在线用户列表
		 */
		//显示列表数据
		Object[] showData=new String[]{"柳岩","范冰冰","李冰冰","刘亦菲"};
		
		//把数据传入给list-创建列表组件
		JList list=new JList(showData);
		//位置和大小
		list.setBounds(100, 50, 100, 150);
		//放入到窗口中
		jf.add(list);
		/**
		 * 消息列表
		 */
		JTextArea ta=new JTextArea();
		//设置自动换行
		ta.setLineWrap(true);
		
		//滚动条的容器-防止JTextArea内容太多-看不到
		//内容超出大小-自动加滚动条
		JScrollPane sp=new JScrollPane();
		//位置和大小
		sp.setBounds(300, 50, 200, 100);
		//把消息列表设置到滚动容器中
		sp.setViewportView(ta);
		
		//把滚动条容器放入到窗口中
		jf.add(sp);
		
		
		//添加消息的按钮
		JButton addMsgBtn=new JButton("添加消息");
		//位置和大小
		addMsgBtn.setBounds(100, 250, 100, 50);
		//放入到窗口中
		jf.add(addMsgBtn);
		//设置添加事件
		addMsgBtn.addActionListener((ActionEvent e)->{
			//生成消息
			/**
			 * 把list【选中】名字拼接为字符串-放入到消息列表
			 */
			//取出选中的名字数组
			Object[] selectArr =list.getSelectedValues();
			//转换为字符串
			String showMsg=Arrays.toString(selectArr);
			
			//添加消息到列表中
			ta.append(showMsg+"\n");
		});
/**
 * 	    3）显示所有组件：通过顶级容器调用setVisible来显示顶级组件及所有子组件。
 */
		jf.setVisible(true);
	
	}
}	
