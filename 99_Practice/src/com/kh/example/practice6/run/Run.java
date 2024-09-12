package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		// 객체
		Book bk0 = new Book();
		bk0.title = "드래곤 라자";
		bk0.publisher = "황금 가지";
		bk0.author = "이영도";
		bk0.price = 8_000;
		bk0.discountRate = 1.5;
		bk0.inform();
		
		Book bk1 = new Book("해리포터와 마법사의 돌", "문학 수첩", "J.K. 롤링");
		bk1.inform();
		
		Book bk2 = new Book("반지의 제왕 : 반지 원정대", "교보 문고", "J.R.R. 톨킨", 15_000, 0.7);
		bk2.inform();

	}

}
