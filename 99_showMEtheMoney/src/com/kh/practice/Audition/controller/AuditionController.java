package com.kh.practice.Audition.controller;

import com.kh.practice.Audition.model.vo.Audition;

public class AuditionController {

	// 필드에 배열 만들기
	private Audition[] aArr = new Audition[5];

	public static final int CUT_LINE = 60; // 전부 대문자로 표기되어 있으면 절대불변의 상수값으로 만든다.
	// 이 때, static final 을 사용한다.

// 메서드
	// 기본 생성자
	public AuditionController() {
		// 5개의 객체 배열을 예제에 이미 적혀있는 샘플 데이터의 값으로 초기화 해준다
		aArr[0] = new Audition("김영희", "발라드", 100);
		aArr[1] = new Audition("박영희", "힙합", 50);
		aArr[2] = new Audition("이영희", "뮤지컬", 85);
		aArr[3] = new Audition("정영희", "댄스", 60);
		aArr[4] = new Audition("홍영희", "팝", 20);
	}

	// 객체 배열에 있는 데이터 반환 - 반환은 return
	public Audition[] printAudition() { // Audition[] == Audition 배열
		return aArr; // aArr 배열의 모든 값을 반환하겠다는 뜻
	}

	// 객체 배열의 점수를 합한 값을 반환 - 반환은 return
	public int sumScore() {
		int sum = 0; // sum 에 0 을 넣어서 0 으로 초기화
		
		// Audition    : aArr 배열
		for(Audition a : aArr) {	
			sum += a.getScore(); // 총점은 0으로 초기화 한 상태 
			  // = aArr 배열에서 점수들 가져와서 더한 값을 a에 저장
		}
		// sumScore 를 호출한다면, 총점을 반환하겠다.
		return sum;
	}
	
	public double[] avgScore() {
		// double 배열을 만들어
		double[] avgArr = new double[2];
		// sumScore 의 return 값을 0 번째 index 에 저장하고
		avgArr[0] = sumScore();
		// 합의 평균을 1 번째 index 에 저장 후 
		avgArr[1] = avgArr[0] / aArr.length;
		// 배열 return
		return avgArr;
	}
	
	// for - each 문으로 각 지원자의 합격 여부 출력하기
	public void printPass() {
		// 출력 메서드 - void
	 // for(   참조형 	새로운 변수명 : 배열)
		for(Audition        a     : aArr) {
			a.setPassed(a.getScore() >= CUT_LINE);
 // 새로운 변수명.boolean set 지정해준 변수명(새로운 변수명.점수 get >= 커트 라인)
			System.out.println(a.getName() + " 지원자는 " + (a.isPassed() ? "합격" : "불합격") + " 입니다.");
		} // 							   삼항 연산자 사용법    .isPassed() ? true : false
		  //                              boolean getter == is			  일 때 출력할 값		
	}

}
