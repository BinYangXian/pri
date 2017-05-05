package swing;

import javax.swing.JFrame;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 
		 * 1、最基本的窗口，及jframe配置
		 * 
		 * 图形程序开发
		 * 基本步骤
    1）创建顶级容器及其配置：创建顶级容器组件对象，设置相关配置信息。
    2）添加子组件及其配置：往顶级容器组件对象里添加子组件（普通容器，普通组件），及相关信息配置。
    3）显示所有组件：通过顶级容器调用setVisible来显示顶级组件及所有子组件。
		 */
		showWindow();
	}
	private static void showWindow() {
//		1）创建顶级容器及其配置：创建顶级容器组件对象，设置相关配置信息。
		//来一个窗口
		JFrame jf=new JFrame();
		//设置标题
		jf.setTitle("第一个窗口！");
		//设置位置
		jf.setLocation(420, 100);
		//设置大小
		jf.setSize(400, 200);
		//点击窗口关闭程序
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	    2）添加子组件及其配置：往顶级容器组件对象里添加子组件（普通容器，普通组件），及相关信息配置。
//	    3）显示所有组件：通过顶级容器调用setVisible来显示顶级组件及所有子组件。
		jf.setVisible(true);
	}
}
