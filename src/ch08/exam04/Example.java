package ch08.exam04;

public class Example {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		//타이어 장착
		//어떤 객체를 대입했는가에 따라서 roll()의 실행 결과가 달라짐 = 다형성
		myCar.t1 = new KumhoTire();
		myCar.t2 = new KumhoTire();
		myCar.t3 = new HankookTire();
		myCar.t4 = new HankookTire();
		
		//달려보자
		myCar.run();
	}

}
