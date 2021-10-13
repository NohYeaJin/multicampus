package com.SpringFramework.domain;

import java.sql.Timestamp;

public class OrderVO {
	private int time_id;
	private String movie_name;
	private String theater_name;
	private String theater_room_name;
	private Timestamp movie_start_time;
	private String printTime;
	private String seatchosen;
	
	public int getTime_id() {
		return time_id;
	}
	public void setTime_id(int time_id) {
		this.time_id = time_id;
	}
	
	public String getSeatchosen() {
		return seatchosen;
	}
	public void setSeatchosen(String seatchosen) {
		this.seatchosen = seatchosen;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private int price;
	public String getPrintTime() {
		return printTime;
	}
	public void setPrintTime(String printTime) {
		this.printTime = printTime;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getTheater_name() {
		return theater_name;
	}
	public void setTheater_name(String theater_name) {
		this.theater_name = theater_name;
	}
	public String getTheater_room_name() {
		return theater_room_name;
	}
	public void setTheater_room_name(String theater_room_name) {
		this.theater_room_name = theater_room_name;
	}
	public Timestamp getMovie_start_time() {
		return movie_start_time;
	}
	public void setMovie_start_time(Timestamp movie_start_time) {
		this.movie_start_time = movie_start_time;
	}
	
}
