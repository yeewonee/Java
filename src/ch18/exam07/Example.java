package ch18.exam07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Example {
	
	public static void main(String args[]) {
		
		String filePath = "C:/YewonProjects/java/src/ch18/exam07/data.txt";
		try { 
			Reader reader = new FileReader(filePath); //Reader는 추사을래스라서 객체 생성 불가능!
			/*
			 * FileInputStream fis = new FileInputStream(filePath); Reader reader = new
			 * InputStreamReader(fis, "UTF-8"); //이거 뒤에서 할거임! 상세설명 X
			 */			
			
			//방법1
			/*while(true) {
				int charCode = reader.read();
				if(charCode ==-1) {
					break;
				}
				char charData = (char) charCode;
				System.out.println(charCode + ":" + charData);
			}*/
			
			//방법2
			int charCode = -1;
			while((charCode = reader.read()) != -1) {
				char charData = (char)charCode;
				System.out.println(charCode + ":" + charData);
			}
			reader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
