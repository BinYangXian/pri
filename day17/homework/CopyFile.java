package day17.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
/*二、通过选择合适的下列流进行文件的复制
字节流(FileInputStream,FileOutputStream)
如下需求，选择合适的流完成操作：
文件复制的逻辑：循环的读取旧文件的数据，循环的写出到新文件里。
1）图片的复制，把用户输入的路径代表的图片复制到同目录,文件名改为原文件名加_new。

例如：test1.png--》new_test1.png

2）utf-8的文本文件复制，把用户输入的路径代表的文本文件复制到同目录,文件名改为原文件名加_new.后缀名。新文件为utf8。
并把字符内容打印到控制台。
例如：test1.txt--》new_test1.txt

3）gbk的文本文件复制，把用户输入的路径代表的文本文件复制到同目录,文件名改为原文件名加_new。新文件为utf-8。（提示：用字节流处理数据，利用字符串String编码和解码的功能，不用考虑字符被分割问题）
把字符内容打印到控制台。
例如：test1.txt--》new_test1.txt*/
 
//1、单纯的文件复制类?感觉无法用装饰模式来解决此需求                                                                                                                          ？？？？？
//输入的路径为：/SetTest/my17day/day17/homework/new_类型转换2.png  为什么需要去除/SetTest/       ？？？？？
public abstract class CopyFile {
	private String sourseSrc;
	public static void main(String[] args) {
		CopyFile cf=new CopyTextGbkToUtf_8();
		cf.copy();
	}
	/*public static void main(String[] args) {
		System.out.println("请输入需要复制文件的路径：");
		Scanner s=new Scanner(System.in);
		String sourseSrc=s.next();
		s.close();
		copy( sourseSrc);
	}*/
	
	public CopyFile() {
		System.out.println("请输入需要复制文件的路径：");
		Scanner s=new Scanner(System.in);
		String sourseSrc=s.next();
		s.close();
		this.sourseSrc=sourseSrc;
	}
	abstract byte[] specifiedModeCopy(byte[] buff, int buffLen);
	boolean copy(){
		String realSrc = sourseSrc.trim();
		File file=new File(realSrc);
		
		String[] strings = realSrc.split("/");
		String fileName=strings[strings.length-1];
		String newFileSrc=file.getParent()+File.separator+"new_"+fileName;
		File newFile=new File(newFileSrc);
		
		if(file.exists()){
			//a、获取输入字节流对象
			InputStream is = null;
			OutputStream os = null;
			try {
				 is=new FileInputStream(file);
				 //b、循环读取输入字节流，并缓存在内存中
				 byte[] buff=new byte[128];
				 int buffLen;
				//c、将缓存构造为输出字节流对象 
				 os=new FileOutputStream(newFile);
				//d、将输出流保存在同目录中名为"new_test1.png"的文件中 * c）通过管道读取数据
				 
				 while((buffLen=is.read(buff))!=-1){
					 if(this!=null){
						 buff=this.specifiedModeCopy(buff,buffLen);
					 }
					 os.write(buff, 0, buffLen);
				 }
				 os.flush(); //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!勿忘
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				//e、先打开后关闭的顺序，关闭流
				try {
					if(is!=null)
						is.close();
					if(os!=null)
						os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("\n******复制完成*******。");
			return true;
		}else{
			System.out.println("你输入的路径下该文件不存在！");
			return false;
		}
	}
}

class CopyImage extends CopyFile{

	@Override
	byte[] specifiedModeCopy(byte[] buff, int buffLen) {
		return buff;
	}
}
class CopyTextUtf_8 extends CopyFile{

	@Override
	byte[] specifiedModeCopy(byte[] buff, int buffLen) {
		try {
			String s = new String(buff,0,buffLen,"utf-8");
			System.out.print(s);
			buff=s.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return buff;
	}
}
class CopyTextGbkToUtf_8 extends CopyFile{

	@Override
	byte[] specifiedModeCopy(byte[] buff, int buffLen) {
		try {
			String s=new String(buff,0,buffLen,"gbk");
			System.out.print(s);
			buff=s.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return buff;
	}
}
