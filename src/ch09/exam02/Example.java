package ch09.exam02;

public class Example {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		
		b.field = 1;
		b.method();
		
		A.C c = new A.C();
		c.field = 1;
		c.method();
	}
}
