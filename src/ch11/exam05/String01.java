package ch11.exam05;

import java.util.Arrays;

public class String01 {
										//이건 JVM에서 예외던짐 -> 예외처리 안 한거랑 같음.
	public static void main(String[] args) throws Exception {
		byte[] arr1 = {65, 66, 67};
		String str1 = new String(arr1);
		System.out.println(str1);
		//네트워크 통신에서 쓰이는 것은 모두 바이트!
		//그래서 배열을 받아서 String으로
		
		String str2 = "ABC";
		byte[] arr2 = str2.getBytes();
		System.out.println(Arrays.toString(arr2)); //배열에 있는 항목을 읽고 문자열로 출력해서 돌려줌.
		//arr2에 있는 항목수를 조사해서 하나의 문자열로 리턴해줌.
		
		String str3 = "가나다";
		byte[] arr31 = str3.getBytes("EUC-KR");
		byte[] arr32 = str3.getBytes("UTF-8");
		System.out.println(Arrays.toString(arr31));
		System.out.println(Arrays.toString(arr32));
		//[-22, -80, -128, -21, -126, -104, -21, -117, -92]
		// 			가     /      나 			/     다

		//다시 한글로 출력하고 싶음.
		//바이트로 만들었을 때 그 때의 charset도 줘야함!
		String str4 = new String(arr31, "EUC-KR");
		String str5 = new String(arr32, "UTF-8");
		System.out.println(str4);
		System.out.println(str5);
	}
}
