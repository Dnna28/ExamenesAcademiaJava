package com.movies.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_movie")
	private int id;

	@Column(name = "title")
	private String title;

	@Column(name = "director")
	private String director;

	@Column(name = "year")
	private int year;

	@Column(name = "price")
	private Double price;

	public Movie() {
	}

	public Movie(int id, String title, String director, int year, Double price) {
		this.id = id;
		this.title = title;
		this.director = director;
		this.year = year;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Movie{" + "id=" + id + ", title='" + title + '\'' + ", director='" + director + '\'' + ", year=" + year
				+ ", price=" + price + '}';
	}
}
