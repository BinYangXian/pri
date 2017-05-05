
public class Test1{
	public static  void main(String agrs[]){
		/**
			浮点数（小数）
						占用空间		表达范围
			float		4字节			8个有效数字，最后一位存储不准确
			double		8字节			17个有效数字，最后一位存储不准确
			
			注意点
			1）浮点数字面值默认类型是double，在字面值后加f或F改为float类型
			2）浮点数存储数据不准确
			3)浮点数计算数据也不准确
			
			-->需要存储浮点数数据的时候-可以转换为整数再进行存储
		*/
		
		//存储身高（米（0.0到2.5））
		float height1=1.781234247890123456789f;
		System.out.print("height1：");
		System.out.println(height1);//浮点数存储数据不准确
		
		double height2=1.781234247890123456789;
		System.out.print("height2：");
		System.out.println(height2);//浮点数存储数据不准确
		
		//商品1价格1.2元
		float f1=1.2f;
		//商品2价格1.8元
		double d1=1.8;
		double sum=f1+d1;
		System.out.print("sum:");
		System.out.println(sum);//浮点数计算数据也不准确
		
		/**
		-->需要存储浮点数数据的时候-可以转换为整数再进行存储
		*/
		//商品1价格120分
		int f2=120;
		//商品2价格180分
		long d2=180;
		//
		long sum2=f2+d2;
		System.out.print("sum2:");
		System.out.println(sum2);
	}
}