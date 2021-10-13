package com.SpringFramework.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringFramework.domain.KakaopayPurchaseVO;
import com.SpringFramework.domain.SeatVO;
import com.SpringFramework.mapper.OrderMapper;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderMapper mapper;
	
	@Override
	public void insertOrder(KakaopayPurchaseVO purchase) {
		mapper.insertOrder(purchase);
		
	}

	@Override
	public void updateSeat(int time_id, int taken_seat_num) {
		mapper.updateSeat(time_id, taken_seat_num);
		
	}

	@Override
	public void insertSeat(SeatVO seatVO) {
		mapper.insertSeat(seatVO);
		
	}

	@Override
	public List<KakaopayPurchaseVO> getReservations(String user_id) {
		return mapper.getReservations(user_id);
	}
	
}
