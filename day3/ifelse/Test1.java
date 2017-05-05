
public class Test1{
	
	public static void main(String args[]){
		/**
			为什么使用分支？
    有时候我们的代码不是一定执行的？而是根据条件选择执行的，这是就需要分支语句。

a）顺序结构：
    之前讲的代码都是顺序执行的，从上到下依次执行每一句代码
b）分支结构：
    代码执行过程中，有部分代码选择性执行（根据条件（布尔值）执行），
  需要用到分支结构，如，用户登录，返回密码错误或登录成功。

		*/
		testIf3();
	}
	/**
		多分支结构（if结构完成语法）-测试代码
		
		语法：
		if(布尔分支条件){
			分支条件为true时执行的代码
			分支条件为true时执行的代码
		}
		[
		else if(布尔分支条件){
			分支条件为true时执行的代码
			分支条件为true时执行的代码
		}
		...
		]
		[
		else{
			上述所有分支条件为false执行的代码
			...
		}
		]
		该结构：
		if：有且只有1个
		else if： 0到多个
		else ：0到1个
		
		执行过程
		1)依次判断if和else if里所有的分支，如果有满足的是-则执行对应的分支-然后离开分支结构
		2）如果所有的if和else if都不满足条件-=执行else
		
	*/
	public static void testIf3(){
		/**
			用户登录
			1）用户输入qq号和qq密码
			
			2）判断-》正确的qq号和密码（111，222）
			  a）判断qq号和qq密码正确  --》登录成功，显示聊天主界面
			  b）判断qq号和qq密码错误 --》登录失败， qq号和qq密码错误
			  c） qq错误 
			  d) 密码错误 
			 
		*/
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//输入QQ号
		System.out.println("请输入qq号");
		int qqNum=sc.nextInt();
		//输入QQ密码
		System.out.println("请输入qq密码");
		int qqPwd=sc.nextInt();
		
		/**
		方式1：手动编写4个分支条件
		
		*/
		//判断qq号和qq密码正确
		if(qqNum==111&&qqPwd==222){
			System.out.println("登录成功");
			System.out.println("显示聊天主界面");
		}else 
		if(qqNum!=111&&qqPwd==222){//qq号错误
			System.out.println("登录失败");
			System.out.println("qq号错误");
		}else 
		if(qqNum==111&&qqPwd!=222){//密码错误
			System.out.println("登录失败");
			System.out.println("密码错误");
		}else 
		if(qqNum!=111&& qqPwd!=222){//qq号和密码错误
			System.out.println("登录失败");
			System.out.println("qq号和密码错误");
		}
		/**
		方式2：由于qq和密码输入一共就4个情况，我们考虑4个情况，说明
		所有分支都会执行-》写分支的时候-应该加else-》少写分支条件		
		*/
		System.out.println("--------------------");
		//判断qq号和qq密码正确
		if(qqNum==111&&qqPwd==222){
			System.out.println("登录成功");
			System.out.println("显示聊天主界面");
		}else 
		if(qqNum!=111&&qqPwd==222){//qq号错误
			System.out.println("登录失败");
			System.out.println("qq号错误");
		}else 
		if(qqNum==111&&qqPwd!=222){//密码错误
			System.out.println("登录失败");
			System.out.println("密码错误");
		}else{//qq号和密码错误
			System.out.println("登录失败");
			System.out.println("qq号和密码错误");
		}
	}
	
	/**
		双分支结构-测试代码
		
		语法：
		if(布尔分支条件){
			分支条件为true时执行的代码
			分支条件为true时执行的代码
			...
		}else{
			分支条件为false时执行的代码
			分支条件为false时执行的代码
			...
		}
		
	*/
	public static void testIf2(){
		/**
			用户登录
			1）用户输入qq号和qq密码
			
			2）判断-》正确的qq号和密码（111，222）
			  a）判断qq号和qq密码正确  --》登录成功，显示聊天主界面
			  b）判断qq号或qq密码错误 --》登录失败， qq号或qq密码错误
			 
		*/
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//输入QQ号
		System.out.println("请输入qq号");
		int qqNum=sc.nextInt();
		//输入QQ密码
		System.out.println("请输入qq密码");
		int qqPwd=sc.nextInt();
		
		//判断qq号和qq密码正确
		if(qqNum==111&&qqPwd==222){
			System.out.println("登录成功");
			System.out.println("显示聊天主界面");
		}else{
			System.out.println("登录失败");
			System.out.println("qq号或qq密码错误");
		}
		
	}
	
	
	/**
		单分支结构-测试代码
		
		语法：
		if(布尔分支条件){
			分支条件为true时执行的代码
			分支条件为true时执行的代码
			...
		}
		
	*/
	public static void testIf1(){
		/**
			用户登录
			1）用户输入qq号和qq密码
			
			2）判断-》正确的qq号和密码（111，222）
			  a）判断qq号和qq密码正确  --》登录成功，显示聊天主界面
			  
			 
		*/
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//输入QQ号
		System.out.println("请输入qq号");
		int qqNum=sc.nextInt();
		//输入QQ密码
		System.out.println("请输入qq密码");
		int qqPwd=sc.nextInt();
		
		//判断qq号和qq密码正确
		if(qqNum==111&&qqPwd==222){
			System.out.println("登录成功");
			System.out.println("显示聊天主界面");
		}
		
	}
}
