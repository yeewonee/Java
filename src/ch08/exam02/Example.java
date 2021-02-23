package ch08.exam02;

public class Example {

	public static void method(RemoteControl rc) { //RemoteControl라는 인터페이스로 사용가능한 객체만 괄호안에 올 수 있음.
		//인터페이스의 설명대로만 사용하는 코드
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
	}
	public static void main(String[] args) {
		
		RemoteControl rc = new Television();

		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		method(new Television());
		method(new Audio());

	}
}