package com.SpringFramework.Service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringFramework.domain.MovieVO;
import com.SpringFramework.domain.OrderVO;
import com.SpringFramework.domain.SeatVO;
import com.SpringFramework.domain.TheaterRoomTimeVO;
import com.SpringFramework.domain.TheaterVO;
import com.SpringFramework.domain.TimeVO;
import com.SpringFramework.domain.UserVO;
import com.SpringFramework.mapper.MemberMapper;
import com.SpringFramework.mapper.MovieMapper;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	private MovieMapper mapper;

	
	@Override
	public MovieVO getMovieInfo(int movie_id) {
		return mapper.getMovieInfo(movie_id);

	}

	@Override
	public void insertMovie(MovieVO movie) {
		mapper.insertMovie(movie);
	}

	@Override
	public void deleteMovie(MovieVO movie) {
		mapper.deleteMovie(movie);
	}

	@Override
	public void updateMovie(MovieVO movie) {
		mapper.updateMovie(movie);
	}


	@Override
	public List<MovieVO> findAllMovie() {
		return mapper.findAllMovie();
	}

	@Override
	public List<TheaterVO> findAllTheater() {
		return mapper.findAllTheater();
	}

	@Override
	public List<MovieVO> findBestMovie() {
		return mapper.findBestMovie();
	}

	@Override
	public List<MovieVO> findRecentMovie() {
		return mapper.findRecentMovie();
	}

	@Override
	public List<TheaterRoomTimeVO> findTimeByMovieAndTheater(@Param("movie_id") int movie_id,@Param("theater_id") int theater_id, @Param("date") String date){
		return mapper.findTimeByMovieAndTheater(movie_id,theater_id,date);
	}

	@Override
	public List<SeatVO> getTakenSeats(int time_id) {
		return mapper.getTakenSeats(time_id);
	}

	@Override
	public int getTheaterSeatType(int time_id) {
		return mapper.getTheaterSeatType(time_id);
	}

	@Override
	public OrderVO getOrderData(int time_id) {
		return mapper.getOrderData(time_id);
	}

	@Override
	public List<TimeVO> findAllTime() {
		return mapper.findAllTime();
	}

}
