package com.bjsxt.listSetMapTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class TeacherAndCourse {
	HashMap<String,String> teacherAndCourse;

	public TeacherAndCourse(HashMap<String, String> teacherAndCourse) {
		super();
		this.teacherAndCourse = teacherAndCourse;
	}
	public static void main(String[] args) {
		//ԭmap��Ϣ��
		HashMap<String,String> teacherAndCourse=new HashMap<String,String>();
		teacherAndCourse.put("java", "����ʦ");
		teacherAndCourse.put("���ݿ�", "����ʦ");
		teacherAndCourse.put("web", "¬��ʦ");
		teacherAndCourse.put("����", "����ʦ");
		teacherAndCourse.put("��", "¬��ʦ");
		teacherAndCourse.put("��", "����ʦ");
		teacherAndCourse.put("����23", "����ʦ");
		//������map��
		HashMap<String,HashSet<String>> newMap=new HashMap<String,HashSet<String>>();
		HashSet<String> teacherSet=new HashSet<String>();
		Set<Entry<String,String>> entrySet = teacherAndCourse.entrySet();
		for (Entry<String, String> entry : entrySet) {
			if(!teacherSet.contains(entry.getValue())){//�����ʦ������û�д���ʦ
				teacherSet.add(entry.getValue());//��Ӵ���ʦ��teacherSet��
				HashSet<String> courseSet=new HashSet<String>();
				courseSet.add(entry.getKey());
				newMap.put(entry.getValue(), courseSet);//���һ�����ݵ�map
			}
			else{//����Ѿ��д���ʦ������newMap�е�value�����һ�ſγ�
				HashSet<String> course = newMap.get(entry.getValue());//�ҵ�����ʦnewMap���Ѿ��еĿγ�
				course.add(entry.getKey());//��ӵ���entry�Ŀγ�
				newMap.put(entry.getValue(), course);//����map
			}
		}
		
		Set<Entry<String,HashSet<String>>> newEntry = newMap.entrySet();
		for (Entry<String, HashSet<String>> entry2 : newEntry) {
			System.out.print(entry2.getKey()+":");
			for (String course : entry2.getValue()) {
				System.out.println(course+" ");
			}
	
		}
	}
}
