package com.java.pracBook;

public class Book {
	//Book클레스를 작성해라
	//code(숫자), title(문자열), author(문자열)
	//모든 필드데이터를 초기화하는 생성자를 만들어라
	// getter,setter를 작성해라
	//toString메서드를 장성해라
	
	private int code;
	private String title;
	private String author;
	
	public Book(int code, String title, String author) {
		this.code = code;
		this.title = title;
		this.author = author;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return code + " " + title + " " + author;
	}
	
}
