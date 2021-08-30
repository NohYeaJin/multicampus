package app;

public class MemberServiceEx {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("a", "123");
		if(result) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("실패");
		}
		memberService.logout("abc");
	}

}
