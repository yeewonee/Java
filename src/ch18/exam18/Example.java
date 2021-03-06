package ch18.exam18;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) throws Exception {
		String filePath1 = "C:/YewonProjects/java/src/ch18/exam18/data.db";
		OutputStream os = new FileOutputStream(filePath1);
		DataOutputStream dos = new DataOutputStream(os);
		
		//데이터 저장
		dos.writeInt(3);
		dos.writeDouble(10.5);
		dos.writeBoolean(true);
		dos.writeUTF("홍길동");
		dos.flush();
		
		dos.close();
	}

}
