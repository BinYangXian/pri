package day9.homework.test1;
//四川人
public class SichuanPerson extends Person{
	/**
	 * 方式1：使用super
	 * 
	 * //睡觉
	public void sleep(){
		
		//当前的四川人-》使用四川人的睡觉功能
		//this.sleep();
		//当前的四川人-》使用普通人的睡觉功能
		super.sleep();
	}
	 */
	
	/**
	 * 方式2：不重写sleep，防止this死循环
	 */
	//睡觉
	public void sleep2(){
	//当前的四川人-》使用普通人的睡觉功能
		this.sleep();
		
	}
}