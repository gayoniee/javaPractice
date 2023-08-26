package com.kh.javai.pracPoint;

public class RectangleController {
	private Rectangle r;
	
	public RectangleController() {
		r = new Rectangle();
	}
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return "면적 : " + r.toString() + " / " + (height * width);
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return "둘레 : " + r.toString() + " / " + (height + width) * 2;
	}
}
