package com.in28minutes.oop;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer 1", 0.34567, "GREEN");

		System.out.println(fan.toString());

		fan.switchOn();
		fan.setSpeed((byte) 5);

		fan.switchOff();
	}

}
