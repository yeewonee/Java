package ch06.exam11;

public class User {
	//Field (������ User��� ��ü�� ������� �� �Ʒ��� �����Ͱ� �������)
	String id;
	String name;
	String password;
	static String nation = "�ѱ�"; //��� user�� �ѱ����. �̴� ���� ��ü �ȿ� �������� �ʾƵ� ��.
	
	//Constructor -> �ν��Ͻ� ����� �� �� ����. ��? �����ڴ� ��ü�� �����ϱ� ���� �뵵�ϻ�
	User(String name){
		this.name = name;
	}
	
	//Method

	static void info() { //��ü�� ���̵� ����� �� �ִ� �޼ҵ�
		System.out.println("��� User�� �ѱ����Դϴ�.");
	}
	void login() {
		System.out.println(name + " �α����մϴ�.");
	}
	
	void logout() {
		System.out.println(name + " �α׾ƿ��մϴ�.");
	}
}
