package com.SpringFramework.Controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.SpringFramework.Service.MemberService;
import com.SpringFramework.Service.MovieService;
import com.SpringFramework.domain.OrderVO;
import com.SpringFramework.domain.SeatVO;
import com.SpringFramework.domain.TheaterRoomTimeVO;

import lombok.Setter;

@Controller
public class MovieController {

	@Setter(onMethod_ = @Autowired)
	private MemberService memberservice;

	@Setter(onMethod_ = @Autowired)
	private MovieService movieservice;

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
}