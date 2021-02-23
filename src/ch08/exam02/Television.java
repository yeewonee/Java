package ch08.exam02;

public class Television implements RemoteControl{
	private int volume;
	
// Televison은 RemoteControl을 사용할 수 있다.
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(this.volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		if(this.volume<RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		System.out.println("TV 볼륨을 " + volume + "로 조절합니다.");
	}
}
