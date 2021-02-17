package ch04;

public class Exam03 {

	public static void main(String[] args) {
		
		int score =95;
		
		System.out.println("A");
		
		if(score>=90) {
			System.out.println("B1");
		} else if(score>=80) {
			System.out.println("B2");
		} else { //else는 굳이 있을 필요는 없다. 조건이 다 맞지 않은 경우에 마지막으로 실행하는 것일 뿐!
			System.out.println("B3");
		}
		
		System.out.println("C");
			
	}



	}

