package com.java.practiceShape;

public class TriangleController {
	private Shape s;
	
	public TriangleController() {
		s = new Shape();
	}
	
	public double calcArea(double height, double width) {
		s = new Shape(3, height, width);
		
		double area = (s.getHeight() * s.getWidth()) / 2;
		return area;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "삼각형 " + s.information();
	}
}
