
public class Test1{
	
	public static void main(String args[]){
		/**
			方法签名：方法名+形式参数列表--》与参数名字无关
		
			方法签名的唯一性
			->在同一个类中，两个方法的方法签名不能相同！-》因为方法签名相同，调用的时候会出现混淆
			-》编译出错-》已在类 XXXX中定义了方法 XXXX
		*/
		//test1(20,"hello");
	}
	//方法签名：test1()
	public static void test1(){}
	//方法签名：test1(int)
	public static void test1(int a){}
	//方法签名：test1(int,String)
	public static void test1(int a,String b){}
	//方法签名：test1(int,String)
	public static void test1(int c,String d){}
}
