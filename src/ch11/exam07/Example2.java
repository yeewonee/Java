package ch11.exam07;

public class Example2 {

	public static void main(String[] args) {
		
		int value = Integer.parseInt("3"); //Integer가 wrapper클래스
		double var3 = Double.parseDouble("3.5");
		
		//11,12줄 같은 의미
		Integer var4 = new Integer(3);
		Integer var5 = new Integer("3");
		Integer var6 = 3;
	}

}
