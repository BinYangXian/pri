
public class Test1{
	
	public static void main(String args[]){
		/**
		1. ��ӡ50-n֮�����е��ܱ�3������ż����n���û�����(n�ķ�Χ102��  
1000)��

˼·������
a)����n��102��1000������-������ѭ��
b)�ҳ�50��n����������-������ѭ��
c)�ж������Ƿ���ż���ұ�3����-����֧���

		*/
		app();
	}
	public static void app(){
		//a 
		int n= inputRangeInt(102,1000);
		System.out.println("�����n��"+n);
		for(int num=50;num<=n;num++){//b 
			//c 
			if(num%2==0&&num%3==0){
				System.out.println(num);
			}
		}
		
	}
	
	/**
		�õ��û������min��max��Χ������
	*/
	public static int inputRangeInt(int min,int max){
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//���������
		int inNum;
		//ѭ��������
		while(true){
			//�������� 
			System.out.println("������һ��"+min+"��"+max+"������");
			inNum= sc.nextInt();
			//�ж�������ȷ-�˳�ѭ��
			if(inNum>=min&&inNum<=max){
				break;
			}
		}
		//������ȷ������
		return inNum;
	}
	
}
