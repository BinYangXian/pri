
public class Test2{
	
	public static void main(String args[]){
		/**
		2����ӡ100-n֮���ˮ�ɻ�����ˮ�ɻ������壬n���û����룬n->101��99999
ÿһλ�ĸ�����λ�����η�֮�͵��ڸ�������ô����Ϊˮ�ɻ���
�磺
153=1��3�η�+5��3�η�+3��3�η�
1634=1��4�η�+6��4�η�+3��4�η�+4��4�η�
-------------------------
153
370
371
407
1634
8208
9474
54748
92727
93084
ע�⣺����λ����ȷ������Ҫ��̬�Ļ�ȡ��
�����ֵ�λ��-��������/10; ��0����
������ÿһλ����-��������/10��%10;��0����

˼·����(��������ֽ�С����)��
 a)����n��101��99999������-������ѭ��
 b)�ҳ�100��n����������-������ѭ��
 c)�жϵ�ǰ�������Ƿ���ˮ�ɻ���
        1����153=1��3�η�+5��3�η�+3��3�η� ������153�����ж����֣�����ֱ�ӻ�ȡ�� 
        2��3�η�����������λ��
        3��  1��3��5����������ÿһλ����
        4��  1��3�η�-->���Ĵη�---�������۳�--���ο��ۼ�
        5��  1��3�η�+5��3�η�+3��3�η�---���ۼ����
        6�����֮��������153�Ƚϼ����ж�
		*/
		app();
	}
	public static void app(){
		//a 
		int n= inputRangeInt(101,99999);
		System.out.println("�����n��"+n);
		for(int curNum=100;curNum<=n;curNum++){//b 
			//c
			if(isFloorNum(curNum)){
				System.out.println(curNum+"��ˮ�ɻ���");
			}
		}
	}
	/**
		�����ָ����������λ��������
		������ָ������
		����ֵ�������λ��
		
		˼·�������ֲ��ϵĳ���10��С����С��0������-ͳ����С�Ĵ����͵õ�λ����
	*/
	public static byte weishu(int num){
		byte ws=0;
		/**
		��ʽ1������do while ѭ��-��ѭ��������ѭ������ 
		
		do{
			//��Сһλ 
			num=num/10;//  num/=10;
			//ͳ��һλ
			ws++;
		}while(num!=0);//�жϲ�Ϊ0-����ѭ��
		*/
		/**
		��ʽ2����ѭ��-�ڲ�break����
		*/
		while(true){
			//��Сһλ 
			num=num/10;//  num/=10;
			//ͳ��һλ
			ws++;
			//�ж�Ϊ0--���˳�ѭ��
			if(num==0){
				break;
			}
		}
		
		return ws;
	}
	
	/**
		�����ָ���������ġ�ָ��ָ�����Ĵη�������
		������ָ��������ָ��
		����ֵ���η�
	*/
	public static int cifang(int ds,int zs){
		
		//�۳˱���
		int rs=1;
		//�ѵ���ds��ָ��zs��
		for(int a=0;a<zs;a++){
			//�ѵ�ǰ����-�۳�һ��
			rs=rs*ds;//rs*=ds;
		}
		//���ؽ��
		return rs;
	}
	/**
		�жϡ�ָ���������Ƿ���ˮ�ɻ���
		������ָ������
		����ֵ��true ��ˮ�ɻ�   false  ����
	*/
	public static boolean isFloorNum(int num){
		//��������num
		int oldNum=num;
		//λ��
		int ws=weishu(num);
		//�ۼӴη��ı���
		int sumCf=0;
		
		//�ҵ�num�����е�����-��η�...
		while(true){
			//ȡ����ǰ���ĸ�λ(���磺153��1��5��3)
			int gw=num%10;
			//System.out.println(gw);
			int cf=cifang(gw,ws);
			//�ۼӴη� 
			sumCf+=cf;
			//��Сһλ 
			num=num/10;//  num/=10;
			
			//�ж�Ϊ0--���˳�ѭ��
			if(num==0){
				break;
			}
		}
		//�ж�-�η����뵱ǰ���Ƿ����-���ˮ�ɻ� 
		//return num==sumCf;
		if(oldNum==sumCf){
			return true;
		}else{
			return false;
		}
	}
	/**
		�õ��û������min��max��Χ������
	*/
	public static int inputRangeInt(int min,int max){
		//������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//���������
		int inNum;
		//ѭ��������
		while(true){
			//�������� 
			System.out.println("������һ��"+min+"��"+max+"������");
			inNum= sc.nextInt();
			//�ж�������ȷ-�˳�ѭ��
			if(inNum>=min&&inNum<=max){
				break;
			}
		}
		//������ȷ������
		return inNum;
	}
	
}
