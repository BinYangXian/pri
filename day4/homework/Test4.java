
public class Test4{
	
	public static void main(String args[]){
	
		printCountChar(3,'A');
		printCountChar(5,'B');
		System.out.println();
		//
		printSanjiao(3,'+');
		printSanjiao(6,'-');
	}	
		/**
		�������·���������main�����е���ʹ�÷���
2����װһ����������ӡ����ߵ�ֱ�������ַ�������  printSanjiao(int n,char ch);-��nΪ�����εĸߣ�chΪ��ӡ���ַ�
���磺
printSanjiao(3,'+')
-----��ӡ------
+
++
+++
printSanjiao(4,'B')
-----��ӡ------
B
BB
BBB
BBBB
		*/
	public static void printSanjiao(int n,char ch){
		for(int rowNum=1;rowNum<=n;rowNum++){
			//��ӡrownum��ch
			for(int i=0;i<rowNum;i++){
				System.out.print(ch);
			}
			//��ӡ���� 
			System.out.println();
		}
	}	
		
	/**
	1����װһ����������ӡ����������ַ�  printCountChar(int n,char ch);
	
	-��nΪ��ӡ�ַ��ĸ�����chΪ��ӡ���ַ�
���磺
printCountChar(3,'A')-->��ӡ��AAA
printCountChar(5,'B')-->��ӡ��BBBBB
	*/
	//������nΪ��ӡ�ַ��ĸ�����chΪ��ӡ���ַ�
	public static void printCountChar(int n,char ch){
		for(int i=1;i<=n;i++){
			System.out.print(ch);
		}
	}
	
	
}
