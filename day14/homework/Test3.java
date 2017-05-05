package day14.homework;

import java.io.File;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) throws Exception{
		/**
		 * 1、编写一个程序，
a）得到用户键盘输入的【已经存在的目录】（不存在则要求用户重写输入 ）
b）把字符串（"a1_b1_b2_b3_......_bn"）【n为10】中子字符串a1,b1,b2,...bn取出来。提示：利用字符串分割的功能可以解决。
c）其中a1作为父目录，b1到bn都为a1的同级子文件，创建上述文件及文件夹，放入用户输入的目录中
例如：用户输入"d:\\test"，则在test文件夹下，建立a1文件夹，在a1里建立b1到bn的所有文件。
		 */
		app();
	}
	private static void app() throws Exception{
		//a
		String path= inputDirPath();
		//b
		String fileNames="a1_b1_b2_b3_b4_b5_b6_b7_b8_b9_b10";
		String[] fileNameArr= fileNames.split("_");
		//c
		createFileAndDir(fileNameArr,path);
	}
	/**
	 * c）其中a1作为父目录，b1到bn都为a1的同级子文件，创建上述文件及文件夹，放入用户输入的目录中
例如：用户输入"d:\\test"，则在test文件夹下，建立a1文件夹，在a1里建立b1到bn的所有文件。
	 */
	private static void createFileAndDir(String[] fileNameArr, String path)throws Exception {
		//a1的路径
		String a1Path=path+File.separator+fileNameArr[0];
		//创建a1的文件夹
		new File(a1Path).mkdir();
		//找到所有b1到b10的名字-分别创建子文件
		for (int idx = 1; idx <=fileNameArr.length-1; idx++) {
			//取出名字-拼接路径
			String bPath= a1Path+File.separator+fileNameArr[idx];
			//创建b对应的子文件
			new File(bPath).createNewFile();
		}
		System.out.println("创建文件夹和文件完成！");
	}
	/**
	 * a）得到用户键盘输入的【已经存在的目录】（不存在则要求用户重写输入 ）
	 * 
	 */
	public static String inputDirPath(){
		//管理者
		Scanner sc=new Scanner(System.in);
		while(true){
			//输入路径
			System.out.println("请输入文件夹路径！");
			String dirPath= sc.next();
			//转换为file对象
			File dir=new File(dirPath);
			//判断路径-正确-退出循环-退出方法
			if(dir.isDirectory()){
				return dirPath;
			}
			//判断路径-错误-继续循环-重新输入
			System.out.println("输入错误！");
		}
	}
}
