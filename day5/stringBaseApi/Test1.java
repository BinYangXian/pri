
public class Test1{
	
	public static void main(String args[]){
		/**
		����java�����ʱ��java���������ṩ�˺ܶ����ã�����������
   ���磺1����ӡ���ݵ�����̨2������� 3����ȡ�û�����̨��������
   
   ������ôʹ����Щ���ܣ�--��ͨ���鿴api
   api�����򿪷������ĵ�--�������� Сѧѧϰ����ʵ䣬�ֵ䡣
   api���ṩ�ܶ๦�ܵ�ʹ�ý��ܣ����ñ�����Ҫ֪����ôȥʹ�ã���ôȥ��ѯ����
   
   
   javaϵͳ�ṩ�˺ܶ��"�ַ���"�������صĹ���-�ŵ���String���С�
�ַ������ͣ�String������apiʹ��

String �ࣺ��װ�˸��ֲ����ַ����Ĺ��ܡ�
ע�⣺����api�������ĳһ��������ַ�����
����ʹ�õ�ʱ�������һ���ַ�����
��ͨ���ַ�����������ķ�����

�﷨��[����ֵ����   ����=] �ַ���.����([ʵ�ʲ���]);
		*/
	
		dome3();
	}
	/**
	c����������
 String substring(int beginIndex, int endIndex)
          ����һ�����ַ��������Ǵ��ַ�����һ�����ַ�����
 String substring(int beginIndex)  
          ����һ���µ��ַ��������Ǵ��ַ�����һ�����ַ�����
----����ѧ��
    equalsIgnoreCase(�����ַ���):���Դ�Сд�Ƚ������ַ��������Ƿ����

 int indexOf(String str)
          ����ָ�����ַ����ڴ��ַ����е�һ�γ��ִ��������� 
 indexOf(String str, int fromIndex)
          ����ָ�����ַ����ڴ��ַ����е�һ�γ��ִ�����������ָ����������ʼ��
	*/
	public static void dome3(){
		//�˵���Ϣ
		String personInfo="����_18_java����ʦ_Ů_��³����";
		//ȡ������ 
		String job= personInfo.substring(6,13);
		System.out.println("������"+job);
		//ȡ����ַ
		String addr1= personInfo.substring(16,personInfo.length());
		System.out.println("��ַ1��"+addr1);
		//ȡ����ַ
		String addr2= personInfo.substring(16);
		System.out.println("��ַ2��"+addr2);
		
		
	}
	/**
	b����������������ֵ
    charAt(����):��ȡ����[0,length())��Ӧ�ĵ����ַ�
    equals(�����ַ���):�Ƚ������ַ��������Ƿ����
    replaceAll("���ַ���","���ַ���"):�滻���е��ַ���Ϊ�µ��ַ�����֧������
    + ƴ��:����׷�ӣ�������µ��ַ���
	*/
	public static void dome2(){
		//�˵���Ϣ
		String personInfo="����_18_java����ʦ_Ů";
		//���˵���Ϣ��ġ����䡿ȡ����-��ӡ
		char ch1= personInfo.charAt(3);
		char ch2= personInfo.charAt(4);
		//ƴ������
		String age= ""+ch1+ch2;
		//��ӡ��
		System.out.println("���䣺"+age);
		//ȡ���Ա𲢴�ӡ
		char sex=personInfo.charAt(personInfo.length()-1);
		System.out.println("�Ա�"+sex);
		
		System.out.println("---------------------------");
		//�ж��û������û����Ƿ���Ե�¼�ɹ�-��ȷ�û���"zeng"
		//���� 
		String inUname= inputString("�û���");
		//�жϣ�==�������ж���������
		System.out.println("(==)�Ƿ��¼�ɹ�-"+(inUname=="zeng"));
		//�жϣ�equals�������ж���������
		System.out.println("(equals)�Ƿ��¼�ɹ�-"+(inUname.equals("zeng")));
		System.out.println("---------------------------");
		//��̳��Ϣ
		String msg="helo������Ŷ���������ܻơ������ܻơ����ܻơ��������ܱ������Ƿ�����";
		//�滻 �ܻ� 
		msg=msg.replaceAll("�ܻ�","xxx");
		//�滻 �ܱ��� 
		msg=msg.replaceAll("�ܱ���","yyyy");
		//�鿴���� 
		System.out.println("�滻��ģ�"+msg);
		
	}
	
	/**
	��������ֵ

    length() :����
    trim(); -->ȥ���������пհ��ַ� -->String
	*/
	public static void dome1(){
		
		/**
			length
		*/
		String uname1="����";
		String uname2="˹�ٷ�-����";
		//�ж�����-�ǻ��Ǻ����˵����֣�2-3���ַ���
		//�ж�����1
		//����1�ĳ���
		int len1= uname1.length();
		if(len1>=2&&len1<=3){
			System.out.println("����1�Ǻ����˵�����");
		}
		//�ж�����2
		//����2�ĳ���
		int len2= uname2.length();
		if(len2>=2&&len2<=3){
			System.out.println("����2�Ǻ����˵�����");
		}
		
		/**
			trim
		*/
		String uname3=inputString("ע����û���"); 
		System.out.println("��������û�����["+uname3+"]");
		//ȥ�����ҵĿհ��ַ� -ȥ����Ĵ洢��uname4
		String uname4= uname3.trim();
		System.out.println("��������û���ȥ�����ҿհ׺��Լ�����ı䣩��["+uname3+"]");
		System.out.println("��������û���ȥ�����ҿհ׺󣨸ı���ַ��������ˣ���["+uname4+"]");
		
	}
	/**
		�õ��û�������ַ���
	*/
	public static String inputString(String tishi){
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//��ʾ
		System.out.println("������"+tishi);
		//
		String data= sc.nextLine();
		//
		return data;
	}
	
}
