package ch18.exam15;

import java.io.File;

public class Example1 {

	public static void main(String[] args) {

		File file = new File("C:/Temp/dir1"); //�̰� �������� �������� �˰������ �����ؼ� �Ǵ��ؾ� ��!
		if(file.isDirectory()) { //�̰� �������� ��� -> true
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
		
		file = new File("C:/Temp/data.txt");
		if(file.isFile()) {
			long size = file.length();
			System.out.println(size + "bytes");
		}
	}

}
