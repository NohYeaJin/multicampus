package com.SpringFramework.Service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.SpringFramework.domain.MovieVO;
import com.SpringFramework.domain.OrderVO;
import com.SpringFramework.domain.SeatVO;
import com.SpringFramework.domain.TheaterRoomTimeVO;
import com.SpringFramework.domain.TheaterVO;

public interface MovieService {
	public List<MovieVO> findAllMovie();
	public List<TheaterVO> findAllTheater();
	public MovieVO getMovieInfo(int movie_id);
	public void insertMovie(MovieVO movie);
	public void deleteMovie(MovieVO movie);
	public void updateMovie(MovieVO movie);	
	public List<MovieVO> findBestMovie();
	public List<MovieVO> findRecentMovie();
	public List<TheaterRoomTimeVO> findTimeByMovieAndTheater(@Param("movie_id") int movie_id,@Param("theater_id") int theater_id, @Param("date") String date);
	public List<SeatVO> getTakenSeats(int time_id);
	public int getTheaterSeatType(int time_id);
	public OrderVO getOrderData(int time_id);
}
