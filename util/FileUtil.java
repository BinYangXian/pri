package util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Date;

import day18.homework.IoCloseUtil;

/**
 * 文件工具类
 * a)读取数据
 * b）写出数据
 * c）copy文件
 * d）分割文件
 */
public class FileUtil {
	
	/**
	 * 
	 * 读取指定文件的指定字符集的字符数据，并返回字符串
	 * 
	 * 参数：
	 * filePath 打印文件的路径
	 * charSetName 打印文件的对应的字符集
	 */

	public static String readFileInfoToString(String filePath,String charSetName) {
//		 a）创建输入的数据源（文件，字节数组...）
		File file=new File(filePath);
		//提高作用域
		Reader isr=null;
		InputStream fis=null;
		StringBuilder sb=new StringBuilder();
		try {
//			 b）根据数据源创建输入流（管道）
			
			//连接到文件的字节输入流
			fis=new FileInputStream(file);
			//字节转字符输入流-包装fis-转换为reader-设置字符集（解码）
			isr=new InputStreamReader(fis, charSetName);
//			 c）通过管道读取数据
			//缓冲数据的字符数组-实际开发512或1024
			char[] buff=new char[7];
			//读取的数量的长度
			int buffLen;
			while((buffLen=isr.read(buff))!=-1){//a)读取数据 b）存储数据 c）判断有数据
				//d）处理数据
//				 d）根据业务处理数据
					//转换为字符串
				String data=new String(buff, 0, buffLen);
				//
				sb.append(data);
			}
			//返回数据
			return sb.toString();
		} catch (FileNotFoundException e) {
			System.out.println("文件路径错误！");
		} catch (IOException e) {
			System.out.println("流断开了，不能继续操作!");
		}finally{
//			 e）关闭流（管道）-先打开后关闭
			util.IoCloseUtil.close(isr);
		}
		return null;
	}
	
	/**
	 * 得到原文件的新文件路径
	 */
	private static String getNewFilePath(String oldFilePath,String subName){
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
	private static void readBigFileWriteSubFile(String bigFilePath, int i,
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
	
	/**
	 * copy文件的功能-有缓冲区
	 * @param oldPath 旧文件路径
	 * @param newPath 新文件路径
	 */
	public static void copyFileHaveBuffer(String oldPath,String newPath) {
		//a)创建输入输出的数据源
		File fileIn=new File(oldPath);
		File fileOut=new File(newPath);

		InputStream bis=null;
		OutputStream bos=null;
		try {
			//b)创建输入输出流（管道）
			//
			bis=new BufferedInputStream(new FileInputStream(fileIn));
			//
			bos=new BufferedOutputStream(new FileOutputStream(fileOut)) ;
			//c)通过输入管道循环的读取数据
			//缓冲数据的字节数组
			byte [] buff=new byte[56];
			//读取到数组的长度
			int buffLen;
			//开始时间
			long startDate=new Date().getTime();
			while((buffLen=bis.read(buff))!=-1){
				//处理数据
				//d)通过输出管道循环的写出数据
				bos.write(buff,0,buffLen);
			}
			//e)刷新输出管道
			bos.flush();
			//结束时间
			long endDate=new Date().getTime();
			System.out.println("copy完成有缓冲的时间（毫秒）："+(endDate-startDate));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//f)关闭所有的流(1到多个流)
			IoCloseUtil.close(bos,bis);
		}
	}
}
