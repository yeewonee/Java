package ch18.exam16;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Example2 {

	public static void main(String[] args) throws Exception{
		/*String filePath = "C:/YewonProjects/java/src/ch18/exam16/data.txt";
		OutputStream os = new FileOutputStream(filePath);
		
		String data = "������ �������̴�.";
		byte[] bytes = data.getBytes("UTF-8"); //data�� ���� byte�迭 ���
		os.write(bytes);
		os.flush();
		
		data = "������ �����ؿ�.";
		bytes = data.getBytes("UTF-8"); //data�� ���� byte�迭 ���
		os.write(bytes);
		os.flush();
		
		os.close();*/
		
		String filePath = "C:/YewonProjects/java/src/ch18/exam16/data.txt";
		OutputStream os = new FileOutputStream(filePath);
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		
		String data = "������ �������̴�.";
		writer.write(data);
		
		writer.flush();
		
		data = "������ �����ؿ�.";
		writer.write(data);
		writer.flush();
		
		writer.close();
	}

}
