package com.kh.arrayList.pre;

public class Book {
	
// �ʵ�
	private String bookName;
	private String author;
	
// �޼���
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
	
	// �⺻ ������
	public Book() {
		
	}
	
	// �ʼ� ������
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	// ��� void - å ����
	public void showBook() {
		System.out.println(bookName + " , " + author);
	}

}
