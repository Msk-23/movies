package com.airport;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.movie.MovieApplication;
import com.movie.model.Movie;
import com.movie.service.MovieService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MovieApplication.class)
public class MovieServiceTest {

	@Autowired
	private MovieService service;
	
	@Before
	public void before() {
		createMovie();
	}
	
	@Test
	public void getMovieDetails(){
		Movie details= service.getMovie(1l);
		assertTrue(details.getId()>0);
	}

	private void createMovie() {
		Movie movie = new Movie();
		movie.setDirector("Steven Spielberg");
		movie.setTitle("ET");
		service.createMovie(movie);
	}
	
	@Test
	public void updateMovie(){
		Movie m = new Movie();
		m.setDirector("D");
		m.setTitle("T");
		Movie details= service.updateMovie(m,1l);
		assertTrue(details.getDirector().equals("D"));
	}
	
}
