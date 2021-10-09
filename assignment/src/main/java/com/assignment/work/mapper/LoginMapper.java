package com.assignment.work.mapper;

import org.apache.ibatis.annotations.Param;

import com.assignment.work.domain.Member;

public interface LoginMapper {
	public Member getLoginData(@Param("id") String id, @Param("password") String password);
}
