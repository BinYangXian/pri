package com.bjsxt.listSetMapTest;

import java.lang.reflect.Array;

public class Test3 {
	public static void main(String[] args) {
		//����String����
		test1("111");
		//����Integer����
		test1(111);
	}
	public static <Type> void test1(Type t){
		//Type[] arr= new Type[];//���Ͳ��� ֻ�Ǳ�������Ч
		//��ȡt����ʱ������
		Class runT= t.getClass();
		//����t����ʱ���͵�����
		Type[] arr=(Type[]) Array.newInstance(runT, 10);
		System.out.println("�������ͣ�"+arr);
		System.out.println("���鳤�ȣ�"+arr.length);
	}
}
