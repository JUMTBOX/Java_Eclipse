package com.in28minutes.oop;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private int id;
	private String name;
	private String author;

	private List<Review> reviews = new ArrayList<>();

	Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public void addReview(Review review) {
		reviews.add(review);
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
}
