package app;

public class MemberService {
	
	
	String a = new String("A");
	
	public Member member;
	public MemberService() {
		
		member = new Member("Myid","mypw","ȫ�浿",100);
		
	}
	
	public boolean login(String id, String pw) {
		boolean result = false;
		if(id.equals(member.getUser_id())) {
			if(pw.equals(member.getUser_pw())) {
				System.out.println("�α��ο� �����Ͽ����ϴ�");
			}else {
				System.out.println("��й�ȣ�� ���� �ʽ��ϴ�");
			}
			
		}
		return result;
	}
	
	public void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		
	}
}
