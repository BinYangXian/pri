
public class Test3{
	public static  void main(String agrs[]){
		/**
			�����Լ������
			--  ++
			���ã����˱���+1��-1�Ĳ���
			
			
			
			�����Լ��������������
			1��ȡ����ǰ������ֵ
			2���ñ�������+1��-1
			
			�﷨��
			a)����++��-- ���� 1���� 2��
			b)++��--���� ���� 2���� 1��
			
		*/
		
		//С������10��
		int age=10;
		System.out.println("age��"+age);
		//����һ��������
		//���������ʵ��
		age= age+1;
		System.out.println("age��"+age);
		//����һ��������
		//��չ�����ʵ��
		age+=1;
		System.out.println("age��"+age);
		//����һ��������
		//���������ʵ��
		age++;
		System.out.println("age��"+age);
		
		//����numΪ10
		int num=10;
		//����num2
		int num2;
		//������num��ֵ��ֵ��num2����������num�Լ�����1
		/**
		��ʽ1
		*/
		num2=num;
		num=num+1;
		System.out.println("num:"+num);
		System.out.println("num2:"+num2);
		
		//��ԭnum��ֵΪ10
		num=10;
		/**
		��ʽ2
		*/
		num2=num++;
		System.out.println("num:"+num);
		System.out.println("num2:"+num2);
		
	}
}