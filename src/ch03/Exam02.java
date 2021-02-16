package ch03;

public class Exam02 {

	public static void main(String[] args) {
		
		//연산의 결과가 boolean 타입으로 나오는 연산기호
		
		int var1 = 2;
		int var2 = 3;
		
		boolean var3 = var1 == var2; //false (같은지 물음)
		boolean var4 = var1 != var2; //true (다른지 물음)
		boolean var5 = var1 > var2; //false(var1이 var2보다 큽니까?)
		boolean var6 = var1 >= var2; //false
		boolean var7 = var1 < var2; //true
		boolean var8 = var1 <= var2; //true
		boolean var9 = !(var1 == var2); //true (not은 괄호 안의 결과를 반대로)
		boolean var10 = (var1 == var2) || (var1 < var2); // true (or은 둘 중 하나만 true면 true)
		boolean var11 = (var1 == var2) && (var1 < var2); // false (and은 둘 다 true여야 true)
		
	}

}
