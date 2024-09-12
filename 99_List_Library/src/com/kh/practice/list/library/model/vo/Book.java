package com.kh.practice.list.library.model.vo;

public class Book {
	
// �ʵ�
	private String title;
	private String author;
	private String category;
	private int price;

// �޼���
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

	// �⺻ ������
	public Book() {
		// Ctrl + Space
	}
	
	// �ʼ� ������
	public Book(String title, String author, String category, int price) {
		// super(); �θ� Ŭ���������� super(); �� �ʿ� ����.
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
	// ��ü�� ������ ��ȯ�ϴ� �޼��� // ��ȯ == return
	// @Override
	// �������̵�� return "����ϰ� ���� ���� : " + ����ϰ� ���� ��;
	@Override
	public String toString() {
		return "���� : " + title + " , ���� : " + author + " , ī�װ� : " + category + " , ���� : " + price;
	}
	
	// �ؽ��ڵ带 ��ȯ�ϴ� �޼��� // ��ȯ == return
	public int hashCode() {
		
	}
	
	// ��ü�� ������ ���θ� ��ȯ�ϴ� �޼��� // ��ȯ == return
	public boolean equals() {
		
	}
	
	// ���� ������ ������ �ִ� �޼���
	public int compareTo() {
		
	}

}
