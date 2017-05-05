package swing.test8;

public class Test8 {
	//来一个登录窗口
	public static LoginWindow logWin= new LoginWindow();
	//来一个注册窗口
	public static  RegisterWindow regWin= new RegisterWindow();
	public static void main(String[] args) {
		
		//显示登录窗口
		Test8.logWin.setVisible(true);
		//显示注册窗口
		//regWin.setVisible(true);
	}
}
