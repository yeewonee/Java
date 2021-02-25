package ch11.exam07;

public class Example {

	public static void main(String[] args) {
		
		int var1 = 10;
		Integer var2 = new Integer(10);
		Integer var3 = 10; //값이 참조타입 변수에 들어갈 수 있어? no
		//그러나 이게 가능함. var3은 엄연히 참조변수. 이 안에 10이 저장되는 것이 아니라
		// 10을 갖고 있는 integer 객체의 번지가 들어감.
		//Auto Boxing 자동적으로 10이 포장이 되어서 객체가 만들어진다는 뜻
		
		double var4 = 3.5;
		Double var5 = new Double(3.5);
		Double var6 = 3.5; //이것도 역시 Auto Boxing
		
		Integer var7 = new Integer(10);
		int var8 = var7.intValue(); //이 객체(var7) 안에 있는 10을 꺼내와서 var8에 저장하겠다!
		int var9 = var7; //이렇게도 가능. 번지를 int에 저장? 이상함!
		//중간에 19번 과정이 들어있다과 보면 됨. Auto UnBoxing
		//자동으로 박싱이 풀리고 그 값이 안에 들어감!
		
		Double var10 = new Double(10);
		double var11 = var10.doubleValue(); //이게 정석
		double var12 = var10; //Auto UnBoxing
				
		Object[] arr = new Object[5];
		arr[0] = "abc";
		arr[1] = 10; //오브젝트 타입이라 번지가 들어가야 함. 10은 번지가 아님! 값임! 여기에 인티저 객체가 만들어져서 번지가 들어감.
		arr[2] = true; //중간에 객체로 만드는 과정이 생략된 것
		//arr[1] = new Integer(10);    arr[2] = new Boolean(true);
		//여기서 Auto Boxing이 일어남!
	}

}
