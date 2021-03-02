package ch18.exam06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
		String filePath1 = "D:/Team1Projects/java/src/ch18/exam06/photo2.jpg";
		String filePath2 = "D:/Team1Projects/java/src/ch18/exam06/photo3.jpg";
		
		try {
			InputStream is = new FileInputStream(filePath1);
			OutputStream os = new FileOutputStream(filePath2);
			
			byte[] data = new byte[1024];
			int readNum = -1;
			while((readNum = is.read(data)) != -1) {
				os.write(data, 0, readNum);
			}
			os.flush(); //반드시 해줘야 하는 과정!!!!
			is.close();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

//이게 카피 프로그램