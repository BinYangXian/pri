
public class Test1{
	
	public static void main(String args[]){
		/**
			Ϊʲôʹ�÷�֧��
    ��ʱ�����ǵĴ��벻��һ��ִ�еģ����Ǹ�������ѡ��ִ�еģ����Ǿ���Ҫ��֧��䡣

a��˳��ṹ��
    ֮ǰ���Ĵ��붼��˳��ִ�еģ����ϵ�������ִ��ÿһ�����
b����֧�ṹ��
    ����ִ�й����У��в��ִ���ѡ����ִ�У���������������ֵ��ִ�У���
  ��Ҫ�õ���֧�ṹ���磬�û���¼���������������¼�ɹ���

		*/
		testIf3();
	}
	/**
		���֧�ṹ��if�ṹ����﷨��-���Դ���
		
		�﷨��
		if(������֧����){
			��֧����Ϊtrueʱִ�еĴ���
			��֧����Ϊtrueʱִ�еĴ���
		}
		[
		else if(������֧����){
			��֧����Ϊtrueʱִ�еĴ���
			��֧����Ϊtrueʱִ�еĴ���
		}
		...
		]
		[
		else{
			�������з�֧����Ϊfalseִ�еĴ���
			...
		}
		]
		�ýṹ��
		if������ֻ��1��
		else if�� 0�����
		else ��0��1��
		
		ִ�й���
		1)�����ж�if��else if�����еķ�֧��������������-��ִ�ж�Ӧ�ķ�֧-Ȼ���뿪��֧�ṹ
		2��������е�if��else if������������-=ִ��else
		
	*/
	public static void testIf3(){
		/**
			�û���¼
			1���û�����qq�ź�qq����
			
			2���ж�-����ȷ��qq�ź����루111��222��
			  a���ж�qq�ź�qq������ȷ  --����¼�ɹ�����ʾ����������
			  b���ж�qq�ź�qq������� --����¼ʧ�ܣ� qq�ź�qq�������
			  c�� qq���� 
			  d) ������� 
			 
		*/
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//����QQ��
		System.out.println("������qq��");
		int qqNum=sc.nextInt();
		//����QQ����
		System.out.println("������qq����");
		int qqPwd=sc.nextInt();
		
		/**
		��ʽ1���ֶ���д4����֧����
		
		*/
		//�ж�qq�ź�qq������ȷ
		if(qqNum==111&&qqPwd==222){
			System.out.println("��¼�ɹ�");
			System.out.println("��ʾ����������");
		}else 
		if(qqNum!=111&&qqPwd==222){//qq�Ŵ���
			System.out.println("��¼ʧ��");
			System.out.println("qq�Ŵ���");
		}else 
		if(qqNum==111&&qqPwd!=222){//�������
			System.out.println("��¼ʧ��");
			System.out.println("�������");
		}else 
		if(qqNum!=111&& qqPwd!=222){//qq�ź��������
			System.out.println("��¼ʧ��");
			System.out.println("qq�ź��������");
		}
		/**
		��ʽ2������qq����������һ����4����������ǿ���4�������˵��
		���з�֧����ִ��-��д��֧��ʱ��-Ӧ�ü�else-����д��֧����		
		*/
		System.out.println("--------------------");
		//�ж�qq�ź�qq������ȷ
		if(qqNum==111&&qqPwd==222){
			System.out.println("��¼�ɹ�");
			System.out.println("��ʾ����������");
		}else 
		if(qqNum!=111&&qqPwd==222){//qq�Ŵ���
			System.out.println("��¼ʧ��");
			System.out.println("qq�Ŵ���");
		}else 
		if(qqNum==111&&qqPwd!=222){//�������
			System.out.println("��¼ʧ��");
			System.out.println("�������");
		}else{//qq�ź��������
			System.out.println("��¼ʧ��");
			System.out.println("qq�ź��������");
		}
	}
	
	/**
		˫��֧�ṹ-���Դ���
		
		�﷨��
		if(������֧����){
			��֧����Ϊtrueʱִ�еĴ���
			��֧����Ϊtrueʱִ�еĴ���
			...
		}else{
			��֧����Ϊfalseʱִ�еĴ���
			��֧����Ϊfalseʱִ�еĴ���
			...
		}
		
	*/
	public static void testIf2(){
		/**
			�û���¼
			1���û�����qq�ź�qq����
			
			2���ж�-����ȷ��qq�ź����루111��222��
			  a���ж�qq�ź�qq������ȷ  --����¼�ɹ�����ʾ����������
			  b���ж�qq�Ż�qq������� --����¼ʧ�ܣ� qq�Ż�qq�������
			 
		*/
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//����QQ��
		System.out.println("������qq��");
		int qqNum=sc.nextInt();
		//����QQ����
		System.out.println("������qq����");
		int qqPwd=sc.nextInt();
		
		//�ж�qq�ź�qq������ȷ
		if(qqNum==111&&qqPwd==222){
			System.out.println("��¼�ɹ�");
			System.out.println("��ʾ����������");
		}else{
			System.out.println("��¼ʧ��");
			System.out.println("qq�Ż�qq�������");
		}
		
	}
	
	
	/**
		����֧�ṹ-���Դ���
		
		�﷨��
		if(������֧����){
			��֧����Ϊtrueʱִ�еĴ���
			��֧����Ϊtrueʱִ�еĴ���
			...
		}
		
	*/
	public static void testIf1(){
		/**
			�û���¼
			1���û�����qq�ź�qq����
			
			2���ж�-����ȷ��qq�ź����루111��222��
			  a���ж�qq�ź�qq������ȷ  --����¼�ɹ�����ʾ����������
			  
			 
		*/
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//����QQ��
		System.out.println("������qq��");
		int qqNum=sc.nextInt();
		//����QQ����
		System.out.println("������qq����");
		int qqPwd=sc.nextInt();
		
		//�ж�qq�ź�qq������ȷ
		if(qqNum==111&&qqPwd==222){
			System.out.println("��¼�ɹ�");
			System.out.println("��ʾ����������");
		}
		
	}
}
