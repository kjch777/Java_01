package com.kh.practice.book.model.vo;

import java.text.SimpleDateFormat;
import java.util.*;

public class Book {

// 필드
	private String title;
	private String author;
	private int price;
	private Calendar date;
	private double discount;
	SimpleDateFormat sdf = new SimpleDateFormat();
	
// 메서드
	// 기본 생성자
	public Book() {
	}
	
	// 필수 생성자
	public Book(String title, String author, int price, Calendar date, double discount) {
		// super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.date = date;
		this.discount = discount;
	}
	
	// setter
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	// getter
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public Calendar getDate() {
		return date;
	}

	public double getDiscount() {
		return discount;
	}
	
	// @Override toString
	@Override
	public String toString() { // 출력문 반환?
		// 필드 값 반환
		// 단, date 필드는 SimpleDateFormat 을 사용하여, "yyyy년 MM월 dd일" 로 반환
		return "도서 이름 : %s , 작가 이름 : %s , 도서 가격 : %d , 출판 날짜 : ";
	}
	
}
