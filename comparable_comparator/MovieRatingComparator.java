package com.sys.comparable_comparator;

import java.util.Comparator;

public class MovieRatingComparator implements Comparator<Movie> {

	public int compare(Movie m1, Movie m2)
	{
		if(m1.getRating() < m2.getRating())
			return -1;
		else if(m1.getRating() > m2.getRating())
			return 1;
		else
			return 0;
	}
}
