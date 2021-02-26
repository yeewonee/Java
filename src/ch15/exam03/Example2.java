package ch15.exam03;

import java.util.HashSet;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		
		Set<User> set = new HashSet<>();
		
		User user1 = new User("winter", "한겨울");
		User user2 = new User("winter", "한겨울");
		set.add(user1);//다른 객체 두개 저장
		set.add(user2);
		System.out.println(user1.hashCode() == user2.hashCode());
		System.out.println(user1.equals(user2)); //Objcet이 갖고 있는 equals는 번지비교
		System.out.println(set.size());

	}

}
