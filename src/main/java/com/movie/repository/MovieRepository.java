package com.movie.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movie.model.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long>{

}
