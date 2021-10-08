package com.SpringFramework.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@PostMapping("/register.do")
	public String Login() {
		
		return "redirect:/login";
	}
	
	
	
	
	
}
