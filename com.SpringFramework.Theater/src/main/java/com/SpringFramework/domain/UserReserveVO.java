package com.SpringFramework.domain;

import java.sql.Timestamp;
import java.util.ArrayList;

public class UserReserveVO {
	private String user_id;
	private int reserve_num;
	private String movie_name;
	private String theater;
	private String theater_room_name;
	private int people_num;
	private Timestamp movie_time;
	private int price;
	private ArrayList<SeatVO> seats;
}
