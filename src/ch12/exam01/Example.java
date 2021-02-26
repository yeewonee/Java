package ch12.exam01;

public class Example {

	public static void main(String[] args) {
		System.out.println("���� ������ ����");
		
		//��Ʈ��ũ �۾��� �ϴ� ������ ������ ����
		Thread thread1 = new Thread (new NetworkTask());
		thread1.start(); 
		
		//���� �۾��� �ϴ� ������ ������ ����
		Thread thread2 = new Thread (new MusicTask());
		thread2.start();
		//ä�� �۾��� �ϴ� ������ ������ ����
		
		//Runnable�� ������ Ŭ������ �����ϰ� �̸� ��ü�� ����ڴ�. -> �͸� ������ü
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.println("���� �۾��� �մϴ�.");
					try {
						Thread.sleep(1000);
					}catch (InterruptedException e) {
					}
				}
			}
		});
		thread3.start();
		
		while(true) {
			System.out.println("���� �۾��� �մϴ�.");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
	
			}
		}
	}

}
