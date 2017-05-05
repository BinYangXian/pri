package day13.homework;

import day12.homework.Test5;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 2、 定义一个20*5的二维数组，用来存储某班级20位学生的5门课的成绩
（每一个学生作为行，每一个科目作为列）：这5门课按存储依次为：C++, Java, Servlet,JSP，EJB。

(1)循环给二维数组的每一个元素赋0到100之间的随机整数。

(2)按照列表的方式输出这些学员的每门课程的成绩。
格式：
C++    Java    Servlet    JSP    EJB
同学1：    11    22    33    45    50
同学2：    11    22    33    45    50
同学3：    11    22    33    45    50
...
(3)要求编写程序求每个学生的总分，将其保留在另外一个一维数组中,并打印所有的学生总分。
提示：每一个学生对应一个总分。

		 */
		//1
		long[][] stuScores= dome1();
		//2
		dome2(stuScores);
		//3
		dome3(stuScores);
	}
	/**
	 * 3)要求编写程序求每个学生的总分，将其保留在另外一个一维数组中,并打印所有的学生总分。
提示：每一个学生对应一个总分。
	 */
	private static void dome3(long[][] stuScores) {
		//总分数组
		long [] sumScores=new long[stuScores.length];
		
		//遍历所有的行（同学）
		for (int i = 0; i < stuScores.length; i++) {
			//当前同学的总分
			long sumScore=0;
			
			//找到当前行（同学）
			long[] arr1= stuScores[i];
			//遍历当前行（同学）所有的科目分数-累加计算一个和
			for (int j = 0; j <arr1.length ; j++) {
				//当前同学的当前科目成绩
				//long score1= stuScores[i][j];
				long score2= arr1[j];
				//累加总分
				sumScore+=score2;
			}
			//把总分放入总分数组(下标-直接利用二维数组行下标-范围一致的！)
			sumScores[i]=sumScore;
		}
		//打印总分
		String arrInfo= Test5.arrToString(sumScores);
		System.out.println("总分数组："+arrInfo);
	}
	/**
	 * (2)按照列表的方式输出这些学员的每门课程的成绩。
格式：
C++    Java    Servlet    JSP    EJB
同学1：    11    22    33    45    50
同学2：    11    22    33    45    50
同学3：    11    22    33    45    50
	 */
	private static void dome2(long[][] stuScores) {
		//打印课程列表
		System.out.println("	C++    Java    Servlet    JSP    EJB");
		//打印同学的分数信息
		//遍历所有的行-（同学）
		for (int i = 0; i < stuScores.length; i++) {
			//打印同学名
			System.out.print("同学"+(i+1)+":\t");
			//遍历当前行（同学）的5个成绩-打印
			for (int j = 0; j < stuScores[i].length; j++) {
				//当前同学的当前课程成绩
				long score=stuScores[i][j];
				System.out.print(score+"\t");
			}
			//打印换行
			System.out.println();
		}
	}
	/**
	 * (1)创建一个二维数组--循环给二维数组的每一个元素赋0到100之间的随机整数。
	 * @return  返回的二维数组
	 */
	private static long[][] dome1() {
		//二维数组
		long[][] stuScores=new long[20][5];
		//赋值
		for (int i = 0; i < stuScores.length; i++) {
			
			for (int j = 0; j < stuScores[i].length; j++) {
				//随机0到100的分数
				long rnScore=(long)(Math.random()*(100-0+1))+0;
				//为当前位置赋值
				stuScores[i][j]=rnScore;
			}
		}
		return stuScores;
	}
}
