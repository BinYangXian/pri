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
		//原map信息：
		HashMap<String,String> teacherAndCourse=new HashMap<String,String>();
		teacherAndCourse.put("java", "曾老师");
		teacherAndCourse.put("数据库", "曾老师");
		teacherAndCourse.put("web", "卢老师");
		teacherAndCourse.put("体育", "刘老师");
		teacherAndCourse.put("体", "卢老师");
		teacherAndCourse.put("育", "刘老师");
		teacherAndCourse.put("体育23", "刘老师");
		//创建新map：
		HashMap<String,HashSet<String>> newMap=new HashMap<String,HashSet<String>>();
		HashSet<String> teacherSet=new HashSet<String>();
		Set<Entry<String,String>> entrySet = teacherAndCourse.entrySet();
		for (Entry<String, String> entry : entrySet) {
			if(!teacherSet.contains(entry.getValue())){//如果老师集合中没有此老师
				teacherSet.add(entry.getValue());//添加此老师到teacherSet中
				HashSet<String> courseSet=new HashSet<String>();
				courseSet.add(entry.getKey());
				newMap.put(entry.getValue(), courseSet);//添加一条数据到map
			}
			else{//如果已经有此老师，则向newMap中的value中添加一门课程
				HashSet<String> course = newMap.get(entry.getValue());//找到该老师newMap中已经有的课程
				course.add(entry.getKey());//添加当下entry的课程
				newMap.put(entry.getValue(), course);//更新map
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
