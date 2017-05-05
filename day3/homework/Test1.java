
public class Test1{
	
	public static void main(String args[]){
		
		dome2();
	}
	//第二题的程序
	public static void dome2(){
		/**
2、用户输入一个100以内的成绩，当成绩在85及以上的时候输出”等级A”,
70以上到84之间输出”等级B”, 60到69之间输出”等级C”,60以下输出”等级D；

如果刚好60分还要输出“运气不错哦”，
如果刚好100分还要输出“大神，膜拜啊”。

	思路分析：
	1）输入100以内的成绩
	2）判断成绩
	  a）85到100 -》等级a
	  b）70到84 -》等级b
	  c）60到69 -》等级c
	  d）0到59 -》等级d
	
	  e >100或<0 输入错误
 	
		*/
		//1 
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//输入
		System.out.println("请输入0到100的成绩数字！");
		short score= sc.nextShort();
		//判断成绩 
		//输入错误
		if(score>100||score<0){
			System.out.println("输入错误");
		}else if(score>=85){//等级A -在0到100里找85到100
			System.out.println("等级A");
			//判断100
			if(score==100){
				System.out.println("大神，膜拜啊");
			}
		}else if(score>=70){//等级B -在0到84里找70到84
			System.out.println("等级B");
		}else if(score>=60){//等级c -在0到69里找60到69
			System.out.println("等级c");
			//判断60 
			if(score==60 ){
				System.out.println("运气不错哦");
			}
		}else {
			System.out.println("等级d");
		}
		
	}
	//第一题的程序
	public static void dome1(){
		/**
		1、随机生成一个【-20到100】随机数，判断并打印其是奇数还是偶数
		
		思路
		 a）产生-20到100的随机数
		 b）判断数字是奇数-》打印是奇数
		 c）判断数字不是奇数=》打印是偶数
		*/
		//a
		int rnNum= (int)(Math.random()*(100+20+1))-20;
		System.out.println("产生的数字："+rnNum);
		//b
		if(rnNum%2!=0){//判断数字是奇数
			System.out.println("是奇数");
		}else{//判断数字不是奇数
			System.out.println("是偶数");
		}
		
		
	}
	
}
