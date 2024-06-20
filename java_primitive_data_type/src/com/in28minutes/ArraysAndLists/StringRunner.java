package com.in28minutes.ArraysAndLists;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		String daysWithMostCharacter = "";
		for (String day : daysOfWeek) {
			if (day.length() > daysWithMostCharacter.length()) {
				daysWithMostCharacter = day;
			}
		}
		System.out.println("Day with most number of character" + daysWithMostCharacter);

		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.print(" /" + daysOfWeek[i]);
		}
	}

}
