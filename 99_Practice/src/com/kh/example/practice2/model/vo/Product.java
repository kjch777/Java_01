package com.kh.example.practice2.model.vo;

public class Product {
	
	// 필드
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
	
	// 메서드 - 생성자 - 기본
	public Product() {
		
	}
	
	// 메서드 - void - 출력
	public void information() {
		System.out.println("===== 상품 정보 =====");
		System.out.println("상품 이름 : " + pName);
		System.out.println("상품 가격 : " + price);
		System.out.println("제조 회사 : " + brand);
	}

}
