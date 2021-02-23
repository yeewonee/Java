package ch07.exam11;

public class Dog extends Animal {
	public String name;
	public String kind;
	
	//method
	@Override
	public void sound() {
		System.out.println("왈왈");
	}
	
	public void keepHome() {
		System.out.println("방범 활동을 해요");
	}
}
