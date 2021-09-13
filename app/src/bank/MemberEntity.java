package bank;

public class MemberEntity {
	private String user_id;
	private String user_pw;
	private String user_email;
	private String phone_num;
	private String join_date;
	private String role;
	
	public MemberEntity() {
		this.user_id = null;
		this.user_pw = null;
		this.user_email = null;
		this.phone_num = null;
		this.join_date = null;
		this.role = null;
	}
	
	public MemberEntity(String user_id, String user_pw, String user_email, String phone_num,
			 String join_date, String role) {
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_email = user_email;
		this.phone_num = phone_num;
		this.join_date = join_date;
		this.role = role;
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

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}


	public String getJoin_date() {
		return join_date;
	}

	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
}
