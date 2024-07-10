package com.in28minutes.level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {

		Employee employee = new Employee("yang", "web developer");

		employee.setEmployerName("conifer");
		employee.setEmail("yjey12@naver.com");
		employee.setPhone("5002");

		System.out.println(employee.toString());
	}

}
