package com.java.pracBook;

public class Run {
	public static void main(String[] args) {
		//메인메서드에서 Book객체를 10개 담을 수 있는 Book형 배열 BookList를 만들고
		//10개의 Book을 생성해서 저장해라
		//BookList의 모든 Book의 toString 메서드를 호출하여 저장이 잘 되었는지 확인해보자
		
		Book[] BookList = new Book[10];
		
		BookList[0] = new Book(1, "aa", "aaa");
		BookList[1] = new Book(2, "bb", "bbb");
		BookList[2] = new Book(3, "cc", "ccc");
		BookList[3] = new Book(4, "dd", "ddd");
		BookList[4] = new Book(5, "ee", "eee");
		BookList[5] = new Book(6, "ff", "fff");
		BookList[6] = new Book(7, "gg", "ggg");
		BookList[7] = new Book(8, "hh", "hhh");
		BookList[8] = new Book(9, "ii", "iii");
		BookList[9] = new Book(10, "jj", "jjj");
		
		for(int i = 0; i < BookList.length; i++) {
			System.out.println(BookList[i].toString());
		}
	}
}
