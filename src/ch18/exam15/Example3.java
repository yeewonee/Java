package ch18.exam15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example3 {

	public static void main(String[] args) {

		File file = new File("C:/Temp");
		
		String[] list = file.list(); //�ȿ� ~�̷��͵��� �ִٰ� �����ִ� ����
		//�������� ���丮���� ����?X 
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println();
		
		File[] files = file.listFiles(); //�̰͵��� ���� ��ü�� ����
		for(File f : files) {
			long time = f.lastModified(); //�̰� long����
			Date date = new Date(time);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
			System.out.print(sdf.format(date));
			
			if(f.isDirectory()) {
				System.out.print("\t <dir> \t");
			}else {
				System.out.print("\t" + f.length()+ "\t"); //������ length�� �� �� ����!
				//�׷��� else�� �־��� ��
			}
			System.out.println(f.getName());
		}
	}

}
