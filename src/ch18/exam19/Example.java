package ch18.exam19;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Example {

	public static void main(String[] args) throws Exception {
		
		String filePath = "C:/YewonProjects/java/src/ch18/exam19/data.txt";
		OutputStream os = new FileOutputStream(filePath);
		
		String data1 = "�ȳ��ϼ���.";
		String data2 = "���� ���Ŀ�.";
		
		/*os.write(data1.getBytes());
		os.write("\n".getBytes());
		os.write(data2.getBytes());
		os.flush();
		
		os.close(); */
		
		PrintStream out = new PrintStream(os);
		out.println(data1);
		out.println(data2);
		out.println(3); //�׳� ����3�� �����!
		
		out.flush();
		out.close();
	}

}
