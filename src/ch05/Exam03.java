package ch05;

public class Exam03 {

	public static void main(String[] args) {
		
		int[] scores1 = {90, 85, 95};
		int[] scores2 = {90, 85, 95};
		int[] scores3 = scores1; //이 변수의 번지가 복사되는 것! 
		//결국 scores1이 참조하는 객체와 scores3이 참조하는 객체가 같은 객체.
		
		System.out.println(scores1 == scores2);
		System.out.println(scores1 == scores3);
	}

}
