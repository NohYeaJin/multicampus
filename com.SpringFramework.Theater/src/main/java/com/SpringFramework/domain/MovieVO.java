package com.SpringFramework.domain;

import java.sql.Timestamp;
import java.util.Date;

public class MovieVO {
	private String movie_name;
	private String movie_info;
	private String age_limit;
	private String kind;
	private String director_name;
	private Timestamp register_date;
	
	private Date release_date;
	private Date end_date;
	
	//movie time duration
	private int time_duration;
	
	//movie date duration
	private int date_duration;
	
	private int views;
}
