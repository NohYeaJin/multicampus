package com.SpringFramework.Controller;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpringFramework.Service.MemberService;
import com.SpringFramework.Service.MovieService;
import com.SpringFramework.Service.OrderService;
import com.SpringFramework.Service.ReplyService;
import com.SpringFramework.domain.KakaopayPurchaseVO;
import com.SpringFramework.domain.UserVO;

import lombok.Setter;

@Controller
public class MainController {

	@Setter(onMethod_ = @Autowired)
	private MemberService memberservice;

	@Setter(onMethod_ = @Autowired)
	private OrderService orderservice;

	@Setter(onMethod_ = @Autowired)
	private MovieService movieservice;
	
	@Setter(onMethod_ = @Autowired)
	private ReplyService replyservice;

	@RequestMapping("/")
	public String toMainPage(Model model) {
		model.addAttribute("bestmovies", movieservice.findBestMovie());
		model.addAttribute("recentmovies", movieservice.findRecentMovie());
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

	@RequestMapping("/seatSelect1")
	public String toSeatSelect1() {
		return "/movie/seatSelect1";
	}

	@RequestMapping("/seatSelect2")
	public String toSeatSelect2() {
		return "/movie/seatSelect2";
	}

	@RequestMapping("/seatSelect3")
	public String toSeatSelect3() {
		return "/movie/seatSelect3";
	}

	@RequestMapping("/mypage")
	public String toMyPage(HttpSession session, Model model) {
		String user_id = (String) session.getAttribute("member");
		if(user_id==null) {
			return "redirect:/login";
		}
		System.out.println(user_id);
		// mypage data for updating member info
		UserVO userinfo = memberservice.getMemberInfo(user_id);
		model.addAttribute("userinfo", userinfo);
		System.out.println(userinfo.getEmail());
		List<KakaopayPurchaseVO> purchaseVO = orderservice.getReservations(user_id);
		for (int i = 0; i < purchaseVO.size(); i++) {
			Timestamp ts = purchaseVO.get(i).getMovie_start_time();
			Date date = new Date();
			date.setTime(ts.getTime());
			System.out.println(purchaseVO.get(i).getMovie_name());
			String formattedDate = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(date);
			purchaseVO.get(i).setPrintTime(formattedDate);
		}
		model.addAttribute("commentlist", replyservice.showReplies(user_id));
		model.addAttribute("list", purchaseVO);
		return "/member/mypage";
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";

	}

	@RequestMapping("/fastReserve")
	public String tofastReserve(Model model,HttpSession session) {
		String user_id = (String)session.getAttribute("member");
		if(user_id==null) {
			return "redirect:/login";
		}
		model.addAttribute("movies", movieservice.findAllMovie());
		model.addAttribute("theaters", movieservice.findAllTheater());

		// date list
		DateFormat df = new SimpleDateFormat("MM/dd");
		Calendar cal = Calendar.getInstance();
		ArrayList<String> dates = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			cal.add(Calendar.DATE, 1);
			dates.add(df.format(cal.getTime()));
		}

		model.addAttribute("dates", dates);
		return "/movie/fastReserve";
	}

	@RequestMapping("/movies")
	public String toMovies(Model model) {
		model.addAttribute("movies", movieservice.findAllMovie());
		return "/movie/movies";
	}

	@RequestMapping("/order")
	public String toOrder() {
		return "/movie/orderComplete";
	}

}
