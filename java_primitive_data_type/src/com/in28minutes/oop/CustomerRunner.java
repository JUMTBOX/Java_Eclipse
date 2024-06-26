package com.in28minutes.oop;

public class CustomerRunner {

	public static void main(String[] args) {
		Address myAddress = new Address("home", "sn", "12345");
		Customer customer = new Customer("yang", myAddress);

		Address workAddress = new Address("corp", "sn", "55555");
		customer.setWorkAddress(workAddress);

		System.out.println(myAddress.toString());
		System.out.println(workAddress.toString());

		System.out.println(customer.toString());
	}

}
