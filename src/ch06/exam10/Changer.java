package ch06.exam10;

public class Changer {

	//Field
	//Constructor
	//Method
	
	void change(int value) {
		value = 2;
	}
	
	void change(String value) {
		value = "B";
	}
	
	void change(int[] arr2) { //참조타입
		arr2[0] = 2;
	}
	
	void change(String[] arr4) { //참조타입
		arr4[0] = "B";
	}
	
	void change(Member m2) {
		m2.age = 2;
	}
}
