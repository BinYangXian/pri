
public class Test1{
	
	public static void main(String args[]){
		/**
			������ע���
			1�������в���-���봫�����-�����������Ǯ
			2�������з���ֵ-���Բ�����-���������Բ�����
			
			��������ֵ��ע���
			1�������з���ֵ-��ô����ִ�д��������н���λ�ö����뷵��ֵ
			-��һ���������һ���return 
			
		*/
		
	}
	public static void dome2(){
		
		
	}
	/**
		��ָ�������ʡ��ġ����ʼ��𡿲�����
		0-2000  -����˿
		
		2001-5000-������
		5001-10000-������
		10000>������
		
		���һ�䷵��ֵ
	*/
	public static String getSalGrade2(int sal){
		
		//���ʼ���ı���
		String grade;
		
		if(sal>=0&&sal<=2000){//��˿
			grade= "��˿";
		}else if(sal>=2001&&sal<=5000){//����
			grade= "����";
		}else if(sal>=5001&&sal<=10000){//����
			grade= "����";
		}else if(sal>10000){//������
			grade= "������";
		}
		//��ֵ��⵰
		grade="��⵰";
		
		//-���ؼ���
		return grade;
	}
	/**
		��ָ�������ʡ��ġ����ʼ��𡿲�����
		0-2000  -����˿
		
		2001-5000-������
		5001-10000-������
		10000>������
		
		���н�����λ��-������ֵ
	*/
	public static String getSalGrade(int sal){
		
		if(sal>=0&&sal<=2000){//��˿
			return "��˿";
		}else if(sal>=2001&&sal<=5000){//����
			return "����";
		}else if(sal>=5001&&sal<=10000){//����
			return "����";
		}else if(sal>10000){//������
			return "������";
		}
		//-��⵰
		return "��⵰";
	}
	
	
	public static void dome1(){
		/**
		������ע���
		*/
		//sum1();//���봫�����
		int rs1= sum1(2,3);//���շ���ֵ
		sum1(4,3);//�����շ���ֵ
	}
	
	//���
	public static int sum1(int num1,int num2){
		int sum1=num1+num2;
		return sum1;
	}
}
