
public class Test2{
	
	public static void main(String args[]){
		/**
		ѭ���ṹ�ķ���
		
			a��whileѭ��
			b��do whileѭ�� 
			c��forѭ��
		
		if ����֧�﷨
		
		if(��������){
			��������������ʱ��ִ�еĴ���-->ִ�������-�˳���if�ṹ
		}
		
		whileѭ�����﷨
		
		while(��������){
			��������������ʱ��ִ�еĴ���-��ִ�������-������ж�����������ٴ���������ִ�д���...
		}
		
		ִ�еĹ���
		1��������������true-��2)ִ��while��ѭ������
		1��������������true-��2)ִ��while��ѭ������
		...
		1��������������false
		
		*/
		testWhile3();
	}
	/**
		���޴�����ѭ��-��ѭ��һ���������ҵ��-ֹͣ��ѭ��
		a������֪��ѭ����������������ѭ��
		
	*/
		public static void testWhile3(){
			/**
			 1���õ��û����������ż������ӡ--����������ֿ��ܲ���ż��-��������
			 
			 ѭ��ִ�еĹ���
			 a���������� 
			 
			 b���ж�����������-true
			 
			 a���������� 
			 
			 b���ж�����������-true
			 
			 ...
			 a���������� 
			 
			 b���ж�����������-false
			 
			 -->�õ�ż��
			 
			 c)��ӡż��
			 
			*/
			
			//������
			java.util.Scanner sc=new java.util.Scanner(System.in);
			//a���������� 
			System.out.println("������һ��ż��");
			int num= sc.nextInt();
			
			while(num%2!=0){// b���ж�����������-true
				// a���������� 
				System.out.println("������һ��ż��");
				num= sc.nextInt();
			}
			
			// c)��ӡż��
			System.out.println("ż���ǣ�"+num);
			
		}
	
	/**
		���޴�����ѭ��-��ѭ��һ���������ҵ��-ֹͣ��ѭ��
		a������֪��ѭ����������ѭ��
		 1)ѭ������  0 ���ӵ�  ѭ���Ĵ���
		   x������ѭ��������ʼΪ0
		   x��ѭ������  -��ѭ������<����
		   x��ѭ��������-�Ӹı�ѭ������-������ѭ���Ĵ���
		    ѭ������++;
		 
		 2��ѭ������ ѭ���Ĵ���  ��С��   0
		   ...
		  
	*/
	public static void testWhile2(){
		/**
			����
			 1����ͳ�8���ӣ��ԵĹ��̣�a���԰��ӵ�Ƥ b���԰��ӵ��� c����ˮ
		*/
		//ѭ��������ʼΪ0 
		int a=0;
		
		while(a<8){
			
			//ҵ��Ҫ��ѭ��������
			System.out.println("�Եİ��ӱ�ţ�"+(a+1));
			System.out.println("�԰��ӵ�Ƥ");
			System.out.println("�԰��ӵ���");
			System.out.println("��ˮ");
			System.out.println();
			//�ı�ѭ������-������ѭ���Ĵ���
			//a=a+1;
			//a+=1;
			//a++;
			++a;
		}
	
	}
	/**
		1��һ�β�ִ�е�ѭ��
		2��һֱִ�е�ѭ��
	*/
	public static void testWhile1(){
		//1��һ�β�ִ�е�ѭ�� ->ѭ��������ʼ��Ϊfalse
		boolean b=false;
		while(b){
			System.out.println("�ô��벻��ִ�У�����");
		}
		System.out.println("------------------------------");
		//2��һֱִ�е�ѭ������ѭ����->ѭ������һֱΪtrue 
		//��ѭ��-һ���ڷ�����������ʹ��
		b=true;
		while(b){
			System.out.println("�ô���һֱִ�У�����");
		}
	}
	
}