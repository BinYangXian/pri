package day7.debugger;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 程序【编译时的错误】
		 * -》eclipse自动报红
		 * -》根据 ctrl +1  提示解决
		 * 
		 * eclipse 的debugger运行模式
		 * 作用-》调试java程序【运行时的错误】
		 * 
		 * 功能——》a）动态的执行每一句代码b）查看运行时当前环境的变量（常量）的数据
		 * 
		 * 使用debugger的步骤
		 * 
		 * 1）先给程序设置断点
		 * 断点：程序运行的时候，要暂停执行的位置
		 * --》双击行号可以打开或取消
		 * 2)通过debugger模式运行程序
		 * --》右键-debuger as run ...
		 * 
		 * 3)切换到debuger平台进行调试
		 *  
		 *  ...
		 * 
		 */
		System.out.println("hello1");
		System.out.println("hello2");
		System.out.println("hello3");
		System.out.println("hello4");
	}
}
