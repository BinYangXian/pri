
public class Test2{
	
	public static void main(String args[]){
		
		dome2();
	}
	public static void dome2(){
		/**
2�����1-1000֮���ܱ�5������������ÿ�����3����

		˼·����
		a���ҵ�1-1000�����е���-������forѭ��-��ѭ������ 1���ӵ�1000
		b��ѭ����-�жϵ�ǰ��-��5����-��ӡ
		c�������ӡ���ֵĴ�������-��ÿ�δ�ӡ-����+1��ÿ��ӡ3�Σ�ģ3==0����һ����
		*/
		//��ӡ���ֵĴ���
		int printNumCount=0;
		for(int num=1;num<=1000;num++){//a 
			//b 
			if(num%5==0){
				//��ӡ
				System.out.print(num+"\t");
				//��ӡ����+1 
				printNumCount++;
			}
			//c-��ǰ������5����-�Ҵ�ӡ�����պ���3�ı�������
			if(printNumCount%3==0&&num%5==0){
				System.out.print("\n");
				//System.out.println();
			}
		}
		
		
	}
	
	/**
	
1���������a---z��ȫ��СдӢ����ĸ����ʾ-��ĸ�������ж�Ӧ��ϵ��

	˼·����
	a���õ�z-a���е���ĸ-�ȵõ�122��97����-������������ת��Ϊ��ĸ��
	b���õ�122��97����--������ forѭ�� -ѭ��������122���ٵ�97
	c��ѭ�����ݰ�����ת��Ϊ��ĸ-����ӡ
	*/
	public static void dome1(){
		
		int maxNum='z';
		int minNum='a';
		for(int charNum=maxNum;charNum>=minNum; charNum--){//�õ�22��97����
			//����ת��ĸ 
			char curChar=(char)charNum;
			System.out.print(curChar);
		}
		
	}
	
}
