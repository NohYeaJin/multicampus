package com.SpringFramework.mapper;

import org.apache.ibatis.annotations.Param;

import com.SpringFramework.domain.UserReserveVO;
import com.SpringFramework.domain.UserVO;

public interface MemberMapper {
		//login
		public int MemberLogin(@Param("user_id") String user_id,@Param("user_pw") String user_pw);
		
		//signup
		public void MemberRegister(UserVO userinfo);
		
		//get member info
		public UserVO getMemberInfo(String user_id);
		
		//get mypage reservation info
		public UserReserveVO getReserveInfo(String user_id);
		
		//undo reservation
		public void deleteReserve(UserReserveVO reserveVO);
		
		//update member info
		public UserVO updateInfo(UserVO userinfo);
		
		//delete member info 
		public UserVO deleteInfo(String user_id);
}
