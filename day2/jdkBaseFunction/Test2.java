
public class Test2{
	
	public static void main(String agrs[]){
  		/**
			java���õĹ���
			1����ӡ����
			System.out.println(��ӡ������)   ��ӡ���ݣ�Ȼ���ӡ����
			System.out.print(��ӡ������)   ��ӡ���ݲ�����
			
			2���������С��
			Math.random()   ÿ��ִ�ж�����һ��[0,1)�����doubleֵ
		
			3)�õ�����̨�û����������
				a���ҵ�����̨�Ĺ�����
				java.util.Scanner sc=new java.util.Scanner(System.in);
				b)ͨ���������õ��û����������
				  x���õ�������ַ���
				    sc.next()    
				  x���õ�����Ļ�����������
					sc.next����������������ĸ��д��() 
					���磺sc.nextInt();  sc.nextDouble() ...
			ע���
			1��һ�������߿��Ի�ȡ����û����������
			2��sc.nextXXX�Ĺ���ִ�е�ʱ�򣬻���ͣ����ִ�У����û��������ݣ����뵽�س���ʱ�򣬰�
			�س�֮ǰ�����ݷ��ص������м���ִ�С�
			
		*/
		/**
			����õ��û���������ֺ����䣬��ӡ����ӭxx���xx����������ѧ�á�
		*/
		//�˵�����
		String name;
		//�˵�����
		int age;
		
		//�ҵ�������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		//��ʾ
		System.out.println("�������������");
		
		//�ӿ���̨��������
		name=sc.next();
		
		//��ʾ
		System.out.println("�������������");
		//�ӿ���̨��������
		age=sc.nextInt();
		
		//��ӡ��ӭ��Ϣ
		System.out.println("��ӭ"+age+"���"+name+"����������ѧ��");
		
	}
}