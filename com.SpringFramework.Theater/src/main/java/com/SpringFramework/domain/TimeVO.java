package com.SpringFramework.domain;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class TimeVO {
	private String movie_name;
	private String theater_name;
	private String theater_room_name;
	private Timestamp start_time;
	private int left_seat_num;
	
	
}
