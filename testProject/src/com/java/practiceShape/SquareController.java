package com.java.practiceShape;

public class SquareController {
	private Shape s;
	
	public SquareController() {
		s = new Shape();
	}
	
	public double calcPerimeter(double height, double width) {
		s = new Shape(4, height, width);
		
		double cir = (s.getHeight() + s.getWidth()) * 2;
		return cir;
	}
	
	public double calcArea(double height, double width) {
		s = new Shape(4, height, width);
		
		double area = s.getHeight() * s.getWidth();
		return area;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "사각형 " + s.information();
	}
}
