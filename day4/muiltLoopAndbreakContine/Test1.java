
public class Test1{
	
	public static void main(String args[]){
		/**
			��֧��Ƕ�ף���֧�ṹ���ֳ��ֵķ�֧�ṹ
			ѭ����Ƕ�ף�ѭ���ṹ���ֳ��ֵ�ѭ���ṹ
			
			ע��㣺ÿһ�����ѭ��ִ�е�ʱ�򣬶���Ҫ���ڲ�ѭ��ִ��һ�Σ�����
			
		*/
		dome2();
	}
	/**
	b��n��m�е�����1
1    1    1    1
1    1    1    1
1    1    1    1
1    1    1    1

	˼·:
	1)��ѭ�� n�Σ�ÿ�δ�ӡһ��
	2��ѭ����-��ѭ��m��-ÿ�δ�ӡһ��
	*/
	public static void dome2(){
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//����n
		System.out.println("�������n");
		int n=sc.nextInt();
		//����m
		System.out.println("�������m");
		int m=sc.nextInt();
		//��ѭ�� n��
		for(int i=0;i<n;i++){
			/**
				��ӡһ������ 
				a����ӡm��1
				b����ӡ����
			*/
			//a 
			for(int j=0;j<m;j++){
				//��ӡ1һ��1
				System.out.print("1\t");
				
			}
			//b 
			System.out.print("\n");
		}
		
	}
	
	
	/**
	a��n��3�е�����1
1    1    1    
1    1    1  
1    1    1    
1    1    1  
	*/
	public static void dome1(){
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//����
		System.out.println("�������n");
		int n=sc.nextInt();
		//ѭ����ӡ
		for(int i=0;i<n;i++){
			//��ӡ 1	1	1
			System.out.println("1	1	1");
		}
	}
}
