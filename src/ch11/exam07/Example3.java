package ch11.exam07;

public class Example3 {

	public static void main(String[] args) {
		
		/*		Integer var1 = new Integer(500);
				Integer var2 = new Integer(500);
				
				Integer var1 = 500;    -> �̰Ŵ� false
				Integer var2 = 500;*/
		
		Integer var1 = 10; //�̰Ŵ� true
		Integer var2 = 10; //������ -128~127�̸� �ڽ��� ��ü ����.
		
		//���� ������ ���� �ٸ� ���� ����. �׷��� ����� equals���!
		System.out.println(var1 == var2); //������
		System.out.println(var1.equals(var2)); //����
	}

}
