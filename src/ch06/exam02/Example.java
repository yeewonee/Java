package ch06.exam02;

public class Example {

	public static void main(String[] args) {

		//��ü ����
		Car myCar = new Car(); //CarŸ���� ���� myCar�����ϰ� Car��ü ����� ���� ����
		
		//�ʵ��� ���� �б�
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.price);
		System.out.println(myCar.old);
		System.out.println(myCar.speed);
		
		//�ʵ��� ���� ����
		myCar.company = "�����ڵ���";
		myCar.model = "�׷���";
		myCar.price = 30000000;
		myCar.old = true;
		myCar.speed = 60;
		
		//�ʵ��� ���� �б�
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.price);
		System.out.println(myCar.old);
		System.out.println(myCar.speed);
		
		//�ٸ� ��ü ����
		Car YourCar = new Car();
		
	}

}
