package app;

public class MemberServiceEx {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("a", "123");
		if(result) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("����");
		}
		memberService.logout("abc");
	}

}
