package ch11.exam02;

import java.util.Date;


public class Example {

	public static void main(String[] args) {
		
		Object var1 = new Object();
		System.out.println(var1.toString());
		
		Date var2 = new Date();
		System.out.println(var2.toString());
	
		String var3 = "abc";
		System.out.println(var3.toString());
		
		Member var4 = new Member("winter", "늦겨울");
		System.out.println(var4.toString()); //println은 toString을 호출함
		//그래서 윗줄이랑 아랫줄 출력값 같음.
		System.out.println(var4);
		
	   String result = var4.toString() + " => spring: 볼돌이";
	   					//여기 toString()생략 가능
	   System.out.println(result);
	}
}
