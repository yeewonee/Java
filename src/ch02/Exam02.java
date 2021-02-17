package ch02;

public class Exam02 {
	
	public static void main(String[] args) {
		
		//자동 타입 변환
		byte var1 = 10;
		int var2 = var1;
		
		//강제 타입 변환
		int var3 = 1000;
		byte var4 = (byte)var3; //바이트 단위로 쪼개겠다. 한 조각만 저장하겠다.
		System.out.println("var4 :" + var4);
		
		// --------------------------------------------------
		
		//자동 타입 변환
		int var5 = 10;
		double var6 = var5;
		
		//강제 타입 변환
		float var7 = 10.5f;
		long var8 = (long)var7; //10 (소수점 버림)
		
		//---------------------------------------------------
		
		//실수를 정수로 변환.
		double var9 = 3.14;
		int var10 = (int)var9; //이렇게 하면 var10에 3이 들어가게 됨.
	}

}
