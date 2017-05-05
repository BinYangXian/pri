package regex.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 开发程序完成    
    a）打印输入的列表
                1）输入数字1进行输入"用户名"（6-8位的数字字母组成，数字不能开头）
                2）输入数字2进行输入"手机号"（11位数字，前两位位必须13或15或18）
                3）输入数字3进行输入"邮箱"（2-5位字母@2-5位字母）
    b）用户输入数字后，进入对应的信息（"用户名"或"手机"或"邮箱"）输入
        如果用户输入信息不匹配要求，则重写输入，直到输入正确，则打印输入的内容(结束程序)。
   提示："用户名"或"手机"或"邮箱"的验证需要用正则验证。
		 */
		app();
	}
	//管理者-类中只需要存储一份-静态的
	private static Scanner sc=new Scanner(System.in);
	
	private static void app() {
		/**
		 * a）打印输入的列表
		 */
		System.out.println("1）输入数字1进行输入\"用户名\"（6-8位的数字字母组成，数字不能开头）");
		System.out.println("2）输入数字2进行输入\"手机号\"（11位数字，前两位位必须13或15或18）");
		System.out.println("3）输入数字3进行输入\"邮箱\"（2-5位字母@2-5位字母）");
		/**
		 *  b）用户输入数字后，进入对应的信息（"用户名"或"手机"或"邮箱"）输入
		 */
		
		//输入
		int num= Test2.sc.nextInt();
		//判断并输入对应的内容
		if(num==1){
			inputRegData("[a-zA-Z][a-zA-Z0-9]{5,7}","请输入\"用户名\"（6-8位的数字字母组成，数字不能开头）");
		}else
		if(num==2){
			inputRegData("1[358]\\d{9}","输入数字2进行输入\"手机号\"（11位数字，前两位位必须13或15或18）");
		}else
		if(num==3){
			//...
		}else{//输入错误！
			System.out.println("输入数字错误！");
		}
	}
	/**
	 * 根据【指定的提示】输入【指定正则表达式】的数据
	 * 输入完成-打印该内容-否则重新输入
	 */
	public static void inputRegData(String reg,String tishi){
		//a）正则对象
	 	Pattern pt=Pattern.compile(reg);
		while(true){
			//输入
			System.out.println(tishi);
		 	String inData= Test2.sc.next();
			//判断输入-正确
		 	//b)正则对象绑定数据-得到匹配器
		    Matcher mt=pt.matcher(inData);
		    //c)通过匹配器检查数据
		    if(mt.matches()){
		    	System.out.println("正确的数据："+inData);
		    	return;
		    }
		}
	}
}
