package com.kh.example.practice6.model.vo;

public class Book {
	
	// 필드
	public String title;
	public String publisher;
	public String author;
	public int price;
	public double discountRate;
	
	// 기본 생성자
	public Book() {
		// 생성자 명은 class 명과 반드시 대/소문자 하나까지 똑같아야 한다.
	}
	
	// 필수 생성자 : 매개변수를 필수로 넣어주어야 한다.
	public Book(String t1, String p1, String a1) {
		this.title = t1;
		this.publisher = p1;
		this.author = a1;
	}
	
	// 필수 생성자 2
	public Book(String t2, String p2, String a2, int pr2, double d2) {
		this.title = t2;
		this.publisher = p2;
		this.author = a2;
		this.price = pr2;
		this.discountRate = d2;
	}
	
	// void 메서드 == 출력 메서드
	public void inform() {
		System.out.println("===== 이 달의 판타지 소설 =====\n");
		System.out.println("책이름 : " + title);
		System.out.println("출판사 : " + publisher);
		System.out.println("지은이 : " + author);
		System.out.println("판매가 : " + price);
		System.out.println("할인율 : " + discountRate + "\n");
	}
}
