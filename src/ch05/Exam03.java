package ch05;

public class Exam03 {

	public static void main(String[] args) {
		
		int[] scores1 = {90, 85, 95};
		int[] scores2 = {90, 85, 95};
		int[] scores3 = scores1; //�� ������ ������ ����Ǵ� ��! 
		//�ᱹ scores1�� �����ϴ� ��ü�� scores3�� �����ϴ� ��ü�� ���� ��ü.
		
		System.out.println(scores1 == scores2);
		System.out.println(scores1 == scores3);
	}

}
