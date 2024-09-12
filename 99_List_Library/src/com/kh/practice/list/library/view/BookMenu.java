package com.kh.practice.list.library.view;

import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {

// 필드
	// 사용자가 직접 메인 메뉴를 선택 할 수 있음
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
// 메서드
	// 출력 void
	public void mainMenu() {
		System.out.println("=== 도서관에 오신걸 환영합니다 ===");
		
		// 종료 전까지 반복 실행
		while(true) {
			System.out.println("=== 도서 관리 프로그램 ===");
			System.out.println("1. 도서 추가");
			System.out.println("2. 전체 도서 목록 조회");
			System.out.println("3. 도서 검색 및 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("6. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine(); // 버퍼 지우기
			
			// 각 메뉴를 입력 시 해당 메서드로 이동
			switch(menu) {
			case 1 : 
				insertBook();
				break;
			case 2 : 
				selectList();
				break;
			case 3 : 
				searchBook();
				break;
			case 4 : 
				deleteBook();
				break;
			case 5 : 
				ascBook();
				break;
			case 6 : 
				System.out.println("프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
			}
		}
	}
	
	// 책을 추가하기 위해 키보드로 입력한 정보를 받는 메서드
	public void insertBook() {
		System.out.print("제목 : ");
		String title = sc.nextLine();
		
		System.out.print("저자 : ");
		String author = sc.nextLine();
		
		System.out.print("카테고리 : ");
		String category = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine(); // 버퍼 지우기
		
		// 책 정보를 저장하는 Book 객체 불러오기
		Book book = new Book(title, author, category, price);
		bc.insertBook(book);
		System.out.println("도서 추가가 완료 되었습니다.");
	}
	
	// 전체 도서 목록 출력 성공을 알리는 메서드
	public void selectList() {
		bc.selectList();
	}
	
	// 특정 도서 검색 결과를 보여주는 메서드
	public void searchBook() {
		System.out.print("검색할 키워드를 입력 하세요 : ");
		String keyword = sc.nextLine();
		bc.searchBook(keyword);
	}
	
	// 특정 도서 삭제 성공을 알리는 메서드
	public void deleteBook() {
		System.out.print("삭제할 도서명을 입력하세요 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자명을 입력하세요 : ");
		String author = sc.nextLine();
		
		// BookController 도서 삭제하는 기능 추가
		bc.deleteBook(title, author); // Ctrl 키 누른 채로 마우스 왼쪽 버튼을 누르면 이동할 수 있다.
	}
	
	// 책 명 오름차순 정렬 성공을 알리는 메서드
	// asc 는 ascending 의 약자로, 오름차순이라는 뜻이다.
	public void ascBook() {
		
		// BookController 도서 오름차순으로 정렬하는 기능 추가
		bc.ascBook();
	}

}
