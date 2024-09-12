package com.kh.practice.book.view;

import java.util.*;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	
// 필드
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;
	
// 메서드
	// 기본 생성자
	public BookMenu() {
		// Ctrl + Space
	}
	
	// 메인메뉴 출력
	public void mainMenu() {
		while(true) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();
			sc.nextLine(); // 버퍼 지우기
			switch(choice) {
			case 1 : 
				fileSave();
				break;
			case 2 :
				fileRead();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("잘못된 입력입니다. 다시 입력 해주세요.");	
			}
		}
	}
	
	// 저장할 책 정보를 받아오기
	public void fileSave() {
		System.out.print("도서 이름 : ");
		String title = sc.nextLine();
		System.out.print("작가 이름 : ");
		String name = sc.nextLine();
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("출판 날짜 (yyyy-mm-dd) : ");
		// Calendar
		
	}
	
	// 저장된 책 정보 출력
	public void fileRead() {
		
	}

}
