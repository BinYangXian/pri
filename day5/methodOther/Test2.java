
public class Test2{
	
	public static void main(String args[]){
		/**
			������ע���
			1�������в���-���봫�����-�����������Ǯ
			2�������з���ֵ-���Բ�����-���������Բ�����
			
			��������ֵ��ע���
			1�������з���ֵ-��ô����ִ�д��������н���λ�ö����뷵��ֵ
			-��һ���������һ���return 
			
			return ֵ;��return ;�Ա�
			
			return ֵ;�Ĺ���
			a����return ��ֵ ��ֵ��	  ����ֵ���ͱ���rn 
				return ��ֵ��  ��Ҫ<=	 ����ֵ����
			b��������return��������Ĵ��벻ִ�У������˷�����ִ�У�
			
			c���ѷ����ķ���ֵ����rn��ֵ  ��ֵ  �����ձ���
				����ֵ����  ��Ҫ<=	 ���ձ�������
				
			return ;�Ĺ���	
		
			a��������return��������Ĵ��벻ִ�У������˷�����ִ�У�
			
			
			�����ṹ
			1��continue; ����ѭ���ĵ���ѭ��
			2��break;  ����ѭ���ṹ������switch�ṹ
			3��return; �������� 
			
				
		*/
		//��ȡ600Ԫ�ĵȼ�
		//byte grade1= getSalGrade(600);
		//System.out.println("600Ԫ�ĵȼ�:"+grade1);
		//��ȡ700Ԫ�ĵȼ�
		long grade2= getSalGrade(700);
		System.out.println("700Ԫ�ĵȼ�:"+grade2);
		
		
		System.out.println("---------------------");
		
		//��ӡ20��50���ܱ�3�����ġ���һ��������
		printNum(20,50);
		
		
	}
	/**
		��ӡmin��max��Χ�����������ܱ�3�����ġ���һ��������
	*/
	public static void printNum(int min,int max){
		for(int num=min;num<=max;num++){//�ҵ����е�����
			//�жϱ�3����-��ӡ
			if(num%3==0){
				//��ӡ1��
				System.out.println(num);
				//�˳�����
				//break;
				return;
			}
		}
		System.out.println("--ѭ����Ĵ���--");
	}
	
	
	
	
	//���ʵȼ�����
	// 500 ���µȼ�1��500��2000�ȼ�2��2000���ϵȼ�3
	public static int getSalGrade(int sal){
		
		if(sal<500){
			return 1;
		}
		System.out.println("return 1;����Ĵ���");
		if(sal<2000){
			return (byte)2;
		}
		System.out.println("return 2;����Ĵ���");
		
		//return (long)3;//long����ת��Ϊint����ʹ��
		return 3;
		
		//System.out.println("return 3;����Ĵ���");//����д�þ����-��Ϊreturn 3һ��ִ�У������������������û�л���
	}
	
}
