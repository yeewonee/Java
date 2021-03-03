package ch18.exam09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class Example {
	
	public static void main(String args[]) {
		
		String filePath = "C:/YewonProjects/java/src/ch18/exam08/data.txt";
		try { 
			Reader reader = new FileReader(filePath); //Reader�� �߻��������� ��ü ���� �Ұ���!
			
			char[] data = new char[1024];
			int readNum = -1;
			String str = "";
			while((readNum = reader.read(data)) != -1) {
				str += new String(data, 0, readNum); //0���� readNum������ ����. �����ؼ�
			}
			System.out.println(str);
			reader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
