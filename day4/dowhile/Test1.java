
public class Test1{
	
	public static void main(String args[]){
		/**
		do whileѭ��
		�﷨��
		do{
			//ѭ������
		}while(ѭ������);

		ִ�еĹ���
		1��ִ��ѭ������
		2��ִ��ѭ������true
		1��ִ��ѭ������
		2��ִ��ѭ������true
		...
		1��ִ��ѭ������
		2��ִ��ѭ������false
		
		
		
		whileѭ���﷨
		�﷨��
		while(ѭ������){
			//ѭ������
		}
		ִ�еĹ���
		2��ִ��ѭ������true
		1��ִ��ѭ������
		2��ִ��ѭ������true
		...
		1��ִ��ѭ������
		2��ִ��ѭ������false
		
		
		while��dowhile �ĶԱ� 
		1��ִ��˳��
		    while����ѭ����������ѭ������ 
			do while����ѭ�����ݣ���ѭ������
		2��ִ�еĴ�����
			while: 0�����
			dowhile 1����� 
			
		*/
		dome2();
	}
	/**
		�����û����루0��10�����֣����Զ�Ӧ���ָ����ȣ�a�����ȣ�b��ը���ȣ�c���Լ��ȣ�
	*/
	public static void dome2(){
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//�������� 
		System.out.println("������Լ��ȵĸ���");
		int count=sc.nextInt();
		/**
			while���
		*/
		int a=0;
		while(a<count){
			//ѭ����ҵ������
			System.out.println("����");
			System.out.println("ը����");
			System.out.println("�Լ���");
			System.out.println();
			//�ı�ѭ������
			a++;
			
		}
		System.out.println("-----------------------");
		/**
			do while���
		*/
		int b=0;
		do{
			//����������Ϊ0
			if(count!=0){
					//ѭ����ҵ������
				System.out.println("����");
				System.out.println("ը����");
				System.out.println("�Լ���");
				System.out.println();
			}
			//�ı�ѭ������
			b++;
			
		}while(b<count);
		
		
		
		
		
	}
	
	/**
		���󣺵õ��û������������ȷ�·ݣ�1-12�������֣�����ӡ-��ѭ��
		ִ�еĹ���
		1���������� 
		2���ж����ִ���-true 
		
		1���������� 
		2���ж����ִ���-true 
		
		...
		1���������� 
		2���ж����ִ���-false 

		3)��ӡ����
	*/
	public static void dome1(){
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		/**
			while���
		*/
		
		//�������� 
		System.out.println("�������·�����");
		int month=sc.nextInt();
		//ѭ�����жϺ����� 
		while(month>12||month<1){//�ж����ִ���-true 
			//�������� 
			System.out.println("�������·�����");
			month=sc.nextInt();
		}
		//��ӡ���� 
		System.out.println("while-��ȷ�����֣�"+month);
		/**
			do while���
		*/
		//���������-������ while��ʹ��
		int month2;
		do{
			//�������� 
			System.out.println("�������·�����");
			month2=sc.nextInt();
			
		}while(month2>12||month2<1);//�ж����ִ���-true 
		//��ӡ���� 
		System.out.println("do while-��ȷ�����֣�"+month2);
	}
	
	
}
