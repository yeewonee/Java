package ch12.exam01;

public class MusicTask implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("뮤직 작업을 합니다.");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
	
			}
		}
	}
}
