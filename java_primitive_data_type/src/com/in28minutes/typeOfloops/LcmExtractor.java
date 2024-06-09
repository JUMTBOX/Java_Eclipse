package com.in28minutes.typeOfloops;

public class LcmExtractor {

	private int number1;
	private int number2;

	public LcmExtractor(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}


	public int getNumber1() {
		return number1;
	}


	public int getNumber2() {
		return number2;
	}

	public int calculateLCM() {
		if (number1 < 0 || number2 < 0) {
			return -1;
		}
		if (number1 == 0 || number2 == 0) {
			return 0;
		}

		int max = Math.max(number1, number2);
		int i = max;

		while (true) {
			if (max % number1 == 0 && max % number2 == 0) {
				break;
			}
			max = max + i;
		}
		return max;
	}
}