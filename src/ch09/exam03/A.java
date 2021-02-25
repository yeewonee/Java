package ch09.exam03;

public class A {
	public void method(final int x) {
		final int y = 2;
		
		//x = 10; ¿Ã∞≈ æ»µ .
		// y = 20; //¿Ã∞Õµµ æ»µ .
		
		class B{
			public void method() {
				int result = x+y;
			}
		}
	}
}
