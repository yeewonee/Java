package ch05homework;
import java.util.Scanner;
public class Exercise09 {

	public static void main(String[] args) {

		boolean run = true;
		String[][] boardArray = new String[100][5]; 

		Scanner scanner = new Scanner(System.in);
		int count=1; // ��Ͽ� ��ȣ�� ī��Ʈ ���ֱ� ���� ����
		int max=100; //������ �� �ִ� �ִ� ����
		

		
		while(run) {
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("1.	��� | 2. ����(Create) | 3. �б�(Read) | 4. ����(Update) | 5.����(Delete) | 6.����");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.print("�޴�����: ");

			int menu = Integer.parseInt(scanner.nextLine());

			if(menu == 1) { //��� ���
				System.out.println("---------------------------------------------------------------------------------------------------");
				System.out.println("��ȣ           ����                    ����                    �۾���      ��ȸ��");
				System.out.println("---------------------------------------------------------------------------------------------------");
				for(int i=boardArray.length-1;i>=0;i--) { // �迭�� ������������ ����ϱ� ���ؼ� �� ������ �迭���� ���
					if(boardArray[i][0]!=null) { //null���� �� �ִ� ���� �����ϱ� ���� if��
						System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
					}
				}
			}
			else if(menu == 2) { //��� ����

				for(int j=0; j<boardArray.length;j++) { // �������� ��쿡 null�� ���� �ڸ��� ����ֱ� ���ؼ� ��ü �迭�� ���鼭 
					if(boardArray[j][0]==null) { // null�� �ִ� ���� ã�Ƽ� �Էµ� ���� ����.

						System.out.print("����: ");
						boardArray[j][1]=scanner.nextLine(); 
						System.out.print("����: ");
						boardArray[j][2]=scanner.nextLine();
						System.out.print("�۾���: ");
						boardArray[j][3]=scanner.nextLine();

						boardArray[j][0]=String.valueOf(count); //��ȣ�� �־��ֱ� ���� count�� ����.
						count++; // ���� ��ȣ�� �־��� count ������Ŵ
						boardArray[j][4]="0"; // �⺻ ��ȸ�� = 0

						System.out.println("---------------------------------------------------------------------------------------------------");
						System.out.println("��ȣ           ����                    ����                    �۾���      ��ȸ��");
						System.out.println("---------------------------------------------------------------------------------------------------");

						for(int i=boardArray.length-1;i>=0;i--)  { //�迭�� �Ųٷ� ���鼭 ������������ ��� ���
							if(boardArray[i][0] != null) {
								System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
							}
						}

						break; // ���� ���� �־����� ����ϰ� for�� ��������.
					}
				}

			}

			else if(menu == 3) {//�б�
				System.out.print("��ȣ: ");
				String s = scanner.nextLine(); //�а��� �ϴ� ��ȣ �Է¹ޱ�

				int readNum = -1; 
	
				for(int x=0; x<boardArray.length;x++) { //�迭�� �ѹ��� ���鼭

					if(boardArray[x][0]!=null&&boardArray[x][0].equals(s)) { //null���� �� ���� (����ó��) + ���� �Է��� ��ȣ�� ����� ��ġ�ϸ�
						readNum =x;	//�Է��� ��ȣ�� ��ġ�� �ε��� �ѹ��� readNum�� �־��ֱ�
					}
				}
				


				if(readNum == -1){ // null���� ��쿣 readNum=-1
					System.out.println("���� ��ȣ�Դϴ�.");
				} 

		
				else {			//null���� �ƴ϶�� ��ȸ�� ����
					int view =	Integer.parseInt(boardArray[readNum][4]);	//���� �а���� ��Ϲ�ȣ�� del�� ��������� �̸� �̿��ؼ� ��ȸ�� ����
					view ++;
					boardArray[readNum][4] = String.valueOf(view);


					//��¹�
					System.out.println("����: "+boardArray[readNum][1]);
					System.out.println("����: "+boardArray[readNum][2]);
					System.out.println("�۾���: "+boardArray[readNum][3]);		
					System.out.println("��ȸ��: "+boardArray[readNum][4]);
				}

			}


			else if( menu == 4) { //����

				System.out.print("��ȣ: ");
				String s = scanner.nextLine(); //�����ϰ��� �ϴ� ��� ��ȣ�� �Է¹���
				int fixNum = -1;

				for(int x=0; x<boardArray.length;x++) {  //�迭�� ���鼭
					if(boardArray[x][0]!=null&&boardArray[x][0].equals(s)){ //null�� �ƴϰ� �Է��� ��Ϲ�ȣ�� ��ġ�ϴ� �ε��� ã��
						fixNum = x; //�ε��� ��ȣ findNum�� ����
					}
				}

				if(fixNum == -1) { // �Է��� ��ȣ�� ���� ��� = null���� ����ִ� ���
					System.out.println("���� ��ȣ�Դϴ�.");
				}

				else {		
					String preTitle = boardArray[fixNum][1]; // �����ϱ� �� ���� preTitle�̶�� ������ �־��.
					String preContent = boardArray[fixNum][2]; // �����ϱ� �� ���� preConten��� ������ �־��.

					System.out.println("���� ����: "+boardArray[fixNum][1]);
					System.out.print("���� ����: ");
					String title = scanner.nextLine();
					if(title.equals("")) { //���࿡ ���Ͱ� ������
						boardArray[fixNum][1] = preTitle; //���� ������ �״�� �������
					}
					else {
						boardArray[fixNum][1] = title; //���Ͱ��� �ƴ϶�� ���� �Է¹��� ���� �迭�� ����
					}

					System.out.println("���� ����: "+boardArray[fixNum][2]);
					System.out.print("���� ����: ");
					String content = scanner.nextLine();

					if(content.equals("")) {
						boardArray[fixNum][2] = preContent;
					}
					else {
						boardArray[fixNum][2] = content;
					}

					//��¹�
					for(int i=boardArray.length-1;i>=0;i--)  {
						if(boardArray[i][0]!=null) {
							System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
						}
					}
				}

			}



			else if( menu == 5) { //����

				System.out.print("��ȣ: ");
				String s = scanner.nextLine(); //������ ��ȣ �Է¹���
				int deleteNum = -1;

				for(int x=0; x<boardArray.length;x++) { 
					if(boardArray[x][0]!=null&&boardArray[x][0].equals(s)){
						deleteNum =x; //�����ҹ�ȣ�� ��ġ�ϴ� �ε��� ��ȣ�� deleteNum�� ����
					}
				}

				if(deleteNum == -1) {
					System.out.println("���� ��ȣ�Դϴ�.");
				}

				else {
					for(int j=0;j<5;j++) {

						boardArray[deleteNum][j] = null; // �Է¹��� ��ȣ�� ���� for���� ���� �� ���鼭 null�� �־���.
					}



					for(int i=boardArray.length-1;i>=0;i--) { //��¹�
						if(boardArray[i][0]!=null) {
							System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
						}
					}

				}	

			}


			else if(menu == 6){ //����
				run = false; // while�� ���������� boolean������ false�� �ٲ�.
			}
			else {
				System.out.println("�޴��� �ٽ� �����ϼ���.");
			}
		}
		System.out.println("���α׷� ����");
	}
}

