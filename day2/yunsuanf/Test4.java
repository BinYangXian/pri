
public class Test4{
	public static  void main(String agrs[]){
		/**
			��������boolean
			ռ�ÿռ䣺1λ��bit��
			����ֵ��true�����������㣬�ԣ�     false�����ɼ��������㣬��
			
		*/
		boolean b;
		b=true;
		b=false;
		/**
			��ϵ�����
			���ã��ж�����ֵ�Ƿ������Ӧ�Ĺ�ϵ
			
			> >= < <=   ==(�ж��Ƿ����)  !=���ж��Ƿ񲻵��ڣ�
		    
			���ֵ��
				����true
				������ false
		*/
		/**
			���� ��������������˵�Ǯ��Ԫ�����������1001111��
				  ��ӡ���������Ǯ�ˡ�����true��
			����  ��ӡ���������Ǯ�ˡ�����false��	
		*/
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//����Ǯ
		System.out.println("������ӵ�е�Ǯ");
	 	long money=  sc.nextLong();
		
		//�����Ƿ���Ǯ�ı�����true-��Ǯ false û��Ǯ��
		boolean isHaveMoney;
		//�ж�-�ѽ���洢��isHaveMoney
		isHaveMoney=money>1001111;
		//��ӡ���
		System.out.println("���Ƿ���Ǯ��true-����Ǯ��flase-�������"+isHaveMoney);
		
		System.out.println("--------------------------");
		/**
			==(�ж��Ƿ����)  !=���ж��Ƿ񲻵��ڣ�
		*/
		System.out.println("3==3:"+(3==3));
		System.out.println("3!=3:"+(3!=3));
		System.out.println("5==3:"+(5==3));
		System.out.println("5!=3:"+(5!=3));
		
		
	}
}