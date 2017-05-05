
/*
	编写程序模拟游戏打怪，在main方法做如下功能
a）存储角色的血（150）和分数（0）
b）存储怪的血（100）
c）角色打一次怪，怪物血降低40，角色分数增加20。
d）怪攻击一次角色，角色的血减少30。
e）程序实现打怪2次，攻击角色1次。
f）打印角色的血和分数以及怪物的血。
--->提示-变量可以多次赋值
*/
public class Test2{
	public static void main(String agrs[]){
		//定义角色的血和分数怪物的血的变量
		int jsHp=150,jsScore=0,gwHp=100;
		//打怪 
		gwHp=gwHp-40;
		jsScore=jsScore+20;
		//打怪 
		gwHp=gwHp-40;
		jsScore=jsScore+20;
		//攻击角色 
		jsHp=jsHp-30;
		//打印信息
		System.out.print("角色的血：");
		System.out.println(jsHp);
		System.out.print("角色的分数：");
		System.out.println(jsScore);
		System.out.print("怪物的血：");
		System.out.println(gwHp);
		
	}
}