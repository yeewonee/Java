package ch10.exam06;

import javax.security.auth.login.AccountException;

public class Example {

	public static void main(String[] args) {
		
		Accont acoount = new Accont(); //Ŭ������ ��Ÿ,,
		//������ ����ϴ� ������ �˾Ƽ� ����ó�� �ض�!
		// ����ó�� �پ��ϰ� ���ֱ� ����.
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
