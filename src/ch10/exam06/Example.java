package ch10.exam06;

import javax.security.auth.login.AccountException;

public class Example {

	public static void main(String[] args) {
		
		Accont acoount = new Accont(); //클래스명 오타,,
		//실제로 사용하는 곳에서 알아서 예외처리 해라!
		// 예외처리 다양하게 해주기 위함.
		try {
			String ano = null;
			acoount.deposit(ano, 1000);
		} catch(NoAccountException e) {
			System.out.println(e.getMessage());
		}
		
		String ano = "111-222-333";
		try{
			acoount.withdraw(ano,1000);
			acoount.withdraw(ano,10000000);
		} catch(NoAccountException e) {
			System.out.println(e.getMessage());
		} catch(BalanceLackException e) {
			System.out.println(e.getMessage());
		} 
	}

}
