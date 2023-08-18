package com.movies.service;

import com.movies.entity.Movie;
import java.util.List;

public interface MovieService {

	List<Movie> findAll();

	Movie findById(int id);

	Movie save(Movie movie);

	void deleteById(int id);
}
