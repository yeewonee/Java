package ch04homework;
import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------");
			System.out.println("1. ���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------");
			System.out.print("����> ");
			
			int a = Integer.parseInt(scanner.nextLine());
			
			if(a == 1) {
				System.out.print("���ݾ�>");
				int in = Integer.parseInt(scanner.nextLine());
				balance += in;
				System.out.println();
			} else if(a == 2) {
				System.out.print("��ݾ�>");
				int out = Integer.parseInt(scanner.nextLine());
				balance -= out;
				System.out.println();
			} else if(a ==3) {
				System.out.print("�ܰ�>");
				System.out.println(balance);
				System.out.println();
			} else if(a==4) {
				System.out.println();
				System.out.print("���α׷� ����");
				break;
			}
		}

	}

}
