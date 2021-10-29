package com.example.sba.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.sba.domain.Member;
import com.example.sba.mapper.MemberMapper;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(HttpServletRequest request) {
		return "main.html";
	}
	

	@RequestMapping("/helloJson")
	public String helloJson() {
		String msg = "spring boot 는 rest 방식으로 데이터를 전송합니다";
		return msg;
	}
	
	@RequestMapping("/paramValueTest/{id}")
	public ResponseEntity<Member> paramValueTest(@PathVariable String id){
		System.out.println(id);
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST.OK);
	}
	@Autowired
	private MemberMapper mapper;
	@GetMapping("/requestlist")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("list");
		try {
			mav.addObject("members", mapper.getMemberList());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}
}
