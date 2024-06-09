package com.in28minutes.typeOfloops;

import java.util.Scanner;

public class DoWhileRepeatedQuestionRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;

		do{
			System.out.print("숫자를 입력하세요: ");
			number = scanner.nextInt();
			System.out.println("Cube is " + (int) Math.pow(number, 3));
			
		} while (number >= 0);

		System.out.println("process over...");
		scanner.close();
	}

}
