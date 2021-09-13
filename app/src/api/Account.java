package api;

public class Account {
	private long balance;

	public Account() {

	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}
	//balanceexception을 exception으로 바꾸면 일괄적으로 다른 예외들까지 처리
	//지금은 하나밖에 없으니까 이거만 해도 ok
	public void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money) {
			throw new BalanceInsufficientException("잔고가 부족합니다.");
		}

		balance -= money;

	}
}
