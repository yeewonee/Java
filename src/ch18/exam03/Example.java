package ch18.exam03;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		
		String filePath = "D:/Team1Projects/java/src/ch18/exam02/data.txt";
		try {
			InputStream is = new FileInputStream(filePath);
			
			byte[] data = new byte[8];
			int readNum = -1;
			while(( readNum = is.read(data, 2, 3)) != -1) { //저장위치가 2인덱스부터
				//총 8바이트이지만, 3개만 읽음.
				System.out.println(readNum + ": "+ Arrays.toString(data));
			}
			
			is.close(); //다 썼으니까 닫아주기!
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}