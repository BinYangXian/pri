
public class Test1{
	
	public static void main(String args[]){
		/**
			�߼���!
			�﷨:
			������ֵ-�� �õ�����ֵ�෴��ֵ
		
		*/
	
		/*
			�ж��û��������֣��Ƿ�������-����������ӡtrue�����Ǵ�ӡfalse
		*/
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//����
		System.out.println("������һ������");
		int num= sc.nextInt();
		//�ж��Ƿ�������
		//��ʽ1-���ж�ģ��2����1�����-1
		boolean isJs1=(num%2==1||num%2==-1);
		//��ʽ2-���ж�ģ��2����0��ż����-��ȡ��������ż������������
		boolean isJs2=(!(num%2==0));
		System.out.println("�Ƿ�����1��"+isJs1);
		System.out.println("�Ƿ�����2��"+isJs2);
		
	}
}