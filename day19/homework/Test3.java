package day19.homework;

import java.io.File;

import util.FileUtil;

public class Test3 {
	public static void main(String[] args) {
		/**
		 * 三、编程题
1）编写程序把文件夹"javaSe工具及资料"里所有文件copy到同级目录"new_javaSe工具及资料"文件夹里，
"javaSe工具及资料"文件夹里所有文件都需要copy，要求每个文件的copy互不干扰（多个文件同时copy）。
--》利用多线程。

思路分析
	a）找到"javaSe工具及资料"里所有的子文件信息-》利用：file- listFiles() 
	b）创建"new_javaSe工具及资料"文件夹-》-》利用：file-mkdir() 
	c）遍历a取到的所有子文件（file）分别进行copy
		 */
		app();
	}
	/**
	 * 多线程copy-》可以同时copy
	 */
	private static void app() {
		//a
		File oldDir=new File("D:/教学软件/javaSe工具及资料");
		File[] subFiles= oldDir.listFiles();
		//b
		File newDir=new File("D:/教学软件/new_javaSe工具及资料");
		newDir.mkdir();
		//c
		for (File subFile : subFiles) {
			//是文件才copy
			if(subFile.isFile()){
				//进行copy当前的subFile
				String oldPath=subFile.getAbsolutePath();
				String newPath=newDir.getAbsolutePath()+File.separator+subFile.getName();
				/**
				 * 开启新线程copy
				 */
				//创建任务对象
				Runnable ct= new CopyFileTask(oldPath, newPath);
				//创建线程对象-绑定任务
				Thread t=new Thread(ct);
				//开启线程
				t.start();
			}
		}
	}
}
/**
 * copy文件的任务
 */
class CopyFileTask implements Runnable{
	//成员变量-copy任务的-原文件路径
	private String oldPath;
	//成员变量-copy任务的-新文件路径
	private String newPath;
	
	//创建copy任务-设置原文件和新文件的路径
	public CopyFileTask(String oldPath, String newPath) {
		this.oldPath = oldPath;
		this.newPath = newPath;
	}

	@Override
	public void run() {
		//copy
		FileUtil.copyFileHaveBuffer(oldPath, newPath);
		System.out.println("copy"+oldPath+"完成");
	}

	
}
