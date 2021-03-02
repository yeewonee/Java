package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

	public static void main(String[] args) {
		
			String filePath = "D:/Team1Projects/java/src/ch18/exam01/data.txt";
			try {
				InputStream is = new FileInputStream(filePath);
				//방법1
				/*
				 * while(true) { int data = is.read(); if(data == -1) { //무한으로 돌지 않게 조건 break; }
				 * System.out.println(data); }
				 */
				
				//방법2
				 int data = 1;
				 while((data = is.read()) != -1) { 
					 System.out.print(data); 
				 	}
				is.close(); // 닫아주지 않으면, 이 파일을 열고 그대로 내버려두면 다른 프로그램이 이 파일을 사용하지 못함.
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

//이건 매우 비효율적!! 만약 파일의 크기가 10mb라면? while문이 10x1024x1024만큼 돌아야 함!!
//그래서 다음 시간에 배울 것!