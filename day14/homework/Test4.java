package day14.homework;

import java.io.File;

public class Test4 {
	public static void main(String[] args) {
		/**
		 * 2、编写一个程序，
a）得到用户输入的文件夹的路径，不存在需要重新输入，直到获取正确的路径--》提示-利用循环
注意：可以不考虑输入路径有中文。
b）按如下格式：打印该文件夹下 所有的子文件的信息

当前文件夹的绝对路径：xxx
当前文件夹的有xxx个子文件夹
分别是：子文件夹1,子文件夹2,子文件夹3....
当前文件夹的有xxx个子文件
分别是：子文件1,子文件2,子文件3....
		 */
		app();
	}

	private static void app() {
		//a 
		String dirPath= Test3.inputDirPath();
		//b
		printDirInfo(dirPath);
	}
	
	
	/**
	 * 
	 * b）按如下格式：打印该文件夹下 所有的子文件的信息

当前文件夹的绝对路径：xxx
当前文件夹的有xxx个子文件夹
分别是：子文件夹1,子文件夹2,子文件夹3....
当前文件夹的有xxx个子文件
分别是：子文件1,子文件2,子文件3....
	 * 
	 * @param dirPath  被打印的文件夹
	 * 
	 */
	private static void printDirInfo(String dirPath) {
		//创建父目录的file对象
		File parentFile=new File(dirPath);
		//得到绝对路径
	 	String absPath= parentFile.getAbsolutePath();
		//找到父目录里所有的子信息
	 	File[] subInfos= parentFile.listFiles();
	 	//拼接子文件的名字，子文件夹的名字信息变量
	 	StringBuilder subFileNames=new StringBuilder(),subDirNames=new StringBuilder();
	 	//子文件的数量
	 	int countSubFile=0;
	 	//遍历所有子信息-找到文件和文件夹
	 	for (File subInfo : subInfos) {
	 		if(subInfo.isDirectory()){//判断文件夹
	 			//拼接名字
	 			subDirNames.append(subInfo.getName());
	 			subDirNames.append(',');
	 			
	 		}else{//判断文件
	 			//拼接名字
	 			subFileNames.append(subInfo.getName());
	 			subFileNames.append(',');
	 			//统计数量
	 			countSubFile++;
	 		}
		}
	 	
	 	//子文件夹的数量
	 	int countSubDir=subInfos.length-countSubFile;
	 	
	 	//打印
	 	System.out.println("当前文件夹的绝对路径："+absPath);
	 	System.out.println("当前文件夹的有"+countSubDir+"个子文件夹");
	 	System.out.println("分别是："+subDirNames);
	 	System.out.println("当前文件夹的有"+countSubFile+"个子文件");
	 	System.out.println("分别是："+subFileNames);
	 	
	}
}
