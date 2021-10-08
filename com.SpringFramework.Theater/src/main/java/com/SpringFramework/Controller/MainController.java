package com.SpringFramework.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String toMainPage() {
		return "/main/index";
	}
	
	@RequestMapping("/login")
	public String toLoginPage() {
		return "/member/login";
	}
	
	@RequestMapping("/signup")
	public String toSignUpPage() {
		return "/member/signup";
	}
	
	@RequestMapping("/seatselect")
	public String toSeatSelect() {
		return "/movie/seatSelect";
	}
	
	
}
