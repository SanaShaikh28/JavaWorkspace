package com.bridgeit.comparable$comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {
	public static void main(String[] args) {
		ArrayList<MovieComparable> list = new ArrayList<MovieComparable>();
		list.add(new MovieComparable("Force Awakens", 8.3, 2015));
		list.add(new MovieComparable("Star Wars", 8.7, 1977));
		list.add(new MovieComparable("Twilight", 8.8, 1980));
		list.add(new MovieComparable("Harry Potter", 8.4, 1983));

		Collections.sort(list);

		System.out.println("Movies after sorting by year : ");
		for (MovieComparable movie : list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}
	}
}