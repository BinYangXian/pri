
public class Test1{
	
	public static void main(String args[]){
		
		dome2();
	}
	//�ڶ���ĳ���
	public static void dome2(){
		/**
2���û�����һ��100���ڵĳɼ������ɼ���85�����ϵ�ʱ��������ȼ�A��,
70���ϵ�84֮��������ȼ�B��, 60��69֮��������ȼ�C��,60����������ȼ�D��

����պ�60�ֻ�Ҫ�������������Ŷ����
����պ�100�ֻ�Ҫ���������Ĥ�ݰ�����

	˼·������
	1������100���ڵĳɼ�
	2���жϳɼ�
	  a��85��100 -���ȼ�a
	  b��70��84 -���ȼ�b
	  c��60��69 -���ȼ�c
	  d��0��59 -���ȼ�d
	
	  e >100��<0 �������
 	
		*/
		//1 
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//����
		System.out.println("������0��100�ĳɼ����֣�");
		short score= sc.nextShort();
		//�жϳɼ� 
		//�������
		if(score>100||score<0){
			System.out.println("�������");
		}else if(score>=85){//�ȼ�A -��0��100����85��100
			System.out.println("�ȼ�A");
			//�ж�100
			if(score==100){
				System.out.println("����Ĥ�ݰ�");
			}
		}else if(score>=70){//�ȼ�B -��0��84����70��84
			System.out.println("�ȼ�B");
		}else if(score>=60){//�ȼ�c -��0��69����60��69
			System.out.println("�ȼ�c");
			//�ж�60 
			if(score==60 ){
				System.out.println("��������Ŷ");
			}
		}else {
			System.out.println("�ȼ�d");
		}
		
	}
	//��һ��ĳ���
	public static void dome1(){
		/**
		1���������һ����-20��100����������жϲ���ӡ������������ż��
		
		˼·
		 a������-20��100�������
		 b���ж�����������-����ӡ������
		 c���ж����ֲ�������=����ӡ��ż��
		*/
		//a
		int rnNum= (int)(Math.random()*(100+20+1))-20;
		System.out.println("���������֣�"+rnNum);
		//b
		if(rnNum%2!=0){//�ж�����������
			System.out.println("������");
		}else{//�ж����ֲ�������
			System.out.println("��ż��");
		}
		
		
	}
	
}
