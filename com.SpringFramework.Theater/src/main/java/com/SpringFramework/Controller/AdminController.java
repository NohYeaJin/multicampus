package com.SpringFramework.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpringFramework.Service.MemberService;
import com.SpringFramework.Service.MovieService;

import lombok.Setter;

@Controller
public class AdminController {
	
	@Setter(onMethod_ = @Autowired)
	private MemberService memberservice;

	@Setter(onMethod_ = @Autowired)
	private MovieService movieservice;
	
	@RequestMapping("/admin")
	public String toAdminPage() {
		return "/admin/admin";
	}
	
	@RequestMapping("/adminMovie")
	public String movieinputPage() {
		return "/admin/admin_movie_input";
	}
	
	@RequestMapping("/adminMember")
	public String memberinputPage() {
		return "/admin/admin_member_input";
	}
	
	@RequestMapping("/adminTime")
	public String timeinputPage() {
		return "/admin/admin_time_input";
	}
}
