package ch07.exam01;

public class Example {
	
	public static void main(String[] args) {
		
		Child child = new Child("길동");

		System.out.println(child.firstName);
		System.out.println(child.lastName);
		
		child.method1();
		child.method2();
	}

}
