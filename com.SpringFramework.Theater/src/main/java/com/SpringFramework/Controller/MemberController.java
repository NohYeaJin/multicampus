package com.SpringFramework.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping("/register")
	public String toRegisterPage() {
		return "/member/register";
	}
	
	@RequestMapping("/login")
	public String toLoginPage() {
		return "/member/login";
	}
	
	
	
	
	
	
	
}
