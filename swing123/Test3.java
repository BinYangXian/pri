package swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test3 {
	public static void main(String[] args) {
		/**
		 * 
		 * 3、边框布局1，窗口加入子组件，及子组件配置。
		 * 
		 * 使用边框布局步骤
		 * 1）创建边框布局BorderLayout对象
		 * 2）容器设置边框布局到布局管理器
		 * 3）容器添加子组件
		 *   容器.add(子组件，对应的位置（中，北...）)
		 *   
		 * 注意点：边框布局的中间区域可以自动填满其他空白区域
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
		jf.setSize(400, 200);
		//点击窗口关闭程序
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//1）创建边框布局BorderLayout对象
		BorderLayout bl= new BorderLayout();
		//2）容器设置边框布局到布局管理器
		jf.setLayout(bl);
	    /**
	     * 2）添加子组件及其配置：往顶级容器组件对象里添加子组件（普通容器，普通组件），及相关信息配置。
	     */
		JButton btn1=new JButton("按钮1");
		JButton btn2=new JButton("按钮2");
		JButton btn3=new JButton("按钮3");
		JButton btn4=new JButton("按钮4");
//		3）容器添加子组件容器.add(子组件，对应的位置（中，北...）)
		jf.add(btn1,BorderLayout.NORTH );
		jf.add(btn2,BorderLayout.WEST );
		jf.add(btn3,BorderLayout.SOUTH );
		jf.add(btn4,BorderLayout.CENTER);
	    /**
	     * 3）显示所有组件：通过顶级容器调用setVisible来显示顶级组件及所有子组件。
	     */
		jf.setVisible(true);
	}
}
