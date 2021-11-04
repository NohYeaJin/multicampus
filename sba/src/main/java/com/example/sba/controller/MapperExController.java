package com.example.sba.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.sba.domain.Member;
import com.example.sba.mapper.MemberMapper;

import ai.AIFaceLogin;
import ai.Main;
import ai.chat1;
import ai.chat2;
@Controller
public class MapperExController {

	@Autowired
	private MemberMapper mapper;
	private Main main;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	// @RequestMapping(value = "/noXmlMapperGet/{id}",method = RequestMethod.GET)
	@GetMapping(value = "/noXmlMapperGet/{id}")
	public ResponseEntity<Member> noXmlMapperGet(@PathVariable String id) {
		try {
			Member member = mapper.getLoginInfo(id);
			logger.info(id);
			return new ResponseEntity<>(member, HttpStatus.BAD_REQUEST.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@GetMapping(value = "/noXmlMapperGet2")
	public ResponseEntity<Member> noXmlMapperGet2(HttpServletRequest request) {
		try {
			String id = request.getParameter("id");
			Member member = mapper.getLoginInfo(id);
			logger.info(id);
			return new ResponseEntity<>(member, HttpStatus.BAD_REQUEST.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@PostMapping("/noXmlMapperPost")
	public ResponseEntity<Member> noXmlMapperPost(HttpServletRequest request) {
		try {
			String id = request.getParameter("id");
			Member member = mapper.getLoginInfo(id);
			logger.info(id);
			return new ResponseEntity<>(member, HttpStatus.BAD_REQUEST.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@PostMapping("/noXmlMapperPost2")
	public ResponseEntity<Member> noXmlMapperPost2(Member member) {
		try {
			// String id = request.getParameter("id");
			Member userInfo = mapper.getLoginInfo(member.getEmail());
			logger.info(member.getEmail());

			return new ResponseEntity<>(userInfo, HttpStatus.BAD_REQUEST.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@GetMapping("/noXmlMapperList")
	public ResponseEntity<List<Member>> noXmlMapperList() {
		try {
			List<Member> members = mapper.getMemberList();
			
			return new ResponseEntity<>(members, HttpStatus.BAD_REQUEST.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/useXmlMapperGet/{id}")
	public ResponseEntity<Member> useXmlMapperGet(@PathVariable String id){
		try {
			Member member = mapper.getMember(id);
			return new ResponseEntity<>(member, HttpStatus.BAD_REQUEST.OK);
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST.OK);
		}
	}
	
	@GetMapping("/chatting")
	public String chat() {
		chat1.chat1();
		return "chat.html";
	}
	
	@RequestMapping("/success")
	public String success(HttpServletRequest request) {
		return "success.html";
	}
	
	@PostMapping("/login")
	public String login() {
		ModelAndView mav = new ModelAndView("success");
		try {
			System.out.println(Main.loginAudio());
			if(mapper.loginMember(Main.loginAudio())==1) {
				return "/success";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "fail";
	}
	
	

	
	@PostMapping("/useXmlMapperPost")
	public ResponseEntity<String> useXmlMapperPost(Member member){
		try {
			Map<String,String> map = new HashMap();
			map.put("email",member.getEmail());
			map.put("pwd",member.getPwd());
			map.put("mname",member.getMname());
			logger.info(member.toString() + "");
			mapper.createMember(map);
			logger.info(member.getEmail());
			return new ResponseEntity<>("가입되었습니다.", HttpStatus.BAD_REQUEST.OK);
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST.OK);
		}
	}

	@PostMapping("/aiface")
	public ResponseEntity<String> aiface(
		@Validated @RequestParam("mname") String name,
		@Validated @RequestParam("content") String content,
		@Validated @RequestParam("files") MultipartFile file
		)throws Exception{
		try {
			file.transferTo(new File(new File("").getAbsolutePath()));
			return new ResponseEntity<>("업로드 성공", HttpStatus.BAD_REQUEST.OK);
		}
		catch(Exception e){
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/AIFace")
	public String AIFace() {
		return "AIFace.html";
	}
	
	@GetMapping("/login22")
	public String AIFace2() {
		return "verification.html";
	}
	
	@GetMapping("/allfail")
	public String allfail() {
		return "allfail.html";
	}
	
	@PostMapping("/login2")
	public String verify2(String email,String pwd) {
		int result = 0;
		try {
			result = mapper.loginMember2(email, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(result==1) {
			return "redirect:/success";
		}else {
			return "redirect:/allfail";
		}
	}
	
	@PostMapping("loginFace")
	public String loginFace(
			@Validated @RequestParam(value = "files")MultipartFile file) {
		try {
			file.transferTo(new File(new File("").getAbsolutePath()+"\\"+file.getOriginalFilename()));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		String result = AIFaceLogin.aiface(file.getOriginalFilename());
		System.out.println(file.getOriginalFilename());
		if(result == "fail") {
			return "redirect:/login22";
		}else {
			try {
				if(mapper.loginMember(result)==1) {
					return "redirect:/success";
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "redirect:/success";
	}
}
