package ch11.exam04;

public class Example {

	public static void main(String[] args) {
	
		Class var1 = A.class; //���� �̷��� ���� �Ʒ�ó�� ���� ����.
		//A�� �ε��� �޼ҵ� ������ ���� (��ü�� ������ �ƴ�!!!)
		//Ÿ���� Class Ÿ��
		//������ ���� ���? �α��� ��! 
		
		A a = new A();
		Class var2 = a.getClass();
	}

}
