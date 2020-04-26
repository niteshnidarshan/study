package com.sys.comparable_comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareObject {

	public static void main(String[] args) {
		
		/* 
		//Using List data structure
		List<Movie> movieList = new ArrayList<Movie>(); 
		
		movieList.add(new Movie("Kaho na Pyar Hai",4.8,2000));
		movieList.add(new Movie("Hum dil de chuke sanam",4.2,2002));
		movieList.add(new Movie("Akele hum akele tum",4.1,1994));
		movieList.add(new Movie("Sadak",4.7,1998));
		movieList.add(new Movie("Stree",4.8,2018));
		movieList.add(new Movie("Munna Bhai MBBS",4.8,2006));
		*/
		
		//Using Array data structure
		Movie movieList[] = new Movie[6];
		movieList[0] = (new Movie("Kaho na Pyar Hai",4.8,2000));
		movieList[1] = (new Movie("Hum dil de chuke sanam",4.2,2002));
		movieList[2] = (new Movie("Akele hum akele tum",4.1,1994));
		movieList[3] = (new Movie("Sadak",4.7,1998));
		movieList[4] = (new Movie("Stree",4.8,2018));
		movieList[5] = (new Movie("Munna Bhai MBBS",4.8,2006));
		
		System.out.println("Before sorting");
		System.out.println("=========================");
		for(Movie movie : movieList)
		{
			System.out.println(movie.getName()+" | "+movie.getRating()+" | "+movie.getReleaseYear());
		}
		
		//Collections.sort(movieList); //It sorts only those object list who implements Comparable else compile time error
		
		//Collections.sort(movieList, new MovieNameComparator()); //It takes only a type List & a comparator object
		Arrays.sort(movieList, new MovieNameComparator()); //It takes Object //It takes array of Objects & a Comparator Object
		
		//Collections.sort(List, Object) - Here Object must have java.util.Comparator
		//java.util.Comparator has the precedence over java.lang.Comparable
		//Means if the List object class implemented Comparable & compare natural sorting over any of the field, instead of it Comparator will be given priority
		
		System.out.println("After sorting with Name Comparator");
		System.out.println("=========================");
		for(Movie movie : movieList)
		{
			System.out.println(movie.getName()+" | "+movie.getRating()+" | "+movie.getReleaseYear());
		}
		
		//Collections.sort(movieList, new MovieRatingComparator()); //It takes List and a Comparator type object
		Arrays.sort(movieList, new MovieRatingComparator()); //It takes array of Objects & a Comparator Object
		
		System.out.println("After sorting with Rating Comparator");
		System.out.println("=========================");
		for(Movie movie : movieList)
		{
			System.out.println(movie.getName()+" | "+movie.getRating()+" | "+movie.getReleaseYear());
		}
		
		//Collections.sort(movieList);
		Arrays.sort(movieList);
		
		System.out.println("After sorting with Comparable class itsef(Natural sorting year wise)");
		System.out.println("=========================");
		for(Movie movie : movieList)
		{
			System.out.println(movie.getName()+" | "+movie.getRating()+" | "+movie.getReleaseYear());
		}
		/*
		System.out.println("Movies in set");
		System.out.println("=========================");
		
		try
		{
			
			//Set<Movie> movieSet = new HashSet<Movie>(); // It does not need comparable object. In HashSet we can store user defined class without comparable
			Set<Movie> movieSet = new TreeSet<Movie>(); // It needs comparable object [Mandatory]. 
			//In TreeSet we can not store user defined class without Comparable. It will throw RuntimeException
			//java.lang.ClassCastException: com.sys.Movie cannot be cast to java.lang.Comparable
			
			movieSet.add(new Movie("Kaho na Pyar Hai",4.8,2000));
			movieSet.add(new Movie("Hum dil de chuke sanam",4.2,2002));
			movieSet.add(new Movie("Akele hum akele tum",4.1,1994));
			movieSet.add(new Movie("Sadak",4.7,1998));
			movieSet.add(new Movie("Stree",4.8,2018));
			movieSet.add(new Movie("Munna Bhai MBBS",4.8,2006));
			
			for(Movie movie : movieSet)
			{
				System.out.println(movie.getName()+" | "+movie.getRating()+" | "+movie.getReleaseYear());
			}
			
			//Using Map
			
			Map<Movie,Movie> movieMap = new TreeMap<Movie, Movie>(); // java.lang.ClassCastException: com.sys.Movie cannot be cast to java.lang.Comparable
			// TreeMap requires Comparable object as a key;
			// HashMap can take without comparable & no exception
			
			movieMap.put(new Movie("Kaho na Pyar Hai",4.8,2000), null);
			movieMap.put(new Movie("Hum dil de chuke sanam",4.2,2002), null);
			movieMap.put(new Movie("Akele hum akele tum",4.1,1994), null);
			movieMap.put(new Movie("Sadak",4.7,1998), null);
			movieMap.put(new Movie("Munna Bhai MBBS",4.8,2006), null);
			 
			Set<Movie> set = movieMap.keySet();
			 
			for(Movie movie : set)
			{
				System.out.println(movie.getName()+" | "+movie.getRating()+" | "+movie.getReleaseYear());
			} 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}*/
			
	}

}
