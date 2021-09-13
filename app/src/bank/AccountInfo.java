package bank;

public class AccountInfo {

	private String user_id;
	private String account_num;
	private String bank_brand;
	private int balance;
	private String grade;

	public AccountInfo(String user_id, String account_num, String bank_brand, int balance, String grade) {
		this.user_id = user_id;
		this.account_num = account_num;
		this.bank_brand = bank_brand;
		this.balance = balance;
		this.grade = grade;

	}

	public AccountInfo() {
		user_id = null;
		account_num = null;
		bank_brand = null;
		balance = 0;
		grade = null;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getAccount_num() {
		return account_num;
	}

	public void setAccount_num(String account_num) {
		this.account_num = account_num;
	}

	public String getBank_brand() {
		return bank_brand;
	}

	public void setBank_brand(String bank_brand) {
		this.bank_brand = bank_brand;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
