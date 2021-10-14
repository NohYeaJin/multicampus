package com.SpringFramework.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.SpringFramework.Service.MemberService;
import com.SpringFramework.domain.UserVO;

import lombok.Setter;

@Controller
public class MemberController {
	
	@Setter(onMethod_=@Autowired)
	private MemberService memberservice;
	
	@PostMapping("/register.do")
	public String register(UserVO user) {		
		memberservice.MemberRegister(user);
		//System.out.println(user.getUser_name());
		return "redirect:/login";
	}
	
	@PostMapping("/login.do")
	public String login(String user_id,String user_pw,RedirectAttributes rttr,HttpServletRequest request) {
		if(memberservice.MemberLogin(user_id, user_pw)==0) {
			rttr.addFlashAttribute("loginmsg","Fail");
			return "redirect:/login";
		}else{
			rttr.addFlashAttribute("loginmsg","Success");
			HttpSession session = request.getSession();
			session.setAttribute("member", user_id);
			return "redirect:/";
		}
		
	}
		
	
}
