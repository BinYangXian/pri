
public class Test1{
	
	public static void main(String args[]){
		/**
		���巽�������ã��ô���
		1������main�����������ӷ�ף����ڵ��Դ���
		2���ظ����÷�������--���������Ե��ö��
		3���ֽ⹦�ܣ��Ѹ��ӵĹ��ܣ��ֽ�ΪС���ܣ�С���ܶ�Ӧ�����ֱ�ȥ����
		--���ô�-�����С����-��ֱ�ӽ�����ӹ��ܼ�
		*/
		
		/**
		3���û���������һ���·����֣�����ѭ����ӡ������������
����1��
�����"1��1��","1��2��","1��3��"......,"1��30��","1��31��"

		 ˼·��
		 1)����ѭ��-�õ���ȷ���·�����-��������д����
		 2)���������·����ֵõ�������� ->��֧�ṹ
			 28 	2
			 30 	4	6	9	11
			 31 	����7���·�����
		 3)�����������ѭ����ӡ���µ�ÿһ��
			
	ע���		
		1������̨������������͵����ݵ�ʱ������������ݲ���ת��Ϊ��Ӧ������-��ô�����-InputMismatchException
		-������ͱ����ˣ�ֹͣ�ˣ�
		*/
		//��ӡ2��������
		//printMonthAllDay(2,28);
		//��ӡ3��������
		//printMonthAllDay(3,31);
		dome1_2();
		
		
	}
	/**
	3)�����������ѭ����ӡ���µ�ÿһ��
	������
	month��ӡ���·�
	maxDay ����������
	*/
	public static void printMonthAllDay(int month,int maxDay){
		//ѭ�������������-ÿ�δ�ӡһ��
		for(int curDay=1;curDay<=maxDay;curDay++){
			//��ӡ��ǰ��
			System.out.println(month+"��"+curDay+"��");
		}
	}
	
	/**
	2)���������·����ֵõ�������� ->��֧�ṹ
			 28 	2
			 30 	4	6	9	11
			 31 	����7���·�����
	*/
	public static int getMonthMaxDay(int month){
		int maxDay;
		if(month==2){//28 
			maxDay=28;
		}else
		if(month==4 ||month==6|| month==9|| month==11 ){//30
			maxDay=30;
		}else{//31 
			maxDay=31;
		}
		System.out.println("�����·�������"+maxDay);
		//�����������
		return maxDay;
	}
	
	/**
	 1)����ѭ��-�õ���ȷ���·�����-��������������
	*/
	public static int  inputMonth(){
		  //������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//�������� 
		System.out.println("������һ������");
		byte month= sc.nextByte();
		while(month>12||month<1){//�ж�����-���� 
			//�������� 
			System.out.println("������һ������");
			month= sc.nextByte();
		}
		System.out.println("��ȷ���·����֣�"+month);
		//�����·� 
		return month;
	}
	/**
		���ӹ���-�ֽ�ΪС����-�ֱ��÷������С����-��ƴ��С����-���
		
	*/
	public static void dome1_2(){
		//1 
		int month= inputMonth();
		//2 
		int maxDay= getMonthMaxDay(month);
		//3 
		printMonthAllDay(month,maxDay);
		
	}
	/**
		���ӹ���-һ���������-����Ƚϸ���
	*/
	public static void dome1_1(){
		
		//1
	    //������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//�������� 
		System.out.println("������һ������");
		byte month= sc.nextByte();
		while(month>12||month<1){//�ж�����-���� 
			//�������� 
			System.out.println("������һ������");
			month= sc.nextByte();
		}
		System.out.println("��ȷ���·����֣�"+month);
		//2 
		//�����·�����
		int maxDay;
		if(month==2){//28 
			maxDay=28;
		}else
		if(month==4 ||month==6|| month==9|| month==11 ){//30
			maxDay=30;
		}else{//31 
			maxDay=31;
		}
		System.out.println("�����·�������"+maxDay);
		//3 
		int curDay=1;
		while(curDay<=maxDay){
			//ѭ��ҵ������ 
			System.out.println(month+"��"+curDay+"��");
			//�ı�ѭ������
			curDay++;
		}
		
	}
}
