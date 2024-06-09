package com.in28minutes.typeOfloops;

public class WhileNumberPlayer {

	private int limit;

	WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	public void printSquaresUptoLimit() {
		int i = 1;
		
		while ((int) Math.pow(i, 2) < limit) {
			System.out.println("squares:  " + (int) Math.pow(i, 2));
			i += 1;
		}
	}

	public void printCubesUptoLimit() {
		int i = 1;
		while ((int) Math.pow(i, 3) <= limit) {
			System.out.println("cubes:  " + (int) Math.pow(i, 3));
			i += 1;
		}
	}

}
