package ch18.exam08;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example {
	
	public static void main(String args[]) {
		
		String filePath = "C:/YewonProjects/java/src/ch18/exam09/data.txt";
		try { 
			Writer writer = new FileWriter(filePath);
			
			writer.write(new char[] {'A', '��'});
			writer.write(new char[] {'B', '��', 'C', 'D'}, 0, 2); //0��°���� 2�� ����ض�
			writer.write("������ ������ ȭâ�մϴ�."); //�ٷ� String���� �ִ� �͵� ����
			writer.flush();
			
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
