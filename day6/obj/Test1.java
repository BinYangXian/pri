public class Test1{
	public static void main(String[] args){
		/**
		
		*/
		dome2();
	}
	/**
		ͨ������������á�����������->���﷨
		
		a���洢���ݣ���Ա��������������
			���������.��Ա����=����ֵ;
			
		b��ȡ�����ݣ���Ա��������������
		  ��Ա����������  ���ձ���= ���������.��Ա����;
			
		c��ʹ�ö���Ĺ��ܣ���Ա������
			 ���������.��Ա����(ʵ�ʲ���);
	*/
	public static void dome2(){
		//����ѧ���Ķ���洢��������
		//��һ��        20        ��        iphone6
		//��һ������
		Student huyifei=new Student();
		//�洢���� 
		//����
		huyifei.name="��һ��";
		//����
		huyifei.age=20;
		//�Ա�
		huyifei.sex='��';
		
		//��һ��iphone6 
		Phone ip6=new Phone();
		ip6.name="iphone6";
		ip6.size=4.7;
		ip6.cpu="a8";
		//���ֻ� 
		huyifei.havePhone=ip6;
		System.out.println("��һ���ֻ���cpu1��"+huyifei.havePhone.cpu);
		
		//�ı�-��һ��-�ֻ���cpu-Ϊa9
		//��ʽ1����һ������-����ѧ������-�ҵ��ֻ�����-�������ֻ�����-�ҵ��ֻ�cpu-����a9
		huyifei.havePhone.cpu="a9";
		System.out.println("��һ���ֻ���cpu2��"+huyifei.havePhone.cpu);
		//�ı�-��һ��-�ֻ���cpu-Ϊa10
		//��ʽ2:iphone6������-�������ֻ�����-�ҵ��ֻ�cpu-����a10
		ip6.cpu="a10";
		System.out.println("��һ���ֻ���cpu2��"+huyifei.havePhone.cpu);
		
		
		
		/**
			��Ա�����;ֲ������Ա�
			1��λ�ò�ͬ��
			   a����Ա����������������
			   b���ֲ�����--���ڷ�����
			2��Ĭ�ϳ�ʼֵ��ͬ��
			   a����Ա����������û�и�ֵ����Ĭ�ϳ�ʼֵ����������������0������0��С��0.0,�ַ�0��Ӧ���ַ�������false������������Ϊnull��
			   b���ֲ�����--��û��Ĭ���ַ�
		*/
		//������       25        ��        s6	
		Student chenmeijia=new Student();
		//��ӡĬ��ֵ
		System.out.println(chenmeijia.name);
		System.out.println(chenmeijia.sex);
		System.out.println(chenmeijia.age);
		System.out.println(chenmeijia.havePhone);
		
		/**
			nullֵ�����������������ֵ������գ�����û�д洢�����ַ�����ܲ����������Դ����Ա��������Ա������
			����-����ָ���쳣  nullpointexception������ͱ����ˣ�
		*/
		
		Student liuyan=null;
		//�����γԷ�
		chenmeijia.eat();
		//���ҳԷ�
		liuyan.eat();
	}
	
	
	/**
		��������
	*/
	public static void dome1(){
		/**
		����������﷨��new����¡�����䣬���л�...
		
		new������﷨��
			new ����();
		
			java�洢����-�Ƿ������
			1��ջ�ڴ棺�ֲ�����
			2�����ڴ棺new�Ķ��󣨳�Ա������
		
			new����Ĺ��̣���ͼ��ݷ�һ����Ĺ��̣�
			1���ڶ��ڴ��ﴴ��һ������  --����ͼ�����һ�������λ�ã��ź��飨λ�ã�2¥3�����2��3�ţ�
			2�����ض���ĵ�ַ -����λ�ã�2¥3�����2��3�ţ�����
		
		*/
		//��һ��ѧ��1
		new Student();
		//��һ��ѧ��2
		new Student();
		//��һ���ֻ�1
		new Phone();
		
		/**
			�����˶���-Ҫʹ��-����ȡ���֣����ö�������ã�-�����þ�������ʹ�ö����
		
			��������﷨��
			��������   ����;
		
			�����������ã��������ͣ��ࣩ�ı������﷨��
			����	���ñ�����;
		*/
		//����ѧ������-liuyan
		Student liuyan;
		//����ѧ������-��һ��
		Student huyifei;
		/**
			���������Ҫ��������-������洢��Ӧ������ĵ�ַ��
			
			����  �洢 (ָ��) �����ַ���﷨��
			���ñ�����=new ����();--��ע�⣺û������ת�������úͶ������ͱ�����ͬ
		*/
		//liuyan -�洢һ��ѧ������ĵ�ַ
		liuyan=new Student();
		//liuyan -�洢һ���ֻ�����ĵ�ַ
		//liuyan=new Phone();//ע�⣺û������ת�������úͶ������ͱ�����ͬ
		
		/**
			��������  ͬʱָ��	һ���մ����Ķ����﷨��
				����   ���ñ�����=new ����();
			
		*/
		//��һ������chenmeijia ָ��һ��ѧ������
		Student chenmeijia=new Student();
		//��һ������guangu ָ��һ��ѧ������
		Student guangu=new Student();
	}
	
	
	
	/**
	����:

����        ����    �Ա�    ӵ�е��ֻ�
����        20        ��        iphone6
�ܴ�        25        ��        s6
���»�    18        ��         s7


����                       ��С        cpu
iphone6                 4.7           a8
iphone6s plus       5.5           a9
����s6                   5.2            e7420


����:

�����Է���1���ÿ��ӣ�2���ѷ��͵����3���̶�����
���ĳԷ���1���ÿ��ӣ�2���ѷ��͵����3���̶�����

iphone6 ����Ϸ
iphone6s plus ����Ϸ
����s6 ������
����s6 ����Ϸ

	*/
}

/**
ѧ����
 ���ݣ� ����        ����    �Ա�    ӵ�е��ֻ�
 ���ܣ��Է�
*/
class Student{
	/**
		���ݣ� ����        ����    �Ա�    ӵ�е��ֻ�
	*/
	String name;
	int age;
	char sex;
	//ӵ�е��ֻ�
	/**
		�ֻ�-�����˶�Ӧ���࣬��Ҳ��������������ͣ������ڳ�Ա����������������ʹ��
		
		�������Ͷ��ǹ淶��һ������
		String name-�����Դ洢�ܶ಻ͬ�ġ��ַ���������
		int age�����Դ洢�ܶ಻ͬ�ġ�����������
		Phone havePhone�����Դ洢�ܶ಻ͬ�ġ�phone����ġ�����
		
	*/
	Phone havePhone;
	/**
		 ���ܣ��Է�
	*/
	public void eat(){
		System.out.println("�˿��ԳԷ���");
	}
}
/**
�ֻ���
 ���ݣ� ����         ��С        cpu
 ���ܣ�����Ϸ 	������
*/
class Phone{
	/**
		���ݣ� ����         ��С        cpu
	*/
	String name;
	double size;
	String cpu;
	/**
		 ���ܣ�����Ϸ 	������
	*/
	public void playGame(){
		System.out.println("�ֻ����Դ���Ϸ");
	}
	public void playMusic(){
		System.out.println("�ֻ����Է�����");
	}
}