
public class Test3{
	
	public static  void main(String []  aaa){
		/**
			�ַ�����
			char
			�洢�����ݣ�1���ַ������֣�
			java���ַ����ݣ�char��String...s����unicode�ַ���������д洢�ģ�˫�ֽڱ��루ռ2���ֽڣ�
			
			char�ı����Ķ��巽ʽ1-������ֵ
			�﷨��  char ������='1���ַ�';
			
			char�ı����Ķ��巽ʽ2-���ַ���Ӧ������
			�﷨��  char ������=��������ֵ��0��65535��;
			
			
		*/
		/**
		���巽ʽ1
		*/
		//�˵��Ա�
		char sex1='��';
		sex1='Ů';
		//char���ܴ洢���ַ���0���ַ���
		//char ch='';
		//char���ܴ洢����ַ�
		//�˵�����
		//char name1='����';
		/**
		���巽ʽ2
		*/
		//�����ַ�a
		char ch1='a';
		//�����ַ�a-�ö�Ӧ����������
		char ch2=97;
		//�����ַ� ��
		char ch3=0x7537;
		System.out.print("ch1:");
		System.out.println(ch1);
		System.out.print("ch2:");
		System.out.println(ch2);
		System.out.print("ch3:");
		System.out.println(ch3);
		
		/**
			��Щ������ַ�����ֱ�ӻ򲻷��㶨��
			���磺����...
			��Ҫ-��ת���ַ���char��String����ֵ������ʹ�ã�
			
			����ת���ַ�		��Ӧ�Ĵ����ַ�
			\n 					����
			\t					tab��
			\'					'
			\"					"
			\\					\
		*/
		char ch4='\'';
		char ch5='\\';
		System.out.print("ch4:");
		System.out.println(ch4);
		System.out.print("ch5:");
		System.out.println(ch5);
		
		/**
			charֻ�ܴ洢1���ַ�
			�洢����ַ�-��String�ַ������ͣ��������ͣ�
			
			String�ı����Ķ��巽ʽ-������ֵ
			�﷨��  String ������="0������ַ�";
			
		*/
		//�˵�����
		String name2="����";
		//�˵ĵ�ַ
		String addr="��³����2-4048";
		System.out.print("name2:");
		System.out.println(name2);
		System.out.print("addr:");
		System.out.println(addr);
		//
		//�˵�����-"����"
		String name3="\"����\"";
		System.out.print("name3:");
		System.out.println(name3);
		
		/**
			�ַ�����ƴ��
			+�����
		    a���ַ���+�ַ���  -��������ַ�������+���ҵ��ַ�������֮�󷵻����ַ���
			b���ַ���+�������� -��������ַ���������ߵ��ַ������ұ߻������ͣ�ֵ���ַ���������֮�󷵻����ַ���
			
			java����ʹ��ֵ�ĵط���������ֵ�����㣬��������...��
			->������ֵ�Ļ�ȡ��ʽ-��ֻ����ֵ������
			ֵ�Ļ�ȡ��ʽ
			1)����ֵ  2������  3�����������  4��....
		*/
		//�˵���Ϣ-���������ֺ͵�ַ
		String perosnInfo1=name2+addr;
		System.out.println("�˵���Ϣ��"+perosnInfo1);
		//�˵���Ϣ2-"���֣�xxx_��ַ:xxx"
		String perosnInfo2="���֣�"+name2+"_��ַ:"+addr;
		System.out.println("�˵���Ϣ2��"+perosnInfo2);
		
		//����
		int  age=18;
		//�˵���Ϣ3-"���֣�xxx_��ַ:xxx_���䣺xxx"
		String perosnInfo3=perosnInfo2+"_���䣺"+age;
		System.out.println("�˵���Ϣ3��"+perosnInfo3);
		
	}
}