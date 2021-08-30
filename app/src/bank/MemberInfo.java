package bank;

public class MemberInfo {
	String user_id;
	String user_pw;
	int balance;
	String grade;
	String bank_brand;

	public MemberInfo(String user_id, String user_pw, int balance, String grade, String bank_brand) {
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.balance = balance;
		this.grade = grade;
		this.bank_brand = bank_brand;
	}

	public MemberInfo() {
		this.user_id = null;
		this.user_pw = null;
		this.balance = 0;
		this.grade = null;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
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
