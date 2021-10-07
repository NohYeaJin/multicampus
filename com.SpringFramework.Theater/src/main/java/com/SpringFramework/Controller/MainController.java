package com.SpringFramework.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String toMainPage() {
		return "/main/index";
	}
}
