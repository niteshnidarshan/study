package com.sys.comparable_comparator;

public class Movie implements Comparable<Movie>{
	private double rating;
	private String name;
	private int releaseYear;
  
	Movie(String name, double rating, int releaseYear)
	{
		this.rating = rating;
		this.name = name;
		this.releaseYear = releaseYear;
	}
	
	public String getName()
	{
		return this.name;
	}
	public double getRating()
	{
		return this.rating;
	}
	public int getReleaseYear()
	{
		return this.releaseYear;
	}
	
	public int compareTo(Movie movie)
	{
		//return (this.name.compareTo(movie.name)); //will compare according to name
		return (this.releaseYear - movie.releaseYear);
	}
	
	 
	
	
}
