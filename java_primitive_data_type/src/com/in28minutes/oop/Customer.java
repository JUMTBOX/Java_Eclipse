package com.in28minutes.oop;

public class Customer {
	private String name;
	private Address homeAddress;
	private Address workAddress;

	Customer(String name, Address homeAddress) {
		this.setName(name);
		this.setHomeAddress(homeAddress);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	@Override
	public String toString() {
		return String.format("name: [%s], homeAddress: [%s], workAddress: [%s] ", name, homeAddress, workAddress);
	}
}
