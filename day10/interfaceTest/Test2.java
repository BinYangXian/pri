package day10.interfaceTest;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 加入接口之后-类型直接的【超类型】和【子类型】的判断
		 * 
		 * 超类型:继承链，实现链上面的类型
		 * 子类型:继承链，实现链下面的类型
		 * 
		 * 类：
		 * CA  CB   CC  CD
		 * 接口：
		 * IA  IB	IC	ID
		 * 
		 * 关系
		 * 类和类：CA和CB继承CC
		 * 类和接口：CC类实现了IA IB，CD类实现IA
		 * 接口和即可：IA继承了IC和ID
		 * 
		 * 
		 * 画图确定超类型和子类型
		 * 
		 */
		//IC作为超类型-子类型有IA	  CA  CB   CC  CD
		//子类型
		IC ic1=null;
		IC ic2=new CA();
		IC ic3=new CB();
		IC ic4=new CC();
		IC ic5=new CD();
		//
		IA ia=null;
		IB ib=null;
		ID id=null;
		//
		//ic1=ib; ib不是ic子类型
		ic1=ia;
		//ic1=id;  ib不是ic子类型
	}
}
class CA extends CC{}
class CB extends CC{}
class CC implements IA,IB{}
class CD implements IA{}

interface IA extends IC,ID{}
interface IB{}
interface IC{}
interface ID{}

