package ch08.exam03;

public class Car implements Flyable, Shipable { //구현해야 할 메소드 총 5개!!!

	@Override
	public void sailing() {
		System.out.println("항해합니다.");
	}

	@Override
	public void anchor() {
		System.out.println("정박합니다.");
	}

	@Override
	public void takeOff() {
		System.out.println("이륙합니다.");		
	}

	@Override
	public void land() {
		System.out.println("착률합니다.");
	}

	@Override
	public void fly() {
		System.out.println("비행합니다.");
	}

}
