package com.in28minutes.level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student();

		student.setName("yang");
		student.setCollegeName("kookmin");
		student.setPhone("5002");
		student.setYear(15);

		String value = student.toString();

		System.out.println("???" + value);
	}

}
