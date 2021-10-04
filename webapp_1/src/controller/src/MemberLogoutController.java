package controller.src;

import java.util.Map;

import javax.servlet.http.HttpSession;

import dao.MemberDAO2;
@Component("/auth/logout.do")
public class MemberLogoutController implements Controller{

	private MemberDAO2 memberDao;
	public MemberLogoutController setMemberDao(MemberDAO2 memberDao) {
		this.memberDao = memberDao;
		return this;
	}
	
	
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		((HttpSession)model.get("session")).invalidate();
		return "/auth/LogInForm.jsp";
	}

}
