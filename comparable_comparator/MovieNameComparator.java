package com.sys.comparable_comparator;

import java.util.Comparator;

public class MovieNameComparator implements Comparator<Movie>{

	public int compare(Movie m1, Movie m2)
	{
		return m1.getName().compareTo(m2.getName());
	}
}
