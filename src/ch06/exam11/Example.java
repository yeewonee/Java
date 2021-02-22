package ch06.exam11;

public class Example {

	public static void main(String[] args) {
		
		//인스턴스 멤버(필드, 메소드)는 반드시
		//객체 참조 변수를 통해서 접근
		User user = new User("홍길동"); //객체를 만듦

		System.out.println(user.name);
		user.login();
		user.logout();
		
		//정적 멤버(필드, 메소드)는 객체가 없이도 사용가능
		//클래스로 접근
		System.out.println(User.nation);
		User.info(); //참조 변수를 가지고 접근X, 클래스 가지고O
	}

}
