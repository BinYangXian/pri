
public class Test3{
	
	public static void main(String args[]){
		/**
			----------���ã������ֽ⣬�ظ����ô���

1. ��ӡ�û�����ĸߺ��ַ�������������
�磺����3 ��B

B
BB
BBB

�磺����5 ��C
C
CC
CCC
CCCC
CCCCC

��ӡ�����ε�˼·
	1��ѭ�� n�Σ���ӡ���е���
	2��ѭ����-��ӡ������-��ѭ���кŴδ�ӡ���ַ������ٻ���
	
		*/
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//����-��
		System.out.println("�����������εĸ�");
		int n=sc.nextInt();
		//����-��ɵ��ַ�
		System.out.println("�����������ε���ɵ��ַ�");
		String ch=sc.next();
		
		//��ӡ������
		//ѭ��n��
		for(int curRow=1;true;curRow++){
			//��ӡһ�����ݣ�a����ӡ�к�curRow�����ַ���b���ٴ�ӡ����
			//a 
			for(int i=0;i<curRow;i++){
				System.out.print(ch);
			}
			//b
			System.out.print("\n");
			
			//ѭ��n�κ�-���� 
			if(curRow==n){
				break;
			}
			
		}
		
		
		
		
	}
	
}
