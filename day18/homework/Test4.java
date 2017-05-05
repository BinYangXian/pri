package day18.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test4 {
	public static void main(String[] args) {
		/**
		 * a）提供一个方法，把传入的大文件分割为每份固定大小的小文件，
再把所有小文件的路径作为数组返回
例如：eclipse.exe(120m) 分为-》elcipse_1.exe(50m),elcipse_2.exe(50m),elcipse_3.exe(20m)
		 */
		FileUtil.splitFile("D:/教学软件/test/eclipse.rar", 1024*1024*50);
	}
	/**
	 * b）提供一个方法，可以接收多个合并的子文件路径和合并后大文件路径名字，
把多个子文件内容合并到一个新的大文件中。
例如：elcipse_1.exe(50m),elcipse_2.exe(50m),elcipse_3.exe(20m)->eclipse.exe(120m) 
	 */
}
/**
文件的工具类
*/
class FileUtil{
	
	/**
	 * 合并多个子文件为一个大文件
	 */
	public static void mergeFile(String bigFilePath,String[] subFilePathArr){
		/**
		 * 自己实现
		 */
		
	}
	
	
	/**
	 * 得到原文件的新文件路径
	 */
	public static String getNewFilePath(String oldFilePath,String subName){
		//旧文件
		File oldFile=new File(oldFilePath);
		String[] arr=oldFile.getName().split("\\.");
		//旧文件的名字
		String oldName=arr[0];
		//旧文件的后缀
		String oldhz=arr[1];
		
		//新文件的路径
		String newFilePath=oldFile.getParent()+File.separator+oldName+subName+"."+oldhz;
		//
		return newFilePath;
	}
	
	
	/**
	 * 分割文件
	 * 参数：
	 * bigFilePath大文件的路径
	 * subFileMaxLen 小文件的最大长度（字节）
	 */
	public static void splitFile(String bigFilePath,int subFileMaxLen){
//			a）创建输入数据源-大文件
		File bigFile=new File(bigFilePath);
		InputStream bis=null;
		//得到子文件的数量
		int subFileCount= (int) (bigFile.length()/subFileMaxLen);
		subFileCount =bigFile.length()%subFileMaxLen==0?subFileCount:subFileCount+1;
		//
		OutputStream [] bosArr=new OutputStream[subFileCount];
		try {
//		    b）通过数据源创建输入流
			bis=new BufferedInputStream(new FileInputStream(bigFile));
//			bis= new FileInputStream(bigFile);
			//循环（子文件的数量）次-创建子文件及子文件的流（管道）-写出数据
			for (int i = 1; i <= subFileCount; i++) {
				
				/**
				 * 读取大文件的数据-写出当前子文件
				 */
				readBigFileWriteSubFile(bigFilePath, i, bosArr, subFileCount, bigFile, subFileMaxLen, bis);
			}
			System.out.println("分割完成！");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
//		    f）关闭流close
			//关闭大文件的管道
			IoCloseUtil.close(bis);
			//关闭小文件的管道
			IoCloseUtil.close(bosArr);
		}
		
	}
	
	/**
	 * 读取大文件的数据-写出当前子文件
	 * @param bigFilePath 大文件路径
	 * @param i 循环变量
	 * @param bosArr  子文件流数组
	 * @param subFileCount  子文件数量
	 * @param bigFile  大文件
	 * @param subFileMaxLen 子文件最大长度 
	 * @param bis 大文件流
	 */
	public static void readBigFileWriteSubFile(String bigFilePath, int i,
			OutputStream[] bosArr, int subFileCount, File bigFile,
			int subFileMaxLen, InputStream bis)throws IOException{

		//子文件路径
		String subPath=getNewFilePath(bigFilePath, "_"+i);
		//创建子文件-输出数据源
		File subFile=new File(subPath);
		//创建子文件的流（管道）-输出流
		OutputStream bos=new BufferedOutputStream(new FileOutputStream(subFile));
		//把管道放入数组-
		bosArr[i-1]=bos;
		
		/**
		 * 读取大文件的数据,放入到小文件
		 * a）读取当前子文件的长度次-每次1字节
		 * b）放入到小文件
		 */
		//当前子文件的长度-可能是最大长度-(最后一个文件)可能大文件长度与子文件最大长度相除的余数
		int curSubLen=i==subFileCount? (int)(bigFile.length()%subFileMaxLen):subFileMaxLen;
		for (int j = 0; j < curSubLen; j++) {
			//读取数据
			int buff= bis.read();
			//写出数据
			bos.write(buff);
		}
		//刷新数据
		bos.flush();
	}
}