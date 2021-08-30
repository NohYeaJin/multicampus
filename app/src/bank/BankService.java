package bank;

public class BankService {
	
	public MemberInfo memberinfo;
	
	public BankService(){
		memberinfo = new MemberInfo();
	}
	
	public boolean login(String id, String pw) {
		if (id.equals(memberinfo.getUser_id())) {
			if (pw.equals(memberinfo.getUser_pw())) {
				System.out.println(memberinfo.getUser_id() + "님 환영합니다.");
				return true;
			} else {
				System.out.println("비밀번호가 맞지 않습니다.");
				return false;
			}
		} else {
			System.out.println("아이디가 존재하지 않습니다.");
			return false;
		}
	}

	public void signup(String id, String pw) {
		memberinfo.setUser_id(id);
		memberinfo.setUser_pw(pw);
		memberinfo.setGrade("silver");
		memberinfo.setBalance(0);
	}

	public void insertMoney(int money) {
		int current = memberinfo.getBalance();
		memberinfo.setBalance(current + money);
		System.out.println("입금되었습니다.");

	}

	public void deleteMoney(int money) {
		int current = memberinfo.getBalance();
		if (current < money) {
			System.out.println("잔고가 부족합니다.");
		} else {
			memberinfo.setBalance(current - money);
			System.out.println("출금되었습니다.");
		}
	}
	
	public int showMoney() {
		return memberinfo.getBalance();
	}

	
}
