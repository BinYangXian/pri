package exam;

public class Test6 {
	public static void main(String[] args) {
		/**
		 * 6、对于一个整数n，有一个函数f（n） 可以计算到1到n之间的出现“1“的个数。
		 * 
		 * 例如：f（1） = 1，f（13） = 6，因为 1,2,3,4,5,6,7,8,9,10,11,12,13
		 * 数数1的个数正好是6。实现这个函数 int f（int n） 
		 * （不推荐采用字符串相关库功能，建议采用除/和模%）
		 */
		System.out.println("f13:"+f(13));
		System.out.println("f999:"+f(999));
		
	}
	/**
	 * 找到 1到n 之间所有数字里1的个数
	 * @param n 
	 * @return 1的个数
	 */
	public static int f(int n){
		//所有数字里1的个数
		int allNum1Count=0;
		for (int num = 1; num <=n; num++) {
			//找到每一个数字num 里出现1的个数
			int num1Count= findNumOneCount(num);
			//累加
			allNum1Count+=num1Count;
		}
		return allNum1Count;
	}
	/**
	 * 找到指定数 num 里数字1的个数
	 * @param num 指定数
	 * @return 数字里1的个数
	 */
	private static int findNumOneCount(int num) {
		int num1Count=0;
		// 12315
		while(true){
			//取出当前的个位
			int gw= num%10;
			//数字是1统计1次
			if(gw==1){
				num1Count++;
			}
			//缩小一位
			num/=10;
			//（是否为0）判断是否还需要继续取出个位
			if(num==0){
				return num1Count;
			}
		}
	}
}
