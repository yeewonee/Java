package ch15.exam04;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
	
	public static void main(String[] args) {
		
		Map<User, Board> map = new HashMap<>();
		
		map.put(new User("Winter", "겨울비"), new Board(1, "겨울비"));
		map.put(new User("Winter", "봄들이"), new Board(2, "입춘"));
		System.out.println(map.size());
		//객체는 다르지만 id가 같아서 같은 key로 간주함. 그래서 1이 출력
		
		Board board = map.get(new User("Winter", null));
		System.out.println(board.getBno());
		System.out.println(board.getTitle());
	}
}
