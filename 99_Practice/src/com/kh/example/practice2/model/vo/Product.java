package com.kh.example.practice2.model.vo;

public class Product {
	
	// �ʵ�
	private String pName;
	private    int price;
	private String brand;
	
	// getter setter
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// �޼��� - ������ - �⺻
	public Product() {
		
	}
	
	// �޼��� - void - ���
	public void information() {
		System.out.println("===== ��ǰ ���� =====");
		System.out.println("��ǰ �̸� : " + pName);
		System.out.println("��ǰ ���� : " + price);
		System.out.println("���� ȸ�� : " + brand);
	}

}
