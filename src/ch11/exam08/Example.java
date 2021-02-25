package ch11.exam08;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example {

	public static void main(String[] args) {
		Board board = new Board();
		board.setBno(1);
		board.setTitle("내용1");
		board.setContent("내용1");
		board.setWriter("글쓴이1");
		board.setWriteDate(new Date());

		service(board);
	}

	public static void service(Board board) {
		System.out.println(board.getBno());
		System.out.println(board.getTitle());
		System.out.println(board.getContent());
		System.out.println(board.getWriter());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		String strDate = sdf.format(board.getWriteDate());
		//Date에 있는 날짜 정보를 yyyy.MM.dd 이 형식으로 바꿔라!
		System.out.println(strDate);
	}
}
