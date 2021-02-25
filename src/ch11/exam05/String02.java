package ch11.exam05;

import java.util.StringTokenizer;

public class String02 {

	public static void main(String[] args) {
		
		String ssn = "123456-1234567";
		char sex = ssn.charAt(7); //7번째 인덱스 값 얻고싶음
		if(sex=='1'||sex=='3') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		//문자열 잘라내기: 방법1
		String first = ssn.substring(0, 6);//0번째 부터 5번까지 뽑아냄! 
		String second = ssn.substring(7); //7위치부터 끝까지
		System.out.println(first);
		System.out.println(second);
		
		//문자열 잘라내기: 방법2
		String[] parts = ssn.split("-"); //구분자
		//0 인덱스에는 -앞까지, 1 인덱스에는 - 뒤부터 끝까지
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		
		//문자열 잘라내기: 방법3 (분리하기)
		StringTokenizer st = new StringTokenizer(ssn, "-");
		first = st.nextToken(); //처음 단어
		second = st.nextToken(); // 그 다음 단어
		 //여기서 더 이상 없는데 third만들어서 할라고 하면 오류남. 그래서 -개수를 알아야함.
		//아래처럼 수정해주면 됨. (교수님은 위에 두줄 지웠음)
		while(st.hasMoreElements()) { //가져올게 더 있는지 검사
			String token = st.nextToken();
			System.out.println(token);
			}
		
		//포함 여부: 방법1
		String content = "이것은 자바 책입니다.";
		boolean result = content.contains("자바"); //자바가 있는지 확인
		System.out.println(result);
		
		//포함 여부: 방법2
		int index = content.indexOf("자바"); //이 문자열이 시작하는 인덱스 번호가 index에 들어감.
		//문자열이 없다면 -1을 리턴함.
		if(index != -1) {
			System.out.println("자바 관련 책이군요");
		}else {
			System.out.println("자바 관련 책이 아니군요");
		}
		
		//문자열의 길이
		int length = content.length();
		System.out.println(length); //출력값: 12
		
		//대치하기(변경)
		String content2 = content.replace("자바", "java");
		//String은 불변이라 원래 문자열은 그대로 있고
		// 바뀐 문자열이 새로 만들어져서 리턴됨.
		System.out.println(content2);
	}
}
