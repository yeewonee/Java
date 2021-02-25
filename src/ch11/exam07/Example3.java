package ch11.exam07;

public class Example3 {

	public static void main(String[] args) {
		
		/*		Integer var1 = new Integer(500);
				Integer var2 = new Integer(500);
				
				Integer var1 = 500;    -> 이거는 false
				Integer var2 = 500;*/
		
		Integer var1 = 10; //이거는 true
		Integer var2 = 10; //범위가 -128~127이면 박싱한 객체 공유.
		
		//값의 범위에 따라서 다른 값이 나옴. 그래서 결론은 equals써라!
		System.out.println(var1 == var2); //번지비교
		System.out.println(var1.equals(var2)); //값비교
	}

}
