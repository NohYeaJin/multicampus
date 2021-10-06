package com.spring.ex01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import dao.MemberDAO2;

public class MemberListController implements Controller{
	private MemberDAO2 memberDao;
	public void setMemberDao(MemberDAO2 memberDao) {
		this.memberDao = memberDao;
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView("MemberList.jsp");
		mav.addObject("members",memberDao.SelectList());
		return null;
	}
}
