package ch06.exam05;

public class Example {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("ȫ�浿","123456-1234567");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		//k1�̶�� �ϴ� ������ �����ϰ� �ִ� ��ü�� ������ �ִ� name�̶� �ʵ��� ���� ����?

		Korean k2 = new Korean("���ڹ�","654321-7654321");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}

}
