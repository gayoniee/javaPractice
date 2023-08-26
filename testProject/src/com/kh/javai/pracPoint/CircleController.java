package com.kh.javai.pracPoint;

public class CircleController {
	private Circle c;
	
	public CircleController() {
		c = new Circle();
	}
	
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		return "면적 : " + c.toString() + " / " + (Math.PI * radius * radius);
				
	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		return "둘레 : " + c.toString() + " / " + (Math.PI * radius * 2);
	}
	
}
