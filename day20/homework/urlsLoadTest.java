package day20.homework;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import day18.homework.IoCloseUtil;

public class urlsLoadTest {
	public static void main(String[] args) {
		demo();
	}

	private static void demo() {
		// 获取用户指定的下载目录
		Scanner scanner = new Scanner(System.in);
		String dstPath = scanner.next();
		ArrayList<String> urls = parseFileToStringUrls("my20day/homework/urls.txt");// 解析包含urls的文本文件，得到其中的urls[]
		// 将需要下载的源文件的url，与指定下载目录传入核心下载方法，完成下载（其实就是copy，下载速度要快，用多线程）：
		ulrsFileLoad(urls, dstPath);
	}

	private static void ulrsFileLoad(ArrayList<String> urls, String dstPath) {

		for (String urlString : urls) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					// 解析资源名称，生成下载文件名称：
					String urlFileName = urlString.substring(urlString
							.lastIndexOf("/") + 1);
					OutputStream bos = null;
					// 获取urls的输入流：
					InputStream openStream = null;

					try {
						bos = new BufferedOutputStream(new FileOutputStream(
								new File(dstPath+File.separatorChar+urlFileName)));// 获取下载文件输出流：
						URL url = new URL(urlString);
						openStream = url.openStream();
						byte[] buff = new byte[512];
						int buffLen;
						while ((buffLen = openStream.read(buff)) != -1) {
							bos.write(buff, 0, buffLen);
						}
						bos.flush();
					} catch (MalformedURLException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						IoCloseUtil.close(bos, openStream);
					}
				};
			}).start();

		}
	}

	private static ArrayList<String> parseFileToStringUrls(String urlsFilePath) {
		BufferedReader br = null;
		ArrayList<String> sourseUrls = new ArrayList<String>();
		try {
			File urlsFile = new File(urlsFilePath);
			System.out.println("文件是否存在："+urlsFile.exists());//
			br = new BufferedReader(new FileReader(urlsFile));
			String url;
			while ((url = br.readLine()) != null) {
				if (url.startsWith("https://")) {
					System.out.println("读取到的url："+url);
					sourseUrls.add(url.trim());
				}
			}
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			IoCloseUtil.close(br);
		}
		return sourseUrls;
	}
}
