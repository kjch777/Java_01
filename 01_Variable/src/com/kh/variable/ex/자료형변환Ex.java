package com.kh.variable.ex;

public class 자료형변환Ex {
	// 메인 메서드 (프로그램 실행)
	public static void main(String[] args) {
	/*
	 컴퓨터에서 계산을 할 때는 값을 처리하는 원칙이 있다
	 같은 자료형끼리의 연산, 결과값은 같은 자료형이어야 한다
	 만약 다른 자료형끼리 연산하는 경우, 자료형을 맞게 변환해야 한다
	 
	 자동 형 변환
	 연산 할 때, 값의 범위가 작은 자료형을 값의 범위가 큰 자료형으로 변환
	 */
		
	// 자동 형 변환 확인
	int num1 = 9;
	long num2 = 10_000_000_000L; // , 대신 _ 를 사용 할 수 있다
	
	long result = num1 + num2; // int 값과 long 값을 더한다
	System.out.println("더한 결과 : " + result + " 원");
	
	// 강제 형 변환 확인
	// 강제로 형태를 변환해서 넣을 수는 있지만, 값이 깨지거나 잘못된 값이 들어간다
	// 작은 값으로 큰 값을 형 변환 하려고 할 경우
	// int result1 = num1 + num2;
	// cannot convert from long to int 발생
	// int result1 = num1 + num2; 일부러 틀린 예제이므로 주석 처리
		

	}

}
