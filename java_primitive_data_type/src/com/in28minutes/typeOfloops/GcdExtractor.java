package com.in28minutes.typeOfloops;

import java.util.ArrayList;
import java.util.List;

public class GcdExtractor {
	private int number1;
	private int number2;

	public GcdExtractor(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }


	public int getNumber1() {
		return number1;
	}


	public int getNumber2() {
		return number2;
	}

	public int calculateGCD() {
		if (number1 < 0 || number2 < 0) {
			return 1;
		}
		if (number1 == 0 || number2 == 0) {
			return 0;
		}
		if (number1 == number2) {
			return number1;
		}

		List<Integer> list1 = this.rtList(number1);
		List<Integer> list2 = this.rtList(number2);
		List<Integer> common = new ArrayList<>();

		for (int el : list1) {
			if (list2.contains(el)) {
				common.add(el);
			}
		}

		common.sort((a, b) -> a - b);

		return common.get(common.size() - 1);
	}

	private List<Integer> rtList(int number) {
		List<Integer> result = new ArrayList<>();
		for (int i = number; i > 0; i--) {
			if (number % i == 0) {
				result.add(i);
			}
		}
		return result;
	}

}
