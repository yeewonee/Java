package pr06.exam15.pack2;

import pr06.exam15.pack1.*;  // command + shift + O 쓰면 자동 임포트 
//import pr06.exam15.pack3.*;

public class Example {

	public static void main(String[] args) {
		
		Board b1 = new Board();
		b1.title = "제목";
		
		Product p1 = new Product();
		p1.name = "세탁기";
		
		
		// 패키지도 클래스의 일부분이다. 
		pr06.exam15.pack3.Board b2 = new pr06.exam15.pack3.Board();
		b2.title = "제목";
		
		
		
	}

}
