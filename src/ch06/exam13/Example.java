package ch06.exam13;

public class Example {

	public static void main(String[] args) {
		//�����ڸ� �̿��ؼ� ��ü ����
		//Singleton result1 = new Singleton(); //�̰� �ȵ�.
		
		//Factory Method �̿��ؼ� ��ü ����
		Singleton result2 = Singleton.getInstance();
		Singleton result3 = Singleton.getInstance();
		if(result2==result3) {
			System.out.println("���� ��ü�� ����");
		} else {
			System.out.println("�ٸ� ��ü�� ����");
		}
	}
}

