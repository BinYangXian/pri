
public class Test5{
	public static  void main(String agrs[]){
		/**
			��ϵ��������ж�һ�������Ƿ�����Ҫ��
		   
		    �������һ���ж�-���߼������
			
			�߼������
			1���߼���&&������-�����������붼���㣩
			�﷨��
			 ��������1  && ��������2
			���ֵ���������������㣨true�������Ϊtrue-������false��
			
			2���߼���||������-������������һ����ok��
			�﷨��
			 ��������1  || ��������2
			���ֵ��������������һ����true�������Ϊtrue-������false��
			
			3���߼���
		*/
		
		/**
			�ж�һ�����Ƿ񡾸߸���-���߲��Ҹ�
			��-�����>180
			��-��Ǯ>10001111
		*/
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//�������
		System.out.println("���������");
	 	Short height=  sc.nextShort();
		//����Ǯ
		System.out.println("������ӵ�е�Ǯ");
	 	long money=  sc.nextLong();
		//�Ƿ��
		boolean isHigh= height>180;
		//�Ƿ�
		boolean isHaveMoney= money>10001111;
		
		//�Ƿ�߲��Ҹ�
		boolean isHeightAndMoney= isHigh&&isHaveMoney;
		
		System.out.println("�Ƿ�ߣ�"+isHigh);
		System.out.println("�Ƿ񸻣�"+isHaveMoney);
		System.out.println("�Ƿ�߲��Ҹ���"+isHeightAndMoney);
		
		System.out.println("-------------------------");
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&false);
		System.out.println(false&&true);
		System.out.println("-------------------------");
		
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||false);
		System.out.println(false||true);
		
	}
}