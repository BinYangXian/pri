
public class Test2{
	
	public static void main(String args[]){
	
		dome2();
	}
	public static void dome2(){
		/**
		//switch��ϰ--���switch��if-else
2�������û�������·ݣ�������·ݵ�����(����Ҫ�������ꡢ����)��

����1-12֮���������ӡ-�����·����֡�
    4 6 9 11 -->30
    2 -->28
    1 3 5 7 8 10 12  -->31
	
	˼·����
		1����������
		2���жϴ�ӡ
		  a��4 6 9 11 -->30
		  b�� 2 -->28
		  c) 1 3 5 7 8 10 12  -->31
		  d������ 		�����·�����
		*/
		//1  
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//����
		System.out.println("������1-12�����֣�");
		short month= sc.nextShort();
		//2 
		//�����·ݵ�����
		if(month>12||month<1){
			System.out.println("�����·�����");
		}else{
			//���·ݵ�����-��1-12 
			switch(month){
				case 2: 
					System.out.println("28��");
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println("30��");
					break;
				default :
					System.out.println("31��");
			}
		}
		
	}
	public static void dome1(){
		/**
		1������switch�´�������break֮ǰ��������ִ�У���
		�û�����1-7����һ������(����)���жϹ����ա���ĩ��
		����1-7֮���������ӡ-�����������֡�
		
		˼·����
		1����������
		2���жϴ�ӡ
		  a��1-5        ������
		  b��6-7		��ĩ 
		  c������ 		������������
		*/
		//1  
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//����
		System.out.println("������1-7�����֣�");
		short weekDay= sc.nextShort();
		//2 
		//�������������
		if(weekDay>7||weekDay<1){
			System.out.println("������������");
		}else{
			//�����������-��1-7 
			switch(weekDay){
				case 6: 
				case 7:
					System.out.println("��ĩ");
					break;
				default :
					System.out.println("������");
			}
		}
		
		
	}
	
}