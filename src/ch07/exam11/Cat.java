package ch07.exam11;

public class Cat extends Animal{
	public String name;
	public String kind;
	
	//method

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
	public void scratch() {
		System.out.println("할켜요");
	}
	
}
