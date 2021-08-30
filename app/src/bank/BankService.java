package bank;

public class BankService {
	
	public MemberInfo memberinfo;
	
	public BankService(){
		memberinfo = new MemberInfo();
	}
	
	public boolean login(String id, String pw) {
		if (id.equals(memberinfo.getUser_id())) {
			if (pw.equals(memberinfo.getUser_pw())) {
				System.out.println(memberinfo.getUser_id() + "�� ȯ���մϴ�.");
				return true;
			} else {
				System.out.println("��й�ȣ�� ���� �ʽ��ϴ�.");
				return false;
			}
		} else {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
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
		System.out.println("�ԱݵǾ����ϴ�.");

	}

	public void deleteMoney(int money) {
		int current = memberinfo.getBalance();
		if (current < money) {
			System.out.println("�ܰ� �����մϴ�.");
		} else {
			memberinfo.setBalance(current - money);
			System.out.println("��ݵǾ����ϴ�.");
		}
	}
	
	public int showMoney() {
		return memberinfo.getBalance();
	}

	
}
