package ch04homework;

public class Exercise03 {

	public static void main(String[] args) {
		
		int i;
		int sum = 0;
		
		for(i=0; i<=100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}

		System.out.println("3�� ����� ��: " + sum);
	}

}
