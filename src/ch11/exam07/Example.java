package ch11.exam07;

public class Example {

	public static void main(String[] args) {
		
		int var1 = 10;
		Integer var2 = new Integer(10);
		Integer var3 = 10; //���� ����Ÿ�� ������ �� �� �־�? no
		//�׷��� �̰� ������. var3�� ������ ��������. �� �ȿ� 10�� ����Ǵ� ���� �ƴ϶�
		// 10�� ���� �ִ� integer ��ü�� ������ ��.
		//Auto Boxing �ڵ������� 10�� ������ �Ǿ ��ü�� ��������ٴ� ��
		
		double var4 = 3.5;
		Double var5 = new Double(3.5);
		Double var6 = 3.5; //�̰͵� ���� Auto Boxing
		
		Integer var7 = new Integer(10);
		int var8 = var7.intValue(); //�� ��ü(var7) �ȿ� �ִ� 10�� �����ͼ� var8�� �����ϰڴ�!
		int var9 = var7; //�̷��Ե� ����. ������ int�� ����? �̻���!
		//�߰��� 19�� ������ ����ִٰ� ���� ��. Auto UnBoxing
		//�ڵ����� �ڽ��� Ǯ���� �� ���� �ȿ� ��!
		
		Double var10 = new Double(10);
		double var11 = var10.doubleValue(); //�̰� ����
		double var12 = var10; //Auto UnBoxing
				
		Object[] arr = new Object[5];
		arr[0] = "abc";
		arr[1] = 10; //������Ʈ Ÿ���̶� ������ ���� ��. 10�� ������ �ƴ�! ����! ���⿡ ��Ƽ�� ��ü�� ��������� ������ ��.
		arr[2] = true; //�߰��� ��ü�� ����� ������ ������ ��
		//arr[1] = new Integer(10);    arr[2] = new Boolean(true);
		//���⼭ Auto Boxing�� �Ͼ!
	}

}
