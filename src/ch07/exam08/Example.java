package ch07.exam08;

public class Example {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.run();
		
		System.out.println("");
		
		car.t1 = new TireChild1(); //자식 쪽에 재정의된 run()이 실행됨.
		car.t2 = new TireChild2();
		car.run();
	}

}
