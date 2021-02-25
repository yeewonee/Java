package ch10.exam06;

public class Accont {
	public void deposit(String account, int money) throws NoAccountException{
		if(account == null) {
			//예외 발생 코드, 여기선 예외가 발생됐다는 것만 알려주자! 얘를 사용하는 곳에서 예외처리하게 함!
			//자바에서 제공해주는 예외가 없으니까 예외를 만듦 -> NoAccountException
			throw new NoAccountException("입금 계좌가 없습니다."); //정확한 이유에 대해 ()안에 명시
		}
		System.out.println("입금 성공");
	}
	
	public void withdraw(String account, int money) 
			throws NoAccountException, BalanceLackException {
		int balance = 10000;
		if(account == null) {
			//예외 발생 코드
			throw new NoAccountException("출금 계좌가 없습니다.");
		}else if(money>balance) {
			throw new BalanceLackException("잔고가 부족합니다.");
		}
		else {
			System.out.println("출금 성공");
		}
	}
}
