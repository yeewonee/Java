package ch06.exam11;

public class Example {

	public static void main(String[] args) {
		
		//�ν��Ͻ� ���(�ʵ�, �޼ҵ�)�� �ݵ��
		//��ü ���� ������ ���ؼ� ����
		User user = new User("ȫ�浿"); //��ü�� ����

		System.out.println(user.name);
		user.login();
		user.logout();
		
		//���� ���(�ʵ�, �޼ҵ�)�� ��ü�� ���̵� ��밡��
		//Ŭ������ ����
		System.out.println(User.nation);
		User.info(); //���� ������ ������ ����X, Ŭ���� ������O
	}

}
