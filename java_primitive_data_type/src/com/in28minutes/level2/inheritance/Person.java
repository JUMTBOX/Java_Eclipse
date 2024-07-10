package com.in28minutes.level2.inheritance;

public class Person {
	private String name;
	private String email;
	private String phone;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return String.format("name: %s, email: %s, phone: %s", name, email, phone);
	}

}
