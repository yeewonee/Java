package ch04;
//���ǽ��� ���� Ȯ����. 
public class Exam09 {

	public static void main(String[] args) {
			
		boolean stop = false;
		int count = 0;
		//---------------------------------
		while(!stop) { //�̰� true�� �Ǿ�� �ؿ� ���� ����
			System.out.println("Hello");
			count++;
			if(count > 10) {
				stop = true;
			}
		}
		System.out.println();
		// �ΰ��� ��� ��� ������ !!
		//---------------------------------
		count = 0;
		while(count <= 10) {
			System.out.println("Hello");
			count++;
		}
	}
}