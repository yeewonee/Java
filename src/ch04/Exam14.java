package ch04;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		//Ű����� �Է��� ������ �ޱ� ���� Scanner ����
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			//Ű���忡�� �Է��� ������ data ������ ����
			System.out.print("�Է�: ");
			String data = scanner.nextLine();
	
			//data ������ ���� ���
			System.out.println("���: "+data);
		}
	}

}
