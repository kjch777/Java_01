package com.kh.practice.list.library.model.vo;

public class Book {
	
// 필드
	private String title;
	private String author;
	private String category;
	private int price;

// 메서드
	// Setter
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// Getter
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getCategory() {
		return category;
	}

	public int getPrice() {
		return price;
	}

	// 기본 생성자
	public Book() {
		// Ctrl + Space
	}
	
	// 필수 생성자
	public Book(String title, String author, String category, int price) {
		// super(); 부모 클래스에서는 super(); 가 필요 없다.
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
	// 객체의 정보를 반환하는 메서드 // 반환 == return
	// @Override
	// 오버라이드는 return "출력하고 싶은 문구 : " + 출력하고 싶은 값;
	@Override
	public String toString() {
		return "제목 : " + title + " , 저자 : " + author + " , 카테고리 : " + category + " , 가격 : " + price;
	}
	
	// 해시코드를 반환하는 메서드 // 반환 == return
	public int hashCode() {
		
	}
	
	// 객체가 같은지 여부를 반환하는 메서드 // 반환 == return
	public boolean equals() {
		
	}
	
	// 정렬 기준을 가지고 있는 메서드
	public int compareTo() {
		
	}

}
