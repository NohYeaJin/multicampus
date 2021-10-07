package com.SpringFramework.domain;

import java.sql.Timestamp;
import java.util.ArrayList;

public class CinemaRoomVO {
	private int room_num;
	private String movie_name;
	private Timestamp movie_start_time;
	private ArrayList<CinemaVO> cinemaTimes;
}
