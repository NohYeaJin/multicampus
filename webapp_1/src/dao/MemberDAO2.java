package dao;

import java.util.List;

import dto.Member;


public interface MemberDAO2 {
	List<Member> SelectList() throws Exception;
	int insert(Member member)throws Exception;
	int delete(int no)throws Exception;
	Member selectOne(int no) throws Exception;
	Member exist(String email, String password)throws Exception;
	int update(Member member)throws Exception;
	}
