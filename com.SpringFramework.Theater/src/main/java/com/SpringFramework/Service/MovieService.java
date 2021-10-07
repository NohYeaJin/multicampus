package com.SpringFramework.Service;

import com.SpringFramework.domain.MovieVO;

public interface MovieService {
	public MovieVO getMovieInfo(String movie_name);
	public int insertMovie(MovieVO movie);
	public int deleteMovie(MovieVO movie);
	public MovieVO updateMovie(MovieVO movie);	
}
