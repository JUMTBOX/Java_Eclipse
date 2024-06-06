package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	private BigDecimal principal;
	private BigDecimal interest;

	SimpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal("100"));
	}

	public BigDecimal calculateTotalValue(int years) {
		BigDecimal interestOfyear = interest.multiply(new BigDecimal(years));

		BigDecimal totalValue = principal.add(principal.multiply(interestOfyear));

		return totalValue;
	}
}
