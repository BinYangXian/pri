package day12.twoArr;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * 
		 */
		dome3();
	}
	
	/**
	 * 
	 * 遍历二维数组的语法：
	 * 
	 * 
	 * //遍历所有的行
	 * for（int colIdx=0;colIdx<=二维数组.length-1;colIdx++）｛
	 *    //遍历当前行的所有的列
	 *    for(int rowIdx=0,rowIdx<=二维数组[colIdx].length-1;rowIdx++){
	 *    	//访问当前行的当前列
	 *      二维数组[colIdx][rowIdx]
	 *    }
	 * ｝
	 * 
	 */
	private static void dome3() {
		//创建二维数组表示如上的工资数据
		long[][] sals=new long[][]{
				{5000,6000,9000},
				{4000,10000,1200},
				{5500},
				{5000,10000}
		};
		
		/**
		 * 求上述所有工资的平均工资
		 */
		//统计工资和的变量
		int sumSal=0;
		//统计工资数量的变量
		int sumSalCount=0;
		//遍历所有的行
		for(int colIdx=0;colIdx<=sals.length-1;colIdx++){
			
			
		     //遍历当前行的所有的列
		    for(int rowIdx=0;rowIdx<=sals[colIdx].length-1;rowIdx++){
		     	//访问当前行的当前列-对应的-工资
		    	long sal= sals[colIdx][rowIdx];
		    	//统计工资和
		    	sumSal+=sal;
		    	//统计工资数量
		    	sumSalCount++;
		    }
		}
		System.out.println("平均工资："+sumSal/sumSalCount);
	}
	/**
	 * 二维数组动态初始化-》知道长度
	 * 
	 * 定义二维数组的引用 		指向		动态初始化的二维数组的对象  ：
	 * 
	 * 语法1 (a）知道行长度-二维数组 b）知道列长度-二维数组的一维数组)
	 * 
	 * 一维数组元素类型[][] 数组引用名=new 一维数组元素类型[行长度][列长度];
	 * 
	 * 执行的过程-》在堆内存里创建【行长度】的二维数组，为其每一个位置-设置一个【列长度】的一维数组，一维数组里也自动设置默认值。
	 * 
	 * 语法2 (a）知道行长度 )
	 * 
	 * 一维数组元素类型[][] 数组引用名=new 一维数组元素类型[行长度][];
	 * 
	 * 执行的过程-》在堆内存里创建【行长度】的二维数组，为其每一个位置-设置一个null值。
	 * 
	 */
	
	private static void dome2() {
		//3行2列的二维数组-装数字
		long[][] nums=new long[3][2];
		
		/**
		 * 查看数据
		 */
		System.out.println("二维数组的长度（行数）"+nums.length);
		System.out.println("二维数组第一行的列数"+nums[0].length);
		System.out.println("二维数组第二行的列数"+nums[1].length);
		System.out.println("二维数组第一行第一列的值"+nums[0][0]);
		System.out.println("二维数组第二行第二列的值"+nums[1][1]);
		System.out.println("----------------");
		//3行的二维数组-装名字
		String[][] names=new String[3][];
		System.out.println("二维数组的长度（行数）"+names.length);
		//System.out.println("二维数组第一行的列数"+names[0].length);//第一行存储为null不能访问length
		//System.out.println("二维数组第二行的列数"+names[1].length);//第二行存储为null不能访问length
		//System.out.println("二维数组第一行第一列的值"+names[0][0]);//第一行存储为null不能访问length
		//System.out.println("二维数组第二行第二列的值"+names[1][1]);//第二行存储为null不能访问length
		
	}


	/**
	 * 二维数组静态初始化-->知道长度，知道内容
	 * 
	 * 定义二维数组的引用 		指向		静态初始化的二维数组的对象  语法：
	 * 
	 * 一维数组元素类型[][] 数组引用名=new 一维数组元素类型[][]{
	 * 	{1行1列,1行2列,1行3列...},//第1行
	 *  {2行1列,2行2列...},//第2行
	 *  {...}...
	 * };
	 * 
	 */
	private static void dome1() {
		/**
		 * 	公司4个员工最近3个月的工资（有员工请假）
	第1个月	第2个月	第3个月	
员工1	5000	6000	9000	
员工2	4000	10000	1200	
员工3	5500			
员工4	5000	10000		
		 */
		//创建二维数组表示如上的工资数据
		long[][] sals=new long[][]{
				{5000,6000,9000},
				{4000,10000,1200},
				{5500},
				{5000,10000}
		};
		/**
		 * 访问二维数组的方式-》与一维数组一致
		 * 1）数组.length  --》长度
		 * 2）数组[下标]-->数组位置
		 */
		System.out.println("第2个员工呢第3个月的工资:"+sals[1][2]);
		System.out.println("第4个员工呢第2s个月的工资:"+sals[3][1]);
		System.out.println("有多少个员工（二维数组的长度）："+sals.length);
		System.out.println("第4个员工有几个月工资（二维数组的一维数组的长度）："+sals[3].length);
		
	}
}
