
public class Test2{
	public static  void main(String agrs[]){
		/**
			扩展运算符
			作用-》对于算数运算符自身操作的扩展-》简化自身操作
		
			+=  -=  *= /= %=
		
			+=
			语法：
			变量+=值; -->把变量的现在值加上新的值，再赋值给变量自己
			-->等价于 
			变量=变量+值;
		*/
		
		//角色的分数
		int jsScore=100;
		
		//打怪1次-增加60分
		jsScore=jsScore+60;//使用-算数运算符实现
		System.out.println("角色分数："+jsScore);
		//打怪1次-增加60分
		jsScore+=60;//使用-扩展运算符实现
		System.out.println("角色分数："+jsScore);
	}
}