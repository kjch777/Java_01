package com.kh.practice.book.model.vo;

import java.text.SimpleDateFormat;
import java.util.*;

public class Book {

// �ʵ�
	private String title;
	private String author;
	private int price;
	private Calendar date;
	private double discount;
	SimpleDateFormat sdf = new SimpleDateFormat();
	
// �޼���
	// �⺻ ������
	public Book() {
	}
	
	// �ʼ� ������
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
	public String toString() { // ��¹� ��ȯ?
		// �ʵ� �� ��ȯ
		// ��, date �ʵ�� SimpleDateFormat �� ����Ͽ�, "yyyy�� MM�� dd��" �� ��ȯ
		return "���� �̸� : %s , �۰� �̸� : %s , ���� ���� : %d , ���� ��¥ : ";
	}
	
}
