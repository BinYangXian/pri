
public class Test1{
	public static  void main(String agrs[]){
		/**
			java���õĹ���
			1����ӡ����
			System.out.println(��ӡ������)   ��ӡ���ݣ�Ȼ���ӡ����
			System.out.print(��ӡ������)   ��ӡ���ݲ�����
			
			2���������С��
			Math.random()   ÿ��ִ�ж�����һ��[0,1)�����doubleֵ
		
		
			ע���
			1��������Ĺ����У�С���ͻ��Զ�ת��Ϊ�������ٽ������㣬����Դ�����Ϊ��
			2)�������=�����ȼ���͵�
			3�����������ͨ��()������ȼ�
		
		*/
		//����[0,1)�����С��
		double rn1= Math.random();
		double rn2= Math.random();
		System.out.println("rn1:"+rn1);
		System.out.println("rn2:"+rn2);
		
		//����[0,10)�����С��
		double rn3= Math.random()*10;
		System.out.println("rn3:"+rn3);
		
		//����[0,10]���������
		int rn4= (int)(Math.random()*11);
		System.out.println("rn4:"+rn4);
		
		//����[5,15]���������
		int rn5= (int)(Math.random()*11)+5;
		System.out.println("rn5:"+rn5);
		//����[5,10]���������
		int rn6= (int)(Math.random()*6)+5;
		System.out.println("rn6:"+rn6);
		/**
			������min��max��֮�����������Ĺ�ʽ
			int rnNum= (int)(Math.random()*(max-min+1))+min;
		*/
		//����[-2,3]���������
		int rnNum =(int)(Math.random()*(3+2+1))-2;
		
		System.out.println("rnNum:"+rn6);
	}
}