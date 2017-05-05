JAVASE基础课程笔试
姓名：_________
一、选择题部分(每题2分，部分题可多选,没有选全1分，多选不给分，共20分）

1、给定的代码片段：

String str = null;
if((str != null)&&(str.length()>10)){
 System.out.println(“more than 10”);
}
else if((str != null)&(str.length()<5)){
 System.out.println(“less than 10”);
}else { System.out.println(“end”); }
哪些行会导致错误？ (  c )
    A  line1      B line2   C line5   D  line8
 
2、下面哪个是java语言中的正确的标识符（ c,d  ）?
    A、3com   B、import   C、that  D、this
 
3、public class ReturnIt{ 
    ReturnType methodA(byte x,double y){
      return  (short)x/y*2;
    }
}
对于在第二行的方法methodA，它的返回值类型应该是:  (   f  )
A、int   B、byte   C、long    D、short  E、float  F、double
 
4、现有代码片段：
switch(x){
    case 1:System.out.println(“Test1”);break;
    case2:
    case3:   System.out.println(“Test2”);break;
    default:  System.out.println(“end”); 
}
X为何值时将输出“Test2”(  c  )
A、1或2B、1或2或3   C、2或3     D、3   E、default
 
5、以下代码:
public static void main(String[] args){
 String str = “null”;
 if(str == null){
 System.out.println(“null”);
 }else(str.length() == 0)
 System.out.println(“zero”); 
 }else{
 System.out.println(“some”); 
}
哪个是结果：    ( d )
A、  null    B、zero   C、some    D、complication fails    E、抛出运行时异常
 
6、
    interface Fish{}
    class Perch implements Fish{}
    class Walleye extends Perch{}
    class Bluegill{}
    public class Fisherman{
        public static void main(String[] args){
            Fish fish = new Walleye();
            Walleye walleye = new Walleye();
            Bluegill bluegill = new Bluegill();
            if(fish    instanceof Perch) System.out.print("f-p ");1111
            if(walleye   instanceof Fish) System.out.print("w-f");
            if(bluegill  instanceof Fish) System.out.print("b-f");
        }
    }
以下结果正确的是:      ( b )  
A、w-f         B、f-p  w-f             C 、w-f  b-f
D 、f-p w-f b-f        E 、Compilation fails       F、 An exception is thrown at runtime 
7、public interface Status{
    /*此处添加代码*/ int MY_VALUE = 10;
}
那几个关键字可以添加到注释区：     ( d,a,b) 
A、final B、static  C、 native D、public
E、private F、abstract G、protected
 
8、 
public class Blip{
        Protected int blipvert(int x){return 0;}
}
class Vert extends Blip{  
    //insert code here
}
哪些代码放到要插入语句的地方没有问题：   (a,b,c,d,e,f,g)       
A、public   int  blipvert(int x){ return 0; }
B、private  int  blipvert(int x){ return 0; }
C、private  int  blipvert(long x){ return 0; }
D、protected  long  blipvert(int x){ return 0; }
E、protected  int  blipvert(long x){ return 0; }
F、protected  long  blipvert(long x){ return 0; }
G、protected  long  blipvert(int x,int y){ return 0; }
9、 
class Atom{
    Atom(){
        System.out.println("atom ");
    }
  }
class Rock extends Atom{
     Rock(String type){
                    //super();
        System.out.println( type);
    }
 }
public class Mountain extends Rock{ 
    Mountain(){
        super("granite ");
        new Rock("granite ");
    }
public static void main(String[] args){
    new  Mountain();
}
}
What is the result?         ( f )
A、complilation fails
B、atom granite
C、granite granite
D、atom granite granite
E、An exception is thrown at runtime
F、atom granite atom  granite
 
10、class  Test{
int num = 81;
public static void main(String[] args){
    new Test().go();
}
void  go(){
    incr(++num);
    System.out.println(num);
} 
void  incr(int num){ 
    num +=10;
}
}
结果正确的是：      ( d )
  1. 81  B、82 C、91  D、92
E、Complication fails  F、an exception is thrown at runtime
 
二、判断题部分：（每题1分，共20分）

1、boolean 变量占用的范围是一个字节 true  ????
2、浮点数字面值常量默认是double     true 
3、char 不能存储汉字                true 
4、String是可变字符序列             false 
5、静态内部类能直接访问外部类的普通成员属性     false 
6、数组不是对象                                 false 
7、New Object[10] 运行后，创建了10个对象        false 
8、Set接口的特点是  可重复，无序                false 
9、对象所在类实现Serialiazable接口之后，可以把对象序列化为字节数据并在网络上传输    true 
10、两个对象比较，equals 返回 true 则 hashcode（） 值一定相等                       true ????
11、线程调用sleep方法后，该线程会等待                                   true 
12、InputStreamReader 是将字符流转换为字节流，并设置字符集。            false 
13、List容器可以存储重复的数据                                          true 
14、如果要将容器中的对象进行排序操作（使用Arrays的sort(Object[] a)），我们对象的类需要实现Comparable接口   false ??set无法排序
15、Java中类可以多继承   false 
16、Java中接口可以多继承 true
17、这个标识符合法： #abc false 
18、方法签名就是指方法名  false 
19、方法内执行return，return后的代码不会执行  false finally中会
20、两个方法只有返回值不同，也可以构成重载    false ？？？？
 
三、解答题部分（每题4分，共60分）

1、  多态的必要条件是什么？    父类引用指向子类对象。
2 、 数组、 Vector、ArrayList 的特点及区别？   数组是最原始的容器属于引用类型，其创建实体后容量固定不变，它是设计Vector与ArrayList的底层基础，
   而后两者容量可以自动扩充，当其底层的数组容量不足时，循环创建固定长度的数组来实现自动扩容；而Vector与ArrayList的区别则是1.线程
   安全与否，2.性能高低不同：Vector中针对多个对象访问同一资源时候，采用了同步锁机制，得以保证线程安全，但是相应的性能降低，低于ArrayList。
3 、  说出String  StringBuilder  StringBuffer的特点及区别？   String是不可变引用类型数据，不同于StringBuilder  StringBuffer的可变性，
   而后两者创建实体后可以改变；而StringBuilder  与StringBuffer的区别则是1.线程
   安全与否，2.性能高低不同：StringBuffer中针对多个对象访问同一资源时候，采用了同步锁机制，得以保证线程安全，但是相应的性能降低，低于StringBuilder  
4 、  叙述Tcp和Udp的区别？   tcp与udp都是一种网络通信协议，而tcp进行数据传输时需要与目的主机先建立连接：先请求连接，等待回应，收到回应后才能进行通信，
   而未收到回应时会重复再次请求；而udp则直接将信息发送给目的主机后完事，不管目的主机收到与否。tcp更为安全但是麻烦，udp更为便捷但不稳定。
5 、  分别叙述 堆、栈、方法区的特点？   栈中存放局部变量，是一段连续的内存区域；堆中存放对象实体，不是一段连续的内存区域；方法区中存放类，静态常量/方法。？？？？
6 、  说出你常见的异常及造成异常的原因（至少5个）？   nullPointException 引用类型变量未指向实例；IoException 网络连接不稳定，存储介质空间满或写保护；ArthmaticException 除数为0未处理；
   ClassCastException 向下转型时候的风险； 
7 、  说一下 Error  和  Exception 及RuntimeException的区别？   error是不能检查出来的错误，属于jre 的异常，是java应用开发程序员无法调试的问题，只能重启，或者升级jre；Exception 是error与RuntimeException的父类；
   RuntimeException 属于java应用程序运行时发生的异常。
 8、描述异常处理的两种方式及说明？   第一种是直接在当前处理，try{中包含可能出异常的代码} catch（Exception e）{拿到异常对象e，进行响应处理}finally{ }；第二种是直接用throws 在可能出异常的方法声明时抛给调用处处理：
      java应用开发程序员应优先采用第一种方式，如果不能很好的处理当前异常，应该首先考虑第二种方式。
9、简述字符集，字符解码，字符编码的含义？   字符集是人类与计算机沟通的一种规范（例如unicode、gbk、utf-8），当人类向计算机输入需要处理的数据时候，需要编码，反之需要解码。
10、int i=32770;short s=(short)i;编译通过吗？s存储值是什么？为什么？   -32765 因为，short的表述范围是-32767—+32767间的整数。
11、简述对象和对象的引用的区别及作用？   对象是指堆内存中存储的实体，对象的引用是指栈内存中存放的变量指向了实体。
12、this和super关键字指向的对象？this和super的区别？   this指向当前对象，super指向父类对象。
13、包package的作用，导入import的作用？   包的作用是便于管理数量庞大的类文件，同时也使得命名更加自由；import保证了类文件在使用不同同名字类而不产生歧义，是一种代码管理手段。
14、程序中定义多个方法的作用是什么，和直接main方法里面写代码的区别？   使得代码可阅读性提高，而且方便代码的复用，代码的维护，错误的检查，bug的调试。
15 、手写代码 用定义线程的两种方式定义两个线程类，并分别启动一个线程，run中只打印1-1000的数字即可？   

  public class Test{
    public static void main(String[] args){
	//方式一：
	new Thread(()->{
		for(int i=1;i<1001;i++){
				System.out.print(i);
			}
	  }).start();
	//方式二：
	new MyThread.start(); 
	}
   public class MyThread extends Thread{
		public void run(){
			for(int i=1;i<1001;i++){
				System.out.print(i);
			}
		}
	}
}








   