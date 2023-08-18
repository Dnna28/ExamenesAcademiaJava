package com.movies.dao;

import com.movies.entity.Movie;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieDaoImp implements MovieDAO {

	private EntityManager entityManager;

	@Autowired
	public MovieDaoImp(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<Movie> findAll() {
		TypedQuery<Movie> theQuery = entityManager.createQuery("from Movie", Movie.class);
		List<Movie> movies = theQuery.getResultList();
		return movies;
	}

	@Override
	public Movie findById(int id) {
		Movie movie = entityManager.find(Movie.class, id);
		return movie;
	}

	@Override
	public Movie save(Movie movie) {
		Movie newMovie = entityManager.merge(movie);
		return newMovie;
	}

	@Override
	public void deleteById(int id) {
		Movie movie = entityManager.find(Movie.class, id);
		entityManager.remove(movie);
	}
}
