package controller.src;

import java.util.Map;

import dao.MemberDAO2;
@Component("/members/delete.do")
public class MemberDeleteController implements Controller, DataBinding{
	
	private MemberDAO2 memberDao;
	public MemberDeleteController setMemberDao(MemberDAO2 memberDao) {
		this.memberDao = memberDao;
		return this;
	}
	
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		memberDao.delete(Integer.parseInt((String) model.get("no")));
		return null;
	}

	@Override
	public Object[] getDataBinders() {
		return new Object[] {
				"no",Integer.class
		};
	}

}
