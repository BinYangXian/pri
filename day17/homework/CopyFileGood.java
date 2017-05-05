package day17.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class CopyFileGood {
	
	public static void main(String[] args) {
		new CopyFileGood().copy("src/day17/homework/gbkFile.ttt", "gbk", "src/day17/homework/utf8File.ttt"
				, "utf-8", "gbk", 5, "src/day17/homework/dstFile.ttt");
	}
	
	public void copy(String fileSrc, String charSet1, String anotherFileSrc,
			String charSet2, String dstCharSet, int charBuffNum, String dstSrc) {
		File file1 = new File(fileSrc);
		File file2 = new File(anotherFileSrc);
		File fileDst = new File(dstSrc);
		boolean isFile1Exist = file1.exists();
		boolean isFile2Exist = file2.exists();
		if (isFile1Exist && isFile2Exist) {
			InputStream is1 = null;
			InputStream is2 = null;
			Reader isr1 = null;
			Reader isr2 = null;

			Writer out = null;
			try {
				is1 = new FileInputStream(file1);
				is2 = new FileInputStream(file2);

				out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileDst), dstSrc));
				isr1 = new BufferedReader(new InputStreamReader(is1, charSet1));
				isr2 = new BufferedReader(new InputStreamReader(is2, charSet2));
				int charNum;
				char[] charBuff = new char[charBuffNum];
				try {
					while ((charNum = isr1.read(charBuff)) != -1) {
						out.write(charBuff, 0, charNum);
					}
					out.flush();
					System.out.println("copy file1完成！");
					while ((charNum = isr2.read(charBuff)) != -1) {
				/*		out.write((new String(charBuff, 0, charNum))
								.getBytes("gbk"));*/
						out.write(charBuff, 0, charNum);
					}
					out.flush();
					System.out.println("copy file2完成！");
			
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
//				Closeable[] c = { out, isr2, isr1 };
				IoCloseUtil.close(out, isr2, isr1);
			}

		} else if (!isFile2Exist) {
			System.out.println("文件2没有找到！");
		} else if (!isFile1Exist) {
			System.out.println("文件1没有找到！");
		} else {
			System.out.println("文件1与文件2都没有找到！");
		}
	}
}
