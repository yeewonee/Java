package ch06.exam01;

public class Example {

	public static void main(String[] args) { //main이 있어야 실행가능
		
		Student s1 = new Student(); //객체가 만들어짐
		//클래스 타입의 변수를 선언하고 s1라는 변수에 객체의 위치정보 넣음.
		Student s2 = new Student();
		Student s3 = s1;
		
		if(s1 == s2) { //다른 객체
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
		
		if(s1 == s3) { //같은 객체
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
	}

}
