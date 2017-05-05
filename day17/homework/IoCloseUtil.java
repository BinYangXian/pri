package day17.homework;

import java.io.Closeable;
import java.io.IOException;

public class IoCloseUtil {
	public  static void close(Closeable... c){
		for (Closeable closeable : c) {
			if(closeable!=null){
				try {
					closeable.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
