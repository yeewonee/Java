package ch18.exam17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) throws Exception {
		String filePath1 = "C:/YewonProjects/java/src/ch18/exam17/photo.jpg";
		String filePath2 = "C:/YewonProjects/java/src/ch18/exam17/photo.jpg2";
		String filePath3 = "C:/YewonProjects/java/src/ch18/exam17/photo.jpg3";

		InputStream is1 = new FileInputStream(filePath1);
		OutputStream os1 = new FileOutputStream(filePath2);
		copy(is1, os1); //buffer를 안씀!
		is1.close();
		os1.close();
		
		InputStream is2 = new FileInputStream(filePath1);
		BufferedInputStream bis = new BufferedInputStream(is2);
		OutputStream os2 = new FileOutputStream(filePath3);
		BufferedOutputStream bos = new BufferedOutputStream(os2);
		copy(bis, bos);
		bis.close();
		bos.close();
		
	}
	
	public static void copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();
		int data = -1;
		
		while((data = is.read())!= -1) {
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		System.out.println("복사 시간: " + (end-start) + "ns");
	}

}
