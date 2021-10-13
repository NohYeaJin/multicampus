package com.SpringFramework.domain;

public class SeatVO {
	private int time_id;
	private String seat;
	//if seat is taken, value is 1
	//if seat is empty, value is 0
	public int getTime_id() {
		return time_id;
	}
	public void setTime_id(int time_id) {
		this.time_id = time_id;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	
}
