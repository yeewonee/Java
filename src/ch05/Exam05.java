package ch05;

public class Exam05 {

	public static void main(String[] args) {
		
		int[] arr1 = new int[3]; //������ �迭�� ������ arr1�� �����.
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		//�迭 �׺��� ���� ����
		arr1[0] = 90;
		arr1[1] = 80;
		arr1[2] = 95;
		
		//�迭 �׸��� ���� �а� ���
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		//�迭 �׸� ��
		System.out.println(arr1[0] == 90);
		System.out.println(arr1[1] != 80);
		
	}

}
