
public class Test2{
	public static  void main(String agrs[]){
		/**
		1����˾����û�����̨����int�����䣬String�����֣�
		Ȼ��ͨ�������Ϊ��齱������5-100Ԫ�Ľ��𣩣�
		��ӡ�����¸�ʽ�ַ���������̨��
		��ʽ��xxx���xxx��ã���ϲ���н�xxxԪ;
		
		˼·����
		1�������û�����
		2����������
		3�������������
		4��ƴ�Ӷ�Ӧ��ʽ�ַ���
		5����ӡ
		*/
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//1
		System.out.println("����������");
		String name=  sc.next();
		//2
		System.out.println("����������");
		int age=  sc.nextInt();
		//3 
		int rnMoney=(int)(Math.random()*(100-5+1))+5;
		//4 
		String concat=age+"���"+name+"��ã���ϲ���н�"+rnMoney+"Ԫ";
		//5 
		System.out.println(concat);
	}
}