package day18.homework;

import java.io.Closeable;
import java.io.IOException;

public class IoCloseUtil {
	/**
	 * 三、封装关闭流的工具类IoCloseUtil提供close方法，
	 * 要求该方法可以关闭多个流对象。
    提示：面向所有流的超类型编程。
	 */
	/**
	 * 思路分析
	 * 1）方法内需要得到多个流对象-》采用数组
	 * 2）数组的类型-数组的元素需要使用close方法，该方法定义在Closeable中
	 * 3）面向超类型Closeable编程-数组类型-采用》Closeable
	 * 4）参数类型=使用可变参数-比数组更灵活-可以直接传入数组元素
	 * 
	 */
	public static void close(Closeable  ... closeObjArr){
		//取出closeObjArr所有的元素
		for (Closeable closeObj : closeObjArr) {
			//关闭当前元素
			if(closeObj!=null){
				try {
					closeObj.close();
					System.out.println("关闭了："+closeObj);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
