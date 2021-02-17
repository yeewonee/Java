package ch04;

public class Exam10 {

	public static void main(String[] args) {
			
		boolean stop = false;
		int count = 0;
		//---------------------------------
		do {
			System.out.println("Hello");
			count++;
			if(count > 10) {
				stop = true;
			}//무조건 여기까진 실행을 하고 조건 확인함.
		} while(!stop);
		System.out.println();
		
		// 두가지 경우 모두 가능함 !!
		//---------------------------------
		count = 0;
		do {
			System.out.println("Hello");
			count++;
		} while(count <=10);
	}
}