package ch15.exam08;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		/*자체적인 비교기능이 없어서 비교할 수 있도록 Comparator를 제공해줌
		  Comparator를 보고 TreeSet이 product가 저장이 될 때 비교를 함.
		  결국은 가격을 보고 이 가격이 적으면 왼쪽에, 크면 오른쪽에 return값을 보고 배치함.*/
		TreeSet<Product> set = new TreeSet<>(new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if(o1.price < o2.price) {
					return -1;
				}else if(o1.price == o2.price) {
					return 0;
				}else
					return 1;
			}
		}); //익명구현객체 Comparator은 인터페이스
		
		set.add(new Product("TV", 10000));
		set.add(new Product("Audio", 5000));
		set.add(new Product("Car", 12000));
		
		for(Product p : set) {
			System.out.println(p.name + "," + p.price);
		}
		System.out.println();
		
		TreeMap<Product, String> map = new TreeMap<>(new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if(o1.price < o2.price) {
					return -1;
				}else if(o1.price == o2.price) {
					return 0;
				}else
					return 1;
			}
		});
		
		map.put(new Product("TV", 10000), "LG");
		map.put(new Product("Audio", 5000), "Samsung");
		map.put(new Product("Car", 12000), "Hyundai");
		
		Set<Product> pset = map.keySet();
		
		for(Product p : pset) {
			System.out.println(p.name + "," + p.price + "," + map.get(p));
		}
	}

}
