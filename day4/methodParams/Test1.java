
public class Test1{
	
	public static void main(String args[]){
		/**
			
�������  ������Ӧһ�ֹ��ܣ������Ķ�����-��Ӧ�ù���ʵ�ֵĲ��裬����������ù����������顣
   ���磺
�Է���1���ÿ���2���ѷ��������3��ҧ���̶��
�˴���Ϸ��  1������2����װ��Ϸ3������Ϸ4������Ϸ

		*/
		//��6��ƻ��
		eatApple();
		//��50������ 
		eatChicken();
		//��6��ƻ��
		eatApple();
	}
	/**
		û���÷����Ĳ���-������ƻ��6�����͡��Լ���50����
		��������-�ǳ�����-�����ظ�
		���������-���Ѵ��붨�嵽һ�������У���ȷ��������-���ò�������
	*/
	
	
	/**
��ƻ��6��
	*/
	public static void eatApple(){
		//�Եĸ���
		int eatCount=6;
		//�Ե�ʳ��
		String eatFood="ƻ��";
		
		for(int i=1;i<=eatCount;i++){
			System.out.println("�Ե�"+i+"��"+eatFood);
			System.out.println("�ппп�");
			System.out.println("�����");
			System.out.println();
		}
	}
	/**
�Լ���50��
	*/
	public static void eatChicken(){
		//�Եĸ���
		int eatCount=50;
		//�Ե�ʳ��
		String eatFood="����";
		
		for(int i=1;i<=eatCount;i++){
			System.out.println("�Ե�"+i+"��"+eatFood);
			System.out.println("�ппп�");
			System.out.println("�����");
			System.out.println();
		}
	}
	
}
