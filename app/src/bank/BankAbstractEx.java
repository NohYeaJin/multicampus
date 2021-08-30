package bank;

public abstract class BankAbstractEx {

	String user_id;
	String user_pw;
	String nickname;
	String bank_brand;
	String grade;
	int balance;

	public BankAbstractEx() {
		this.balance = 0;
		this.grade = "bronze";
	}

	public abstract void signup(String user_id, String user_pw, String nickname, String bank_brand);

	public abstract void login(String user_id, String user_pw);

	public void deposit(int money) {
		this.balance += money;
	}

	public void withdraw(int money) {
		this.balance -= money;
	}

}
