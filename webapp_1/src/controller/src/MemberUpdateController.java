package controller.src;

import java.util.Map;

import dao.MemberDAO2;
import dto.Member;
@Component("/members/update.do")
public class MemberUpdateController implements Controller , DataBinding{

	private MemberDAO2 memberDao;
	public MemberUpdateController setMemberDao(MemberDAO2 memberDao) {
		this.memberDao = memberDao;
		return this;
	}

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		Member member = (Member) model.get("member");
		if(member != null && member.getEmail()!=null) {
			memberDao.update(member);
			return "redirect:list.do";
		}else {
			memberDao.selectOne(Integer.parseInt(model.get("no").toString()));
			return "/members/MemberUpdate.jsp";
		}

	}

	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {
				"member",dto.Member.class,
				"no",Integer.class
		};
	}

}
