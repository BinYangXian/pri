public class Test1{
	public static void main(String[] args){
		dome2();
	}
	/**
	
	2����дһ�����򣬼��㲢��������ַ����еĴ�дӢ����ĸ����СдӢ����ĸ���Լ���Ӣ����ĸ����
��ʾ-�鿴ascii�ַ����ҹ��ɣ��������ַ���ƴ�ӡ�

  String s =��aDsL2we*tR9EVbnM5ky&r$T+@C����
  ��ӡ�Ľ����

�����ṩ���ַ����ǣ�aDsL2we*tR9EVbnM5ky&r$T+@C
�����ַ����У�
��д��ĸ�ֱ��ǣ�  D   L  R  E  V  M   T  C   ���� 8 ��
Сд��ĸ�ֱ��ǣ�  a   s w  w  t  b  n  k y r ���� 8 ��
     ���ֱַ��ǣ�  2  9  5 ����  3  ��
�����ַ��ֱ��ǣ�  *   &  $  +   @ ����5�� */
	public static void dome2(){
		/**
			����
			1���ҵ��ַ��������е��ַ�-��forѭ��
			2���ж��ַ�-���ַ������֣���ĸ��������-��>=��С�� <=�����ַ�
			3����ӡ����Ӧ��ʽ���ַ���-���ҵ���Ӧ���ַ��洢�ڶ�Ӧ�ı����У�ѭ�������ٴ�ӡ
		*/
		
		//ԭʼ�ַ���
		String s ="aDsL2we*tR9EVbnM5ky&r$T+@C";
		//ƴ�Ӹ����ַ����ַ���
		String dxStr="",xxStr="",numStr="",otStr="";
		for(int idx=0;idx<=s.length()-1 ;idx++ ){//1���ҵ��ַ��������е��ַ�
			//��ǰ�ַ�
			char curChar=s.charAt(idx);
			//char��char���Ƚϻ��Զ�ת��Ϊ�������бȽ�
			//2���ж��ַ�
			if(curChar>='0'&&curChar<='9'){//����
				numStr=	numStr+curChar+"\t";
			}else
			if(curChar>='a'&&curChar<='z'){//Сд
				xxStr+=curChar+"\t";
			}else
			if(curChar>='A'&&curChar<='Z'){//��д 
				dxStr+=curChar+"\t";
			}else{//����
				otStr+=curChar+"\t";
			}
		}
		
		//��ӡ
		System.out.println("�ַ�����:"+s);
		System.out.println("��д:"+dxStr+" ������"+dxStr.length()/2);
		System.out.println("Сд:"+xxStr+" ������"+xxStr.length()/2);
		System.out.println("����:"+numStr+" ������"+numStr.length()/2);
		System.out.println("����:"+otStr+" ������"+otStr.length()/2);
		
		
	}
	
		/**
1,���ַ���"abcd�Ƿ�1234�Ƿ�" 
�С��Ƿ����ַ�ת��Ϊ"xxx"��������������ַ���
��ѭ�����ַ�����������
		*/
	public static void dome1(){
		String str="abcd�Ƿ�1234�Ƿ�";
		//�滻-�Ƿ�
		str=str.replaceAll("�Ƿ�","xxx");
		//�������
		//�����ҵ������ַ����±꣨λ�ã���ţ�������
		for(int idx=str.length()-1;idx>=0;idx--){
			//ȡ���ַ�
			char curChar= str.charAt(idx);
			//��ӡ
			System.out.print(curChar);
		}
	}
}