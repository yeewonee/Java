package ch02;

public class Exam04 {

	public static void main(String[] args) {
	
		//���ڿ� => ����(����, �Ǽ�)
		
		//���ڿ� String Ÿ�� ������ �����Ѵ�.
		String var1 = "10";
		System.out.println("var1: "+ var1);
		
		//���ڿ��� ���ڰ� + �Ǹ� ���ڿ� ����
		String var2 =var1 + 5;
		System.out.println("var2: "+ var2);
		
		//���ڿ��� ������ �����ؼ� ����
		int var3 = Integer.parseInt(var1) +5;
		System.out.println("var3: "+ var3);
		
		//���ڿ��� �Ǽ��� �����ؼ� ����
		String var4 = "10.5";
		Double var5 = Double.parseDouble(var4) + 2.3;
		System.out.println("var5: "+ var5);
		
		//���� => ���ڿ�
		int var6 = 3;
		//�̰� ���ڿ� 3�� �ǵ����ϴ� ��� 1
		String var7 = "" + var6;
		//��� 2
		String var8 = String.valueOf(var6);
		
	}

}
