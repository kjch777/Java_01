package com.kh.arrayList.pre;

public class Book {
	
// 필드
	private String bookName;
	private String author;
	
// 메서드
	// Getter
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	
	// Setter
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// 기본 생성자
	public Book() {
		
	}
	
	// 필수 생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	// 출력 void - 책 정보
	public void showBook() {
		System.out.println(bookName + " , " + author);
	}

}
