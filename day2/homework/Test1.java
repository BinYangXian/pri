
public class Test1{
	public static  void main(String agrs[]){
		/**
		1������ת��
a)����byte ���ͱ��� b1ֵΪ112����b1��ֵ��ֵ���µ�long���ͱ��� n1���ѱ���n1��ֵ��ֵ��int���ͱ��� i1����ӡ��ر�����
b)���� int ���ͱ���i2ֵΪ97����i2��ֵ��Ӧ���ַ���ֵ��char����c2����ӡ��c2��Ӧ���ַ�ֵ������ֵ��
c)����char���ͱ���ch1,ch2,ch3���ֱ�洢('Y','e','s')�����ַ����������ַ�����������ӡΪYes��
d)����С��float����price�洢��ƷΧ����Ϊ95.85Ԫ��С������3���������ʱ������Żݣ��Զ����ܼ۵�С������Ĩ������ӡ����������֧��xxxԪ��
		*/
		//a
		byte b1=112;
		long n1=b1;
		//int i1=(int)n1;
		int i1=(short)n1;
		System.out.println("b1:"+b1);
		System.out.println("n1:"+n1);
		System.out.println("i1:"+i1);
		//b
		int i2=97;
		char c2=(char)i2;
		System.out.println("c2�ַ�ֵ��"+c2);
		System.out.println("c2����ֵ��"+(byte)c2);
		//c 
		char ch1='Y',ch2='e',ch3='s';
		String concat=""+ch1+ch2+ch3;
		System.out.println("���ӵ��ַ���ֵ��"+concat);
		//d
		float price=95.85f;
		float sumPrice1= price*3;
		int sumPrice2=(int)sumPrice1;
		System.out.println("�ܼۣ�"+sumPrice2);
	}
}