package com.movies.rest;

import com.movies.entity.Movie;
import com.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {

	private MovieService movieService;

	@Autowired
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	@GetMapping("/movies")
	public List<Movie> findAll() {
		return movieService.findAll();
	}

	@GetMapping("/movies/{id}")
	public Movie getMovie(@PathVariable int id) {
		Movie movie = movieService.findById(id);
		if (movie == null) {
			throw new RuntimeException("No se encontro" + id);
		}
		return movie;
	}

	@PostMapping("/add")
	public Movie addMovie(@RequestBody Movie movie) {
		movie.setId(0);
		Movie newMovie = movieService.save(movie);
		return newMovie;
	}

	@PutMapping("/update")
	public Movie updateMovie(@RequestBody Movie movie) {
		Movie updatedMovie = movieService.save(movie);
		return updatedMovie;
	}

	@DeleteMapping("/delete/{id}")
	public String deleteMovie(@PathVariable int id) {
		Movie movie = movieService.findById(id);
		if (movie == null) {
			throw new RuntimeException("Not found " + id);
		}
		movieService.deleteById(id);
		return "Delete successful " + id;
	}
}
