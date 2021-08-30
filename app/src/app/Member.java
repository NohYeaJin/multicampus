package app;

public class Member {
	private String user_id;
	private String user_pw;
	private String name;
	private int balance;
	
	public Member(String user_id, String user_pw, String name, int balance) {
		this.user_id= user_id;
		this.user_pw = user_pw;
		this.name = name;
		this.balance = balance;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
