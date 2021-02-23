package ch08.exam02;

public class Audio implements RemoteControl {
	//Field
	private int volume;
	//Constructor
	//Method
	@Override
	public void turnOn() {
		System.out.println("Audio 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(this.volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		if(this.volume<RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		System.out.println("Audio의 볼륨을 "+ volume +"로 조절합니다.");
		
	}
	
}
