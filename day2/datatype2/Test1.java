
public class Test1{
	public static  void main(String agrs[]){
		/**
			��������С����
						ռ�ÿռ�		��ﷶΧ
			float		4�ֽ�			8����Ч���֣����һλ�洢��׼ȷ
			double		8�ֽ�			17����Ч���֣����һλ�洢��׼ȷ
			
			ע���
			1������������ֵĬ��������double��������ֵ���f��F��Ϊfloat����
			2���������洢���ݲ�׼ȷ
			3)��������������Ҳ��׼ȷ
			
			-->��Ҫ�洢���������ݵ�ʱ��-����ת��Ϊ�����ٽ��д洢
		*/
		
		//�洢��ߣ��ף�0.0��2.5����
		float height1=1.781234247890123456789f;
		System.out.print("height1��");
		System.out.println(height1);//�������洢���ݲ�׼ȷ
		
		double height2=1.781234247890123456789;
		System.out.print("height2��");
		System.out.println(height2);//�������洢���ݲ�׼ȷ
		
		//��Ʒ1�۸�1.2Ԫ
		float f1=1.2f;
		//��Ʒ2�۸�1.8Ԫ
		double d1=1.8;
		double sum=f1+d1;
		System.out.print("sum:");
		System.out.println(sum);//��������������Ҳ��׼ȷ
		
		/**
		-->��Ҫ�洢���������ݵ�ʱ��-����ת��Ϊ�����ٽ��д洢
		*/
		//��Ʒ1�۸�120��
		int f2=120;
		//��Ʒ2�۸�180��
		long d2=180;
		//
		long sum2=f2+d2;
		System.out.print("sum2:");
		System.out.println(sum2);
	}
}