package com.kh.practice.Employee.controller;

import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeController {
	
	// 배열 - class 내부에 작성
	private Employee[] eArr = new Employee[5]; // 작성 후 import 해주어야 한다.
	
	public static final int CUT_LINE = 60; // static final 자료형 변수명 = 절대불변의 값; 즉, 상수
	//										  이 때, 변수명은 전부 대문자로 작성한다.
	
// 메서드
	// 기본 생성자
	public EmployeeController() {
		// 5개의 객체 배열을 정해진 샘플 데이터의 값으로 초기화
		eArr[0] = new Employee("김길동", "자바", 100);
		eArr[1] = new Employee("박길동", "디비", 50);
		eArr[2] = new Employee("이길동", "화면", 85);
		eArr[3] = new Employee("정길동", "서버", 60);
		eArr[4] = new Employee("홍길동", "자바", 20);
	}
	
	// 객체 배열에 있는 데이터 반환
	public Employee[] printEmployee() {
		return eArr; 
	}
	
	// 객체 배열의 점수를 모두 합한 값 반환
	public int sumScore() {
		int sum = 0; // sum 초기화
		for(Employee e : eArr) {
			sum += e.getScore();
		}
		return sum;
	}
	
	public double[] avgScore() {
		double[] avgArr = new double[2]; // 자료형[] 새로운 변수명 = new 자료형[원하는 값];
		avgArr[0] = sumScore();          // 새로운 변수[0] 에 sumScore(); 를 담는다.
		avgArr[1] = avgArr[0] / eArr.length; // 새로운 변수[1] 에 sumScore(); / eArr 의 최대 길이;
											 // 즉 점수 총합 / 총 학생 수
		return avgArr; // avgArr 전부 반환하겠다.
	}

}
