package ch15.exam06;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Example2 {

	public static void main(String[] args) {
		
		TreeMap<String, String> map = new TreeMap<>();
		
		map.put("s3","홍길동");
		map.put("s1","박길순");
		map.put("s4","감자바");
		map.put("s2","개발자");
		map.put("s5","디자이너");
	
		//키가 정렬이 돼서 출력됨.
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		System.out.println();
		
		//내림차순 출력
		keys = map.descendingKeySet();
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		System.out.println();
		
		//s3부터 s4까지만 출력하고자 할 때
		//map.subMap("s3", true, "s5", false); 이것도 가능하고 아랫줄도 괜찮음.
		Map<String, String> smap = map.subMap("s3", true, "s5", false);
		keys = smap.keySet();
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
	}

}
