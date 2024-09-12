package com.kh.practice.Audition.view;

import com.kh.practice.Audition.controller.AuditionController;
import com.kh.practice.Audition.model.vo.Audition;

// 사용자의 입장에서 바라보는 화면

public class AuditionMenu {

// 필드
	// import 할 객체		새로운 변수명   =	새로운 		 공간 () 생성
	AuditionController 	    ac 		=	 new AuditionController(); 
	
// 메서드
	// 기본 생성자
	public AuditionMenu() { 
		
	}
	
	// 정보와 성적, 결과 출력
	// 출력 void 메서드 명은 class 명과 달라도 상관 없다.
	public void printAuditionMenu() {
		System.out.println("지원자 이름 \t\t 분야 \t\t 점수"); // \t Tab만큼 띄우기 - \n Enter 줄바꿈
		System.out.println("=========================");
		
		// for - each 문
		// String 을 썼다면 지원자의 이름, 과목, 점수 중에 하나만 가져올 수 있다.
		// Audition 은 이름, 분야, 점수 모두 가져올 수 있다.
		for(Audition a : ac.printAudition()) {
			// 작성 후 import
		}
		
	}
}
