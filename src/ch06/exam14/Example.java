package ch06.exam14;

public class Example {

	public static void main(String[] args) {
		
		System.out.println(Korean.NATION);
		//Korean.NATION = "미국"; 이거 X. final이라서

		Korean k1 = new Korean("123456-1234567");
		//k1.ssn = "666658-3948592"; 이거 X
		
		System.out.println(Math.PI);
		double area = 10*10*Math.PI;
	}

}
