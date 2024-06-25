package com.in28minutes.oop;

public class Rectangle {
	private int length;
	private int width;

	Rectangle(int length, int width) {
		this.setWidth(width);
		this.setLength(length);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int area() {
		return width * length;
	}

	public int perimeter() {
		return 2 * (width + length);
	}

	@Override
	public String toString() {
		return String.format("length:  %d, width:  %d, area:  %d, perimeter:  %d", length, width, area(), perimeter());
	}
}
