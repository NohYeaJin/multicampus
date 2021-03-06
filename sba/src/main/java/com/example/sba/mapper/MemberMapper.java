package com.example.sba.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.sba.domain.Member;

public interface MemberMapper {

	@Select("select * from members3 where email = #{email}")
	public Member getLoginInfo(@Param("email") String email) throws Exception;

	@Select("select * from members3 limit 10")
	public List<Member> getMemberList() throws Exception;

	
	public Member getMember(@Param("email") String email)throws Exception;
	
	public void createMember(Map<String,String> map)throws Exception;
	
	public int loginMember(@Param("email") String email)throws Exception;
	
	public int loginMember2(@Param("email") String email,@Param("pwd") String pwd)throws Exception;
}
