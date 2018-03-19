package com.bridgeit.comparable$comparator;

public class MovieComparable implements Comparable<MovieComparable> {

	String rating;
	double name;
	int year;

	public MovieComparable(String string, double d, int i) {

		this.rating = string;
		this.name = d;
		this.year = i;
	}

	public String getRating() {
		return rating;
	}

	public double getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public int compareTo(MovieComparable movie) {

		return this.year - movie.year;
	}
}
