
public class Test1{
	
	public static void main(String args[]){
		/**
����
		1����������ʦ�б�
���    	��ʦ��
1          ����ʦ
2          ¬��ʦ
30          ����ʦ
4          ����ʦ

Ҫ���û������ţ���ӡ����Ŷ�Ӧ����ʦ������

˼·
1��������
2���ж�-��ӡ
 a��==1			��ӡ����ʦ
 b��==2			��ӡ¬��ʦ 
 c��==30 		��ӡ����ʦ 
 d��==4			��ӡ����ʦ 
 e����������	û�ж�Ӧ����ʦ		
			*/
		

		/**
			��֧�ṹ
			if �ṹ����֧������-�������������������> < == != ��
			switch�ṹ������==�ķ�֧����-�����Ż�
			
			
			����ֵ�����е�����ֵ���ǳ���ֵ
			
			�﷨��
			switch(��֧����){
				[
				case  ����ֵ :
					��֧����==����ֵʱִ�еĴ���
					[break;]
				case  ����ֵ :
					��֧����==����ֵʱִ�еĴ���	
					[break;]
				...
				
				]
				[
				default:�������е�case������ִ�еĴ���
				]
			}
			ִ�еĹ��̣�
			1�����ݷ�֧�������ϵ��������ж���������case����case�����ִ�ж�Ӧcase�Ĵ��룬
			ִ����ɻ��������ִ�У�ֱ������breakΪֹ
			2��������е�case����������������ôִ��default
		
		*/
		dome3();
	}
	public static void dome3(){
		/**
			switch��ע���
			1����֧�������ͣ�jdk1.6��int��ö������   jdk1.7֮��������ַ���String
			2��case������ǳ��������Ǳ���
		*/	
		String str1="hello";
		int num1=11;
		long num2=33;
		byte num3=44;
		switch(str1){}
		switch(num1){}
		//switch(num2){} long�����Զ�תint =����ʹ��
		switch(num3){} //byte�����Զ�תint =����ʹ��
		
		int a=5;
		switch(num1){
			case 1:
			case 2:
			case a: // a �Ǳ���������case��ʹ��
			case 6:
		}
		
	}
	/**
		switch�ṹʵ��
	*/
	public static void dome2(){
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//������
		System.out.println("��������");
		int num=sc.nextInt();
		//�ж�-��ӡ
		
		switch(num){
			case  1 :
				System.out.println("����ʦ");
				break;
			case  2 :
				System.out.println("¬��ʦ");
				break;
			case  30 :
				System.out.println("����ʦ");
				break;
			case  4 :
				System.out.println("����ʦ");
				break;
			default:
				System.out.println("û�ж�Ӧ����ʦ���������");
		}
	}
	/**
		if else�ṹʵ��
	*/
	public static void dome1(){
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//������
		System.out.println("��������");
		int num=sc.nextInt();
		//�ж�-��ӡ
		if(num==1){
			System.out.println("����ʦ");
		}else
		if(num==2){
			System.out.println("¬��ʦ");
		}else
		if(num==30){
			System.out.println("����ʦ");
		}else
		if(num==4){
			System.out.println("����ʦ");
		}else{
			System.out.println("û�ж�Ӧ����ʦ���������");
		}
		
	}
}
