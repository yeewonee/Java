package ch11.exam04;

public class Example {

	public static void main(String[] args) {
	
		Class var1 = A.class; //보통 이렇게 쓰고 아래처럼 쓰지 않음.
		//A가 로딩된 메소드 영역의 번지 (객체의 번지가 아님!!!)
		//타입은 Class 타입
		//웹에서 언제 사용? 로깅할 때! 
		
		A a = new A();
		Class var2 = a.getClass();
	}

}
