package com.SpringFramework.Service;

import com.SpringFramework.domain.UserReserveVO;
import com.SpringFramework.domain.UserVO;

public interface MemberService {
	
	public int MemberLogin(String user_id, String user_pw);
	public int MemberRegister(UserVO userinfo);
	
	//get member info
	public UserVO getMemberInfo(String user_id);
	
	//get mypage reservation info
	public UserReserveVO getReserveInfo(String user_id);
	
	//update member info
	public UserVO updateInfo(UserVO userinfo);
	
	//delete member info 
	public UserVO deleteInfo(String user_id);
	
}
