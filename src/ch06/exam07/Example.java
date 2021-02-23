package ch06.exam07;

public class Example {

	public static void main(String[] args) {
		
		BoardService bs = new BoardService(); 
		//클래스는 설계도, 설계도만 갖고 사용X, 반드시 객체를 만들어줘야 함!
		//객체를 만들고 객체의 번지를 참조 변수에 대입해야 함!!
		
		int bno = bs.getNewBno();
		System.out.println(bno);
		
		bno = bs.getNewBno();
		System.out.println(bno);

		bs.save("제목1", "내용1");
		bs.save("제목2", "제목2");
		
		int[] arr = {1, 2, 3};
		int sum = bs.getSum(arr);
		System.out.println(sum);
		
		sum = bs.getSum(new int[]{1, 2, 3});
		System.out.println(sum);
	}

}
