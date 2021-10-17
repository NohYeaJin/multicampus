package com.SpringFramework.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringFramework.domain.UserReserveVO;
import com.SpringFramework.domain.UserVO;
import com.SpringFramework.mapper.MemberMapper;

import lombok.AllArgsConstructor;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper mapper;

	@Override
	public int MemberLogin(String user_id, String user_pw) {
		int result = mapper.MemberLogin(user_id, user_pw);
		return result;
		//if result is 1, login is success
		//if result is 0, login is fail
	}
	
	@Override
	public List<UserVO> getMemberInfos(){
		return mapper.getMemberInfos();
	}
	
	@Override
	public void MemberRegister(UserVO userinfo) {
		mapper.MemberRegister(userinfo);
	}

	@Override
	public UserVO getMemberInfo(String user_id) {
		UserVO userinfo = mapper.getMemberInfo(user_id);
		return userinfo;
	}

	@Override
	public UserReserveVO getReserveInfo(String user_id) {
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

	@Override
	public void deleteReserve(UserReserveVO reserveVO) {
		// TODO Auto-generated method stub
		
	}

}
