package ch03;

public class Exam01 {

	public static void main(String[] args) {
		
		//산술 연산(덧셈, 뺄셈, 나눗셈)의 다양한 형태
		
		int var1 = 1;
		
		var1 = var1 + 1;
		var1 += 1;
		var1++;
		System.out.println("var1: " +var1); //4가 출력됨.

		int var2 = 10;
		var2 = var2 - 1;
		var2 -= 1;
		var2--;
		System.out.println("var2: " +var2); //7가 출력됨.
		
		int var3 = 16;
		var3 = var3 / 2;
		var3 /= 2;
		
		//자바는 정수 / (나눗셈)의 결과는 정수입니다.
		int var4 = 10;
		int var5 = 4;
		double var6 = var4 / var5;
		System.out.println("var6: "+var6);
		
		// double var7 = 1.0 * var4 / var5; //실수 나누기 정수는 실수가 나옴.
		double var7 = (double) var4 / var5;
		System.out.println("var7: "+var7);
		
		//나머지 구하기
		int var8 = var4 % var5; //%는 나머지를 구하는 연산기호
		System.out.println("var8: "+var8);
	}

}
