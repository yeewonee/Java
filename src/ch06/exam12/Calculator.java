package ch06.exam12;

public class Calculator {
	//Field
	static double pi = 3.14159; //객체하고 전혀 무관한 공통된 값을 가진 필드
	int memory;
	//Constructor
	
	//Method
	static void plus(int x, int y) {
		int result = x + y;
		System.out.println(result);
	}
}
