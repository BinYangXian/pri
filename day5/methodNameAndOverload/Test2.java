
public class Test1{
	
	public static void main(String args[]){
		/**
			���������أ�ָ��������Ĺ�ϵ
			�﷨��
			1��ͬһ������
			2����������ͬ
			3�������Ĳ����б�ͬ
			    a������������ͬ
				b���������Ͳ�ͬ
				c��������˳��ͬ
				--��ע��-���������û�й�ϵ
				
			���������ص�ʹ��
			-����������������ɵĹ������ƣ���ô���ǿ��Է������أ�			
				
		*/
		/**
			���������
		*/
		sum(2,3);
		sum(5,3);
		sum(5,3213);
		/**
			���������-û������-ѧϰ����
		*/
		qiuhe(11,22,333);
		qiuhe(11,222,33312);
		/**
			���������-������-ѧϰ��
		*/
		sum(11,22,333);
		sum(11,222,33312);
	}
	/**
	    ����2��
		���������-->��ʹ������-ʹ�øù���ѧϰ�ɱ���-����һ�����������ƣ�
	*/
	public static int sum(int num1,int num2 int num3){
		int sum=num1+num2+num3;
		return sum;
	}
	
	/**
	    ����2��
		���������-->û��ʹ������-ʹ�øù���ѧϰ�ɱ�����
	*/
	public static int qiuhe(int num1,int num2 int num3){
		int sum=num1+num2+num3;
		return sum;
	}
	
	/**
	    ����1��
		���������
	*/
	public static int sum(int num1,int num2 ){
		int sum=num1+num2;
		return sum;
	}
	
	/**
		������������-����������
	*/
	public static void test1(){}
	public static void test1(int num){}
		/**
		������������-�����˷����ظ�����
	*/
	public static void test2(int a){}
	//public static void test2(int b){}
	
	
}
