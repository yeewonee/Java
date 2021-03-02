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
				//���1
				/*
				 * while(true) { int data = is.read(); if(data == -1) { //�������� ���� �ʰ� ���� break; }
				 * System.out.println(data); }
				 */
				
				//���2
				 int data = 1;
				 while((data = is.read()) != -1) { 
					 System.out.print(data); 
				 	}
				is.close(); // �ݾ����� ������, �� ������ ���� �״�� �������θ� �ٸ� ���α׷��� �� ������ ������� ����.
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

//�̰� �ſ� ��ȿ����!! ���� ������ ũ�Ⱑ 10mb���? while���� 10x1024x1024��ŭ ���ƾ� ��!!
//�׷��� ���� �ð��� ��� ��!