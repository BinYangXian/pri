package day15.fanxing;

public class Test2 {
	public static void main(String[] args) {
	
		/**
		 * 泛型概念
    a）泛型：本质是参数化类型，把【类】【接口】【方法】所需要用的【数据类型】被指定为一个【参数】。这种【参数对应的类型】可以用在【类】【接口】【方法】中使用，分别称为【泛型类】、【泛型接口】、【泛型方法】。
    b）好处：编译器【类型检查】,【自动类型转换】。
    
    
    方法参数:->方法内用的值（数据）不确定，通过方法参数传入
    
         * 1)方法参数装的是[装的是值],
         * 2)可以在方法中使用方法参数代替[值].
         * 3)在方法调用的时候传入并确定方法参数里的值.
  
  泛型参数：  类（接口，方法）中使用的【数据类型】不确定，通过【泛型参数】传入
  		 1)泛型参数装的是【装的是数据类型】,
         2)可以在类（接口，方法）中使用【泛型参数】代替【数据类型】.
         3)在使用【类（接口，方法）】时候传入并确定【泛型参数】里的【数据类型】.
    
    	
    	【类（接口）】使用泛型参数的步骤
    	1）在【类】定义用的泛型参数
    	语法：
    		class 类名<泛型参数名1,泛型参数名2,...>{类体}
    	2）在【类】中【成员的结构-成员变量，方法，构造器】通过【泛型参数名】代替对应的类型
    	注意点：静态结构不能使用
    
    	3）在使用【类】的时候-给【泛型参数】传入具体的【数据类型（引用类型-基本类型传入包装类型）】
    	语法：
    	类名<具体的数据类型1,具体的数据类型2...>
    	
    	注意点：
    	1）没有通配符的时候，引用类型有泛型参数，引用类型赋值的时候，泛型参数必须相同。
		 */
		
		dome3();
	}
	
	/**
	 * 类（接口，方法）定义了泛型参数，可以不使用-不传入泛型参数
	 * -》泛型擦出-》自动传入Object类型
	 * 
	 * 
	 */
	private static void dome3() {
		//使用Person5没有传入（名字和年龄）类型-自动传入Object
		Person5 p1= new Person5();
		Object p1Name= p1.name;
		Object p1Age= p1.age;
		/**
		 * 等价于
		 */
		Person5<Object,Object> p2= new Person5<Object,Object>();
		Object p2Name=p2.name;
		Object p2Age=p2.age;
	}
	/**
	 * 泛型参数存储数据好处
	 * 
	a）存储数据的时候-》自动类型检查
	b）取出类型的时候-》自动类型转换
	
	 */
	
	private static void dome2() {
//		 a）需要装String 类型的name和int 类型的age
		Person5<String,Integer> p1= new Person5<String,Integer>("柳岩", 18);
		/**
		 * p1的name只能存String
		 */
		p1.name="刘德华";//存String
		/**
		 * a）存储数据的时候-》自动类型检查
		 */
		//p1.name=new StringBuffer("刘德华");//StringBuffer类型不是String，检查出来
		
		/**
		 * b）取出类型的时候-》自动类型转换
		 */
		String p1Name= p1.name;
		
		
//		 b）需要装StringBuilder类型的name和short类型的age
		
		Person5<StringBuilder,Short> p2= new Person5<StringBuilder,Short>();
//		p2.name="柳岩";
		
//		 c）需要装char[]类型的name和byte类型的age

	}
	private static void dome1() {
		//计算 3，5的和
		sum(3, 5);//调用方法的时候-传入具体的参数的值
		//计算 3，8的和
		sum(3, 8);//调用方法的时候-传入具体的参数的值
	}
	/**
	 * 计算两个数的和并打印和的方法
	 * 两个数不确定：参数传入
	 */
	public static void sum(int num1,int num2){//定义方法参数
		int sum=num1+num2;//在方法内使用方法参数代替值
		System.out.println("和："+sum);
	}
}
/**
 * 解决方式3:使用泛型参数来存储具体类型的数据
 * 
 * 泛型参数：
 * NameType：存储类中需要用的名字的类型
 * AgeType：存储类中需要用的年龄的类型
 */
class Person5<NameType,AgeType> {
	/**
	 * 成员变量中使用泛型参数
	 */
	NameType name;
	AgeType age;
	/**
	 * 构造器中使用泛型参数
	 */
	public Person5() {
	}
	public Person5(NameType name, AgeType age) {
		this.name = name;
		this.age = age;
	}
	/**
	 * 成员方法中使用泛型参数
	 */
	public NameType getName() {
		return name;
	}
	
	public  void setName(NameType name) {
		this.name = name;
	}
}