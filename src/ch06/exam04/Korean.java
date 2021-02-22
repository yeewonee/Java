package ch06.exam04;

public class Korean {

	//Field
	String nation = "한국";
	String name;
	String ssn;
	
	//Constructor
	Korean(String name, String ssn){ //매개변수는 외부에서 값을 주면 값을 받아야하는 변수임
			this.name = name; //객체가 객체 스스로를 this라고 칭함.
			this.ssn =ssn;
	}
}
