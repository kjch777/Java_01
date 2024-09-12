package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {

// 필드
	ArrayList<Book> list = new ArrayList<>();
	
// 메서드
	// 기본 생성자
	public BookController() {
		// Ctrl + Space
	}
	
	// 리스트에 책을 추가하는 메서드
	public void insertBook(Book bk) {
		list.add(bk); // .add(); 로 책 추가
	}
	
	// 모든 책 목록을 출력하는 메서드 // 출력 == void
	public void selectList() {
		if(list.isEmpty()) { // 만약 책이 없다면 등록된 도서가 없다고 출력하고
			System.out.println("등록된 도서가 없습니다.");
		} else { // 책이 있다면 책 목록을 보여주기
			// for - each 문
			for(Book b : list) {
				System.out.println(b.toString()); // (변수명.toString()) 을 하면 주소값이 아닌 실제 보고 싶은 문구가 출력 된다.
			}
		}
	}
	
	// 키워드로 책을 검색하는 메서드
	public void searchBook(String keyword) { // void 써줘야 하네...
		List<Book> 검색결과 = new ArrayList<>();
		for(Book b : list) {
			if(b.getTitle().contains(keyword)) {
				검색결과.add(b);
			}
		}
		if(검색결과.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(Book b2 : 검색결과) {
				System.out.println(b2);
			}
		}
	}
	
	// 책 제목과 저자 명으로 책을 삭제하는 메서드
	public void deleteBook(String title, String author) {
		
		// true false 를 통해 삭제가 됐는지 안 됐는지 확인할 수 있도록 해주기
		boolean removed = false; // boolean 은 기본값이 false 이기 때문에, removed == false 인 상태이다.
		
		// 책 제목과 저자를 검색하여 삭제할 책 찾기
		// 전체 목록 for - each 문
		for(Book bbb : list) {
			
			// 만약 내가 삭제하고자 하는 책 제목과 저자가 존재한다면
		   // (책 제목 가져오기.비교하기(내가 삭제하고자 하는 책 제목)) && (책 저자 가져오기.비교하기(내가 삭제하고자 하는 저자 이름))
			if(bbb.getTitle().equals(title) && bbb.getAuthor().equals(author)){
				list.remove(bbb);
				
				// 삭제 됐으면 true
				removed = true;
				break;
			}
		}
		
		// 만약 삭제 됐다면 삭제 됐다를 true false 활용하여 표시하기
		if(removed) {
			System.out.println("도서 삭제가 완료 되었습니다.");
		} else {
			System.out.println("해당하는 도서를 찾을 수 없습니다.");
		}
		
	}
	
	public void ascBook() {
		// for while short 등을 사용하여 오름차순 정렬을 해줘도 되지만, 그러면 코드가 길어진다.
		//         .sort() 는 목록을 오름차순 또는 내림차순으로 정렬해줄 때 사용한다.
		//         .sort(?, Comparator)
		//                                          정렬하는 기준 책에서 책 제목
		//                                              :: == 앞 파일의 :: 뒤 값을 참조해서 사용하겠다.
		//                               .comparing == 비교하다
		Collections.sort(list, Comparator.comparing(Book::getTitle));
	}
	
}
