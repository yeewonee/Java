package ch18.exam15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example3 {

	public static void main(String[] args) {

		File file = new File("C:/Temp");
		
		String[] list = file.list(); //안에 ~이런것들이 있다고 보여주는 정도
		//파일인지 디렉토리인지 구분?X 
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println();
		
		File[] files = file.listFiles(); //이것들을 파일 객체로 받음
		for(File f : files) {
			long time = f.lastModified(); //이건 long값임
			Date date = new Date(time);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
			System.out.print(sdf.format(date));
			
			if(f.isDirectory()) {
				System.out.print("\t <dir> \t");
			}else {
				System.out.print("\t" + f.length()+ "\t"); //폴더는 length를 할 수 없음!
				//그래서 else에 넣어준 것
			}
			System.out.println(f.getName());
		}
	}

}
