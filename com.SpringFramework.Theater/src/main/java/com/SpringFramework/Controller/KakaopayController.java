package com.SpringFramework.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringFramework.Service.KakaopayService;
import com.SpringFramework.Service.OrderService;
import com.SpringFramework.domain.KakaopayPurchaseVO;
import com.SpringFramework.domain.SeatVO;

import lombok.Setter;
import lombok.extern.java.Log;

@Log
@Controller
public class KakaopayController {

	@Setter(onMethod_ = @Autowired)
	private KakaopayService kakaopay;

	@Setter(onMethod_ = @Autowired)
	private OrderService orderservice;

	@GetMapping("/kakaoPay")
	public void kakaoPayGet() {

	}

	@PostMapping("/ready")
	public String kakaoPay(KakaopayPurchaseVO purchaseVO, HttpServletRequest request) {
		log.info("kakaoPay post............................................");
		HttpSession session = request.getSession();
		String user_id = (String) session.getAttribute("member");
		purchaseVO.setUser_id(user_id);
		orderservice.insertOrder(purchaseVO);
		String seat_list = purchaseVO.getSeatchosen();
		String[] list = seat_list.split(" ");
		int time_id = purchaseVO.getTime_id();
		for (int i = 0; i < list.length; i++) {
			SeatVO seatVO = new SeatVO();
			seatVO.setTime_id(time_id);
			seatVO.setSeat(list[i]);
			orderservice.insertSeat(seatVO);
		}
		orderservice.updateSeat(time_id, list.length);
		return "redirect:" + kakaopay.kakaoPayReady(purchaseVO);
	}

	@GetMapping("/kakaoPaySuccess")
	public String kakaoPaySuccess(@RequestParam("pg_token") String pg_token, Model model) {
		log.info("kakaoPaySuccess get............................................");
		log.info("kakaoPaySuccess pg_token : " + pg_token);
		return "redirect:/mypage";
	}
}
