package ch18.exam13;

import java.io.Console;

public class Example {

	public static void main(String[] args) {
		
		Console console = System.console();
		
		System.out.println("���̵�: ");
		String id = console.readLine();
		
		System.out.println("��й�ȣ: ");
		String password = new String(console.readPassword());
		
		System.out.println(id);
		System.out.println(password);
	}

}
