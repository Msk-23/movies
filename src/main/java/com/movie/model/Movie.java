package com.movie.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -507989352124889587L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String director;
	
	public Movie(){
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
}
