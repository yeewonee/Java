package ch18.exam15;

import java.io.File;

public class Example {

	public static void main(String[] args) throws Exception{
		
		File file = new File("C:/Temp/data.txt");
		if(!file.exists()) {
			file. createNewFile(); //내용은 없고 파일만 만들어지는 것
		}
		
		file = new File("C:/Temp/dir1/dir2/dir3");
		if(!file.exists()) {
			//file.mkdir(); //이거 쓰면 오류남! dir2가 없어서!
			file.mkdirs(); //경로상에 없는 폴더 모두 만들기
		}
		
		file = new File("C:/Temp/data.txt");
		if(file.exists()) {
			file.delete(); //data.txt 삭제
		}
		file = new File("C:/Temp/dir1/dir2/dir3");
		if(file.exists()) {
			file.delete(); //dir3만 삭제되는 것
		}
	}

}
