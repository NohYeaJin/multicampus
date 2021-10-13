package com.SpringFramework.domain;

import java.sql.Timestamp;
import java.util.Date;

public class MovieVO {
	private Long movie_id;
	private String movie_name;
	private String movie_info;
	private String age_limit;
	private KindVO kind;
	private String director_name;
	private Timestamp register_date;
	
	private Date release_date;
	private Date end_date;
	
	//movie time duration
	private int time_duration;
	
	//movie date duration
	private int date_duration;
	
	public Long getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(Long movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getMovie_info() {
		return movie_info;
	}

	public void setMovie_info(String movie_info) {
		this.movie_info = movie_info;
	}

	public String getAge_limit() {
		return age_limit;
	}

	public void setAge_limit(String age_limit) {
		this.age_limit = age_limit;
	}

	public KindVO getKind() {
		return kind;
	}

	public void setKind(KindVO kind) {
		this.kind = kind;
	}

	public String getDirector_name() {
		return director_name;
	}

	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}

	public Timestamp getRegister_date() {
		return register_date;
	}

	public void setRegister_date(Timestamp register_date) {
		this.register_date = register_date;
	}

	public Date getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public int getTime_duration() {
		return time_duration;
	}

	public void setTime_duration(int time_duration) {
		this.time_duration = time_duration;
	}

	public int getDate_duration() {
		return date_duration;
	}

	public void setDate_duration(int date_duration) {
		this.date_duration = date_duration;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public String getMovie_poster() {
		return movie_poster;
	}

	public void setMovie_poster(String movie_poster) {
		this.movie_poster = movie_poster;
	}

	private int views;
	
	private String movie_poster;
}
