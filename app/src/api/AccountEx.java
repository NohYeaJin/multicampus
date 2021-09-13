package api;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(1000);
		System.out.println(account.getBalance());
		//예외처리를 해줘야 한다. 
		//runtime은 예외처리 안해줘도 되지만, 일반적 syntax에러는 예외처리를 해줘야
		//돌릴수라도 있다. 
		try {
			account.withdraw(1001);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}

}
