
public class Test2{
	
	public static void main(String args[]){
		/**
		2、打印100-n之间的水仙花数，水仙花数定义，n由用户输入，n->101到99999
每一位的该数【位数】次方之和等于该数，那么该数为水仙花数
如：
153=1的3次方+5的3次方+3的3次方
1634=1的4次方+6的4次方+3的4次方+4的4次方
-------------------------
153
370
371
407
1634
8208
9474
54748
92727
93084
注意：这里位数不确定，需要动态的获取。
求数字的位数-》可利用/10; 到0结束
求数字每一位的数-》可利用/10和%10;到0结束

思路分析(复杂问题分解小问题)：
 a)输入n在101到99999的数字-》利用循环
 b)找出100到n的所有数字-》利用循环
 c)判断当前的数字是否是水仙花数
        1）由153=1的3次方+5的3次方+3的3次方 分析，153就是判断数字，可以直接获取到 
        2）3次方——》数的位数
        3）  1，3，5——》数的每一位数字
        4）  1的3次方-->数的次方---》可以累乘--》参考累加
        5）  1的3次方+5的3次方+3的3次方---》累加求和
        6）求和之后与数字153比较即可判断
		*/
		app();
	}
	public static void app(){
		//a 
		int n= inputRangeInt(101,99999);
		System.out.println("输入的n："+n);
		for(int curNum=100;curNum<=n;curNum++){//b 
			//c
			if(isFloorNum(curNum)){
				System.out.println(curNum+"是水仙花数");
			}
		}
	}
	/**
		求出【指定的数】的位数并返回
		参数：指定的数
		返回值：所求的位数
		
		思路：把数字不断的除以10缩小，缩小到0结束。-统计缩小的次数就得到位数。
	*/
	public static byte weishu(int num){
		byte ws=0;
		/**
		方式1：利用do while 循环-先循环内容再循环条件 
		
		do{
			//缩小一位 
			num=num/10;//  num/=10;
			//统计一位
			ws++;
		}while(num!=0);//判断不为0-继续循环
		*/
		/**
		方式2：死循环-内部break跳出
		*/
		while(true){
			//缩小一位 
			num=num/10;//  num/=10;
			//统计一位
			ws++;
			//判断为0--》退出循环
			if(num==0){
				break;
			}
		}
		
		return ws;
	}
	
	/**
		求出【指定底数】的【指定指数】的次方并返回
		参数：指定底数，指数
		返回值：次方
	*/
	public static int cifang(int ds,int zs){
		
		//累乘变量
		int rs=1;
		//把底数ds找指数zs次
		for(int a=0;a<zs;a++){
			//把当前底数-累乘一次
			rs=rs*ds;//rs*=ds;
		}
		//返回结果
		return rs;
	}
	/**
		判断【指定的数】是否是水仙花数
		参数：指定的数
		返回值：true 是水仙花   false  不是
	*/
	public static boolean isFloorNum(int num){
		//保存数字num
		int oldNum=num;
		//位数
		int ws=weishu(num);
		//累加次方的变量
		int sumCf=0;
		
		//找到num里所有的数字-求次方...
		while(true){
			//取出当前数的个位(例如：153里1或5或3)
			int gw=num%10;
			//System.out.println(gw);
			int cf=cifang(gw,ws);
			//累加次方 
			sumCf+=cf;
			//缩小一位 
			num=num/10;//  num/=10;
			
			//判断为0--》退出循环
			if(num==0){
				break;
			}
		}
		//判断-次方和与当前数是否相等-相等水仙花 
		//return num==sumCf;
		if(oldNum==sumCf){
			return true;
		}else{
			return false;
		}
	}
	/**
		得到用户输入的min到max范围的整数
	*/
	public static int inputRangeInt(int min,int max){
		//管理者
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//输入的整数
		int inNum;
		//循环的输入
		while(true){
			//输入整数 
			System.out.println("请输入一个"+min+"到"+max+"的整数");
			inNum= sc.nextInt();
			//判断整数正确-退出循环
			if(inNum>=min&&inNum<=max){
				break;
			}
		}
		//返回正确的整数
		return inNum;
	}
	
}
