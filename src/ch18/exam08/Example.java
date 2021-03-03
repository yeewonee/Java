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
			
			writer.write(new char[] {'A', '한'});
			writer.write(new char[] {'B', '글', 'C', 'D'}, 0, 2); //0번째부터 2개 출력해라
			writer.write("오늘은 날씨가 화창합니다."); //바로 String으로 주는 것도 가능
			writer.flush();
			
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
