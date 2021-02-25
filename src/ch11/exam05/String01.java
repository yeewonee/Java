package ch11.exam05;

import java.util.Arrays;

public class String01 {
										//�̰� JVM���� ���ܴ��� -> ����ó�� �� �ѰŶ� ����.
	public static void main(String[] args) throws Exception {
		byte[] arr1 = {65, 66, 67};
		String str1 = new String(arr1);
		System.out.println(str1);
		//��Ʈ��ũ ��ſ��� ���̴� ���� ��� ����Ʈ!
		//�׷��� �迭�� �޾Ƽ� String����
		
		String str2 = "ABC";
		byte[] arr2 = str2.getBytes();
		System.out.println(Arrays.toString(arr2)); //�迭�� �ִ� �׸��� �а� ���ڿ��� ����ؼ� ������.
		//arr2�� �ִ� �׸���� �����ؼ� �ϳ��� ���ڿ��� ��������.
		
		String str3 = "������";
		byte[] arr31 = str3.getBytes("EUC-KR");
		byte[] arr32 = str3.getBytes("UTF-8");
		System.out.println(Arrays.toString(arr31));
		System.out.println(Arrays.toString(arr32));
		//[-22, -80, -128, -21, -126, -104, -21, -117, -92]
		// 			��     /      �� 			/     ��

		//�ٽ� �ѱ۷� ����ϰ� ����.
		//����Ʈ�� ������� �� �� ���� charset�� �����!
		String str4 = new String(arr31, "EUC-KR");
		String str5 = new String(arr32, "UTF-8");
		System.out.println(str4);
		System.out.println(str5);
	}
}
