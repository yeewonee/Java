package ch04homework;

public class Exercise05 {

	public static void main(String[] args) {
		int x, y;
		
		for(x=1; x<=10; x++) {
			for(y=1; y<=10; y++) {
				int z= ((4*x) + (5*y));
				if(z==60) {
					System.out.println("("+ x + "," + y + ")");
				}
			}
		}
	}

}
