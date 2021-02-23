package ch08.exam01;

public class Example {

	public static void main(String[] args) {
		
		RemoteControl rc = new Audio();
		//인터페이스 RemoteControl을 가지고 Audio()객체를 사용하고자 함.
	
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5); //실제 실행부는 객체가 갖고 있음.
	}

}
