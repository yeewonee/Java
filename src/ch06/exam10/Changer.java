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
	
	void change(int[] arr2) { //����Ÿ��
		arr2[0] = 2;
	}
	
	void change(String[] arr4) { //����Ÿ��
		arr4[0] = "B";
	}
	
	void change(Member m2) {
		m2.age = 2;
	}
}
