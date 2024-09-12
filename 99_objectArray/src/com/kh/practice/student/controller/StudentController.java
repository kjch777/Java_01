package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	/*
	  
	 Student[] sArr = new Student[5]
	  
	  				   name		subject		score
	         ┌ sArr[0] 김길동 	  자바 		 100 
	         ├ sArr[1] 박길동       디비         50
	 Student ├ sArr[2] 이길동       화면         85
	  sArr   ├ sArr[3] 정길동       서버         60
             └ sArr[4] 홍길동       서버         20
             	  
	 */
	// 배열
	private Student[] sArr = new Student[5]; // index 0 1 2 3 4		length 5
	
	public static final int CUT_LINE = 60; // final 을 쓰면 절대 변하지 않는 상수가 된다.
	// 상수명은 모두 대문자로 작성한다. 절대 값을 바꾸지 말라는 주의, 경고의 의미를 담고 있다.
	// 변수명은 소문자로 시작하자는 개발자간의 규칙이 있다.
	// static : 고정
	
// 메서드
	// 기본 생성자
	public StudentController() {
		
		// 0 ~ 4 번째 학생까지의 값을 넣어주기
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
		
	}
	
	// 반환 메서드 만들기
	public Student[] printStudent() { // Student[] == Student 배열
		return sArr; // sArr 의 모든 정보를 반환하겠다.
	}
	
	// 학생들의 점수를 모두 더해서 총점을 계산한 것
	public int sumScore() { // 총점 전달
		int sum = 0;
		for(Student s : sArr) {
			sum += s.getScore(); // 총점은 0으로 초기화 한 상태 = sArr 배열에서 점수들 가져와서 더한 값을 s에 저장
		}
		// sumScore 를 호출한다면, 총점을 반환하겠다.
		return sum;
	}
	
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore();				 // 위에서 만든 학생들의 점수를 모두 더한 값을 저장하는 공간 0
		avgArr[1] = avgArr[0] / sArr.length; // 평균 = 총점 / 총 학생 수
		return avgArr;
	}
	
	/*
	 배열을 사용하지 않고 평균 구하기
	 
	 public double[] avgScore() {
		double avgArr = sumScore(); / sArr.length; // 평균 = 총점 / 총 학생 수
		return avgArr;
	} 
	 */
	
	// 각 학생의 합격 여부를 확인하고 출력하는 메서드
	public void printPass() {
		for(Student s : sArr) {
			s.setPassed(s.getScore() >= CUT_LINE);
			System.out.println(s.getName() + " 학생은 " + (s.isPassed() ? "통과" : "불합격") + "입니다.");
			/*
			 if(s.getScore() >= CUT_LINE){
			 	System.out.println(s.getName() + " 학생은 합격입니다.");
			 } else {
			 	System.out.println(s.getName() + " 학생은 불합격입니다.");
			 }
			 */
		}
	}

}
