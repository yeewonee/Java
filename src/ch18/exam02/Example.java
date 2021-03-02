package ch18.exam02;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		
		String filePath = "D:/Team1Projects/java/src/ch18/exam02/data.txt";
		try {
			InputStream is = new FileInputStream(filePath);
			
			byte[] data = new byte[3];
			
			//���1
			/*while(true) {
				int readNum = is.read(data);
				if(readNum == -1) {
					break;
				}
				System.out.println(readNum + ": "+ Arrays.toString(data));
			}*/
			
			//���2
			int readNum = -1;
			while(( readNum = is.read(data)) != -1) {
				System.out.println(readNum + ": "+ Arrays.toString(data));
			}
			
			is.close(); //�� �����ϱ� �ݾ��ֱ�!
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}