package ch06.exam11;

public class User {
	//Field (앞으로 User라는 객체가 만들어질 때 아래의 데이터가 만들어짐)
	String id;
	String name;
	String password;
	static String nation = "한국"; //모든 user는 한국사람. 이는 굳이 객체 안에 저장하지 않아도 됨.
	
	//Constructor -> 인스턴스 멤버가 될 수 없음. 왜? 생성자는 객체를 생성하기 위한 용도일뿐
	User(String name){
		this.name = name;
	}
	
	//Method

	static void info() { //객체가 없이도 사용할 수 있는 메소드
		System.out.println("모든 User는 한국인입니다.");
	}
	void login() {
		System.out.println(name + " 로그인합니다.");
	}
	
	void logout() {
		System.out.println(name + " 로그아웃합니다.");
	}
}
