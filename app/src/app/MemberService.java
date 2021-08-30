package app;

public class MemberService {
	
	
	String a = new String("A");
	
	public Member member;
	public MemberService() {
		
		member = new Member("Myid","mypw","홍길동",100);
		
	}
	
	public boolean login(String id, String pw) {
		boolean result = false;
		if(id.equals(member.getUser_id())) {
			if(pw.equals(member.getUser_pw())) {
				System.out.println("로그인에 성공하였습니다");
			}else {
				System.out.println("비밀번호가 맞지 않습니다");
			}
			
		}
		return result;
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
		
	}
}
