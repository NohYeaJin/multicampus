package com.SpringFramework.domain;

import java.sql.Timestamp;

public class TheaterRoomTimeVO {
	private Long time_id;
	private Long room_id;
	private Timestamp start_time;
	private int movie_id;
	private int left_seat_num;
	private String printTime;
	
	public String getPrintTime() {
		return printTime;
	}
	public void setPrintTime(String printTime) {
		this.printTime = printTime;
	}
	public Long getTime_id() {
		return time_id;
	}
	public void setTime_id(Long time_id) {
		this.time_id = time_id;
	}
	public Long getRoom_id() {
		return room_id;
	}
	public void setRoom_id(Long room_id) {
		this.room_id = room_id;
	}
	public Timestamp getStart_time() {
		return start_time;
	}
	public void setStart_time(Timestamp start_time) {
		this.start_time = start_time;
	}
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public int getLeft_seat_num() {
		return left_seat_num;
	}
	public void setLeft_seat_num(int left_seat_num) {
		this.left_seat_num = left_seat_num;
	}
}
