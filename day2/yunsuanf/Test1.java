
public class Test1{
	public static  void main(String agrs[]){
		/**
		
		�����
����:�����ݰ�������м��㴦��
���磺�����ܼۣ�ƽ���ٶȣ��ܷ֣�ƽ����...

		���������
		+ -  *���ˣ�  /(��)  %(ģ-��ѧ��������)
		
		
		ע���
		1�������ʱ��С���ͺʹ��������㣬С���Զ�ת��Ϊ�����㣬����Դ�����Ϊ����
		*/
		
		/**
		+ -  *���ˣ� -->����ѧ����һ��
		*/
		System.out.println(2+3);
		System.out.println(2-3);
		System.out.println(2*3);
		
		/**
			/(��)
			
			�����ദ-�����������
		*/
		int b;
		b=6/2;
		System.out.println("b="+b);
		b=5/2;
		System.out.println("b="+b);
		
		double c;
		c=5/2;//5/2�õ���int�Ľ��2����ֵ��c��c�洢2.0
		System.out.println("c="+c);
		
		/**
			�������ʱ����С������Ϳ��Եõ�С���Ľ��
		*/
		c=5.0/2;
		System.out.println("c="+c);
		c=5/2.0;
		System.out.println("c="+c);
		c=5/(double)2;
		System.out.println("c="+c);
		c=5f/2;
		System.out.println("c="+c);
		
		/**
			%(ģ-��ѧ��������)
		*/
		int d;
		d=12%3;
		System.out.println("d="+d);
		d=8%3;
		System.out.println("d="+d);
		d=5%3;
		System.out.println("d="+d);
		
		/**
			ģ����-���и��������ʱ��
			���ֵ
			1)�Ⱥ��Ը���-ֱ��ȡ����
			2�����ֵ����-�뱻������ͬ
		*/
		System.out.println("----------------------------------------------");
		d=5%3;
		System.out.println("d="+d);
		d=-5%3;
		System.out.println("d="+d);
		d=5%-3;
		System.out.println("d="+d);
		d=-5%-3;
		System.out.println("d="+d);
	}
}