package ch06.exam05;

public class Example {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("홍길동","123456-1234567");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		//k1이라고 하는 변수가 참조하고 있는 객체가 가지고 있는 name이란 필드의 값이 무엇?

		Korean k2 = new Korean("감자바","654321-7654321");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}

}
