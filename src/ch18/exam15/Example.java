package ch18.exam15;

import java.io.File;

public class Example {

	public static void main(String[] args) throws Exception{
		
		File file = new File("C:/Temp/data.txt");
		if(!file.exists()) {
			file. createNewFile(); //������ ���� ���ϸ� ��������� ��
		}
		
		file = new File("C:/Temp/dir1/dir2/dir3");
		if(!file.exists()) {
			//file.mkdir(); //�̰� ���� ������! dir2�� ���!
			file.mkdirs(); //��λ� ���� ���� ��� �����
		}
		
		file = new File("C:/Temp/data.txt");
		if(file.exists()) {
			file.delete(); //data.txt ����
		}
		file = new File("C:/Temp/dir1/dir2/dir3");
		if(file.exists()) {
			file.delete(); //dir3�� �����Ǵ� ��
		}
	}

}
