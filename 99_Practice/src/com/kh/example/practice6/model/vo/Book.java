package com.kh.example.practice6.model.vo;

public class Book {
	
	// �ʵ�
	public String title;
	public String publisher;
	public String author;
	public int price;
	public double discountRate;
	
	// �⺻ ������
	public Book() {
		// ������ ���� class ��� �ݵ�� ��/�ҹ��� �ϳ����� �Ȱ��ƾ� �Ѵ�.
	}
	
	// �ʼ� ������ : �Ű������� �ʼ��� �־��־�� �Ѵ�.
	public Book(String t1, String p1, String a1) {
		this.title = t1;
		this.publisher = p1;
		this.author = a1;
	}
	
	// �ʼ� ������ 2
	public Book(String t2, String p2, String a2, int pr2, double d2) {
		this.title = t2;
		this.publisher = p2;
		this.author = a2;
		this.price = pr2;
		this.discountRate = d2;
	}
	
	// void �޼��� == ��� �޼���
	public void inform() {
		System.out.println("===== �� ���� ��Ÿ�� �Ҽ� =====\n");
		System.out.println("å�̸� : " + title);
		System.out.println("���ǻ� : " + publisher);
		System.out.println("������ : " + author);
		System.out.println("�ǸŰ� : " + price);
		System.out.println("������ : " + discountRate + "\n");
	}
}
