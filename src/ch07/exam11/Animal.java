package ch07.exam11;

public abstract class Animal { //클래스마다 공통된 부분을 뽑아서 만들었다면 abstract 무조건 붙이기
	public String name;
	public String kind;
	
	//method
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
	
	public void eat() {
		System.out.println("먹습니다.");
	}
	
	public abstract void sound(); //추상메소드 -> 자식 쪽에서 반드시 재정의!!!!!
}
