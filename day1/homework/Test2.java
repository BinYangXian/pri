
/*
	��д����ģ����Ϸ��֣���main���������¹���
a���洢��ɫ��Ѫ��150���ͷ�����0��
b���洢�ֵ�Ѫ��100��
c����ɫ��һ�ι֣�����Ѫ����40����ɫ��������20��
d���ֹ���һ�ν�ɫ����ɫ��Ѫ����30��
e������ʵ�ִ��2�Σ�������ɫ1�Ρ�
f����ӡ��ɫ��Ѫ�ͷ����Լ������Ѫ��
--->��ʾ-�������Զ�θ�ֵ
*/
public class Test2{
	public static void main(String agrs[]){
		//�����ɫ��Ѫ�ͷ��������Ѫ�ı���
		int jsHp=150,jsScore=0,gwHp=100;
		//��� 
		gwHp=gwHp-40;
		jsScore=jsScore+20;
		//��� 
		gwHp=gwHp-40;
		jsScore=jsScore+20;
		//������ɫ 
		jsHp=jsHp-30;
		//��ӡ��Ϣ
		System.out.print("��ɫ��Ѫ��");
		System.out.println(jsHp);
		System.out.print("��ɫ�ķ�����");
		System.out.println(jsScore);
		System.out.print("�����Ѫ��");
		System.out.println(gwHp);
		
	}
}