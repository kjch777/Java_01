package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class Run { // Product를 가져와서 실행하는 class

	public static void main(String[] args) { // main 메서드
		
		Product product1 = new Product(); // Product 객체 생성
		
		// 정보 저장
		product1.setpName("아이폰 17"); // setpName 은 메서드기 때문에,
		product1.setPrice(990000);	  // = 이 아니라 ( ) 를 사용한다. 
		product1.setBrand("애플");
		
		product1.information();
		
		// 저장하는건 set
		System.out.println("\n===== get으로 불러와보기 ====="); // 불러오는건 get
		System.out.println("상품 이름 : " + product1.getpName());
		System.out.println("상품 가격 : " + product1.getPrice());
		System.out.println("제조 회사 : " + product1.getBrand());

	}

}
