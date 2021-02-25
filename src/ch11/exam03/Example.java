package ch11.exam03;

public class Example {

	public static void method() {
		long sum = 0;
		for(int i=0; i<1000000; i++) {
			sum += i;
		}
	}
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		method();
		long end = System.currentTimeMillis();
		
		System.out.println("½ÌÇà ½Ã°£: " + (end - start) + "ms");

	}

}
