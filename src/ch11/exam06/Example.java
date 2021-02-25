package ch11.exam06;

import java.util.regex.Pattern;

public class Example {

	public static void main(String[] args) {
		// 전화번호 체크
		String regExp = "010-\\d{3,4}-\\d{4}";
				//역슬래쉬 두개 넣어줘야 함!

		String data = "010-23-1234";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("유효한 데이타");
		}else {
			System.out.println("잘못된 데이타");
		}
		
		//정규표현식 이미 인터넷에 많으니까 가져와서 테스트해보고 쓰면 됨!
		String regExp2 = ".*(?=^.{8,15}$)(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*";
		String password = "a#123456789";
		boolean result2 = Pattern.matches(regExp2, password);
		System.out.println(result2);
	}

}
