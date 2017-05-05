package swing;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Test10 {
	public static void main(String[] args) {
		/**
		 * 2、登录窗口，swing事件处理线程是UI更新是同一个线程 ，不能在事件处理线程里做耗时任务，否则界面会卡住
		 * 
		 * 
		 * --》累加计算器
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
 * 	    2）添加子组件及其配置：往顶级容器组件对象里添加子组件（普通容器，普通组件），及相关信息配置。
 */
		//用户名和密码标签
		JLabel unameLabel=new JLabel("最小值：");
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
		logBtn.setBounds(200, 250, 80, 50);
		JButton resetBtn=new JButton("重置");
		resetBtn.setBounds(300, 250, 80, 50);
		System.out.println("当前的代码的线程（main的线程）："+Thread.currentThread());
		
		logBtn.addActionListener((ActionEvent e)-> {
			    //swing的事件和ui操作都是同一个线程-如果事件里执行时间过程-ui就会卡主
				System.out.println("当前的代码的线程（事件的线程）："+Thread.currentThread());
				/**
				 * 曾小贤-累加最小值到最大值之间的和
				 */
				int min=Integer.parseInt(unameField.getText());
				int max=Integer.parseInt(pwdField.getText()) ;
				//
				int sum=0;
				for (int num = min; num <=max; num++) {
					//计算
					sum+=num;
					//花了100毫秒
					try {
						Thread.sleep(100);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				//显示结果
				JOptionPane.showMessageDialog(jf, "计算的和："+sum);
				
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
