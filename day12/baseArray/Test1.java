package day12.baseArray;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * １、数组是什么？
      数组就是一个容器，可以用来装【很多数据元素】，是一种特殊数据类型，引用数据类型。
      容器简单理解：容器就像一个装【冰块】的【冰格】，可以装很多的【冰块】。
      数组就是【冰格】，数组的元素就是【冰块】。
2、为什么需要它？ 
      之前学的数据类型，基本类型，String,自定义类型都是只能装一个值！！！
有时候我们定义的变量需要装多个数据的时候。
变量，参数，返回值--》装入多个数据
    例如：
    喜欢的食物，喜欢的明星，喜欢的数字，喜欢的运动,拥有的手机，拥有的朋友。这些数据 可以通过数组来存储。 

3、数组的定义
        a）数组描述的是统一类型的【长度固定】若干个数据；
        b）数据按照一定的先后次序排列（位置：0到length-1）组合而成。 其中,每一个数据称作一个数组元素。
		 */
		
		dome5();
	}
	/**
	 * 遍历数组-》 访问数组里所有的位置的元素
	 * 语法：
	 * 
	 * for(int idx=0;idx<=数组引用.length-1;idx++ ){
	 *    //取出当前元素（设置值-访问值）
	 *    数组引用[idx]
	 * }
	 * 
	 * 
	 * 
	 */
	private static void dome5() {
		//定义一个装喜欢明星名字的数组-并初始化数据
		String [] favStars =new String[]{
					"柳岩",
					"范冰冰",
					"古力娜扎",
					"李冰冰"
		};
		//把数组里所有的名字-打印到控制台
		for (int idx = 0; idx < favStars.length; idx++) {
			//取出名字
			String curStar= favStars[idx];
			System.out.println(curStar);
		}
		
	}

	/**
	 * 操作数组的数据
	 * 
	 * 
	 * a）访问数组指定位置（下标）的元素值
	 * 语法：	  数组元素类型   接收变量=数组引用名[下标];
	 * 
	 * b）修改数组指定位置（下标）的元素值
	 * 
	 * 语法：	  数组引用名[下标]=新的元素值;
	 * 
	 * c）访问数组的长度
	 * 
	 * 语法： 数组引用名.length;
	 * 
	 * 注意点
	 * 1）下标有范围：0到len-1
	 * 2）访问的时候不能超过范围-》ArrayIndexOutOfBoundsException
	 * 3）数组的长度是固定的，创建的时候确定，以后不能更改
	 */
	
	private static void dome4() {
		//定义一个装喜欢数字的数组-可以装3个数字
		int [] favNums=new int[3];
		//定义一个装喜欢明星名字的数组-可以装5个名字
		String [] favStars=new String[5];
		
		/**
		 * 查看默认值
		 */
		System.out.println("喜欢明星名字的数组第1个元素的值："+favStars[0]);
		System.out.println("喜欢数字的数组第3个元素的值："+favNums[2]);
		//System.out.println("喜欢数字的数组第5个元素的值："+favNums[4]);//没有第5个元素-越界异常
		
		/**
		 * 修改数组的位置的元素值
		 */
		//明星名字的数组第2个位置的值改为-李冰冰
		favStars[1]="李冰冰";
		//明星名字的数组第3个位置的值改为-柳岩
		favStars[2]="柳岩";
		//明星名字的数组第4个位置的值改为-杨幂
		favStars[3]="杨幂";
		/**
		 * 查看数组的位置的【修改后的】元素值
		 */
		System.out.println("喜欢明星名字的数组第1个元素的值："+favStars[0]);
		System.out.println("喜欢明星名字的数组第2个元素的值："+favStars[1]);
		System.out.println("喜欢明星名字的数组第3个元素的值："+favStars[2]);
		System.out.println("喜欢明星名字的数组第4个元素的值："+favStars[3]);
		/**
		 * 查看数组的长度
		 */
		System.out.println("明星名字的数组的长度："+favStars.length);
		System.out.println("喜欢数字的数组的长度："+favNums.length);
		/**
		 * 长度不能更改
		 */
		//favStars.length=8;
	}

	/**
	 * 数组创建对象
	 * 
	 * a）静态初始化->1）知道长度 2）知道元素内容
	 * 	
	 * b）动态初始化->1）知道长度
	 * 
	 * 
	 * 定义数组引用	指向	动态初始化的数组对象 语法
	 * 
	 *  数组元素类型  []   引用变量名=new  数组元素类型  [数组长度];
	 * 
	 * 注意点
	 * 1）动态初始化-没有手动的装入数据，有默认数据-》与成员变量和静态变量一致...
	 * 
	 */
	private static void dome3() {
		//定义一个装喜欢数字的数组-可以装3个数字
		int [] favNums=new int[3];
		//定义一个装喜欢明星名字的数组-可以装5个名字
		String [] favStars=new String[5];
		
	}

	/**
	 * 数组创建对象
	 * 
	 * a）静态初始化->1）知道长度 2）知道元素内容
	 * 	
	 * b）动态初始化
	 * 
	 * 
	 * 定义数组引用	指向	静态初始化的数组对象 语法
	 * 
	 *  数组元素类型  []   引用变量名=new  数组元素类型  []{元素值1,元素值2...};
	 * 
	 */
	
	private static void dome2() {
		//定义一个装喜欢数字的数组-并初始化数据
		int [] favNums=new int[]{
			23,
			(byte)24,//byte可以装入-自动类型转换
			(short)30//short可以装入-自动类型转换
			//,(long)1//long 不能装，long不能自动转int
		};
		//定义一个装喜欢明星名字的数组-并初始化数据
		String [] favStars =new String[]{
			"柳岩",
			"范冰冰",
			"古力娜扎"
			//,'龙' char不能装入
		};
		//定义一个装所有引用类型数据的数组
		Object  []allObjs =new Object[]{
				"柳岩",
				"范冰冰",
				new Exception(),
				new Error()
		};
	}
	/**
	 * 数组定义引用
	 * 
	 * a）语法1
	 * 
	 *   数组元素类型  []   引用变量名;(java方式-推荐)
	 * 
	 * b）语法2
	 *   数组元素类型    引用变量名   [];（c保留）
	 * 
	 */
	private static void dome1() {
		/**
		 * a）语法1
		 */
		//定义一个装喜欢数字的数组类型引用
		byte [] favNums;
		/**
		 * b）语法2
		 */
		//定义一个装喜欢明星名字的数组类型引用
		String  favStars [];
				
		
		//定义一个装所有引用类型数据的数组类型引用
		Object  allObjs [];
		
	}
}
