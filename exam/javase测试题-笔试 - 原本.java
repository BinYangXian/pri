JAVASE�����γ̱���
������_________
һ��ѡ���ⲿ��(ÿ��2�֣�������ɶ�ѡ,û��ѡȫ1�֣���ѡ�����֣���20�֣�

1�������Ĵ���Ƭ�Σ�

String str = null;
if((str != null)&&(str.length()>10)){
 System.out.println(��more than 10��);
}
else if((str != null)&(str.length()<5)){
 System.out.println(��less than 10��);
}else { System.out.println(��end��); }
��Щ�лᵼ�´��� (  c )
    A  line1      B line2   C line5   D  line8
 
2�������ĸ���java�����е���ȷ�ı�ʶ���� c,d  ��?
    A��3com   B��import   C��that  D��this
 
3��public class ReturnIt{ 
    ReturnType methodA(byte x,double y){
      return  (short)x/y*2;
    }
}
�����ڵڶ��еķ���methodA�����ķ���ֵ����Ӧ����:  (   f  )
A��int   B��byte   C��long    D��short  E��float  F��double
 
4�����д���Ƭ�Σ�
switch(x){
    case 1:System.out.println(��Test1��);break;
    case2:
    case3:   System.out.println(��Test2��);break;
    default:  System.out.println(��end��); 
}
XΪ��ֵʱ�������Test2��(  c  )
A��1��2B��1��2��3   C��2��3     D��3   E��default
 
5�����´���:
public static void main(String[] args){
 String str = ��null��;
 if(str == null){
 System.out.println(��null��);
 }else(str.length() == 0)
 System.out.println(��zero��); 
 }else{
 System.out.println(��some��); 
}
�ĸ��ǽ����    ( d )
A��  null    B��zero   C��some    D��complication fails    E���׳�����ʱ�쳣
 
6��
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
���½����ȷ����:      ( b )  
A��w-f         B��f-p  w-f             C ��w-f  b-f
D ��f-p w-f b-f        E ��Compilation fails       F�� An exception is thrown at runtime 
7��public interface Status{
    /*�˴���Ӵ���*/ int MY_VALUE = 10;
}
�Ǽ����ؼ��ֿ�����ӵ�ע������     ( d,a,b) 
A��final B��static  C�� native D��public
E��private F��abstract G��protected
 
8�� 
public class Blip{
        Protected int blipvert(int x){return 0;}
}
class Vert extends Blip{  
    //insert code here
}
��Щ����ŵ�Ҫ�������ĵط�û�����⣺   (a,b,c,d,e,f,g)       
A��public   int  blipvert(int x){ return 0; }
B��private  int  blipvert(int x){ return 0; }
C��private  int  blipvert(long x){ return 0; }
D��protected  long  blipvert(int x){ return 0; }
E��protected  int  blipvert(long x){ return 0; }
F��protected  long  blipvert(long x){ return 0; }
G��protected  long  blipvert(int x,int y){ return 0; }
9�� 
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
A��complilation fails
B��atom granite
C��granite granite
D��atom granite granite
E��An exception is thrown at runtime
F��atom granite atom  granite
 
10��class  Test{
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
�����ȷ���ǣ�      ( d )
  1. 81  B��82 C��91  D��92
E��Complication fails  F��an exception is thrown at runtime
 
�����ж��ⲿ�֣���ÿ��1�֣���20�֣�

1��boolean ����ռ�õķ�Χ��һ���ֽ� true  ????
2������������ֵ����Ĭ����double     true 
3��char ���ܴ洢����                true 
4��String�ǿɱ��ַ�����             false 
5����̬�ڲ�����ֱ�ӷ����ⲿ�����ͨ��Ա����     false 
6�����鲻�Ƕ���                                 false 
7��New Object[10] ���к󣬴�����10������        false 
8��Set�ӿڵ��ص���  ���ظ�������                false 
9������������ʵ��Serialiazable�ӿ�֮�󣬿��԰Ѷ������л�Ϊ�ֽ����ݲ��������ϴ���    true 
10����������Ƚϣ�equals ���� true �� hashcode���� ֵһ�����                       true ????
11���̵߳���sleep�����󣬸��̻߳�ȴ�                                   true 
12��InputStreamReader �ǽ��ַ���ת��Ϊ�ֽ������������ַ�����            false 
13��List�������Դ洢�ظ�������                                          true 
14�����Ҫ�������еĶ���������������ʹ��Arrays��sort(Object[] a)�������Ƕ��������Ҫʵ��Comparable�ӿ�   false ??set�޷�����
15��Java������Զ�̳�   false 
16��Java�нӿڿ��Զ�̳� true
17�������ʶ���Ϸ��� #abc false 
18������ǩ������ָ������  false 
19��������ִ��return��return��Ĵ��벻��ִ��  false finally�л�
20����������ֻ�з���ֵ��ͬ��Ҳ���Թ�������    false ��������
 
��������ⲿ�֣�ÿ��4�֣���60�֣�

1��  ��̬�ı�Ҫ������ʲô��    ��������ָ���������
2 �� ���顢 Vector��ArrayList ���ص㼰����   ��������ԭʼ�����������������ͣ��䴴��ʵ��������̶����䣬�������Vector��ArrayList�ĵײ������
   �����������������Զ����䣬����ײ��������������ʱ��ѭ�������̶����ȵ�������ʵ���Զ����ݣ���Vector��ArrayList����������1.�߳�
   ��ȫ���2.���ܸߵͲ�ͬ��Vector����Զ���������ͬһ��Դʱ�򣬲�����ͬ�������ƣ����Ա�֤�̰߳�ȫ��������Ӧ�����ܽ��ͣ�����ArrayList��
3 ��  ˵��String  StringBuilder  StringBuffer���ص㼰����   String�ǲ��ɱ������������ݣ���ͬ��StringBuilder  StringBuffer�Ŀɱ��ԣ�
   �������ߴ���ʵ�����Ըı䣻��StringBuilder  ��StringBuffer����������1.�߳�
   ��ȫ���2.���ܸߵͲ�ͬ��StringBuffer����Զ���������ͬһ��Դʱ�򣬲�����ͬ�������ƣ����Ա�֤�̰߳�ȫ��������Ӧ�����ܽ��ͣ�����StringBuilder  
4 ��  ����Tcp��Udp������   tcp��udp����һ������ͨ��Э�飬��tcp�������ݴ���ʱ��Ҫ��Ŀ�������Ƚ������ӣ����������ӣ��ȴ���Ӧ���յ���Ӧ����ܽ���ͨ�ţ�
   ��δ�յ���Ӧʱ���ظ��ٴ����󣻶�udp��ֱ�ӽ���Ϣ���͸�Ŀ�����������£�����Ŀ�������յ����tcp��Ϊ��ȫ�����鷳��udp��Ϊ��ݵ����ȶ���
5 ��  �ֱ����� �ѡ�ջ�����������ص㣿   ջ�д�žֲ���������һ���������ڴ����򣻶��д�Ŷ���ʵ�壬����һ���������ڴ����򣻷������д���࣬��̬����/��������������
6 ��  ˵���㳣�����쳣������쳣��ԭ������5������   nullPointException �������ͱ���δָ��ʵ����IoException �������Ӳ��ȶ����洢���ʿռ�����д������ArthmaticException ����Ϊ0δ����
   ClassCastException ����ת��ʱ��ķ��գ� 
7 ��  ˵һ�� Error  ��  Exception ��RuntimeException������   error�ǲ��ܼ������Ĵ�������jre ���쳣����javaӦ�ÿ�������Ա�޷����Ե����⣬ֻ����������������jre��Exception ��error��RuntimeException�ĸ��ࣻ
   RuntimeException ����javaӦ�ó�������ʱ�������쳣��
 8�������쳣��������ַ�ʽ��˵����   ��һ����ֱ���ڵ�ǰ����try{�а������ܳ��쳣�Ĵ���} catch��Exception e��{�õ��쳣����e��������Ӧ����}finally{ }���ڶ�����ֱ����throws �ڿ��ܳ��쳣�ķ�������ʱ�׸����ô�����
      javaӦ�ÿ�������ԱӦ���Ȳ��õ�һ�ַ�ʽ��������ܺܺõĴ���ǰ�쳣��Ӧ�����ȿ��ǵڶ��ַ�ʽ��
9�������ַ������ַ����룬�ַ�����ĺ��壿   �ַ�����������������ͨ��һ�ֹ淶������unicode��gbk��utf-8����������������������Ҫ���������ʱ����Ҫ���룬��֮��Ҫ���롣
10��int i=32770;short s=(short)i;����ͨ����s�洢ֵ��ʲô��Ϊʲô��   -32765 ��Ϊ��short�ı�����Χ��-32767��+32767���������
11����������Ͷ�������õ��������ã�   ������ָ���ڴ��д洢��ʵ�壬�����������ָջ�ڴ��д�ŵı���ָ����ʵ�塣
12��this��super�ؼ���ָ��Ķ���this��super������   thisָ��ǰ����superָ�������
13����package�����ã�����import�����ã�   ���������Ǳ��ڹ��������Ӵ�����ļ���ͬʱҲʹ�������������ɣ�import��֤�����ļ���ʹ�ò�ͬͬ����������������壬��һ�ִ�������ֶΡ�
14�������ж�����������������ʲô����ֱ��main��������д���������   ʹ�ô�����Ķ�����ߣ����ҷ������ĸ��ã������ά��������ļ�飬bug�ĵ��ԡ�
15 ����д���� �ö����̵߳����ַ�ʽ���������߳��࣬���ֱ�����һ���̣߳�run��ֻ��ӡ1-1000�����ּ��ɣ�   

  public class Test{
    public static void main(String[] args){
	//��ʽһ��
	new Thread(()->{
		for(int i=1;i<1001;i++){
				System.out.print(i);
			}
	  }).start();
	//��ʽ����
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








   