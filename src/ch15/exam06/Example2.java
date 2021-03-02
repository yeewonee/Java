package ch15.exam06;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Example2 {

	public static void main(String[] args) {
		
		TreeMap<String, String> map = new TreeMap<>();
		
		map.put("s3","ȫ�浿");
		map.put("s1","�ڱ��");
		map.put("s4","���ڹ�");
		map.put("s2","������");
		map.put("s5","�����̳�");
	
		//Ű�� ������ �ż� ��µ�.
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		System.out.println();
		
		//�������� ���
		keys = map.descendingKeySet();
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		System.out.println();
		
		//s3���� s4������ ����ϰ��� �� ��
		//map.subMap("s3", true, "s5", false); �̰͵� �����ϰ� �Ʒ��ٵ� ������.
		Map<String, String> smap = map.subMap("s3", true, "s5", false);
		keys = smap.keySet();
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
	}

}
