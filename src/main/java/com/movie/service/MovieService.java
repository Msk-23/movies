package com.movie.service;

import com.movie.model.Movie;

public interface MovieService {

	Movie createMovie(Movie movie);

	Movie getMovie(Long id);

	String deleteMovie(Long id);

	Movie updateMovie(Movie movie, Long id);
	
}
