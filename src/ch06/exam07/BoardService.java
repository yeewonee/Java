package ch06.exam07;

public class BoardService {
	
	//Field
	int count; 
	
	//Constructor
	
	//Method
	int getNewBno() {
		return ++count;
	}
	
	void save(String title, String content){ //저장하는 경우는 리턴받을 것이 없음. 그래서 void
		
		int bno = getNewBno(); //내부에선 이렇게 사용하면 됨.
		System.out.println(title+"을 저장합니다.");
		System.out.println(content+"을 저장합니다.");
		
	}
	
	int getSum(int[] values) {
		int result = 0;
		for(int value : values) { //value 개수만큼 반복
			result += value;
		}
		return result;
	}
	
}
