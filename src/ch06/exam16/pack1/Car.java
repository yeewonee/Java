package ch06.exam16.pack1;

public class Car {

	//Field
	public String model; //public을 붙여주면 다른 패키지에서도 접근 가능
	
	//Constructor
	public Car(){
		
	}
	
	//Method
	public void run() {
		System.out.println("달립니다.");
	}
}
