package day19.homework;

import java.io.File;

import util.FileUtil;

public class Test2 {
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
	 * 单线程copy-》不能同时copy
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
				//copy
				FileUtil.copyFileHaveBuffer(oldPath, newPath);
				System.out.println("copy"+subFile+"完成");
			}
		}
	}
}
