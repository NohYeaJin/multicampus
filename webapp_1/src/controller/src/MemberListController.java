package controller.src;

import java.util.Map;

import dao.MemberDAO2;
import dao.MemberDAOImpl;

@Component("/members/list.do")
public class MemberListController implements Controller{
	MemberDAO2 memberDao;
	
	public MemberListController setMemberDao(MemberDAO2 memberDao) {
	    this.memberDao = memberDao;
	    return this;
	}
	
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		model.put("members", new MemberDAOImpl().SelectList());
		return "/members/MemberList.jsp";
	}

}