
public class Test3{
	
	public static void main(String args[]){
		/**
		---ͨ�����������ء��������ظ����ô��롿������湦�� 
		
4����main����������������
		*/
		System.out.println("�õ�2-6���û������������"+inputInt("������2-6������",2,6));
	}
	/**
	3�������ȡ����̨������������ָ����ʾ����ָ����Χ����Сֵ�����ֵ֮�䣩�ķ�����
����һ��Ҫ������Сֵ�����ֵ֮�����������-������ֵ����-��Ҫ�������롣
��������ʾ���ݣ���ʾ�û�������ַ���������Χ��Сֵ����Χ���ֵ
����ֵ�����������
	*/
	public static int inputInt(String tishi2,int min,int max){
		while(true){
			//�������� -��ָ����ʾ 
			//ʹ��inputInt(String tishi)������������
			int num=inputInt(tishi2);
			//�ж�����-��ȷ-�˳�ѭ��-�˳�����
			if(num>=min&&num<=max){
				return num;
			}
		}
	}
	
	/**
	1�������ȡ����̨���������ķ���-�����û���ʾ"����������"
����ֵ�����������
	*/
	public static int inputInt(){
		//ʹ��inputInt(String tishi)������������
		int num=inputInt("����������");
		//�������� 
		return num;
	}
	/**
	2�������ȡ����̨������������ָ����ʾ�ķ���
��������ʾ���ݣ���ʾ�û������-�����ַ�����
����ֵ�����������
	*/
	public static int inputInt(String tishi){
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//��ʾ
		System.out.println(tishi);
		//���� 
		int in= sc.nextInt();
		//�������� 
		return in;
	}
}
