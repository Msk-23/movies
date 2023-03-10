package com.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.model.Movie;
import com.movie.service.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	private MovieService service;
	
	@PostMapping("/createMovie")
	public ResponseEntity<?> createMovie(@RequestBody Movie movie) {
		return new ResponseEntity<>(service.createMovie(movie), HttpStatus.CREATED);
	}
	
	@GetMapping("/getMovie/{id}")
	public ResponseEntity<?> getMovie(@PathVariable Long id){
		return new ResponseEntity<>(service.getMovie(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteMovie/{id}")
	public ResponseEntity<?> deleteMovie(@PathVariable Long id){
		return new ResponseEntity<> (service.deleteMovie(id),HttpStatus.OK);
	}
	
	@PutMapping("/updateMovie/{id}")
	public ResponseEntity<?> updateMovie(@RequestBody Movie movie, @PathVariable Long id) {
		return new ResponseEntity<> (service.updateMovie(movie, id),HttpStatus.OK);
	}
}
