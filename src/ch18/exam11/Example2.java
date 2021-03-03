package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;

public class Example2 {

	public static void main(String[] args) {
	  try {	
			InputStream is = System.in;
			byte[] data = new byte[100];
			while(true) {
				int readNum = is.read(data);
				String srt = new String(data, 0, readNum - 2);
				//안에 들어가 있는 (read한 수 만큼만) 문자열로 만들어줌!
				System.out.println(srt);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
