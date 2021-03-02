package ch18.exam05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
		
		String filePath = "D:/Team1Projects/java/src/ch18/exam05/data.txt";
		try {
			OutputStream os = new FileOutputStream(filePath);
			byte[] arr = {65, 66, 67};
			os.write(arr);
			os.write(arr, 0, arr.length);
			os.write(67);
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
//바이트 하나씩 보내는 경우는 드묾.
