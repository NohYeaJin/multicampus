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
	//balanceexception�� exception���� �ٲٸ� �ϰ������� �ٸ� ���ܵ���� ó��
	//������ �ϳ��ۿ� �����ϱ� �̰Ÿ� �ص� ok
	public void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money) {
			throw new BalanceInsufficientException("�ܰ� �����մϴ�.");
		}

		balance -= money;

	}
}
