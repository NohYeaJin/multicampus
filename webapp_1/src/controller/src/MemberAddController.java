package controller.src;

import java.util.Map;

import dao.MemberDAO2;
import dto.Member;
@Component("/members/add.do")
public class MemberAddController implements Controller, DataBinding{
	private MemberDAO2 memberDao;
	public MemberAddController setMemberDAO(MemberDAO2 memberDao) {
		this.memberDao = memberDao;
		return this;
	}
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		Member member = (Member)model.get("member");
		if(member != null && member.getEmail()!=null) {
			memberDao.insert(member);
			return "redirect:list.do";
		}else {	
			return "/members/MemberForm.jsp";
		}
	}
	@Override
	public Object[] getDataBinders() {

		return new Object[] {
				"member",dto.Member.class
		};
		
	}
}
