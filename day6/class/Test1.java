public class Test1{
	public static void main(String[] args){
		/**
			java�ﶨ�壨��������
			�﷨��λ��-��������class��ͬ���𣬲��ܶ��嵽�������ڲ�
			class ����{
				//����-0�������Ա����
				//����-0�������Ա����
			}
			
			��Ա�������﷨��
			λ�ã������У�����������ͬ����
			[���η�] ��������	������1[=ֵ1],������2[=ֵ2]...;
			
			��Ա�������﷨��
			λ�ã������У�����������ͬ����
			�﷨����֮ǰ�ķ��������ϲ���static����̬�ģ���ģ�
		*/
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