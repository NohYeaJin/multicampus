package com.SpringFramework.Controller;

import java.io.IOException;
import java.security.Principal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.SpringFramework.Service.MemberService;
import com.SpringFramework.Service.MovieService;
import com.SpringFramework.Service.ReplyService;
import com.SpringFramework.domain.OrderVO;
import com.SpringFramework.domain.ReplyVO;
import com.SpringFramework.domain.SeatVO;
import com.SpringFramework.domain.TheaterRoomTimeVO;

import lombok.Setter;

@Controller
public class MovieController {

	@Setter(onMethod_ = @Autowired)
	private MemberService memberservice;

	@Setter(onMethod_ = @Autowired)
	private MovieService movieservice;
	
	@Setter(onMethod_ = @Autowired)
	private ReplyService replyservice;

	@PostMapping("/movietime")
	@ResponseBody
	public Map<String, Object> searchMovieTime(HttpServletRequest request, HttpServletResponse response, Model model)
			throws IOException {
		int movie_id = Integer.parseInt(request.getParameter("movie_id"));
		int theater_id = Integer.parseInt(request.getParameter("theater_id"));
		String date = (String) request.getParameter("date");
		// PrintWriter writer = response.getWriter();
		Map<String, Object> map = new HashMap<String, Object>();

		String[] arr = date.split("/");
		Calendar cal = Calendar.getInstance();
		cal.set(2021, Integer.parseInt(arr[0]) - 1, Integer.parseInt(arr[1]));
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("hh:mm");
		//현재시간 이전 예약 닫는 transaction 필요
		String date_result = dateFormat.format(cal.getTime());
		List<TheaterRoomTimeVO> times = movieservice.findTimeByMovieAndTheater(movie_id, theater_id, date_result);
		for (int i = 0; i < times.size(); i++) {
		 	Timestamp ts = times.get(i).getStart_time();
			Date date2 = new Date();
			date2.setTime(ts.getTime());
			String formattedDate = new SimpleDateFormat("HH:mm").format(date2);
			times.get(i).setPrintTime(formattedDate);
		}
		if (times.size() == 0) {
			map.put("result", "fail");
		} else {
			map.put("result", "success");
			map.put("timelist", times);
		}
		return map;
	}
	
	@GetMapping("/optioncomplete")
	public ModelAndView toseatselect(int time_id) {
		List<SeatVO> takenseats = movieservice.getTakenSeats(time_id);
		int seattype = movieservice.getTheaterSeatType(time_id);
		ModelAndView mav = new ModelAndView();
        mav.addObject("takenseats", takenseats); 
        mav.addObject("time_id", time_id); 
        mav.setViewName("/movie/seatSelect"+Integer.toString(seattype));
		return mav;
	}
	
	@PostMapping("/ordercomplete")
	public ModelAndView toPayment(int time_id,String seatchosen,int price) {
		ModelAndView mav = new ModelAndView();

		mav.setViewName("/movie/orderComplete");
		System.out.println(price);

		OrderVO orderinfo = movieservice.getOrderData(time_id);
		
		Timestamp ts = orderinfo.getMovie_start_time();
		Date date = new Date();
		date.setTime(ts.getTime());
		String formattedDate = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(date);
		orderinfo.setPrintTime(formattedDate);
		orderinfo.setPrice(price);
		orderinfo.setSeatchosen(seatchosen);
		mav.addObject("info",orderinfo);
		return mav;
		
	}
	
	@RequestMapping("/movieDetail/{movie_id}")
	public String toMovieDetail(@PathVariable("movie_id") int movie_id,Model model) {
		model.addAttribute("movieinfo", movieservice.getMovieInfo(movie_id));
		return "/movie/movieDetail";
	}
	@ResponseBody
	@PostMapping("/insertReply")
	public Map<String, Object> saveReply(int movie_id,String content_text,HttpSession session) throws Exception {
		ReplyVO replyVO = new ReplyVO();
		replyVO.setContent_text(content_text);
		replyVO.setMovie_id(movie_id);
		String user_id = (String)session.getAttribute("member");		
		replyVO.setUser_id(user_id);
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			replyservice.insertReply(replyVO);
			result.put("status", "OK");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("status", "False");
		}
		return result;
	}
	
	@ResponseBody
	@PostMapping("/getReplyList")
	public List<ReplyVO> getReplyList(int movie_id) throws Exception{
		System.out.println(movie_id);
		List<ReplyVO> times = replyservice.selectReplies(movie_id);
		for (int i = 0; i < times.size(); i++) {
		 	Timestamp ts = times.get(i).getReg_date();
			Date date2 = new Date();
			date2.setTime(ts.getTime());
			String formattedDate = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(date2);
			times.get(i).setPrintTime(formattedDate);
		}
		return times;
	}
	/*
	@RequestMapping(value = "/showReplyList", method = RequestMethod.POST)
	public List<ReplyVO> getReplyList(String user_id) throws Exception{
		return replyservice.showReplies(user_id);
	}
	*/


}