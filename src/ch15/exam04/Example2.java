package ch15.exam04;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
	
	public static void main(String[] args) {
		
		Map<User, Board> map = new HashMap<>();
		
		map.put(new User("Winter", "�ܿ��"), new Board(1, "�ܿ��"));
		map.put(new User("Winter", "������"), new Board(2, "����"));
		System.out.println(map.size());
		//��ü�� �ٸ����� id�� ���Ƽ� ���� key�� ������. �׷��� 1�� ���
		
		Board board = map.get(new User("Winter", null));
		System.out.println(board.getBno());
		System.out.println(board.getTitle());
	}
}
