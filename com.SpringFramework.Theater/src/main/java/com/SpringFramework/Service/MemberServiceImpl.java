package com.SpringFramework.Service;

import com.SpringFramework.domain.UserReserveVO;
import com.SpringFramework.domain.UserVO;

public class MemberServiceImpl implements MemberService{

	@Override
	public int MemberLogin(String user_id, String user_pw) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int MemberRegister(UserVO userinfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserVO getMemberInfo(String user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserReserveVO getReserveInfo(String user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO updateInfo(UserVO userinfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO deleteInfo(String user_id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
