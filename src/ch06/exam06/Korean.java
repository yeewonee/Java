package ch06.exam06;

public class Korean {

	//Field
	String nation = "�ѱ�";
	String name;
	String ssn;
	int age;
	
	//Constructor Overloading
	Korean(){
		this("�ƹ���", "000000-0000000", 1);
		//this() -> ���� �����ִ� �����ڸ� �����ϰڴ�.
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
