package com.kh.javai.pracPoint;

public class Rectangle extends Point{
	int width;
	int height;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	} 
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String toString() {
		return super.toString() + " " + width + " " + height;
	}
}
