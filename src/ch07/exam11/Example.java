package ch07.exam11;

public class Example {

	public static void main(String[] args) {

		Animal animal1 = new Dog(); //Animal이 부모니까 자식 객체 대입 가능
		Animal animal2 = new Cat();
		
		animal1.eat();
		animal1.sleep();
		animal1.sound();  //Dog()의 sound() 
		
		animal2.eat();
		animal2.sleep();
		animal2.sound(); //Cat()의 sound()
	}

}
