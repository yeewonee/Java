package ch07.exam10;

public class Example {
	
	public static void main(String[] args) {
		
		
		Parent parent = new Child(); 
		
		parent.field1 = 5;
		parent.method1();
		parent.method2(); //부모타입으로 호출하지만 재정의됐기 때문에 Child의 method2()가 호출됨.
		
		
		Child child = (Child) parent; // 다시 자식으로 타입변환
		
		child.field1 = 5;
		child.field2 = 5;
		child.method1();
		child.method2();
		child.method3();
	}

}
