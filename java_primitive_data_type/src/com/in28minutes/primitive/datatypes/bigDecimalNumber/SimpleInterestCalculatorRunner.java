package com.in28minutes.primitive.datatypes.bigDecimalNumber;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {

		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");

		BigDecimal totalValue = calculator.calculateTotalValue(5); // 5years

		System.out.println(totalValue + " 원 입니다.");
	}

}
