package com.assignment.work.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assignment.work.domain.Member;
import com.assignment.work.mapper.LoginMapper;

import net.minidev.json.JSONObject;

@Controller
public class LoginController {
	
	@Autowired
	private LoginMapper mapper;
	
	@RequestMapping("/")
	public String toTest1(Model model) {
		model.addAttribute("message", "주목받는 AI 9대 핵심 기술 분석");
		return "test1";
	}
	
	@PostMapping("/login")
	public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String id = (String)request.getParameter("id");
		String password = (String)request.getParameter("password");
		PrintWriter writer = response.getWriter();
		Member member = new Member();
		member = mapper.getLoginData(id, password);
		if(member.getId()==null) {
			writer.print("fail");
		}else {
			JSONObject memberinfo = new JSONObject();
			memberinfo.put("id",member.getId());
			memberinfo.put("password",member.getPassword());
			memberinfo.put("name",member.getUserName());
			writer.print(memberinfo);			
		}
		
	}
	
	
}
