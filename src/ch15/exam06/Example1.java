package ch15.exam06;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("홍길동");
		set.add("감자바");
		set.add("방돌이");
		set.add("박길순");
		
		for(String item : set) {
			System.out.println(item);//가나다 순으로 출력됨. 저장되는 순간부터 값이 비교돼서 저장됨.
			//그리고 왼쪽부터 읽어와서 저절로 오름차순으로 출력
		}
		System.out.println();
		
		NavigableSet<String> nset = set.descendingSet();
		for(String item : nset) {
			System.out.println(item);
		}
		System.out.println();
		
		NavigableSet<String> sset = set.subSet("가", false,"방돌이", true);
		for(String item : sset) {
			System.out.println(item);
		}
	}

}
