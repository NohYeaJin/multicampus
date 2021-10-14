package com.SpringFramework.domain;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class ReplyVO {
	private int comment_id;
	private int movie_id;
	private String content_text;
	private String user_id;
	private Timestamp reg_date;
	private Timestamp edit_date;
	private String printTime;
}
