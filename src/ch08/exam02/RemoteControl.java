package ch08.exam02;

public interface RemoteControl {

	//상수 = 어떤 타입이건 상관없음. 
	String COMPANY = "삼성";
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;
	
	//메소드(객체 사용 설명) = 설명 내용만 넣음
	//실행을 하려고 놓은 것이 아니라 사용 설명!!
	void turnOn(); //리턴 타입X, 매개값X => 이런 매개값을 사용할 수 있다!
	void turnOff();
	void setVolume(int volume); // volume이라는 int타입 매개값 받아야 함!
	
}
