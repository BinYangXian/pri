
public class Test2{
	
	public static void main(String args[]){
		/**
		 break��continue�ؼ���
		 ���á�������̬����ѭ���ڲ������ѭ��
		 
		 break��Ĭ�Ͻ�������break��ѭ���ṹʣ������д�ѭ����
		 -��ִ��break֮�󣬺�������еĴ�ѭ��������ִ�У�ֱ���뿪ѭ���ṹ��
		 continue��Ĭ�Ͻ�������continue��ѭ���ṹ1��ѭ����
		 -��ִ��continue֮�󣬵�ǰ����ʣ��ѭ�����ݲ�ִ�У�ֱ�ӽ�����һ��ѭ��ִ�С�
		
		*/
		dome3();
	}
	/**
1    12345
3    12345       
4    12345
6    12345
	*/
	public static void dome3(){
		System.out.println("��ʽ1���ڴ�ӡ��ʱ���ų�2��5�в���ӡ");
		for(int num=1;num<=6;num++){
			
			//��2�к͵�5��-���ܴ�ӡ
			if(num!=2&&num!=5){
				//��ӡһ������ 
				System.out.println(num+"\t12345");
			}
		}
		System.out.println("��ʽ2���ڴ�ӡ֮ǰ���ų�2��5�в���ӡ");
		for(int num=1;num<=6;num++){
			
			//��2�л��5��-��ǰ�������������εĴ�ӡ��
			if(num==2||num==5){
				continue;
			}
			//��ӡһ������ 
			System.out.println(num+"\t12345");
			
		}
	}
	/**
break������ǰ������ѭ��

1    12345
2    12345
3    12345 --��ǰ����
4    12345
5    12345
6    12345
	*/
	public static void dome2(){
		/**
			��ʽ1���ı�ѭ������
		*/
		System.out.println("----------��ʽ1���ı�ѭ������-------------");
		for(int num=1;num<=3;num++){
			//��ӡһ������ 
			System.out.println(num+"\t12345");
		}
		/**
			��ʽ2����������ѭ������������ִ�е�Ҫ���ѭ������-����break��ǰ����ѭ��
		*/
		System.out.println("----------��ʽ2������break��ǰ����ѭ��-------------");
		for(int num=1;true;num++){
			//��ӡһ������ 
			System.out.println(num+"\t12345");
			//��3�д�ӡ���-����ѭ�� 
			if(num==3){
				break;
			}
		}
		
	}
	/**
	��ӡ����ͼ��
	
1    12345
2    12345
3    12345
4    12345
5    12345
6    12345
	*/
	public static void dome1(){
		
		for(int num=1;num<=6;num++){
			//��ӡһ������ 
			System.out.println(num+"\t12345");
		}
		
	}
}
