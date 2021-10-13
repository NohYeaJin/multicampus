package com.SpringFramework.Service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.SpringFramework.domain.KakaopayPurchaseVO;
import com.SpringFramework.domain.SeatVO;

public interface OrderService {
	public void insertOrder(KakaopayPurchaseVO purchase);
	public void updateSeat(@Param("time_id") int time_id,@Param("taken_seat_num") int taken_seat_num);
	public void insertSeat(SeatVO seatVO);
	public List<KakaopayPurchaseVO> getReservations(String user_id);
}
