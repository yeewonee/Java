package ch05homework;
import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		double avg = 0;
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = Integer.parseInt(scanner.next());
				scores = new int[studentNum];
				//System.out.println(studentNum);
			} else if(selectNo == 2) {
				for(int i=0; i<studentNum;i++) {
					System.out.print("score["+i+"]> ");
					scores[i] = Integer.parseInt(scanner.next());
				}
			} else if(selectNo == 3) {
				for(int i=0; i<studentNum;i++) {
				System.out.println("score["+i+"]: "+scores[i]);
				}
			} else if(selectNo == 4) {
				int max = 0;
				for(int i=0; i<studentNum;i++) {
					 if(scores[i]>max) {
						 max = scores[i];
					 }
					 total += scores[i];
					 avg = (double)total / studentNum;
				}
				 System.out.println("�ְ� ����: "+max);
				 System.out.println("��� ����: "+avg);
				 
			} else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("���α׷� ����");

	}

}
