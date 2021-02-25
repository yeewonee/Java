package ch11.exam05;

import java.util.StringTokenizer;

public class String02 {

	public static void main(String[] args) {
		
		String ssn = "123456-1234567";
		char sex = ssn.charAt(7); //7��° �ε��� �� ������
		if(sex=='1'||sex=='3') {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		
		//���ڿ� �߶󳻱�: ���1
		String first = ssn.substring(0, 6);//0��° ���� 5������ �̾Ƴ�! 
		String second = ssn.substring(7); //7��ġ���� ������
		System.out.println(first);
		System.out.println(second);
		
		//���ڿ� �߶󳻱�: ���2
		String[] parts = ssn.split("-"); //������
		//0 �ε������� -�ձ���, 1 �ε������� - �ں��� ������
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		
		//���ڿ� �߶󳻱�: ���3 (�и��ϱ�)
		StringTokenizer st = new StringTokenizer(ssn, "-");
		first = st.nextToken(); //ó�� �ܾ�
		second = st.nextToken(); // �� ���� �ܾ�
		 //���⼭ �� �̻� ���µ� third���� �Ҷ�� �ϸ� ������. �׷��� -������ �˾ƾ���.
		//�Ʒ�ó�� �������ָ� ��. (�������� ���� ���� ������)
		while(st.hasMoreElements()) { //�����ð� �� �ִ��� �˻�
			String token = st.nextToken();
			System.out.println(token);
			}
		
		//���� ����: ���1
		String content = "�̰��� �ڹ� å�Դϴ�.";
		boolean result = content.contains("�ڹ�"); //�ڹٰ� �ִ��� Ȯ��
		System.out.println(result);
		
		//���� ����: ���2
		int index = content.indexOf("�ڹ�"); //�� ���ڿ��� �����ϴ� �ε��� ��ȣ�� index�� ��.
		//���ڿ��� ���ٸ� -1�� ������.
		if(index != -1) {
			System.out.println("�ڹ� ���� å�̱���");
		}else {
			System.out.println("�ڹ� ���� å�� �ƴϱ���");
		}
		
		//���ڿ��� ����
		int length = content.length();
		System.out.println(length); //��°�: 12
		
		//��ġ�ϱ�(����)
		String content2 = content.replace("�ڹ�", "java");
		//String�� �Һ��̶� ���� ���ڿ��� �״�� �ְ�
		// �ٲ� ���ڿ��� ���� ��������� ���ϵ�.
		System.out.println(content2);
	}
}
