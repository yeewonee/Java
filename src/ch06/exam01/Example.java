package ch06.exam01;

public class Example {

	public static void main(String[] args) { //main�� �־�� ���డ��
		
		Student s1 = new Student(); //��ü�� �������
		//Ŭ���� Ÿ���� ������ �����ϰ� s1��� ������ ��ü�� ��ġ���� ����.
		Student s2 = new Student();
		Student s3 = s1;
		
		if(s1 == s2) { //�ٸ� ��ü
			System.out.println("���� ��ü");
		} else {
			System.out.println("�ٸ� ��ü");
		}
		
		if(s1 == s3) { //���� ��ü
			System.out.println("���� ��ü");
		} else {
			System.out.println("�ٸ� ��ü");
		}
	}

}
