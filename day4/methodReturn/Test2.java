
public class Test2{
	
	public static void main(String args[]){
		/**
		ʹ�÷�������ֵ�Ĳ���
		
		1�����巽��-���뷵��ֵ���ͣ���������Ҫ���ص����ݵ����ͣ�
			�﷨��
			public static  ����ֵ����  ������(��ʽ�����б�){//�����Ĵ���}
		void���գ����÷������ݡ�
		����ֵ����:���巵�ص���������,����Ҫ��������-��void��
		
		2�����巽���Ĵ�����-������return ֵ������Ҫ���ص����ݴ��ظ�����λ�ã�
			�﷨��
		public static  ����ֵ����  ������(��ʽ�����б�){
			//�����Ĵ���
			//1)ҵ�����
			...
			//2)�ѽ�����ݷ��� 
			return �������ֵ;
			}
			
		3)ʹ��ִ�з�����ʱ��-���շ�������������
			�﷨��
		  ����ֵ����  ���ձ����� = ������(ʵ�ʲ���);
			
		*/
		//���2+3 -�ѽ���洢sum2������
		int sum2= sum1(2,3);
		//ʹ��sum2
		System.out.println("2��3�ĺͣ�"+sum2);
	}
	
	/**
	�������κ��������ĺ͵ķ���
	������num1��num2��͵�������
	����ֵ��������ĺͷ��ظ������ĵ���λ��
	*/
	public static int  sum1(int num1,int num2){
		//���
		int sum=num1+num2;
		//�Ѻʹ��ظ���������λ��
		return sum;
	}
	
}