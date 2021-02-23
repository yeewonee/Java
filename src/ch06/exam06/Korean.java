package ch06.exam06;

public class Korean {

	//Field
	String nation = "한국";
	String name;
	String ssn;
	int age;
	
	//Constructor Overloading
	Korean(){
		this("아무개", "000000-0000000", 1);
		//this() -> 내가 갖고있는 생성자를 실행하겠다.
	}	
	
	Korean(String name){
		this(name, "000000-0000000", 1);
	}	
	
	Korean(String name, String ssn){
		this(name, ssn, 1);
	}
	Korean(String name, String ssn, int age){
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
}
