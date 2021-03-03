package ch18.exam12;

import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
	
		try {
			OutputStream os = System.out;
			os.write(new byte[] {66, 67, 68});
			os.write(new byte[] {66, 67, 68}, 0, 2); //0인덱스부터 2개 출력
			os.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
