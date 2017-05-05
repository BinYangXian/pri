package swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 2、绝对布局1，窗口加入子组件，及子组件配置。
		 * 
		 * 把一个组件绝对定位的步骤：
                a）把容器布局管理器设为null
                b）把子组件添加到容器中
                c）指定子组件需要的位置和大小
		 * 
		 * 注意点
		 * -》子组件添加的时候-位置相对父组件左上角的位置
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
		jf.setTitle("第一个窗口！");
		//设置位置
		jf.setLocation(420, 100);
		//设置大小
		jf.setSize(400, 600);
		//点击窗口关闭程序
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// a）把容器布局管理器设为null
		jf.setLayout(null);
/**
 * 	    2）添加子组件及其配置：往顶级容器组件对象里添加子组件（普通容器，普通组件），及相关信息配置。
 */
		//来3个按钮
		JButton btn1=new JButton("按钮1");
		//设置位置和大小
		btn1.setBounds(100, 50, 220, 50);
		JButton btn2=new JButton("按钮2");
		btn2.setBounds(100, 150, 220, 50);
		JButton btn3=new JButton("按钮3");
		btn3.setBounds(100, 250, 220, 50);
		//添加按钮到窗口中
		jf.add(btn1);
		jf.add(btn2);
		jf.add(btn3);
/**
 * 	    3）显示所有组件：通过顶级容器调用setVisible来显示顶级组件及所有子组件。
 */
		jf.setVisible(true);
	}
}
