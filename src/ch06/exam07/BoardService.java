package ch06.exam07;

public class BoardService {
	
	//Field
	int count; 
	
	//Constructor
	
	//Method
	int getNewBno() {
		return ++count;
	}
	
	void save(String title, String content){ //�����ϴ� ���� ���Ϲ��� ���� ����. �׷��� void
		
		int bno = getNewBno(); //���ο��� �̷��� ����ϸ� ��.
		System.out.println(title+"�� �����մϴ�.");
		System.out.println(content+"�� �����մϴ�.");
		
	}
	
	int getSum(int[] values) {
		int result = 0;
		for(int value : values) { //value ������ŭ �ݺ�
			result += value;
		}
		return result;
	}
	
}
