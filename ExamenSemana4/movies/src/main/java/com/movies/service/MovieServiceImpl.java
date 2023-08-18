package com.movies.service;

import com.movies.dao.MovieDAO;
import com.movies.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDAO movieDAO;

	@Override
	public List<Movie> findAll() {
		return movieDAO.findAll();
	}

	@Override
	public Movie findById(int id) {
		return movieDAO.findById(id);
	}

	@Transactional
	@Override
	public Movie save(Movie movie) {
		return movieDAO.save(movie);
	}

	@Transactional
	@Override
	public void deleteById(int id) {
		movieDAO.deleteById(id);
	}
}
