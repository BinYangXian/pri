package swing;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test4 {
	public static void main(String[] args) {
		/**
		 * 
		 * 4、边框布局2，窗口加入子组件，及子组件配置，子组件高度，宽度配置。
		 * 
		 * 注意点：
		 * 1）边框布局的中间区域可以自动填满其他空白区域
		 * 2）对于北边和南边组件可以设置高度，东和西可以设置宽度
		 * 3)如果子组件放入容器中（通过布局管理者管理）
		 * 那么设置大小setPreferredSize设置此组件的首选大小
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
		JButton btn1=new JButton("按钮1");
		//把按钮1的高度设置为100
		btn1.setPreferredSize(new Dimension(3000, 100));
		JButton btn2=new JButton("按钮2");
		//把按钮2的宽度设置为150
		btn2.setPreferredSize(new Dimension(150, 13213));
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
