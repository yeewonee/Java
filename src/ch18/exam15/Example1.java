package ch18.exam15;

import java.io.File;

public class Example1 {

	public static void main(String[] args) {

		File file = new File("C:/Temp/dir1"); //이게 파일인지 폴더인지 알고싶으면 조사해서 판단해야 함!
		if(file.isDirectory()) { //이게 폴더인지 물어봄 -> true
			System.out.println("폴더입니다.");
		} else {
			System.out.println("파일입니다.");
		}
		
		file = new File("C:/Temp/data.txt");
		if(file.isFile()) {
			long size = file.length();
			System.out.println(size + "bytes");
		}
	}

}
