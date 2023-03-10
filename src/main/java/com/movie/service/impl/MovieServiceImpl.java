package com.movie.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.model.Movie;
import com.movie.repository.MovieRepository;
import com.movie.service.MovieService;

@Service 
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieRepository repository;

	@Override
	public Movie createMovie(Movie movie) {
		return repository.save(movie);
	}

	@Override
	public Movie getMovie(Long id) {
		Optional<Movie> movieOptional = repository.findById(id);
		return movieOptional.isPresent() ? movieOptional.get() : new Movie();
	}

	@Override
	public String deleteMovie(Long id) {
		repository.deleteById(id);
		return "deleted";
		
	}

	@Override
	public Movie updateMovie(Movie movie, Long id) {
		Optional<Movie> movieOptional = repository.findById(id);
		Movie m = movieOptional.get();
		m.setTitle(movie.getTitle());
		m.setDirector(movie.getDirector());
		return repository.save(m);
	}

	
}
