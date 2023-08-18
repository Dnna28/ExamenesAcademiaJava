package com.movies.dao;

import com.movies.entity.Movie;

import java.util.List;

public interface MovieDAO {

	List<Movie> findAll();

	Movie findById(int id);

	Movie save(Movie movie);

	void deleteById(int id);
}
