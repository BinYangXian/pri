package day16.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Test3 {
	public static void main(String[] args) {
		/**
		 *  2. 在一个Map中，记录了某学校每门课程的授课老师
		 *  （key为课程名，value为老师名），请分析原有Map，创建一个新的Map，
		 *  用来表示每个老师负责讲授哪些课程 新的Map的key应为老师的名字，value为一个Set，Set中的元素为课程的名字
例如：
原map ：
   课程名key（String）	 老师名value （String）
 java        		曾老师
   数据库     				曾老师
 web         		卢老师
   体育         				刘老师
  美术         				刘老师
  音乐         				刘老师
   
新map ：
   老师名key（String） 课程名的集合value （Set<String>）
   曾老师                             {java,数据库}
   卢老师                             {web}
   刘老师                             {体育,美术,音乐} 

思路分析1：
    1）创建原map加入数据
    2）把原map的所有值（老师）拿出来去重，得到所有的【老师的列表容器】
    3）遍历【老师的列表容器】找到每一个老师，通过老师原map找对应当前老师的课程，把找到的课程装到set容器
    4）定义新map，把老师和对应的课程容器装入新map
 
		 */
		//原map
		Map<String, String> oldMap=new HashMap<String, String>();
		//装数据
		oldMap.put("java", "曾老师");
		oldMap.put("数据库", "曾老师");
		oldMap.put("web", "卢老师");
		oldMap.put("体育", "刘老师");
		oldMap.put("美术", "刘老师");
		oldMap.put("音乐", "刘老师");
		
		/**
		 * 装数据到新map
		 */
		//a)创建新map
		Map<String, Set<String>> newMap=new HashMap<String, Set<String>>();
		//b)找到新map所有的键（老师-取出原来的map的老师去重）
		Set<String> newMapTeachers=new HashSet<String>();
		for (String teacher : oldMap.values()) {
			newMapTeachers.add(teacher);
		}	
		System.out.println("去重后的新map的老师列表："+newMapTeachers);
		//c)遍历所有的新map的老师列表-找到对应老师的课程集合
		for (String newMapTeacher : newMapTeachers) {
			
			//当前老师的课程集合
			Set<String> newMapKcs=new HashSet<String>();
			//为当前老师newMapTeacher去原map找对应的课程集合
			for (String oldMapKc  : oldMap.keySet()) {
				//找到原map课程对应的老师
				String oldMapTeacher= oldMap.get(oldMapKc);
				//当前课程是对应老师的-加入课程集合
				if(newMapTeacher.equals(oldMapTeacher)){
					//
					newMapKcs.add(oldMapKc);
				}
			}
			//把当前老师和对应的课程装入新map
			newMap.put(newMapTeacher, newMapKcs);
		}
		//d)查看数据
		System.out.println("新map的数据："+newMap);
		
	}
}
