package ch04;
//조건식을 먼저 확인함. 
public class Exam09 {

	public static void main(String[] args) {
			
		boolean stop = false;
		int count = 0;
		//---------------------------------
		while(!stop) { //이게 true가 되어야 밑에 실행 가능
			System.out.println("Hello");
			count++;
			if(count > 10) {
				stop = true;
			}
		}
		System.out.println();
		// 두가지 경우 모두 가능함 !!
		//---------------------------------
		count = 0;
		while(count <= 10) {
			System.out.println("Hello");
			count++;
		}
	}
}