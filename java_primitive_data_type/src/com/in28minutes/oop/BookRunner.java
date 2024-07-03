package com.in28minutes.oop;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "OOP Programming with JAVA", "Ranga");

		book.addReview(new Review(10, "great book", 5));
		book.addReview(new Review(10, "Awesome", 5));

		System.out.println(book);
	}

}
