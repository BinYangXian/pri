
public class Test1{
	
	public static void main(String args[]){
		/**
		--- ѡ��while�����������


3���û���������һ���·����֣�����ѭ����ӡ������������
����1��
�����"1��1��","1��2��","1��3��"......,"1��30��","1��31��"
		*/
		dome3();
	}
	public static void dome3(){
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
	public static void dome2(){
		/**
		
2�����1-100���ڵ��ܺͲ������
��ʾ���������ÿ��ѭ�������һ��������100�μ��ɡ�


	˼·������
	 1 ���õ�1��100�����е�����-��ѭ��������1���ӵ�100 
	
		*/
		//����
		int num=1;
		//��ͱ���
		int sum=0;
		while(num<=100){
			//ѭ��ҵ������
			//�ѵ�ǰ������num-���ӵ�sum��洢
			//��ԭ����sum����num=��ֵ��sum
			sum=sum+num;
			//�ı�ѭ������
			num++;
		}
		//��ӡ�� 
		System.out.println("���ǣ�"+sum);
		
	}
	
	public static void dome1(){
		/**
		
1������ѭ����ӡ"hello world2","hello world3"...."hello world11"��
		*/
		
		/**
		��ʽ-1-��ѭ�������ʹ�ӡ�����ַֿ�
		
			//ѭ����ӡ����
		int count=10;
		//��ӡ������
		int num=2;
		while(count>0){
			//��ӡhellowolrd
			System.out.print("hello world");
			//��ӡ����
			System.out.println(num);
			//����+1 
			num++;
			//����ѭ������
			count--;
		}
		*/
		/**
		��ʽ-2-��ѭ�������ʹ�ӡ������ͨ��ͬһ����������
		
		��Ҫ�õ�����min��max����Χ�����е�����
		��·��
		1������ѭ��������ʼmin
		2��ѭ������ÿ��ѭ������+1 
		3��ѭ������-��ѭ������<=max
		*/
		//��ӡ�����ֺ�ѭ������
		int printNum=2;
		while(printNum<=11){
			//��ӡhellowolrd
			System.out.print("hello world");
			//��ӡ����
			System.out.println(printNum);
			//���� ѭ������
			printNum++;
		}
		
	}
	
}
